package Video;
import javax.swing.*;
import java.awt.event.ActionListener;
public class Ventana extends javax.swing.JFrame{
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JLabel Tiempito;
    Hilo hilo;
    Tiempo tiempo;
    String d1,d2,d3,d4;
    Pila pila = new Pila();
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        campo.setText(pila.GraphvizPila());
        boton1 = new JButton();
        boton1.setBounds(40, -50, 50, 50);
        boton1.setText("1");
        lienzo.add(boton1);
        
        boton2 = new JButton();
        boton2.setBounds(40, -150, 50, 50);
        boton2.setText("2");
        lienzo.add(boton2);
        
        boton3 = new JButton();
        boton3.setBounds(40, -250, 50, 50);
        boton3.setText("3");
        lienzo.add(boton3);
        
        boton4 = new JButton();
        boton4.setBounds(40, -350, 50, 50);
        boton4.setText("4");
        lienzo.add(boton4);
        
        Tiempito = new JLabel("Aqui toy");
        Tiempito.setBounds(250, 275, 300, 100);
        lienzo.add(Tiempito);
        
        
        hilo = new Hilo(boton1, lienzo,boton2,boton3,boton4);
        tiempo = new Tiempo(Tiempito);
        hilo.setBoton1(boton1);
        hilo.setBoton2(boton2);
        hilo.setBoton3(boton3);
        hilo.setBoton4(boton4);
        hilo.setPanel(lienzo);
        hilo.start();
        tiempo.start();
        
        d1 = boton1.getText();
        d2 = boton2.getText();
        d3 = boton3.getText();
        d4 = boton4.getText();
        
        ActionListener click = new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
              pila.push(d1);
              campo.setText(pila.GraphvizPila());
              boton1.setVisible(false);
            }
        };
        boton1.addActionListener(click);
        
        ActionListener click1 = new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
              pila.push(d2);
              campo.setText(pila.GraphvizPila());
              boton2.setVisible(false);
            }
        };
        boton2.addActionListener(click1);
        
        ActionListener click2 = new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
              pila.push(d3);
              campo.setText(pila.GraphvizPila());
              boton3.setVisible(false);
            }
        };
        boton3.addActionListener(click2);
        
        ActionListener click4 = new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
              pila.push(d4);
              campo.setText(pila.GraphvizPila());
              boton4.setVisible(false);
            }
        };
        boton4.addActionListener(click4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campo.setEditable(false);
        campo.setColumns(20);
        campo.setRows(5);
        jScrollPane1.setViewportView(campo);

        jButton1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton1.setText("Pop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lienzoLayout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lienzoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lienzoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(142, 142, 142))))
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lienzoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pila.pop();
        campo.setText(pila.GraphvizPila());
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea campo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lienzo;
    // End of variables declaration//GEN-END:variables

  
}
