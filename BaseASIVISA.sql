create database BaseASIVISA;
use BaseASIVISA;

create table Ejercicio(
idEjercicio int,
nombre varchar (20),
descripcion varchar (100),
intensidad varchar (8),
calorias int,
primary key (idEjercicio)
);

create table EjercicioRutina(
ejercicio int,
rutina int
);

create table Rutina(
idRutina int,
fechaInicio date,
descripcion varchar (50),
primary key (idRutina)
);

create table RutinaUsuario(
rutina int,
usuario int
);

create table EjercicioArea(
ejercicio int,
area varchar (8)
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

create table Comida(
idComida int,
calorias int,
nombre varchar (20),
primary key (idComida)
);

create table Pago(
idPago varchar(8),
fecha date,
usuario int,
factura int,
descripcion varchar (39),
monto float,
primary key (idPago)
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
usuario int
);
