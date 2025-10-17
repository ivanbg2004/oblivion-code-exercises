-- Tabla PERSONA mejorada con constraints y comentarios
CREATE TABLE PERSONA (
    DNI CHAR(9) PRIMARY KEY,
    NOMBRE VARCHAR2(50) NOT NULL,  -- Aumentado límite para nombres completos
    EDAD INT CHECK (EDAD >= 0 AND EDAD <= 150),  -- Constraint para edades válidas
    PADRE CHAR(9),
    FOREIGN KEY (PADRE) REFERENCES PERSONA(DNI) ON DELETE SET NULL
);

-- Inserts con validación
INSERT INTO PERSONA VALUES ('10000000A', 'Juan Pérez', 32, NULL);
INSERT INTO PERSONA VALUES ('20000000A', 'Luis García', 54, NULL);
INSERT INTO PERSONA VALUES ('40000000A', 'Luis Martínez', 18, '20000000A');
INSERT INTO PERSONA VALUES ('30000000A', 'Daniel López', 73, NULL);
INSERT INTO PERSONA VALUES ('50000000A', 'Alberto Sánchez', 51, '30000000A');
INSERT INTO PERSONA VALUES ('60000000A', 'Eva Rodríguez', 19, '50000000A');

-- Índice para búsquedas rápidas
CREATE INDEX idx_nombre ON PERSONA(NOMBRE);

-- Vista para familias
CREATE VIEW familias AS
SELECT p1.NOMBRE AS HIJO, p2.NOMBRE AS PADRE
FROM PERSONA p1
LEFT JOIN PERSONA p2 ON p1.PADRE = p2.DNI;

-- Trigger para prevenir edades negativas
CREATE TRIGGER check_edad BEFORE INSERT ON PERSONA
FOR EACH ROW
BEGIN
    IF :NEW.EDAD < 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Edad no puede ser negativa');
    END IF;
END;





