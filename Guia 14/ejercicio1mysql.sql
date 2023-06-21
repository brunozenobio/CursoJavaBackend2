## SCRIP SEJERCICIO 1##

select * from empleados;
select * from departamentos;
#Ejercicio 3
select nombre_depto from departamentos;

select nombre,sal_emp from empleados;
select comision_emp from empleados;
select * from empleados where cargo_emp = 'Secretaria';
select * from empleados where cargo_emp = 'Vendedor' order by nombre;
select nombre,cargo_emp from empleados order by sal_emp;
select nombre from empleados inner join departamentos on empleados.id_depto = departamentos.id_depto AND departamentos.ciudad= 'Ciudad Real';
select nombre as Nombre, cargo_emp as Cargo from empleados;
select sal_emp as Salario,comision_emp as Comision from empleados where id_depto = 2000 order by Comision;
select nombre,(500 + sal_emp +comision_emp) as SueldoTotal from empleados where id_depto = 3000 order by nombre;
select * from empleados where nombre like 'J%';
select nombre,sal_emp,comision_emp,(sal_emp + comision_emp) as SalarioTotal from empleados where comision_emp > 1000;
select nombre,sal_emp,comision_emp,(sal_emp + comision_emp) as SalarioTotal from empleados where comision_emp = 0;
select * from empleados where comision_emp > sal_emp;
select * from empleados where comision_emp <= 0.3 * sal_emp;
select * from empleados where nombre  not like '%MA%';
select nombre_depto from departamentos where nombre_depto in ('VENTAS','INVESTIGACION','MANTENIMIENTO');
select nombre_depto from departamentos where nombre_depto not in ('VENTAS','INVESTIGACION','MANTENIMIENTO');
select max(sal_emp) from empleados;
select nombre from empleados order by nombre DESC limit  1;
select max(sal_emp) as SalMax,min(sal_emp) as SalMin, (max(sal_emp) - min(sal_emp)) as Diferencia from empleados;
select AVG(sal_emp) from empleados group by id_depto;
select count(id_emp) from empleados group by id_depto having count(id_depto) > 3;
## SELECT nombre_depto AS departamento, COUNT(*) AS num_empleados FROM departamentos dJOIN empleados e ON d.id_depto = e.id_deptoGROUP BY nombre_deptoHAVING COUNT(*) > 3;
select count(id_emp) from empleados group by id_depto having count(id_depto) = 0 ;
select nombre,nombre_depto,nombre_jefe_depto from empleados inner join departamentos on empleados.id_depto = departamentos.id_depto;
select * from empleados where sal_emp >= (select avg(sal_emp) from empleados)  order by id_depto











