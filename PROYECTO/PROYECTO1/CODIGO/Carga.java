/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Org.EduardoAgustin.Ventanas;
import Org.EduardoAgustin.Clases.ControladorCarga;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Agustin
 */
public class Carga extends javax.swing.JFrame {

    /**
     * Creates new form Carga
     */
    public Carga() {
        initComponents();
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Carga de Datos");
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setLayout(null);
    }
    ControladorCarga control = new ControladorCarga();
    public double tipoValorA,pors,polizaMarca,polizaLinea,polizaUso,precioMecanica,presioRepuesto;
    public int anio;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCargaDatos = new javax.swing.JTextArea();
        cargaDatos = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carga Masiva de Datos");

        txtCargaDatos.setColumns(20);
        txtCargaDatos.setRows(5);
        jScrollPane1.setViewportView(txtCargaDatos);

        cargaDatos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        cargaDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Proyecto/Cargar.png"))); // NOI18N
        cargaDatos.setText(" Cargar Datos");
        cargaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaDatosActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Proyecto/Regreso.png"))); // NOI18N
        Salir.setText(" Regresar");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cargaDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addComponent(Salir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargaDatos)
                    .addComponent(Salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        Carga.this.setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed

    private void cargaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaDatosActionPerformed
        try {
                if (txtCargaDatos.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No has agregado ninguna cadena");
                }else{
                    String dato1 = txtCargaDatos.getText();
                    String s1[] = dato1.split("\n");
                        for (String info: s1) {
                        System.out.println(info);
                        String s2[] = info.split(",");
                        switch(s2[0]){
                        case "TIPO":
                            tipoValorA = Double.parseDouble(s2[2]);
                            control.ingresarTipo(s2[1], tipoValorA);
                            
                            break;
                        case "MODELO":
                            anio = Integer.parseInt(s2[1]);
                            pors = Double.parseDouble(s2[2]);
                            control.ingresarModelo(anio, pors);
                            
                            break;
                        case "MARCA":
                            polizaMarca = Double.parseDouble(s2[2]);
                            control.ingresarMarca(s2[1], polizaMarca);
                            
                            break;
                        case "LINEA":
                            polizaLinea = Double.parseDouble(s2[2]);
                            control.ingresarLinea(s2[1], polizaLinea);
                           
                            break;
                        case "USO":
                            polizaUso = Double.parseDouble(s2[2]);
                            control.ingresarUso(s2[1], polizaUso);
                            
                            break;
                        case "MECANICA":
                            precioMecanica = Double.parseDouble(s2[2]);
                            control.ingresarMecanica(s2[1], precioMecanica);
                            
                            break;
                        case "REPUESTO":
                            presioRepuesto = Double.parseDouble(s2[2]);
                            control.ingresarRepuesto(s2[1], presioRepuesto);
                            
                            break;
                        }
                        }
                        control.mostrarTipo();
                        control.mostrarModelo();
                        control.mostrarMarca();
                        control.mostrarLinea();
                        control.mostrarUso();
                        control.mostrarMecanica();
                        control.mostrarRepuesto();
                }
            } catch (Exception e) {
                   JOptionPane.showMessageDialog(null, "Error");
            }
    }//GEN-LAST:event_cargaDatosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton cargaDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtCargaDatos;
    // End of variables declaration//GEN-END:variables
}
