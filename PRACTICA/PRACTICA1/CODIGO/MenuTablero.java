package Org.EduardoAgustin.Menu;

import java.util.Scanner;

public class MenuTablero {
    public int opc,entrada,intentos,auintento,res,opcjuego;
    public boolean status ;
    String Tablero[][];
    public Scanner readoption = new Scanner(System.in);
    public Scanner juego;
    public String coordenada;
    public int Xo, Yo, Xf, Yf;
    public String nickname;
    
    
    public MenuTablero() {
        this.opc = 0;
        Tablero = new String[10][10];
        this.entrada=0;
        this.juego = new Scanner(System.in);
        this.intentos =10;
    }
    
    public void MTablero(){
        do{
        System.out.println("Selecciona una opcion por favor");
        System.out.println("--->1. Ingresar Barcos");
        System.out.println("--->2. Cambiar Cantidad de Movimientos");
        System.out.println("--->3. Iniciar Juegos");
        System.out.println("--->4. Ver Tablero");
        System.out.println("--->5. Reiniciar Tablero");
        System.out.println("--->6. Regresar al Menu");
        opc = readoption.nextInt();
            
            switch(opc){
            case 1:
                IniciarTablero();
                break;
            case 2:
                AumentarIntentos();
                break;
            case 3:
                Jugar();
                break;
            case 4:
                for (int i = 0; i < Tablero.length; i++) {
                    for (int j = 0; j < Tablero.length; j++) {
                        System.out.print("["+Tablero[i][j]+"]");
                    }
                        System.out.println("");
                }
                break;
            case 5:
                for (int i = 0; i < Tablero.length; i++) {
           for (int j = 0; j < Tablero.length; j++) {
               Tablero[i][j]=" ";
               Tablero[i][0]=""+i+"";
               Tablero[0][j]=""+j+"";
               System.out.print("["+Tablero[i][j]+"]");
           }
           System.out.println("");
       }
                break;
            case 6:
                Regreso();
                break;
            }
        }while(!status);
    }
   
   public void IniciarTablero(){
       for (int i = 0; i < Tablero.length; i++) {
           for (int j = 0; j < Tablero.length; j++) {
               Tablero[i][j]=" ";
               Tablero[i][0]=""+i+"";
               Tablero[0][j]=""+j+"";
               System.out.print("["+Tablero[i][j]+"]");
           }
           System.out.println("");
       }
       MenuBarcos();
   }
   
   public void MenuBarcos(){
       for (int a = 0; a < 5; a++) {
       System.out.println("Que barco deseas ingresar?");
       System.out.println("1. Portaaviones");
       System.out.println("2. Submarino");
       System.out.println("3. Destructur");
       System.out.println("4. Fragata");
       System.out.println("5. EASTER EGG");
       opc = readoption.nextInt();
       switch(opc){
           case 1:
               if (entrada < 1) {
                System.out.println("Ingresa tu coordenada del Portavion" );
               coordenada = readoption.next();
               SplitPosicion(coordenada);
               entrada++;
               }else if(entrada >=1){
                   System.out.println("Ya ingresaste un portaviones");
               }
              break;
               
           case 2:
               for (int n = 0; n < 3; n++) {
                   System.out.println("Ingresa tus coordenadas del Submarino "+(n+1));
                   coordenada = readoption.next();
                   SplitPosicion(coordenada);
               }
               break;
           case 3:
               for (int n = 0; n < 3; n++) {
                   System.out.println("Ingresa tus coordenadas del Destructor"+(n+1));
                   coordenada = readoption.next();
                   SplitPosicion(coordenada);
               }
               break;
           case 4:
               for (int n = 0; n < 1; n++) {
                   System.out.println("Ingresa tus coordenadas de las Fragatas"+(n+1));
                   coordenada = readoption.next();
                   SplitPosicion(coordenada);
               }
               break;
           case 5:
                   System.out.println("Ingresa tus coordenadas");
                   coordenada = readoption.next();
                   SplitEasterEgg(coordenada);
               break;
                default: 
               System.out.println("Opcion incorrecta");
               break;
       }
       }
   }
   
   public void SplitPosicion(String cade){
        try {
       String[] coordenadacadena = cade.split("-");
       String quitaparentesis;
       for (int i = 0; i < coordenadacadena.length; i++) {
           quitaparentesis = coordenadacadena[i];
          if (i == 0) {
               String Valxo = String.valueOf(quitaparentesis.charAt(1));
               String Valyo = String.valueOf(quitaparentesis.charAt(3));
               Xo = Integer.parseInt(Valxo);
               Yo = Integer.parseInt(Valyo);
           }else{
               String vxo = String.valueOf(quitaparentesis.charAt(1));
               String vyo = String.valueOf(quitaparentesis.charAt(3));
               Xf = Integer.parseInt(vxo);
               Yf = Integer.parseInt(vyo);
           }
        }
       } catch (Exception e) {
            System.out.println("Has ingresado una Coordenada fuera de Rango, por favor ingresa nuevamente");
       }
       IngresodeCoordenadas();
   }
   
   public void IngresodeCoordenadas(){
       if (Xo == Xf) {
           for (int i = Xo; i < Xf+1; i++) {
               for (int j = Yo; j <=Yf; j++) {
                   Tablero[i][j]="0";
               }
               System.out.println("");
           }
       }else if (Yo == Yf) {
           for (int i = Xo; i <=Xf; i++) {
               for (int j = Yo; j < Yf+1; j++) {
                   Tablero[i][j]="0";
               }
               System.out.println("");
           }
       }else{
           System.out.println("Ingrese Coordenadas Validas");
       }
        for (int i = 0; i < Tablero.length; i++) {
           for (int j = 0; j < Tablero.length; j++) {
               System.out.print("["+Tablero[i][j]+"]");
           }
           System.out.println("");
       }
        System.out.println("");
        
   }
   
   public void ingresarEasterEgg(){
       if (Xo == Xf) {
           for (int i = Xo; i < Xf+1; i++) {
               for (int j = Yo; j <=Yf; j++) {
                   Tablero[i][j]="$";
               }
               System.out.println("");
           }
       }else if (Yo == Yf) {
           for (int i = Xo; i <=Xf; i++) {
               for (int j = Yo; j < Yf+1; j++) {
                   Tablero[i][j]="$";
               }
               System.out.println("");
           }
       }else{
           System.out.println("Ingrese Coordenadas Validas");
       }
        for (int i = 0; i < Tablero.length; i++) {
           for (int j = 0; j < Tablero.length; j++) {
               System.out.print("["+Tablero[i][j]+"]");
           }
           System.out.println("");
       }
        System.out.println("");
        
   
   }
   
   public void SplitEasterEgg(String cade){
       try {
       String[] coordenadacadena = cade.split("-");
       String quitaparentesis;
       for (int i = 0; i < coordenadacadena.length; i++) {
           quitaparentesis = coordenadacadena[i];
          if (i == 0) {
               String Valxo = String.valueOf(quitaparentesis.charAt(1));
               String Valyo = String.valueOf(quitaparentesis.charAt(3));
               Xo = Integer.parseInt(Valxo);
               Yo = Integer.parseInt(Valyo);
           }else{
               String vxo = String.valueOf(quitaparentesis.charAt(1));
               String vyo = String.valueOf(quitaparentesis.charAt(3));
               Xf = Integer.parseInt(vxo);
               Yf = Integer.parseInt(vyo);
           }
        }
       } catch (Exception e) {
            System.out.println("Has ingresado una Coordenada fuera de Rango, por favor ingresa nuevamente");
       }
       ingresarEasterEgg();
   }
   
   public void Regreso(){
       MenuP principal = new MenuP();
       principal.IniciarMenu();
   }

   public void AumentarIntentos(){
       intentos = auintento;
       System.out.println("Tienes "+intentos+" intentos\n");
       System.out.println("Quieres cambiar el numero de intentos\n1. Si\n2. No?");
       opc = readoption.nextInt();
       if (opc ==1 ) {
           System.out.println("Coloca el numero de intentos que deseas");
           auintento = readoption.nextInt();
           System.out.println("Ahora tienes "+auintento);
       }else{
           System.out.println("Bai");
       }
       
   }
   
   
   public void Jugar(){
       
       System.out.println("Ingresa tu nickname");
       nickname = readoption.next();
       
       System.out.println("\nComenzamos");
       
       do{
       System.out.println("Hora: ");
       System.out.println("Barcos: ");
       System.out.println("Intentos: ");
                System.out.println(res+"/10 Realizados");
                System.out.println(intentos+"/10 Restantes");
                
             for (int i = 0; i < Tablero.length; i++) {
                    for (int j = 0; j < Tablero.length; j++) {
                        System.out.print("["+Tablero[i][j]+"]");
                    }
                        System.out.println("");
                }
             
             System.out.println("1. Lanzar Misil");
             System.out.println("2. Abandonar la partida");
             opcjuego = juego.nextInt();
             switch(opcjuego){
                 case 1:
                     System.out.println("Ingresa las coordenadas del disparo");
                     coordenada = readoption.next();
                     SplitDisparo(coordenada);
                     intentos--;
                     res++;
                     break;
                 case 2:
                     System.out.println("Hasta luego");
                     intentos=0;
                     break;
                 default:
                     System.out.println("Ingresa una opcion correcta");
             }
             
             
             }while(intentos != 0);
   }
       
   
   public void Disparar(){
       if (Xo == Xf) {
           for (int i = Xo; i < Xf+1; i++) {
               for (int j = Yo; j <=Yf; j++) {
                   Tablero[i][j]="x";
               }
               System.out.println("");
           }
       }else if (Yo == Yf) {
           for (int i = Xo; i <=Xf; i++) {
               for (int j = Yo; j < Yf+1; j++) {
                   Tablero[i][j]="x";
               }
               System.out.println("");
           }
       }else{
           System.out.println("Ingrese Coordenadas Validas");
       }
        for (int i = 0; i < Tablero.length; i++) {
           for (int j = 0; j < Tablero.length; j++) {
               System.out.print("["+Tablero[i][j]+"]");
           }
           System.out.println("");
       }
        System.out.println("");
        
   }
   
   public void SplitDisparo(String cade){
       try {
       String[] coordenadacadena = cade.split("-");
       String quitaparentesis;
       for (int i = 0; i < coordenadacadena.length; i++) {
           quitaparentesis = coordenadacadena[i];
          if (i == 0) {
               String Valxo = String.valueOf(quitaparentesis.charAt(1));
               String Valyo = String.valueOf(quitaparentesis.charAt(3));
               Xo = Integer.parseInt(Valxo);
               Yo = Integer.parseInt(Valyo);
           }else{
               String vxo = String.valueOf(quitaparentesis.charAt(1));
               String vyo = String.valueOf(quitaparentesis.charAt(3));
               Xf = Integer.parseInt(vxo);
               Yf = Integer.parseInt(vyo);
           }
        }
       } catch (Exception e) {
            System.out.println("Has ingresado una Coordenada fuera de Rango, por favor ingresa nuevamente");
       }
       Disparar();
   }
}

