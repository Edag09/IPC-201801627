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

![DiagramaClases](https://user-images.githubusercontent.com/66287100/85490139-7a4be880-b58e-11ea-85a1-b684e1157c79.JPG)


## Métodos Utilizados

### Contructor Imagenes
_Este metodo lo utilizamos para popder mostrar las imagenes en nuestro panel_

![ConstructordeImagenes](https://user-images.githubusercontent.com/66287100/85490188-918ad600-b58e-11ea-8a67-1e1d619d15fb.JPG)


### Repeticion de Imagenes
_Este metodo lo utilizamos para popder repetir ciertas veces para simular que caen varios a la vez_

![RepeticiondeImagenes](https://user-images.githubusercontent.com/66287100/85490231-9f405b80-b58e-11ea-885f-bd0b8ec5f4bc.JPG)


### Declaracion de Etiquetas
_Este metodo lo utilizamos para popder crear todas las etiquetas que utilizamos para poder incertar las imagenes_

![DeclaracionLabels](https://user-images.githubusercontent.com/66287100/85490264-af583b00-b58e-11ea-8f1b-37035b54041d.JPG)


### Mover Imagenes
_Este metodo lo utilizamos para popder hacer la simulacion de movimientos para las imagenes que van cayendo_

![HiloObjetos](https://user-images.githubusercontent.com/66287100/85490300-c0a14780-b58e-11ea-9636-6a0ec9803434.JPG)


### Mover Nave y Disparar
_Este metodo lo utilizamos para popder hacer la simulacion de que la nave se esta moviendo hacia los lados y disparar_

![MoverNave y Disparar](https://user-images.githubusercontent.com/66287100/85490341-cf87fa00-b58e-11ea-8fa0-1cae20957d24.JPG)


### Teclas para mover
_Este esta dentro del panel para poder llamar el ActionEvent y KeyEvent_

![Presion](https://user-images.githubusercontent.com/66287100/85490376-dca4e900-b58e-11ea-8279-1c6725b00c4c.JPG)


### Timer
_Dentro de este se hizo un cronometro que va hacia atras_

![Timer](https://user-images.githubusercontent.com/66287100/85490402-e9c1d800-b58e-11ea-8a3c-a3e3eb49a6eb.JPG)


## Resolución de Problema

_Para este juego se tuvo que implemntar la herramienta de hilos porque se necesita usar mas procesos de los normales, primero se tuvo que ver como iban a estar colocados las imagenes ya que nuestro panel llamado lienzo iba a tener el tamaño de 400x600 así tenían 4 carriles en la horizotal y 6 carriles en la vertical, despues de tener esto se generaron las demas imagenes afuera del lienzo para que se notara que estan cayendo del cielo, teniendo esto se implementaron los hilos para que emepzaran a moverse las imagenes desde el alto del lienzo, se hicieron varios hilos para poder controlar el timer, el caer de los objetos, mover la imagen, disparar, destuir y aadaprar los poderes, depues te esto se junto todo en el lienzo para poder armar la logica de como irian cayendo, tambien se uso la librieria de Timer y TimerTask para poder ponerles un contador dado de cada cuanto se iban a repetir y cada cuanto iban a caer._

