# Proyecto 1: Banco y Aseguradora

## Requerimientos para la Aplicaión
```
Sistema Operativo requerido: Windows 8 o superiores.
Memoria Ram: 4 GB o Superiores.
Requerimiento de Ejecucion: Tener instalado Netbeans 8.0.1.(compatible para el sistema)
Procesador: Intel Core i3 o superiores.
Tipo de Sistema: 64bit.
```

## Clases Utilizadas
_Para el desarrollo de esta aplicación se utilizaron varias clases para poder ir almacenando los datos reueridos a continuacnión en el diagrama se vera como se relaciona las clases para poder manupular la información_

![DiagramaClase1](IMAGENES/DiagramaClase1.jpg)

![DiagramaClase2](IMAGENES/DiagramaClase2.jpg)

## Metodos Utilizados


### Método de Agregar
_Este metodo se utiliza para ir ingresando ya sea una persona aseugrada, un no asegurado, un incidente, etc. Este método ayuda a la incersión de los datos_

![AgregarPersonaAsegurada](IMAGENES/AgregarPersonaAsegurada.jpg)

### Método Validación y Retorno

_En el primer metodo hacemos una validación del dato para saber si se encuenta o no la persona identificada con ese dato, esto nos puede servir para algún login o aprovación_

_El segundo método que es el que nos retorna el nombre de esa persona asociado con ese dato, esto se puede hacer para cualquier tipo de dato y puede retornar tambien cualquier dato de esa persona_

![Validaciones](IMAGENES/Validaciones.jpg)

### Método Para Cargar Datos

_Se realiza un Split para poder separar las cadenas de datos que nos brindan para poder llenar las clases necesarias y componenetes de los formularios, se separan y se guardan respectivamente en su clase_

![CargarDatos](IMAGENES/CargarDatos.jpg)

### Métodos para ingresar datos de Carga Masiva

_Estos son los metodos implementados para los datos de la sobrecarga ya que estos van a ir variando ya que los datos entran de forma de cadena y se pueden separa en enteros o decimales o en este caso porcentajes_

![MetodosCarga](IMAGENES/MetodosCarga.jpg)

_En el metodo datoTipo lo que se hace es que se extrae el tipo ingresado y como se ve que recibe de parametro un JComboBox y una palabra la cual sera la misma que en la carga masiva esto es para poder cargarlos en los ComboBox del formulario, también en los siguientes se va extrayendo los datos necesarios de cada utilidad_

![MetodosCarga2](IMAGENES/MetodosCarga2.jpg)

### Método Mostrar Tablas

_Como podemos ver esta tabla es para el tipo de Persona Asegurada por lo tanto los datos que se visualizaran en esta son los de tal persona, por lo tanto esto se puede utilizar para cualquier tipo de clase solo que se tiene que especificar que tipos de datos se desea que visualice el usuario_

![MetodosMostrarTablasCarga2](IMAGENES/MostrarTablas.jpg)


## Resolución del Problema

_Se analizo despues de una lectura al encunciado las necesidades que iban a tener los usuarios que adquirieran los seguros y los que iban a ser ingresados como no asegurados, En primera se tenía que tener en cuenta que los usuarios iban a solicitar el seguro por medio de un formulario el cual se iba a llenar de manera automatica en la parte de los calculos, los cuales se fueron obteniendo despues de la carga masiva ya que por cada tipo, marca, uso, linea y modelo se iba a tener cierto porcentaje de poliza y depreciación por lo tanto se utilizaron estos valores para poder calcular la prima, el deducible y los pisbles deducibles y primas que el usuario queria obtener, segundo los administradores podrian reportar los incidentes que se tenían entonces se hizo una interfaz gráfica en donde se relacionaba el autor y el dañado el cual podria estar asegura o no entonces por medio de unos CheckBox se pudo induir quien era el resposable del incidente y a la hora de reportar el incidente se se iba a agregar al perfil de la persona culpable para pagar, Tercero para las personas que no eran aseguradas a la hora de reportar los incidentes se les crea el usuario de no asegurado y se muestra una tabla donde detalla todo, por ultimo se hicieron reportes de las personas quienes estucieron mayormente incolucradas en mas incidentes y quienes pagaron la mayor poliza_