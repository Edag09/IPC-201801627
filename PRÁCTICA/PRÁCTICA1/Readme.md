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



_2. Constructor Tablero_
//SS construcotr tablero

_3. Iniciar Tablero_
//ss iniciar Tablero

_4. Menú Tablero_
//ss MenuTablero

_5. Menu Barcos_
//ss MenuBarco

_6. Split de Coordenadas_
//ss Split

_7. Ingresar Coordenadas_
//Ss ingresarCoordenadas

_8. Ingresar Easter Egg_
// metodo Easter

_9. Jugar_
// Jugar 1 y2 

_10. Split Disparo_
//metodoSplitdisparo

_11. Disparar_
//Disparar

### Resolución de Problema
_Para el siguiente problema, en si la logica se aplico a la hora de ingresar las coordenadas de cada uno de los barcos y asi mismo a la hora de disparar. Los que se aplico aquí es el uso de los vectores los cuales nos ayudarian a almacenar el nombre de los jugadores, la puntuacion y los intentos que se harían, así mismo se utilizo un arreglo bidimensional para crear el tablero el cual se iria llenando con los barcos. 
Cada uno de los barcos se irian ingresando de una forma especifica que era (filainiciom columnainicio)-(filafinal-columnafinal) pero para esto solo necesitamos los valores enteros de cada una de las coordenadas por lo que se realizo un metodo split que quitaba los parentesis y posterior a esto se utilizo un .charAt para tomar solo los valores y no tomar en cuenta los parentesis y la coma despues de esto, para poder hacer una buena inserción de barcos se debian de validar las posiciones de los demas barcos si en este caso ya estaban ingresados para poder colocar el barco en la posición ingresada, se utilizo un metodo separado para el Easter Egg ya que este se puede ingresar y cambiar de posición y a la hora de pegarle en el juego tiene que enviar un mensaje especifico, para la simulación del juego se utilizaron metodos similares para disparar y que fueran marcando la casilla que se les ingresaba, cuando estos le daban a un barco inmediatemente el barco se marcaba con "x" y se tomaba como hundido, para esto se tuvo que utilizar una validacion con una matriz clonada asi se iban validando las casillas y si en una de ellas se encontraba ocupara directamente ya sea la fila o culumna se marcaba con dicho simbolo el juego finalizaba de 3 maneras,la 1ra abandonar la partida, la 2da cuanto sus intetnos llegaban a 0 y la tercera era derrotando a todos los barcos._
