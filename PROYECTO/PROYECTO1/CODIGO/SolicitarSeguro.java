/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Org.EduardoAgustin.Ventanas;

import Org.EduardoAgustin.Clases.ControladorPersonas;
import javax.swing.JOptionPane;


/**
 *
 * @author Eduardo Agustin
 */
public class SolicitarSeguro extends javax.swing.JFrame {
  
    

    
    public SolicitarSeguro() {
        initComponents();
        this.setTitle("Solicitar Seguro");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
    }
    
    ControladorPersonas personita = new ControladorPersonas();
    int telefono;
    double costos;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDPI = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        TipoVehiculo = new javax.swing.JComboBox();
        UsoVehiculo = new javax.swing.JComboBox();
        MarcaVehiculo = new javax.swing.JComboBox();
        LineaVehiculo = new javax.swing.JComboBox();
        ModeloVehiculo = new javax.swing.JComboBox();
        txtValVehiculo = new javax.swing.JTextField();
        Cotizar = new javax.swing.JButton();
        txtCostoPrima = new javax.swing.JTextField();
        txtDedusible = new javax.swing.JTextField();
        PosibleCostoPrima = new javax.swing.JTextField();
        txtPosibleDeducible = new javax.swing.JTextField();
        Deduciblemenor = new javax.swing.JButton();
        Deduciblemayor = new javax.swing.JButton();
        Solicitar = new javax.swing.JButton();
        Regreso = new javax.swing.JButton();
        AseguradoraImagen = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        MostrarDato = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 14, 44, 16);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 49, 44, 16);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setText("DPI");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 86, 20, 16);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 124, 47, 16);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel5.setText("Tipo de Vehiculo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 162, 90, 16);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setText("Uso de Vehiculo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 198, 86, 16);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setText("Marca");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 236, 33, 16);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setText("Linea");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 274, 28, 16);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel9.setText("Modelo");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 312, 41, 16);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel10.setText("Valor del Vehiculo");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 350, 97, 16);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel11.setText("Costo Prima");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 441, 64, 16);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel12.setText("Deducible");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(236, 441, 54, 16);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel13.setText("Posible Costo Prima");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(79, 474, 105, 16);

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel14.setText("Posible Deducible");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(79, 505, 95, 16);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(88, 11, 100, 20);

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido);
        txtApellido.setBounds(88, 43, 100, 20);

        txtDPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDPIActionPerformed(evt);
            }
        });
        txtDPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDPIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDPIKeyTyped(evt);
            }
        });
        getContentPane().add(txtDPI);
        txtDPI.setBounds(88, 85, 100, 20);

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(91, 123, 97, 20);

        TipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una Opcion", "Sedan", "Camioneta", "Pick up", "Microbus", "Hatchback" }));
        getContentPane().add(TipoVehiculo);
        TipoVehiculo.setBounds(129, 159, 104, 20);

        UsoVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una Opcion", "Uber", "Transporte", "Personal", " " }));
        getContentPane().add(UsoVehiculo);
        UsoVehiculo.setBounds(127, 195, 104, 20);

        MarcaVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una Opcion", "Toyota", "Mazda", "Chebrolet", "Nissan", "Hyunday", "KIA", "Porsche", "Volks Wagen", "Audi", "BMW", "FIAT", "Volvo", "Ford", "Land Rover", "Mercedes Bens", "Honda", "Mitsubishi", "Jeep", " " }));
        getContentPane().add(MarcaVehiculo);
        MarcaVehiculo.setBounds(120, 233, 122, 20);

        LineaVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(LineaVehiculo);
        LineaVehiculo.setBounds(119, 271, 112, 20);

        ModeloVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una Opcion", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "\t\t\t\t\t\t\t" }));
        getContentPane().add(ModeloVehiculo);
        ModeloVehiculo.setBounds(123, 309, 119, 20);

        txtValVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValVehiculoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValVehiculoKeyTyped(evt);
            }
        });
        getContentPane().add(txtValVehiculo);
        txtValVehiculo.setBounds(130, 347, 112, 20);

        Cotizar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        Cotizar.setText("COTIZAR");
        Cotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CotizarActionPerformed(evt);
            }
        });
        getContentPane().add(Cotizar);
        Cotizar.setBounds(120, 388, 122, 27);

        txtCostoPrima.setEditable(false);
        getContentPane().add(txtCostoPrima);
        txtCostoPrima.setBounds(92, 438, 100, 20);

        txtDedusible.setEditable(false);
        getContentPane().add(txtDedusible);
        txtDedusible.setBounds(300, 440, 100, 20);

        PosibleCostoPrima.setEditable(false);
        PosibleCostoPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosibleCostoPrimaActionPerformed(evt);
            }
        });
        getContentPane().add(PosibleCostoPrima);
        PosibleCostoPrima.setBounds(202, 471, 100, 20);

        txtPosibleDeducible.setEditable(false);
        txtPosibleDeducible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosibleDeducibleActionPerformed(evt);
            }
        });
        getContentPane().add(txtPosibleDeducible);
        txtPosibleDeducible.setBounds(203, 502, 100, 20);

        Deduciblemenor.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        Deduciblemenor.setText("- Deducible");
        getContentPane().add(Deduciblemenor);
        Deduciblemenor.setBounds(10, 540, 99, 23);

        Deduciblemayor.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        Deduciblemayor.setText("+Deducible");
        getContentPane().add(Deduciblemayor);
        Deduciblemayor.setBounds(121, 540, 95, 23);

        Solicitar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        Solicitar.setText("Solicitar Seguro");
        Solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitarActionPerformed(evt);
            }
        });
        getContentPane().add(Solicitar);
        Solicitar.setBounds(234, 540, 119, 23);

        Regreso.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        Regreso.setText("Cancelar");
        Regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresoActionPerformed(evt);
            }
        });
        getContentPane().add(Regreso);
        Regreso.setBounds(380, 540, 81, 23);

        AseguradoraImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Proyecto/Aseguradora.png"))); // NOI18N
        getContentPane().add(AseguradoraImagen);
        AseguradoraImagen.setBounds(320, 10, 130, 160);

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 3, 13)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Aseguradora \"Automas\"");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(300, 160, 160, 30);

        MostrarDato.setText("Mostrar");
        MostrarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarDatoActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarDato);
        MostrarDato.setBounds(380, 490, 69, 23);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 210, 73, 23);

        jButton2.setText("jButton2");
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 240, 73, 23);

        jButton3.setText("jButton3");
        getContentPane().add(jButton3);
        jButton3.setBounds(320, 270, 73, 23);

        jButton4.setText("jButton4");
        getContentPane().add(jButton4);
        jButton4.setBounds(320, 300, 73, 23);

        jButton5.setText("jButton5");
        getContentPane().add(jButton5);
        jButton5.setBounds(320, 330, 73, 23);

        jButton6.setText("jButton6");
        getContentPane().add(jButton6);
        jButton6.setBounds(320, 360, 73, 23);

        jButton7.setText("jButton7");
        getContentPane().add(jButton7);
        jButton7.setBounds(320, 390, 73, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDPIActionPerformed

    private void txtPosibleDeducibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosibleDeducibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosibleDeducibleActionPerformed

    private void PosibleCostoPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosibleCostoPrimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PosibleCostoPrimaActionPerformed

    private void CotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CotizarActionPerformed
        
    }//GEN-LAST:event_CotizarActionPerformed

    private void MostrarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarDatoActionPerformed
         personita.imprimir();  
    }//GEN-LAST:event_MostrarDatoActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyPressed

    }//GEN-LAST:event_txtApellidoKeyPressed

    private void txtDPIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDPIKeyPressed
     
    }//GEN-LAST:event_txtDPIKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed

    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtValVehiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValVehiculoKeyPressed
        
    }//GEN-LAST:event_txtValVehiculoKeyPressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
       char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && (c<'A'|| c>'Z'))evt.consume(); {  
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
      char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && (c<'A'|| c>'Z'))evt.consume(); {  
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtDPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDPIKeyTyped
    char c = evt.getKeyChar();
        if (c<'0' || c>'9')evt.consume(); {
        }
    }//GEN-LAST:event_txtDPIKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
    char c = evt.getKeyChar();
        if (c<'0' || c>'9')evt.consume(); {
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtValVehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValVehiculoKeyTyped
      if (!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!= '.') {
        evt.consume();
        }
        if (evt.getKeyChar()=='.'&& txtValVehiculo.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtValVehiculoKeyTyped

    private void RegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresoActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        SolicitarSeguro.this.setVisible(false);
    }//GEN-LAST:event_RegresoActionPerformed

    private void SolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitarActionPerformed
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDPI.getText().isEmpty() || txtTelefono.getText().isEmpty() || TipoVehiculo.getSelectedItem().equals("Elige una Opcion") || UsoVehiculo.getSelectedItem().equals("Elige una Opcion") || MarcaVehiculo.getSelectedItem().equals("Elige una Opcion") || txtValVehiculo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor Llena todos los datos");
        }else{

            telefono = Integer.parseInt(txtTelefono.getText());
            costos = Double.parseDouble(txtValVehiculo.getText());
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String tipoV = TipoVehiculo.getSelectedItem().toString();
            String usoV = UsoVehiculo.getSelectedItem().toString();
            String marcaV =  MarcaVehiculo.getSelectedItem().toString();
            String dpi = txtDPI.getText();
           
            personita.solicitarSeguro(nombre,apellido,tipoV ,usoV ,marcaV,dpi , telefono, costos);
            JOptionPane.showMessageDialog(null, "Solicitado");
        }
        
    }//GEN-LAST:event_SolicitarActionPerformed

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
            java.util.logging.Logger.getLogger(SolicitarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolicitarSeguro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AseguradoraImagen;
    private javax.swing.JButton Cotizar;
    private javax.swing.JButton Deduciblemayor;
    private javax.swing.JButton Deduciblemenor;
    private javax.swing.JComboBox LineaVehiculo;
    private javax.swing.JComboBox MarcaVehiculo;
    private javax.swing.JComboBox ModeloVehiculo;
    private javax.swing.JButton MostrarDato;
    private javax.swing.JTextField PosibleCostoPrima;
    private javax.swing.JButton Regreso;
    private javax.swing.JButton Solicitar;
    private javax.swing.JComboBox TipoVehiculo;
    private javax.swing.JComboBox UsoVehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCostoPrima;
    private javax.swing.JTextField txtDPI;
    private javax.swing.JTextField txtDedusible;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPosibleDeducible;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValVehiculo;
    // End of variables declaration//GEN-END:variables
}

