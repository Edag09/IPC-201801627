package Org.EduardoAgustin.Ventanas;

import Org.EduardoAgustin.Clases.Acciones;
import Org.EduardoAgustin.Clases.ColocarNave;
import Org.EduardoAgustin.Clases.PintarImagen;
import Org.EduardoAgustin.Clases.Imagenes;
import Org.EduardoAgustin.Clases.Tiempo;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.TimerTask;

public final class Galaga extends javax.swing.JFrame {

    PintarImagen imagen;
    Acciones juego;
    ColocarNave nave;
    Timer abajo;
    TimerTask task;
    Tiempo tim;
    int vel, t;
    String puntos, life, pod, speed;
    public JLabel punto, vida, power, flash, tiempo, time;
    public JLabel nombre, punteo, vidas, poder, velocidad;
    public JLabel nav, cometa, corazon, caracol, ojo, rayo,bala;
    Random r = new Random();
    int aleatorio,x,y;
    Imagenes incertar = new Imagenes();

    public Galaga() {
        initComponents();
        this.setTitle("Galaga");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBounds(250, 90, 700, 620);
        this.abajo = new Timer();
        

        nombre = new JLabel("Nombre:  Jugador 1");
        nombre.setBounds(430, 15, 145, 25);
        nombre.setFont(new Font("Cavolini", Font.PLAIN, 15));
        PanelTablero.add(nombre);

        punteo = new JLabel("Puntos: ");
        punteo.setBounds(430, 50, 75, 25);
        punteo.setFont(new Font("Cavolini", Font.PLAIN, 15));
        PanelTablero.add(punteo);

        puntos = String.valueOf(Acciones.puntos);
        punto = new JLabel();
        punto.setText(puntos);
        punto.setBounds(500, 50, 100, 25);
        punto.setFont(new Font("Cavolini", Font.PLAIN, 15));
        PanelTablero.add(punto);

        vidas = new JLabel("Vidas: ");
        vidas.setBounds(430, 95, 50, 25);
        vidas.setFont(new Font("Cavolini", Font.PLAIN, 15));
        PanelTablero.add(vidas);

        life = String.valueOf(Acciones.vidas);
        vida = new JLabel();
        vida.setText(life);
        vida.setBounds(500, 95, 50, 25);
        vida.setFont(new Font("Cavolini", Font.PLAIN, 15));
        PanelTablero.add(vida);

        poder = new JLabel("Poder: ");
        poder.setBounds(430, 135, 75, 25);
        poder.setFont(new Font("Cavolini", Font.PLAIN, 15));
        PanelTablero.add(poder);

        pod = "Ninguno";
        power = new JLabel();
        power.setText(pod);
        power.setBounds(500, 135, 130, 25);
        power.setFont(new Font("Cavolini", Font.PLAIN, 15));
        PanelTablero.add(power);

        velocidad = new JLabel("Velocidad: ");
        velocidad.setBounds(430, 180, 130, 25);
        velocidad.setFont(new Font("Cavolini", Font.PLAIN, 15));
        PanelTablero.add(velocidad);

        speed = " 1 m/s";
        flash = new JLabel();
        flash.setText(speed);
        flash.setBounds(500, 180, 130, 25);
        flash.setFont(new Font("Cavolini", Font.PLAIN, 15));
        PanelTablero.add(flash);

        tiempo = new JLabel("Tiempo: ");
        tiempo.setBounds(430, 225, 130, 25);
        tiempo.setFont(new Font("Cavolini", Font.PLAIN, 15));
        PanelTablero.add(tiempo);

        time = new JLabel();
        tim = new Tiempo(time);
        time.setBounds(500, 240, 200, 25);
        PanelTablero.add(time);

        incertar.Imagenes(lienzo, "C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\original.gif");
        
        //Movimiento de Asteroide
        this.task = new TimerTask() {
            @Override
            public void run() {
                aleatorio = r.nextInt(4) * 100;
                imagen = new PintarImagen(cometa, lienzo);
                lienzo.add(imagen.pintar(cometa, aleatorio,"C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\comet.png"));
                imagen.setImagen(imagen.pintar(cometa, aleatorio,"C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\comet.png"));
                imagen.start();
            }
        };
        abajo.schedule(task,2000,4000);

        
        //Movimiento de Rayo
        this.task = new TimerTask() {
            @Override
            public void run() {
                aleatorio = r.nextInt(4) * 100;
                imagen = new PintarImagen(rayo, lienzo);
                lienzo.add(imagen.pintar(rayo, aleatorio,"C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\lightning.png"));
                imagen.setImagen(imagen.pintar(rayo, aleatorio,"C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\lightning.png"));
                imagen.start();
            }
        };
        abajo.schedule(task,10000,20000);
        
        
        //Movimiento de Caracol
        this.task = new TimerTask() {
            @Override
            public void run() {
                aleatorio = r.nextInt(4) * 100;
                imagen = new PintarImagen(caracol, lienzo);
                lienzo.add(imagen.pintar(caracol, aleatorio,"C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\snail.png"));
                imagen.setImagen(imagen.pintar(caracol, aleatorio,"C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\snail.png"));
                imagen.start();
            }
        };
        abajo.schedule(task,15000,30000);

        
        //Movimiento de Ojo
        this.task = new TimerTask() {
            @Override
            public void run() {
                aleatorio = r.nextInt(4) * 100;
                imagen = new PintarImagen(ojo, lienzo);
                lienzo.add(imagen.pintar(ojo, aleatorio,"C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\eye.png"));
                imagen.setImagen(imagen.pintar(ojo, aleatorio,"C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\eye.png"));
                imagen.start();
            }
        };
        abajo.schedule(task,10000,20000);
        
        
        //Movimiento de Corazon
        this.task = new TimerTask() {
            @Override
            public void run() {
                aleatorio = r.nextInt(4) * 100;
                imagen = new PintarImagen(corazon, lienzo);
                lienzo.add(imagen.pintar(corazon, aleatorio,"C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\heart.png"));
                imagen.setImagen(imagen.pintar(corazon, aleatorio,"C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\heart.png"));
                imagen.start();
            }
        };
        abajo.schedule(task,14000,28000);

        
        //Pintar Nave
        nave = new ColocarNave(nav, bala,lienzo, 0,cometa);
        nav = new JLabel();
        nav.setBounds(0, 500, 85, 85);
        incertar.Imagenes(nav, "C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\space-invaders.png");
        lienzo.add(nav);
        nave.setNave(nav);
        nave.setCometa(cometa);
        nave.start();
        
        juego = new Acciones();
        tim.start();
        juego.start();
        

        this.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {

            }

            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getExtendedKeyCode()) {
                    case KeyEvent.VK_RIGHT:
                           nave.setMover(1);
                        break;
                    case KeyEvent.VK_LEFT:
                        nave.setMover(2);
                        break;
                    case KeyEvent.VK_SPACE:
                        nave.setMover(3);
                        break;
                }
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {

            }
        });
    }

    public void mostrarDatos() {
        nombre = new JLabel("Nombre");
        nombre.setBounds(630, 15, 20, 50);
        lienzo.add(nombre);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTablero = new javax.swing.JPanel();
        lienzo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        PanelTablero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PanelTableroKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PanelTableroLayout = new javax.swing.GroupLayout(PanelTablero);
        PanelTablero.setLayout(PanelTableroLayout);
        PanelTableroLayout.setHorizontalGroup(
            PanelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTableroLayout.createSequentialGroup()
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        PanelTableroLayout.setVerticalGroup(
            PanelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel6)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelTableroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelTableroKeyPressed

    }//GEN-LAST:event_PanelTableroKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTablero;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lienzo;
    // End of variables declaration//GEN-END:variables

}
