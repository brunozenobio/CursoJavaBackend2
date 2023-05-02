SELECT * FROM  fabricante;
SELECT * FROM producto;

/* 
	PARA VINCULAR LAS TABLAS LAS TRAEMO Y USAMOS UN ALIAS
*/
/*
	ALIAS f PARA FABRIANTE Y P PARA PRECIO
    PIDO NOMBRE DE FABRICANTE NOMBRE DE PRODUCTO Y PRECIO SIEMPRE QUE EL CODIGO DE FABRICANTE
    SEA IGUAL A LA LLAVE FORANEA EN EL PRODUCTO
    PUEDO USAR ESTRUCTURAS LOGICAS COMO ANTES.
*/
 SELECT f.nombre,p.nombre,p.precio
	FROM fabricante f,producto p
    WHERE f.codigo = p.codigo_fabricante;
    
    SELECT f.nombre,p.nombre,p.precio
	FROM fabricante f,producto p
    WHERE f.codigo = p.codigo_fabricante
		AND f.codigo = 6;/*PRODUCTO DEL FABRICANTE  6*/
    
     SELECT p.codigo,p.nombre,p.precio
	FROM fabricante f,producto p
    WHERE f.codigo = p.codigo_fabricante
		AND f.codigo = 6;/*TODOS LOS VALORES DE LA TABLA PRODUCTO PERO DEL FABRICANTE 6*/
        
 SELECT p.codigo,p.nombre,p.precio
	FROM fabricante f,producto p
    WHERE f.codigo = p.codigo_fabricante
		AND f.nombre ='Lenovo';
        
        
       SELECT p.codigo,p.nombre,p.precio
	FROM fabricante f,producto p
    WHERE f.codigo = p.codigo_fabricante
		AND f.nombre ='Lenovo'
        AND p.precio > 450;
        