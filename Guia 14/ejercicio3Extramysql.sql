#Ejercicio 3 extra mysql
select nombre from pokemon;
select nombre from pokemon where peso < 10;
select * from pokemon where numero_pokedex in (select numero_pokedex from pokemon_tipo where id_tipo in (select id_tipo  from tipo where nombre = 'agua'));
select * from pokemon where numero_pokedex in (select numero_pokedex from pokemon_tipo where id_tipo in (select id_tipo  from tipo where nombre = 'agua'));
select * from pokemon inner join pokemon_tipo on pokemon.numero_pokedex = pokemon_tipo.numero_pokedex inner join tipo on pokemon_tipo.id_tipo = tipo.id_tipo where tipo.nombre = 'agua';
select * from pokemon where numero_pokedex in (select numero_pokedex from pokemon_tipo where id_tipo in (select id_tipo  from tipo where nombre = 'agua' or nombre = 'fuego' or nombre = 'tierra') );
select * from pokemon where numero_pokedex in (select numero_pokedex from pokemon_tipo where id_tipo in (select id_tipo  from tipo where nombre = 'fuego')) and numero_pokedex in (select numero_pokedex from pokemon_tipo where id_tipo in (select id_tipo  from tipo where nombre = 'volador'));
select * from pokemon where numero_pokedex in (select numero_pokedex from estadisticas_base where ps >200 );
select nombre,peso,altura from pokemon where numero_pokedex = (select pokemon_origen from evoluciona_de where pokemon_evolucionado = (select numero_pokedex from pokemon where nombre='arbok'));
select * from pokemon where numero_pokedex in (select numero_pokedex from pokemon_forma_evolucion where id_forma_evolucion in (select id_forma_evolucion from forma_evolucion where tipo_evolucion in (select id_tipo_evolucion from tipo_evolucion where tipo_evolucion = 'Intercambio') ));
select nombre from movimiento where prioridad = (select max(prioridad) from movimiento);
select nombre from movimiento  order by prioridad DESC limit 1;
select nombre,peso from pokemon order by peso DESC limit 1;
select ta.tipo,count(*) as Cantidad_Mov
	from tipo_ataque ta
    inner join tipo as ti on ta.id_tipo_ataque = ti.id_tipo_ataque
    inner join movimiento as mo on mo.id_tipo = ti.id_tipo
    group by ta.id_tipo_ataque;
select mo.nombre from movimiento mo
	inner join movimiento_efecto_secundario mef on mo.id_movimiento = mef.id_movimiento
    inner join efecto_secundario ef on mef.id_efecto_secundario = ef.id_efecto_secundario
    where ef.efecto_secundario = 'envenenamiento leve';
select mo.nombre from movimiento mo
	where mo.descripcion like 'Causa daño%'
    order by mo.nombre ;
    
select  po.nombre,pmf.id_movimiento
	from pokemon_movimiento_forma pmf 
    inner join pokemon po on pmf.numero_pokedex = po.numero_pokedex
    where po.nombre = 'pikachu';
select  po.nombre,pmf.id_movimiento
	from pokemon_movimiento_forma pmf 
    inner join pokemon po on pmf.numero_pokedex = po.numero_pokedex
    inner join forma_aprendizaje fa on fa.id_forma_aprendizaje = pmf.id_forma_aprendizaje
    inner join tipo_forma_aprendizaje tfa on tfa.id_tipo_aprendizaje = fa.id_tipo_aprendizaje
    where po.nombre = 'pikachu' and tfa.tipo_aprendizaje = 'MT';
select mov.nombre,np.nivel
	from movimiento mov 
	inner join pokemon_movimiento_forma pmf on mov.id_movimiento = pmf.id_movimiento
    inner join nivel_aprendizaje np on pmf.id_forma_aprendizaje=np.id_forma_aprendizaje
    where pmf.numero_pokedex = (select numero_pokedex from pokemon where nombre='pikachu')
		and mov.id_tipo in (select id_tipo from tipo where nombre='normal');
	
 select mov.nombre   from movimiento mov
	inner join movimiento_efecto_secundario mec on mov.id_movimiento = mec.id_movimiento
    where mec.probabilidad > 30;
select * from pokemon 
	where numero_pokedex in 
		(select numero_pokedex from pokemon_forma_evolucion where id_forma_evolucion in 
			(select id_forma_evolucion from forma_evolucion where tipo_evolucion in 
				(select id_tipo_evolucion from tipo_evolucion where tipo_evolucion = 'piedra') ));
    
select pokemon.nombre from pokemon
	left join pokemon_forma_evolucion on pokemon.numero_pokedex = pokemon_forma_evolucion.numero_pokedex
    where pokemon_forma_evolucion.numero_pokedex is null;
    
select tipo.nombre,count(pokemon.numero_pokedex) from pokemon
	inner join pokemon_tipo on pokemon.numero_pokedex = pokemon_tipo.numero_pokedex
	inner join tipo on pokemon_tipo.id_tipo = tipo.id_tipo
    group by tipo.nombre;





