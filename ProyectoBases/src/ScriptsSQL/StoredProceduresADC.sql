
use baseasivisa;



DELIMITER $
CREATE PROCEDURE `grabarADC` (IN nombre VARCHAR(20), IN id INT, IN nuevo BOOLEAN)
#SP para grabar en la tabla AreaDelCuerpo
BEGIN
	IF nuevo THEN
		INSERT INTO areadelcuerpo (nombreADC) VALUES(nombre);
	ELSE
		UPDATE areadelcuerpo SET nombre=nombreADC WHERE idADC=id;
	END IF;
END
$