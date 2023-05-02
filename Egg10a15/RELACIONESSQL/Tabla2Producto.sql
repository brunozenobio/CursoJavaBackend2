CREATE TABLE producto (
	codigo INT UNSIGNED PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DOUBLE NOT NULL,
    codigo_fabricante INT UNSIGNED NOT NULL,FOREIGN KEY (codigo_fabricante) REFERENCES fabricante(codigo) 
    
);

INSERT INTO producto VALUES(1,'DISCO duro SATA3 1TB',86.99,5);
INSERT INTO producto VALUES(2,'Memoria RAM DDR4 8GB',120,6);
INSERT INTO producto VALUES(3,'Disco SSD 1TB',150.99,4);
INSERT INTO producto VALUES(4,'GeForce GTX 1050Ti',185,7);
INSERT INTO producto VALUES(5,'GeForce GTX 1080 Xtreme',755,6);
INSERT INTO producto VALUES(6,'Monitor 24 LED Full HD',202,1);
INSERT INTO producto VALUES(7,'Monitor 27 LED Full HD',249.99,1);
INSERT INTO producto VALUES(8,'Portatil Yoga 520',599,2 );
INSERT INTO producto VALUES(9,'Portatil Ideapd 320',444,2);
INSERT INTO producto VALUES(10,'Impresora HP Deskjet 3720',59.99,3);
INSERT INTO producto VALUES(11,'IMpresora HP Laserjet Pro M26nw',180,3);