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
        
        
/*
	CLAUSULAS MAS AVANZADAS BASADSA EN TEORIA DE CONJUNTOS
*/

SELECT * FROM fabricante;
SELECT * FROM producto;


/*
	INNER JOINS : DA COMO RESULTADO LOS VALORES INTERSECCION ENTRE DOS TABALAS IMPLICADAS EN LA CONSuLTA
*/
SELECT * 
	FROM producto p
inner Join fabricante f
	On p.codigo_fabricante = f.codigo;

/*
	LEFT OUTER Joins : DA COMO RESULTADOS LOS VALORES DE LA TABLA INDICADA 
    EN EL FROM JUNTO CON LOS VALORES INTERSSECCION
    ENTRE LAS DOS TABLAS IMPLICADAS EN LA CONSULTA
*/

SELECT *
	FROM producto p
Left Outer Join fabricante f
	On p.codigo_fabricante = f.codigo;

    
/*
	Raigh Outer Joijns: DAMO COMO RESLTADOS LOS VALORES DE LA TABLA INDICADA 
    EN RIGHT OUTHER JOIN JUNTO CON LOS VALORES INTERSECCION ENTRE LAS DOS
    TABLAS INDICADAS
*/

SELECT *
	FROM producto p
Right Outer join fabricante f
	On p.codigo_fabricante = f.codigo;
    
    
/* 
	Semi Join(Exist) DA COMO RESULTADOS LOS VALORES INTERSECCION
    ENTRE LA TABLA PRODUCTO LA TABLA FABRICANTE
    ME DA TODOS LOS PROdUCTOS QUE EXISTEN PARA UN FABRICANTE
*/

SELECT *
	FROM producto p
WHERE exists (Select f.codigo
				FROM fabricante f
                Where f.codigo = p.codigo_fabricante); 

/*
	ANTI SEMI JOIN (Not Exists) DA COMO RESULTADDOS LOS VALORES DE LA
	DEL PRIMERO FROM QUE NO EXISTEN EN LA DE LA FUNCION NOT EXISTS
    
    
*/
SELECT *
	FROM producto p
WHERE not exists(Select f.codigo
					FROM fabricante f
                    WHERE f.codigo =  p.codigo_fabricante
                    );/* DA NULO PORQUE TODOS LOS PRODUCTOS TIENE FABRICANTE*/


SELECT *
	FROM fabricante f
WHERE not exists(Select p.codigo_fabricante
					FROM producto p
                    WHERE p.codigo_fabricante = f.codigo
                    );

/*
	ROS JOIN: DA COMO RESULTADO LOS VALORES QUE SE ENCUENTRAN EN AMBAS TABLAS.
    MULTIPLICANDO CADA PRODUCTO POR CADA FABRICCANTE
    
    ES DECIR ME DA PARA CADA FILA DE LA TABLA SELECT ASOCIADO A CADA TODAS LAS FILAS DE 
    LA TABLA DE CROSS JOIN
    CUIDADO PORQUE PUEDE TRAER INFORMACION INCORRECTA
*/

SELECT *
	FROM producto p
    Cross Join fabricante f; 



/*
	ORDER BY:ORDENAD POR UNA DETERMINADA COLUMNA
    LUEGO DeL NOMBRE LA COLUMNA PUEDO PONER asc(ascendente que es por default) 
    Y desc (Descendente)
    
O*/

SELECT *
	FROM fabricante
order by nombre;

SELECT *
	FROM fabricante
order by nombre desc;

 
/*	
	TAMBIEN DENTRO DEL ORDER BY PUEDO PEDIRSE QUE ORDENE POR UNA COLUMNA Y LUEGO POR OTRA 
*/

SELECT *
	FROM fabricante
order by nombre,codigo;


SELECT f.nombre,p.nombre,p.precio
	FROM fabricante f,producto p
WHERE f.codigo = p.codigo_fabricante
order by f.nombre,p.nombre;
/*
	ME DA EL NOMBRE DEL FABRICANTE Y EL NOMBRE Y PRECIO DEL PRODUCTO
    PARA LOS FABRICANTE CON CODIGO IGUAL AL CODIGO DEL FABRICANTE
    Y ADEMAS ORDENAD POR OMBRE DE FABRICANTE Y LUEGO DE PRODUCTO
    EJEMPLO LA G DE GYBATYE ESTA ANTES QUE LA M DE MEMORIA PARA EL MISMO FABRICANTE
*/


/*
	GROUP BY :AGRUPAR RESULTADOS
*/


SELECT f.nombre
	FROM fabricante f,producto p
	WHERE f.codigo = p.codigo_fabricante
GROUP BY f.nombre;


/* 
	PUEDO USARLO CON LA FUNCION COUNT()
    PARA VER POR EJEMPLO LA CANTIDAD DE PRODUCTOS
    
*/

SELECT f.nombre ,count(*)
	FROM fabricante f,producto p
WHERE f.codigo = p.codigo_fabricante
GROUP BY f.nombre;/*ME DA LOS NOMBRE DE FABRICANTE ORDENADOS POR NOMBRE JUNTO CON LA
LA CANTIDAD DE VECES QUE UN PRODUCTO SE RELACIONA CON UN FABRICANTE*/



/*
	DA LA POSIBLIDAD DE AGREGAR UN CRITERIO AL ORDER BY

*/

SELECT f.nombre, Count(*)
	FROM fabricante f,producto p
WHERE f.codigo = p.codigo_fabricante
GROUP BY f.nombre
HAVING Count(*)>1;/*LO MISMO QUE LA ANTERIOR PERO SOLO CUANDO COUNT SEA MAYOR A 1*/

SELECT f.nombre, Count(*)
	FROM fabricante f,producto p
WHERE f.codigo = p.codigo_fabricante
GROUP BY f.nombre
HAVING Count(*)>1 AND f.nombre <> 'Lenovo';/*DISTINTO A LENOVO*/

SELECT f.nombre, Count(*),SUM(p.precio)
	FROM fabricante f,producto p
WHERE f.codigo = p.codigo_fabricante
GROUP BY f.nombre
HAVING Count(*)>1 AND SUM(p.precio) > 300;