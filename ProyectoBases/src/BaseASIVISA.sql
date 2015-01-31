CREATE database BaseASIVISA;
USE BaseASIVISA;

CREATE TABLE Ejercicio(
	idEjercicio INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR (20) NOT NULL,
	descripcion VARCHAR (100) NOT NULL,
	intensidad VARCHAR (8) NOT NULL,
	calorias INT,
	PRIMARY KEY (idEjercicio)
);

CREATE TABLE Rutina(
	idRutina INT NOT NULL AUTO_INCREMENT,
	fechaInicio DATE,
	descripcion VARCHAR (50),
	PRIMARY KEY (idRutina)
);

CREATE TABLE EjercicioRutina(
	ejercicio INT NOT NULL , 
	rutina INT NOT NULL,
	FOREIGN KEY (ejercicio)
		REFERENCES Ejercicio(idEjercicio)
		ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (rutina)
		REFERENCES Rutina(idRutina)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE AreaDelCuerpo(
	idADC INT AUTO_INCREMENT,
	nombre VARCHAR (20),
	PRIMARY KEY (idADC)
);

CREATE TABLE EjercicioArea(
	ejercicio INT,
	area int,
	FOREIGN KEY (ejercicio)
		REFERENCES Ejercicio(idEjercicio)
		ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (area)
		REFERENCES AreaDelCuerpo(idADC)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Usuario(
	idUsuario INT,
	nombre VARCHAR (39),
	username VARCHAR(20),
	contrasena VARCHAR(20),
	email VARCHAR (30),
	residencia VARCHAR (30),
	pesoInicial float,
	estatura float,
	perfilPublico boolean,
	dificultadFísica VARCHAR (30),
	PRIMARY KEY (idUsuario)
);

CREATE TABLE Dieta(
	idDieta INT AUTO_INCREMENT,
	ingestaCalorica INT,
	horaDia time,
	PRIMARY KEY (idDieta)
);

CREATE TABLE RutinaUsuario(
	rutina INT,
	usuario INT,
	FOREIGN KEY (usuario)
		REFERENCES Usuario(idUsuario)
		ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (rutina)
		REFERENCES Rutina(idRutina)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE UsuarioDieta(
	dieta INT,
	usuario INT,
	FOREIGN KEY (dieta)
		REFERENCES Dieta(idDieta)
		ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (usuario)
		REFERENCES Usuario(idUsuario)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Comida(
	idComida INT,
	calorias INT,
	nombre VARCHAR (20),
	PRIMARY KEY (idComida)
);

CREATE TABLE ComidaDieta(
	comida INT,
	dieta INT,
	FOREIGN KEY (comida)
		REFERENCES Comida(idComida)
		ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (dieta)
		REFERENCES Dieta(idDieta)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Factura(
	idFactura INT,
	fecha DATE,
	ciudad VARCHAR (10),
	monto float,
	usuario INT,
	PRIMARY KEY (idFactura)
);

CREATE TABLE Pago (
    idPago int AUTO_INCREMENT,
    fecha DATE,
    factura INT,
    descripcion VARCHAR(39),
    monto decimal,
    PRIMARY KEY (idPago),
    FOREIGN KEY (factura)
        REFERENCES Factura (idFactura)
        ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Membresia(
	idMembresia INT AUTO_INCREMENT,
	usuario INT,
	tipoMembresia char(8),
	costoMembresia decimal,
	fechaInicioMembresia DATE,
	fechaFinMembresia DATE,
	PRIMARY KEY (idMembresia),
	FOREIGN KEY (usuario)
		REFERENCES Usuario(idUsuario)
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE USER ASIVISA IDENTIFIED BY 'asivisa';
GRANT ALL ON BaseASIVISA.* to ASIVISA;