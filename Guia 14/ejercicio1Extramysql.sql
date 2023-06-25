###Ejercio 1 extra mysql

select Nombre from jugadores order by Nombre;
select * from jugadores where Posicion = 'C' and Peso > 200 order by Nombre;
select nombre from equipos order by Nombre;
select nombre from equipos where Conferencia = 'East';
select * from equipos where Ciudad Like 'c%' order by Nombre;
select Nombre_equipo  NombreEquipo,Nombre NombreJugadores from jugadores order by Nombre_equipo;
select * from jugadores where Nombre_equipo = 'Raptors' order by Nombre;
select Puntos_por_partido from estadisticas inner join jugadores on codigo = jugador where Nombre = 'Pau Gasol';
select Puntos_por_partido from estadisticas inner join jugadores on codigo = jugador where Nombre = 'Pau Gasol' and temporada = '04/05';
select jugador,sum(Puntos_por_partido) from estadisticas inner join jugadores on codigo = jugador group by jugador;
select Nombre,Conferencia,Division from equipos where Nombre = (select Nombre_equipo from jugadores order by Altura DESC limit 1);
select equipo_local,equipo_visitante,abs(puntos_local - puntos_visitante) as Diferencia from partidos where abs(puntos_local - puntos_visitante) = (select max(abs(puntos_local - puntos_visitante)) from partidos);
select codigo,equipo_local,equipo_visitante, case when puntos_local>puntos_visitante then equipo_local when puntos_visitante>puntos_local then equipo_visitante else null end as Equipo_ganador from partidos;
select codigo,equipo_local,equipo_visitante, equipo_ganador from partidos;

SELECT codigo, equipo_local, equipo_visitante,
       IF(puntos_local > puntos_visitante, equipo_local,
          IF(puntos_local < puntos_visitante, equipo_visitante, NULL)) AS equipo_ganador
FROM partidos;