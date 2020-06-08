# Practica 1: BattleShip

### Requerimientos para la Aplicación.
```
Sistema Operativo requerido: Windows 8 o superiores.
Memoria Ram: 4 GB o Superiores.
Requerimiento de Ejecucion: Tener instalado Netbeans 8.0.1.(compatible para el sistema)
Procesador: Intel Core i3 o superiores.
Tipo de Sistema: 64bit.
```

### Clases Utilizadas
_Para esta aplicacion fueron requeridas 3 clases, la primera llamada Menu Inicio, la segunda Menu Principal (MenuP) y la tercera Menu Tablero eb el siguiente diagrama de clases veremos como estan relacionadas_

![DiagramadeClases](https://user-images.githubusercontent.com/66287100/83987538-ceec3400-a8fd-11ea-8084-7cdd380718e8.jpg)

### Métodos Utilizados
_1. Menú 1_

![MetodoMenu1,](https://user-images.githubusercontent.com/66287100/83987949-0a3b3280-a8ff-11ea-9fbb-1291d483aecb.png)

_2. Constructor Tablero_

![MetodoConstructorTablero](https://user-images.githubusercontent.com/66287100/83988030-466e9300-a8ff-11ea-9d7b-865848efc036.jpg)

_3. Iniciar Tablero_

![MetodoInicioTablero](https://user-images.githubusercontent.com/66287100/83988314-1ecbfa80-a900-11ea-95f0-78cd48e3de3d.jpg)

_4. Menú Tablero_

![MetodoMenuTablero](https://user-images.githubusercontent.com/66287100/83988363-3acf9c00-a900-11ea-838b-3bba8ed3451c.png)

![MetodoMenuTablero2](https://user-images.githubusercontent.com/66287100/83988367-3f945000-a900-11ea-86b2-38967ba7881d.jpg)


_5. Menu Barcos_

![MetodoMenuBarcos](https://user-images.githubusercontent.com/66287100/83988402-576bd400-a900-11ea-8b58-02b2cf51cb59.jpg)

_6. Split de Coordenadas_

![MetodoSplit](https://user-images.githubusercontent.com/66287100/83988442-71a5b200-a900-11ea-8aaa-c9b6dbacb3e1.jpg)

_7. Ingresar Coordenadas_

![MetodoIngresarCoordenadas](https://user-images.githubusercontent.com/66287100/83988469-884c0900-a900-11ea-8cc3-f316a8cf1211.jpg)

_8. Ingresar Easter Egg_

![MetodoEaster](https://user-images.githubusercontent.com/66287100/83988497-a1ed5080-a900-11ea-9a99-c562642179f0.jpg)

_9. Jugar_

![MetodoJugar](https://user-images.githubusercontent.com/66287100/83988508-af0a3f80-a900-11ea-9b1d-ba607b9cccb9.jpg)

![MetodoJugar2](https://user-images.githubusercontent.com/66287100/83988511-b03b6c80-a900-11ea-98ef-0e7195b77f02.jpg)

_10. Split Disparo_

![MetodoSplitDisparo](https://user-images.githubusercontent.com/66287100/83988564-d95bfd00-a900-11ea-9ecf-aead8a5e3279.jpg)

_11. Disparar_

![MetodoDisparar](https://user-images.githubusercontent.com/66287100/83988581-ea0c7300-a900-11ea-8afa-4ad68f531315.png)

### Resolución de Problema
_Para el siguiente problema, en si la logica se aplico a la hora de ingresar las coordenadas de cada uno de los barcos y asi mismo a la hora de disparar. Los que se aplico aquí es el uso de los vectores los cuales nos ayudarian a almacenar el nombre de los jugadores, la puntuacion y los intentos que se harían, así mismo se utilizo un arreglo bidimensional para crear el tablero el cual se iria llenando con los barcos. 
Cada uno de los barcos se irian ingresando de una forma especifica que era (filainiciom columnainicio)-(filafinal-columnafinal) pero para esto solo necesitamos los valores enteros de cada una de las coordenadas por lo que se realizo un metodo split que quitaba los parentesis y posterior a esto se utilizo un .charAt para tomar solo los valores y no tomar en cuenta los parentesis y la coma despues de esto, para poder hacer una buena inserción de barcos se debian de validar las posiciones de los demas barcos si en este caso ya estaban ingresados para poder colocar el barco en la posición ingresada, se utilizo un metodo separado para el Easter Egg ya que este se puede ingresar y cambiar de posición y a la hora de pegarle en el juego tiene que enviar un mensaje especifico, para la simulación del juego se utilizaron metodos similares para disparar y que fueran marcando la casilla que se les ingresaba, cuando estos le daban a un barco inmediatemente el barco se marcaba con "x" y se tomaba como hundido, para esto se tuvo que utilizar una validacion con una matriz clonada asi se iban validando las casillas y si en una de ellas se encontraba ocupara directamente ya sea la fila o culumna se marcaba con dicho simbolo el juego finalizaba de 3 maneras,la 1ra abandonar la partida, la 2da cuanto sus intetnos llegaban a 0 y la tercera era derrotando a todos los barcos._
