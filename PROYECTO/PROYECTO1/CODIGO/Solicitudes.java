package Org.EduardoAgustin.Ventanas;

import Org.EduardoAgustin.Clases.ControladorDatosdeCotizacion;
import Org.EduardoAgustin.Clases.ControladorPersonas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Solicitudes extends javax.swing.JFrame {

    public Solicitudes() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Solicitudes de Seguro");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        LlenarTabla();
    }
    ControladorPersonas persona = new ControladorPersonas();
    
    public void LlenarTabla(){
    String Columnas[]={"DPI","Nombre","Telefono","Tipo","Descripcion","Monto","Poliza","Deducible"};
        String Datos[][]= new String[ControladorPersonas.cont][8];
        try {
            for (int fila = 0; fila < Datos.length; fila++) {
                if (Datos[fila][0] == null) {
                    
                    String datos = ControladorPersonas.persona[fila].getTipoVehiculo()+","+ControladorPersonas.persona[fila].getModelo()+","+ControladorPersonas.persona[fila].getMarca()+","+ControladorPersonas.persona[fila].getLinea();
                    Datos[fila][0] = ControladorPersonas.persona[fila].getDpi();
                    Datos[fila][1] = ControladorPersonas.persona[fila].getNombre();
                    Datos[fila][2] = ControladorPersonas.persona[fila].getTelefono()+"";
                    Datos[fila][3] = "AUTOMAS";
                    Datos[fila][4] = datos;
                    Datos[fila][5] = ControladorDatosdeCotizacion.cotizado[fila].getValorReal();
                    Datos[fila][6] = ControladorDatosdeCotizacion.cotizado[fila].getCostoPrimal();
                    Datos[fila][7] = ControladorDatosdeCotizacion.cotizado[fila].getDeducible();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Trono");
        }
        TablaSolicitudes.setModel(new DefaultTableModel(Datos,Columnas));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaSolicitudes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaSolicitudes);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Proyecto/like.png"))); // NOI18N
        jButton1.setText(" Aprobar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Proyecto/forbidden.png"))); // NOI18N
        jButton2.setText(" Rechazar");

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Proyecto/Regreso.png"))); // NOI18N
        Salir.setText("Cancelar");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(189, 189, 189)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(Salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       Administrador admin = new Administrador();
       admin.setVisible(true);
       Solicitudes.this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JTable TablaSolicitudes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
