Práctica 8 Técnicas de Programación

Ejercicio 1:
### Enunciado:
Desarrollar una clase JugadorGuerraAR para simular una batalla de dados con realidad aumentada. Cada jugador tiene un dado virtual de seis caras y fichas, y la clase debe incluir algoritmos para animaciones y efectos visuales en 3D. Implementar un algoritmo principal que utilice esta clase en un entorno de realidad aumentada
.
### Pseudocódigo:
clase JugadorGuerraAR:
    # Atributos: fichas, dado virtual, nombre, animaciones 3D
    # Métodos necesarios para jugar y mostrar efectos en realidad aumentada

algoritmo principal:
    jugador1 = JugadorGuerraAR("Jimena")
    jugador2 = JugadorGuerraAR("Lucía")
    # Lógica de juego con efectos de realidad aumentada y simulación de dados
### Explicación: 
# Juego Guerra de Dados

Este proyecto es un juego simple basado en Java llamado "Guerra de Dados". Involucra a dos jugadores que lanzan dados y comparan sus resultados para determinar el ganador.

## Descripción de los Archivos

- `Dado.java`: Define una clase `Dado` con métodos para establecer el número de caras y lanzar el dado, simulando un tiro de dado.
- `Persona.java`: Define una clase `Persona` con atributos para el nombre y el ID de una persona, incluyendo getters y setters para estos atributos.
- `GuerraDeDados.java`: Contiene la lógica principal del juego donde dos jugadores lanzan dados, y sus resultados se comparan para determinar el ganador en una serie de rondas.

## Cómo Jugar

1. El juego comienza presentando un menú con opciones para jugar o salir.
2. Si se selecciona la opción de jugar, cada jugador ingresa su nombre.
3. El juego consiste en rondas donde cada jugador lanza un dado.
4. Después de cada ronda, se comparan los resultados y se determina el ganador de la ronda.
5. Los jugadores pueden elegir continuar jugando rondas o terminar el juego para ver los resultados totales.

Ejercicio 2:
### Enunciado:
Mejorar la clase Cliente para incluir funcionalidades de e-commerce con un sistema de recomendación inteligente basado en el historial de compras y preferencias del cliente. Crear clases para libros y vídeos con características avanzadas, y una clase Pedido que integre análisis de preferencias y recomendaciones
### Pseudocódigo:
clase ClienteECommerce:
    # Atributos: nombre, número de cliente, historial de compras, recomendaciones
    # Métodos para análisis de preferencias y generación de recomendaciones

clase Obra, Libro, Video:
    # Atributos y métodos específicos, más características avanzadas

clase Pedido:
    # Asociar cliente con obras compradas, integrando análisis y recomendaciones

algoritmo principal:
    # Menú para gestionar clientes, obras, pedidos y mostrar recomendaciones
### Explicación:
# Sistema de Gestión de Contenidos y Pedidos

Este proyecto es un sistema de gestión en Java que permite a los usuarios interactuar con un menú para gestionar clientes, contenidos y pedidos. El sistema maneja libros, videos y los pedidos asociados a los clientes.

## Descripción de los Archivos

- `Cliente.java`: Gestiona la información de los clientes, permitiendo crear y visualizar clientes, así como ver su historial de compras.
- `Contenido.java`: Clase abstracta que define la estructura básica para diferentes tipos de contenidos como libros y videos.
- `Libro.java`: Extiende `Contenido` para gestionar libros específicamente, incluyendo la creación y visualización de libros.
- `Menu.java`: Implementa un menú interactivo para que los usuarios interactúen con el sistema, realizando diversas operaciones.
- `Pedido.java`: Maneja la creación de pedidos, permitiendo a los clientes comprar libros o videos disponibles en el sistema.

## Cómo Usar

El sistema se inicia a través del menú principal, donde se pueden seleccionar diversas acciones como crear o visualizar clientes, importar contenido, crear pedidos, entre otros. Los usuarios interactúan con el sistema a través de entradas por consola para realizar las operaciones disponibles.

Ejercicio 3:
### Enunciado:
Crear una versión avanzada del juego de guerra de barcos utilizando inteligencia artificial y simulación de entornos marinos. La clase CuadriculaIA debe incluir algoritmos para simular condiciones marinas y estrategias de IA para el posicionamiento y ataque de barcos.
### Pseudocódigo:
clase CuadriculaIA:
    # Atributos: tablero, simulación ambiental, IA para estrategias
    # Métodos: depositarBarco(), disparar(), visualizacion()

algoritmo principal:
    cuadricula = CuadriculaIA()
    # Lógica del juego con IA y simulación de entornos marinos
### Explicación:
# Juego de Batalla Naval

Este proyecto es una implementación del juego clásico de batalla naval en Java. Permite a dos jugadores colocar barcos en una cuadrícula y atacar las posiciones del oponente con el objetivo de hundir todos sus barcos.

## Descripción de los Archivos

- `Barco.java`: Define la clase `Barco`, utilizada para crear y gestionar los barcos en el juego.
- `CuadriculaIA.java`: Define una cuadrícula para el juego, permitiendo colocar barcos y registrar los ataques.
- `Juego.java`: Contiene la lógica principal del juego, manejando la interacción entre los jugadores, el proceso de colocación de barcos y la secuencia de turnos para atacar.

## Cómo Jugar

Los jugadores introducen sus nombres y colocan sus barcos en la cuadrícula. Luego, por turnos, ingresan coordenadas para atacar al oponente. El juego proporciona retroalimentación sobre si el ataque fue un acierto o un fallo y muestra el estado actual de la cuadrícula. El juego continúa hasta que uno de los jugadores hunde todos los barcos del oponente.

Ejercicio 4:
### Enunciado:
En esta versión del juego, el jugador humano y la computadora compiten en un mundo virtual detallado. Utilizar técnicas de aprendizaje profundo para que la computadora adapte su estrategia basada en el juego del humano. Incluir gráficos avanzados y simulación de condiciones oceánicas.
### Pseudocódigo:
clase CuadriculaVirtual:
    # Atributos: tablero para humano y computadora, IA avanzada, gráficos 3D
    # Métodos: métodos para juego, visualización y adaptación de estrategias

algoritmo principal:
    cuadriculaHumano = CuadriculaVirtual()
    cuadriculaComputadora = CuadriculaVirtual()
    # Lógica del juego con desafío humano vs. máquina en entorno virtual
### Explicación:
# Juego de Batalla Naval

Este proyecto es una implementación en Java del clásico juego de batalla naval. Incluye clases para gestionar el juego, la lógica principal, y el tablero de juego.

## Descripción de los Archivos

- `Juego.java`: Contiene la clase `Juego`, que gestiona la lógica principal del juego, permitiendo a los jugadores y al ordenador colocar barcos y disparar en turnos.
- `Main.java`: Contiene la clase principal que inicia el juego.
- `Tablero.java`: Implementa un tablero para el juego, manejando la colocación y estado de los barcos, así como los disparos.

## Cómo Jugar

El juego se inicia desde la clase `Main`, que crea una instancia de `Juego` y comienza la interacción con el usuario para colocar barcos y realizar disparos. Los jugadores se turnan para atacar las posiciones del oponente, y el juego termina cuando todos los barcos de un jugador han sido hundidos.





