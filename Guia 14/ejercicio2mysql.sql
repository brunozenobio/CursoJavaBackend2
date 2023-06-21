##EJERCICIO 2 GUIA SQL

select nombre from producto;
select nombre,precio from producto;
describe producto;
select nombre, round(precio) from producto;
select codigo_fabricante from producto;
select distinct codigo_fabricante from producto;
select nombre from fabricante order by nombre;
select nombre from producto order by nombre,precio DESC;
select * from fabricante limit 5;
select nombre,precio from producto order by precio limit 1;
select nombre,precio from producto order by precio DESC limit 1;
select nombre from producto where precio <= 120;
select * from producto where precio between 60 and 200;
select * from producto where codigo_fabricante in (1,3,5);
select * from producto where nombre like '%Portatil%';
select producto.codigo,producto.nombre,fabricante.nombre as nombre_fabricante ,producto.codigo_fabricante from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo ;
select producto.nombre,fabricante.nombre as nombre_fabricante,producto.precio from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo order by fabricante.nombre; 
select producto.nombre,fabricante.nombre as nombre_fabricante,producto.precio from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo order by precio limit 1;
select producto.nombre,fabricante.nombre as nombre_fabricante,producto.precio from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo where fabricante.nombre = 'lenovo';
select producto.nombre,fabricante.nombre as nombre_fabricante,producto.precio from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo where fabricante.nombre = 'crucial' and producto.precio>200;
select producto.nombre,fabricante.nombre as nombre_fabricante,producto.precio from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo where fabricante.nombre in ('asus','hewlett-Packard');
select producto.nombre,fabricante.nombre as nombre_fabricante,producto.precio from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo where producto.precio>=180 order by precio DESC, producto.nombre;
select fabricante.nombre,producto.nombre from fabricante left join producto on fabricante.codigo = producto.codigo_fabricante;
select fabricante.nombre,producto.nombre from fabricante left join producto on fabricante.codigo = producto.codigo_fabricante where producto.codigo_fabricante is null;
select * from producto where codigo_fabricante = (select codigo from fabricante where fabricante.nombre='lenovo');
select * from producto where precio = (select precio from producto where codigo_fabricante =(select codigo from fabricante where fabricante.nombre='lenovo') order by precio DESC limit 1 );
select nombre from producto where codigo_fabricante = (select codigo from fabricante where fabricante.nombre='lenovo') order by precio DESC limit 1;
select * from producto where codigo_fabricante = (select codigo from fabricante where nombre = 'asus') and precio > (select avg(precio) from producto where codigo_fabricante = (select codigo from fabricante where nombre = 'asus'));
select nombre from fabricante where codigo in (select codigo_fabricante from producto);
select nombre from fabricante where codigo not in (select codigo_fabricante from producto);
select f.nombre from fabricante f inner join  producto p on f.codigo = p.codigo_fabricante group by f.nombre having count(p.codigo_fabricante) = ( select count(p2.codigo_fabricante) from fabricante f2 inner join producto p2 on f2.codigo = p2.codigo_fabricante where f2.nombre = 'Lenovo')


