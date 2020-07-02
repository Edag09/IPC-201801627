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

![DiagramaClases](https://user-images.githubusercontent.com/66287100/86310705-e906f280-bbdb-11ea-94d5-d56796be64b0.JPG)

## Métodos Utilizados

### Mover Jugador.
_Se utilizo la implementación de hilos para poderlo mover hacia los lados_

![MoverJugador1](https://user-images.githubusercontent.com/66287100/86310741-ffad4980-bbdb-11ea-9319-0699bbcafa76.JPG)

![MoverJugador2](https://user-images.githubusercontent.com/66287100/86310747-00de7680-bbdc-11ea-92ed-69727bea53b9.JPG)

### Comparaciones
_Este nos ayudo para saber donde se encontraba cada boton y saber si el jugador estaba sobre la posición_

![MetodoParaComparar](https://user-images.githubusercontent.com/66287100/86310773-118eec80-bbdc-11ea-8f9f-6690d31a68c7.JPG)

### Crear Botones 

![MetodoParaBotones](https://user-images.githubusercontent.com/66287100/86310788-15bb0a00-bbdc-11ea-9102-f52a80fb50f2.JPG)

## Lista Simple

![NodoSimple](https://user-images.githubusercontent.com/66287100/86310828-2b303400-bbdc-11ea-9117-b14a505bfabc.JPG)

![GuardarYPintarSimple](https://user-images.githubusercontent.com/66287100/86310830-2bc8ca80-bbdc-11ea-95b2-695b60738e99.JPG)

## Lista Doblemente Enlazada

![NodoDoble](https://user-images.githubusercontent.com/66287100/86310943-734f5680-bbdc-11ea-986b-d9e7b08e1cee.JPG)

![GuardarYPintarDoble](https://user-images.githubusercontent.com/66287100/86310940-721e2980-bbdc-11ea-8a8b-523864560073.JPG)

![EliminarDoble](https://user-images.githubusercontent.com/66287100/86310941-72b6c000-bbdc-11ea-9b81-1b187d283e8d.JPG)

## Lista Circular Doblemente Enlazda

![NodoDC](https://user-images.githubusercontent.com/66287100/86311092-d0e3a300-bbdc-11ea-98d2-c619ce1efc29.JPG)

![GuardarDC](https://user-images.githubusercontent.com/66287100/86311071-c6c1a480-bbdc-11ea-90c3-ab2935f7d00a.JPG)

![PintarDC](https://user-images.githubusercontent.com/66287100/86311073-c6c1a480-bbdc-11ea-9c63-c1f9e692678f.JPG)

![EliminarDC](https://user-images.githubusercontent.com/66287100/86311075-c75a3b00-bbdc-11ea-8bf4-edcb15d8072b.JPG)

## Cola

![NodoCola](https://user-images.githubusercontent.com/66287100/86311287-49e2fa80-bbdd-11ea-8b43-f6c1d9e0ad87.JPG)

![GuardarCola](https://user-images.githubusercontent.com/66287100/86311289-4bacbe00-bbdd-11ea-8bdc-5746c860d300.JPG)

![PintarCola](https://user-images.githubusercontent.com/66287100/86311294-4cddeb00-bbdd-11ea-9cb3-9040cc28adbd.JPG)

## Pila

![NodoPila](https://user-images.githubusercontent.com/66287100/86312764-aa276b80-bbe0-11ea-9994-52a3f9cbe9ee.JPG)

![GuardarPila](https://user-images.githubusercontent.com/66287100/86312768-ab589880-bbe0-11ea-8cb5-1d051e617ecd.JPG)

![PintarPila](https://user-images.githubusercontent.com/66287100/86312770-ac89c580-bbe0-11ea-9df7-a5acac74c784.JPG)


# Resolución del Problema
_Para el siguiente juego se creo una interfáz gráfica en Netbeans medonte su código, se utilizaron hilos para ir moviendo al bloque que simulaba ser el jugador mediante las flechitas, para poder optener la información de los bloques se tenian que cargar y su solución fue la implementación de un JFielChooser que este nos abre una pestaña tipo Windows para poder cargar el archivo, al tenerlos cargados se hizo una carga a nuestro tablero y se colocaron ahí los bloques pintados del color correspondientes, para obtner la información que traía cada uno de los datos se realizo un if que iba comparando la posicion que se habia guardado en cada uno de los bloques y se comparaba con la del jugador, asi mismo se comparo el color para poder saber sobre que bloque estaba el jugador._

