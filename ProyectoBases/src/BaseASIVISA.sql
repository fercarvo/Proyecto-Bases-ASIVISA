create database BaseASIVISA;
use BaseASIVISA;

create table Ejercicio(
	idEjercicio int auto_increment not null,
	nombre varchar (20),
	descripcion varchar (100),
	intensidad varchar (8),
	calorias int,
	primary key (idEjercicio)
);

create table Rutina(
	idRutina int not null,
	fechaInicio date,
	descripcion varchar (50),
	primary key (idRutina)
);

create table EjercicioRutina(
	ejercicio int not null, 
	rutina int,
	foreign key (ejercicio)
		references Ejercicio.idEjercicio,
	foreign key (rutina)
		references Rutina.idRutina
);

create table RutinaUsuario(
	rutina int,
	usuario int,
	foreign key (usuario)
		references Usuario.idUsuario,
	foreign key (rutina)
		references Rutina.idRutina
);

create table EjercicioArea(
	ejercicio int,
	area varchar (8),
	foreign key (ejercicio)
		references Ejercicio.idEjercicio,
	foreign key (area)
		references AreaDelCuerpo.idADC
);

create table AreaDelCuerpo(
	idADC int,
	nombre varchar (20),
	primary key (idADC)
);

create table Usuario(
	idUsuario int,
	nombre varchar (39),
	email varchar (30),
	residencia varchar (30),
	pesoInicial float,
	estatura float,
	perfilPublico boolean,
	dificultadFísica varchar (30),
	primary key (idUsuario)
);

create table UsuarioDieta(
	dieta int,
	usuario int,
	foreign key (dieta)
		references Dieta.idDieta,
	foreign key (usuario)
		references Usuario.idUsuario
);

create table Comida(
	idComida int,
	calorias int,
	nombre varchar (20),
	primary key (idComida)
);

create table ComidaDieta(
	comida int,
	dieta int,
	foreign key (comida)
		references Comida.idComida,
	foreign key (dieta)
		references Dieta.idDieta
);

create table Dieta(
	ingestaCalorica int,
	idDieta int,
	horaDia time,
	primary key (idDieta)
);

create table Pago(
	idPago varchar(8),
	fecha date,
	factura int,
	descripcion varchar (39),
	monto decimal,
	primary key (idPago),
	foreign key (factura)
		references Factura.idFactura
);

create table Factura(
	idFactura int,
	fecha date,
	ciudad varchar (10),
	monto float,
	usuario int,
	primary key (idFactura)
);

create table Membresia(
	idMembresia int,
	usuario int,
	tipoMembresia char(8),
	costoMembresia decimal,
	fechaInicioMembresia date,
	fechaFinMembresia date,
	primary key (idMembresia),
	foreign key (usuario)
		references Usuario.idUsuario
);


#..........................................................#
#TRIGGERS

#..........................................................#
#VISTAS

#..........................................................#
#PROCEDIMIENTOS DE CREACION
DELIMITER //
CREATE PROCEDURE crearUsuario(in nombre varchar(39), in email varchar(39), in residencia varchar (30), pesoInicial float)
BEGIN
	INSERT INTO Usuario(nombre, email, residencia, pesoInicial)
	VALUES (nombre, email, residencia, pesoInicial);
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE crearComida(in nombre varchar(20), in calorias int)
BEGIN
	INSERT INTO Comida(nombre, calorias)
	VALUES (nombre, calorias);
END //
DELIMITER ;