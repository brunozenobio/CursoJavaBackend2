select count(Asistencias_por_partido),Asistencias_por_partido from estadisticas
	group by Asistencias_por_partido order by Asistencias_por_partido desc limit 1;
select * from estadisticas where Asistencias_por_partido=34;
##2
select sum(Peso) from jugadores where Nombre_equipo in (select nombre from equipos where Conferencia = "East") and Posicion like '%c%';
##14043
select count(*) from jugadores 
	where codigo in 
    (select jugador from estadisticas where Asistencias_por_partido>(select count(*) from jugadores where Nombre_equipo='Heat'));
##3
select count(*) from partidos where temporada like '%99%';
##3480
select * from partidos where codigo=2500;
select count(*) from jugadores
		where Procedencia like '%Michigan%' 
		and 
		Nombre_equipo in (select Nombre from equipos where Conferencia='West');
select count(*) from jugadores where peso>=195      ;  
##1
select avg(Puntos_por_partido) + count(Asistencias_por_partido) + sum(Tapones_por_partido) from estadisticas
	where jugador in (select codigo from jugadores where Nombre_equipo in (select Nombre from equipos where Division='Central'));
##631
select round((Tapones_por_partido)) from estadisticas where jugador = (select codigo from jugadores where Nombre='Corey Maggette') and temporada = '00/01';
##4
select sum(Puntos_por_partido) from estadisticas where jugador in (select codigo from jugadores where Procedencia='Argentina')
##191