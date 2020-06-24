# Practica 2: Galaga

### Requerimientos para la Aplicación.
```
Sistema Operativo requerido: Windows 8 o superiores.
Memoria Ram: 4 GB o Superiores.
Requerimiento de Ejecucion: Tener instalado Netbeans 8.0.1.(compatible para el sistema)
Procesador: Intel Core i3 o superiores.
Tipo de Sistema: 64bit.
```
### Clases Utilizadas
_Para esta aplicacion solicitamos el uso de hilos(Thread) esto ya que se iban a ejecutar mas de un solo proceso por lo tanto en el diagrama de clases verremos su solicion_

![DiagramaClases](//IMAGENES//DiagramaClases.jpg)

## Métodos Utilizados

### Contructor Imagenes
_Este metodo lo utilizamos para popder mostrar las imagenes en nuestro panel_

![ConstructordeImagenes](//IMAGENES//ConstructordeImagenes.jpg)

### Repeticion de Imagenes
_Este metodo lo utilizamos para popder repetir ciertas veces para simular que caen varios a la vez_

![RepeticiondeImagenes](//IMAGENES//RepeticiondeImagenes.jpg)


### Declaracion de Etiquetas
_Este metodo lo utilizamos para popder crear todas las etiquetas que utilizamos para poder incertar las imagenes_

![DeclaracionLabels](//IMAGENES//DeclaracionLabels.jpg)


### Mover Imagenes
_Este metodo lo utilizamos para popder hacer la simulacion de movimientos para las imagenes que van cayendo_

![HiloObjetos](//IMAGENES//HiloObjetos.jpg)


### Mover Nave y Disparar
_Este metodo lo utilizamos para popder hacer la simulacion de que la nave se esta moviendo hacia los lados y disparar_

![MoverNave y Disparar](//IMAGENES//MoverNaveyDisparar.jpg)


### Teclas para mover
_Este esta dentro del panel para poder llamar el ActionEvent y KeyEvent_

![Presion](//IMAGENES//Presion.jpg)


### Timer
_Dentro de este se hizo un cronometro que va hacia atras_

![Timer](//IMAGENES//Timer.jpg)


## Resolución de Problema

_Para este juego se tuvo que implemntar la herramienta de hilos porque se necesita usar mas procesos de los normales, primero se tuvo que ver como iban a estar colocados las imagenes ya que nuestro panel llamado lienzo iba a tener el tamaño de 400x600 así tenían 4 carriles en la horizotal y 6 carriles en la vertical, despues de tener esto se generaron las demas imagenes afuera del lienzo para que se notara que estan cayendo del cielo, teniendo esto se implementaron los hilos para que emepzaran a moverse las imagenes desde el alto del lienzo, se hicieron varios hilos para poder controlar el timer, el caer de los objetos, mover la imagen, disparar, destuir y aadaprar los poderes, depues te esto se junto todo en el lienzo para poder armar la logica de como irian cayendo, tambien se uso la librieria de Timer y TimerTask para poder ponerles un contador dado de cada cuanto se iban a repetir y cada cuanto iban a caer._

