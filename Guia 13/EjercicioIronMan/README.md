## Entidades
* Armadura
  * Atributos
    * String - colorPrimario 
    * String - colorSecuncario 
    * Bota - botaDerecha
    * Bota - botaIzquierda
    * Guante - guanteDerecho
    * Guante - guateIzquierdo
    * int - resistencia
    * int - salud
    * float - bateria carga maxima el mayor float posible
    * Casco - casco
    * JarvisService - jarvis
* Guante
  * Atributos
    * float - consumo
    * boolean - daniado 
* Bota
  * Atributos
    * float - consumo
    * boolean - daniado
* Casco
  * Atributos
    * Consola - consola
    * Sintetizador - sintetizador
    * boolean - daniado
    
* Consola
  * Atributos
    * float - consumo
* Sintetizador
  * Atributos
    * float - consumo
## Servicios

* JarvisService
  * Metodos desplazamiento
    * caminar, retorno el uso basico de cada bota * el tiempo de caminata
    * correr, retorno el uso normal de las botas (doble del basico ) * el tiempo de corrida
    * propulsarse, uso intensivo de las botas (triple del normal) * el tiempo de impulso
    * volar, uso intensivo de botas y y normal de guantes (doble de cada guate)  * el tiempo de vuelo
  * Informe de Jarvis
    * informarConsola, consumo basico de consolo
    * informarSintetizador, consumo basico de sintetizador
  * Verificar consumo
    * accion, recibe el consumo hecho por algun dispositivo y lo descuenta de la bateria de la armadura
  * atacar, uso intensivo de guantes(triplica el consumo) * el tiempo de disparo
  * mostrarEstado,muestro estado de toda la armadura, no olvidar llamar al consumo de la consula
  * estadoBateria, informe en porcentaje el estado de la bateria
  * mostrarEstadoExtra , informar el estado de la bateria en otras dos unidades
  * Daños
    * cada accion tiene un 30% de posibilidades de quie se dañe el dispositivo, llamar un metodo que rreflejo esto luego de cada accion
    * verificar daños, antes de cada accion verificar que el objeto a realizar no este dañado
    * repararDaños, un 40% de posibiliadees de repararse
    * revision, jarvis revisa el dsipositivo si esta dañado lo intenta arreglar de manera insistente, con un 30% de posibilidades de que se destruya, esto se debe hacer hasta que se arregle o destruya
    * Radar
      * detectar, jarvis detecta las coordenadas de objetos, x,y,z determinando ademas la hostilidad y la resistencia del objeto
      * distancia, jarvis calcula la distancia al objeto teniendo en cuenta la ubicacion de la armadura es 0,0,0
      * radar, este metodo implementa los dos anteriores, para simular un radar con la ubicacion de objetos su distancia y hostilidad  hasta 10 objetos
    * Atacando
      * jarvis analiza los objetos del radar si son hostiles y estan a menos de 5000 metros(alcance de los guantes) disparara, cada ataque disminuye la resistencia del enemigo, la potencia del disparo p = k / distancia, si el dispositivo esta roto o  no hay bateria no se podria disparara
    * Evasion
      * si el nivel de bateria pasa a ser menos del 10% jarvis volara para alejarse a 10km a una velocidad de 300km/h
      
      