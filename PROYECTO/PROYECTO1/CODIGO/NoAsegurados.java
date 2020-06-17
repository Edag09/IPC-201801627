/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Org.EduardoAgustin.Ventanas;

import Org.EduardoAgustin.Clases.ControlNoAsegurados;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class NoAsegurados extends javax.swing.JFrame {

    public NoAsegurados() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Lista de No Asegurados");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        LlenarTabla();
    }
    ControlNoAsegurados noAsegurado = new ControlNoAsegurados();
    
    
    public void LlenarTabla(){
    String Columnas[]={"DPI","Nombre","Telefono"};
        String Datos[][]= new String[ControlNoAsegurados.cont][8];
        try {
            for (int fila = 0; fila < Datos.length; fila++) {
                if (Datos[fila][0] == null) {
                    
                    Datos[fila][0] = ControlNoAsegurados.noAsegurados[fila].getDpi();
                    Datos[fila][1] = ControlNoAsegurados.noAsegurados[fila].getNombre();
                    Datos[fila][2] = ControlNoAsegurados.noAsegurados[fila].getTelefono();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Trono");
        }
        TablaNoAsegurados.setModel(new DefaultTableModel(Datos,Columnas));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaNoAsegurados = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaNoAsegurados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaNoAsegurados);

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Proyecto/Regreso.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Administrador admin = new Administrador();
       admin.setVisible(true);
       NoAsegurados.this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaNoAsegurados;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
