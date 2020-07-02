# Proyecto 2: Recoge Bloques

## Requerimientos para la Aplicaión
```
Sistema Operativo requerido: Windows 8 o superiores.
Memoria Ram: 4 GB o Superiores.
Requerimiento de Ejecucion: Tener instalado Netbeans 8.0.1.(compatible para el sistema)
Procesador: Intel Core i3 o superiores.
Tipo de Sistema: 64bit.
```

## Clases Utilizadas
_Para la siguiente aplicación se utilizaron extenciones de clases para poder crear los JFrame y Thread para poder mover al jugador en todo el panel, también se implementaron TDA´s para poder guardar la información que nos proporcionaban_

![DiagramaClases](imagen.jpg)


## Métodos Utilizados

### Mover Jugador.
_Se utilizo la implementación de hilos para poderlo mover hacia los lados_

![MoverJugador1](imagen.jpg)

![MoverJugador2](imagen.jpg)

### Comparaciones
_Este nos ayudo para saber donde se encontraba cada boton y saber si el jugador estaba sobre la posición_

![MetodoParaComparar](imagen.jpg)

### Crear Botones 

![MetodoParaBotones](imagen.jpg)

## Lista Simple

![NodoSimple](imagen.jpg)

![GuardarYPintarSimple](imagen.jpg)

## Lista Doblemente Enlazada

![NodoDoble](imagen.jpg)

![GuardarYPintarDoble](imagen.jpg)

![EliminarDoble](imagen.jpg)

## Lista Circular Doblemente Enlazda

![GuardarDC](imagen.jpg)

![PintarDC](imagen.jpg)

![EliminarDC](imagen.jpg)

## Cola

![NodoCola](imagen.jpg)

![GuardarCola](imagen.jpg)

![PintarCola](imagen.jpg)

## Pila

![NodoPila](imagen.jpg)

![GuardarPila](imagen.jpg)

![PintarPila](imagen.jpg)



# Resolución del Problema
_Para el siguiente juego se creo una interfáz gráfica en Netbeans medonte su código, se utilizaron hilos para ir moviendo al bloque que simulaba ser el jugador mediante las flechitas, para poder optener la información de los bloques se tenian que cargar y su solución fue la implementación de un JFielChooser que este nos abre una pestaña tipo Windows para poder cargar el archivo, al tenerlos cargados se hizo una carga a nuestro tablero y se colocaron ahí los bloques pintados del color correspondientes, para obtner la información que traía cada uno de los datos se realizo un if que iba comparando la posicion que se habia guardado en cada uno de los bloques y se comparaba con la del jugador, asi mismo se comparo el color para poder saber sobre que bloque estaba el jugador._

