#Ejercicio 3 extra mysql
select nombre from pokemon;
select nombre from pokemon where peso > 10;
select * from pokemon where numero_pokedex in (select numero_pokedex from pokemon_tipo where id_tipo in (select id_tipo  from tipo where nombre = 'agua'));
select * from pokemon where numero_pokedex in (select numero_pokedex from pokemon_tipo where id_tipo in (select id_tipo  from tipo where nombre = 'agua'));
select * from pokemon where numero_pokedex in (select numero_pokedex from pokemon_tipo where id_tipo in (select id_tipo  from tipo where nombre = 'fuego')) and numero_pokedex in (select numero_pokedex from pokemon_tipo where id_tipo in (select id_tipo  from tipo where nombre = 'volador'));
select * from pokemon where numero_pokedex in (select numero_pokedex from estadisticas_base where ps >200 );
select nombre,peso,altura from pokemon where numero_pokedex = (select pokemon_origen from evoluciona_de where pokemon_evolucionado = (select numero_pokedex from pokemon where nombre='arbok'));
select * from pokemon where numero_pokedex in (select numero_pokedex from pokemon_forma_evolucion where id_forma_evolucion in (select id_forma_evolucion from forma_evolucion where tipo_evolucion in (select id_tipo_evolucion from tipo_evolucion where tipo_evolucion = 'Intercambio') ));










