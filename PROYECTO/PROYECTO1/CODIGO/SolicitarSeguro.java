/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Org.EduardoAgustin.Ventanas;

import Org.EduardoAgustin.Clases.ControladorPersonas;
import Org.EduardoAgustin.Clases.DatosPersonas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Agustin
 */
public class SolicitarSeguro extends javax.swing.JFrame {
    ControladorPersonas personita;
    DatosPersonas solicitar;
    int telefono;
    double costos;

    
    public SolicitarSeguro() {
        initComponents();
        AseguradoraImagen.setIcon(new ImageIcon("C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Proyecto1Vacas\\src\\Iconos Proyecto\\Aseguradora.png"));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Solicitar Seguro");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.personita = new ControladorPersonas();
    }
    
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

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setText("DPI");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel5.setText("Tipo de Vehiculo");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setText("Uso de Vehiculo");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setText("Marca");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setText("Linea");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel9.setText("Modelo");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel10.setText("Valor del Vehiculo");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel11.setText("Costo Prima");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel12.setText("Deducible");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel13.setText("Posible Costo Prima");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel14.setText("Posible Deducible");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

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

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        TipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una Opcion", "Sedan", "Camioneta", "Pick up", "Microbus", "Hatchback" }));

        UsoVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una Opcion", "Uber", "Transporte", "Personal", " " }));

        MarcaVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una Opcion", "Toyota", "Mazda", "Chebrolet", "Nissan", "Hyunday", "KIA", "Porsche", "Volks Wagen", "Audi", "BMW", "FIAT", "Volvo", "Ford", "Land Rover", "Mercedes Bens", "Honda", "Mitsubishi", "Jeep", " " }));

        LineaVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ModeloVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtValVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValVehiculoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValVehiculoKeyTyped(evt);
            }
        });

        Cotizar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        Cotizar.setText("COTIZAR");
        Cotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CotizarActionPerformed(evt);
            }
        });

        txtCostoPrima.setEditable(false);

        txtDedusible.setEditable(false);

        PosibleCostoPrima.setEditable(false);
        PosibleCostoPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosibleCostoPrimaActionPerformed(evt);
            }
        });

        txtPosibleDeducible.setEditable(false);
        txtPosibleDeducible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosibleDeducibleActionPerformed(evt);
            }
        });

        Deduciblemenor.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        Deduciblemenor.setText("- Deducible");

        Deduciblemayor.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        Deduciblemayor.setText("+Deducible");

        Solicitar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        Solicitar.setText("Solicitar Seguro");
        Solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitarActionPerformed(evt);
            }
        });

        Regreso.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        Regreso.setText("Cancelar");
        Regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 3, 13)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Aseguradora \"Automas\"");

        MostrarDato.setText("Mostrar");
        MostrarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarDatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Deduciblemenor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Deduciblemayor)
                        .addGap(18, 18, 18)
                        .addComponent(Solicitar)
                        .addGap(27, 27, 27)
                        .addComponent(Regreso))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(34, 34, 34)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(34, 34, 34)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(29, 29, 29)
                                        .addComponent(TipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(60, 60, 60)
                                .addComponent(AseguradoraImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)
                                .addGap(31, 31, 31)
                                .addComponent(UsoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8)
                                .addGap(81, 81, 81)
                                .addComponent(LineaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addGap(72, 72, 72)
                                .addComponent(ModeloVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)
                                .addGap(23, 23, 23)
                                .addComponent(txtValVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(10, 10, 10)
                                .addComponent(txtDedusible, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(77, 77, 77)
                                        .addComponent(MarcaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Cotizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(PosibleCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtPosibleDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(77, 77, 77)
                                .addComponent(MostrarDato)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(TipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(AseguradoraImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(UsoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(MarcaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(LineaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(ModeloVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(txtValVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(Cotizar)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDedusible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel13))
                            .addComponent(PosibleCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel14))
                            .addComponent(txtPosibleDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MostrarDato)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Deduciblemenor)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Solicitar)
                        .addComponent(Regreso)
                        .addComponent(Deduciblemayor))))
        );

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
        try {
            personita.mostrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay dadtos que mostrar aun");
        }    
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
        SolicitarSeguro.this.dispose();
    }//GEN-LAST:event_RegresoActionPerformed

    private void SolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitarActionPerformed
        try {
            if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDPI.getText().isEmpty() || txtTelefono.getText().isEmpty() || TipoVehiculo.getSelectedItem().equals("Elige una Opcion") || UsoVehiculo.getSelectedItem().equals("Elige una Opcion") || MarcaVehiculo.getSelectedItem().equals("Elige una Opcion") || txtValVehiculo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor Llena todos los datos");
        }else{
            telefono = Integer.parseInt(txtTelefono.getText());
            costos = Double.parseDouble(txtValVehiculo.getText());
            solicitar = new DatosPersonas(txtNombre.getText(), txtApellido.getText(), TipoVehiculo.getSelectedItem().toString(), UsoVehiculo.getSelectedItem().toString(), MarcaVehiculo.getSelectedItem().toString(), txtDPI.getText(), telefono, costos);
            personita.solicitarSeguro(solicitar);
            JOptionPane.showMessageDialog(null, "Cotizado");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ahorita vemos tus cagadales perame");
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
