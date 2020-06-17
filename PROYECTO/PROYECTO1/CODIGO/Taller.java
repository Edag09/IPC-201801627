
package Org.EduardoAgustin.Ventanas;

import Org.EduardoAgustin.Clases.ControlNoAsegurados;
import Org.EduardoAgustin.Clases.ControladorPersonas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Taller extends javax.swing.JFrame {

    public Taller() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Taller");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        LlenarTabla();
    }
    ControladorPersonas persona = new ControladorPersonas();
    ControlNoAsegurados personaNo = new ControlNoAsegurados();
    int contador;
    
    public void LlenarTabla(){
        contador =0;
        String Columnas[] = {"ID","Asegurado","Tercero","Estado","Pago"};
        String Datos[][] = new String[ControladorPersonas.cont][5];
        try {
            for (int i = 0; i < Datos.length; i++) {
                if (Datos[i] == null) {
                 Datos[i][0] = contador+"";
                 Datos[i][1] = ControladorPersonas.persona[i].getDpi();
                 Datos[i][2] = ControlNoAsegurados.noAsegurados[i].getDpi();
                 Datos[i][3] = "En proceso";
                 Datos[i][4] = "Pendiente";
                 contador++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No");
        }
        TablaTaller.setModel(new DefaultTableModel(Datos, Columnas));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTaller = new javax.swing.JTable();
        Terminado = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaTaller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaTaller);

        Terminado.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        Terminado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Proyecto/icons8-tarea-completada-24.png"))); // NOI18N
        Terminado.setText(" Marcar como Terminado");

        Salir.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Proyecto/Regreso.png"))); // NOI18N
        Salir.setText(" Cancelar");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Terminado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Terminado)
                    .addComponent(Salir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
     Administrador admin = new Administrador();
     admin.setVisible(true);
     Taller.this.dispose();
    }//GEN-LAST:event_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JTable TablaTaller;
    private javax.swing.JButton Terminado;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
