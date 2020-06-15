/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Org.EduardoAgustin.Ventanas;

import Org.EduardoAgustin.Clases.ControladorCarga;
import Org.EduardoAgustin.Clases.ControladorDatosdeCotizacion;
import Org.EduardoAgustin.Clases.ControladorPersonas;
import Org.EduardoAgustin.Clases.TipoVehiculo;
import java.text.DecimalFormat;
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
        cargas.datosTipo(TipodVehiculo, "tipo");
        cargas.datosUso(UsoVehiculo, "uso");
        cargas.datosMarca(MarcaVehiculo, "marca");
        cargas.datosLinea(lineaVehiculo, "linea");
        cargas.datosModelo(ModeloVehiculo, "modelo");
        
    }
    
    ControladorPersonas personita = new ControladorPersonas();
    ControladorCarga cargas = new ControladorCarga();
    ControladorDatosdeCotizacion cotizar = new ControladorDatosdeCotizacion();
    int telefono,deducible,modelo;
    double costos;
    DecimalFormat df = new DecimalFormat("#.00");
    int anio; 
    double costo;
    double porsModelo;
    double porsMarca;
    double porsUso;
    double porsLinea;
    
    
     public void datos(){
         if (cargas.datosT(TipodVehiculo.getSelectedItem().toString()) == TipodVehiculo.getSelectedItem().toString()) {
                if (cargas.valorAsegurado(costo) == costo) {
                    JOptionPane.showMessageDialog(null, "Si esta bien");
                    anio = Integer.parseInt(ModeloVehiculo.getSelectedItem().toString());
                }if(cargas.anio(anio)==anio){
                }if (cargas.nombreMarca(MarcaVehiculo.getSelectedItem().toString())== MarcaVehiculo.getSelectedItem().toString()) {
                }if (cargas.nombreLinea(lineaVehiculo.getSelectedItem().toString())== lineaVehiculo.getSelectedItem().toString()) {                    
                }if (cargas.nombreUso(UsoVehiculo.getSelectedItem().toString())== UsoVehiculo.getSelectedItem().toString()) {
                    costo  = Double.parseDouble(txtValVehiculo.getText());
                    porsLinea = cargas.porcentajeLinea(lineaVehiculo.getSelectedItem().toString());
                    porsMarca = cargas.porcentajeMarca(MarcaVehiculo.getSelectedItem().toString());
                    porsModelo = cargas.porcentaje(anio);
                    porsUso = cargas.porcentajeUso(UsoVehiculo.getSelectedItem().toString());
                    
                    cotizar.PTR(porsMarca, porsLinea, porsUso);
                    System.out.println(df.format(cotizar.PTR(porsMarca, porsLinea, porsUso)));
                    
                    cotizar.PrimaTotal(costo, cotizar.PTR(porsMarca, porsLinea, porsUso));
                    System.out.println(df.format(cotizar.PrimaTotal(costo, cotizar.PTR(porsMarca, porsLinea, porsUso))));
                    
                    cotizar.CostoPrima(cotizar.PrimaTotal(costo, cotizar.PTR(porsMarca, porsLinea, porsUso)));
                    txtCostoPrima.setText(df.format(cotizar.CostoPrima(cotizar.PrimaTotal(costo, cotizar.PTR(porsMarca, porsLinea, porsUso)))));
                    
                    cotizar.CostoDeducible(costo);
                    txtDedusible.setText(df.format(cotizar.CostoDeducible(costo)));
                    
                    cotizar.valorReal(costo, porsModelo);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Te pasaste de verga");
            }
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
        TipodVehiculo = new javax.swing.JComboBox();
        UsoVehiculo = new javax.swing.JComboBox();
        MarcaVehiculo = new javax.swing.JComboBox();
        lineaVehiculo = new javax.swing.JComboBox();
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

        TipodVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una Opcion." }));
        TipodVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipodVehiculoActionPerformed(evt);
            }
        });

        UsoVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una Opcion." }));
        UsoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsoVehiculoActionPerformed(evt);
            }
        });

        MarcaVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una Opcion." }));

        lineaVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una Opcion." }));
        lineaVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineaVehiculoActionPerformed(evt);
            }
        });

        ModeloVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una Opcion." }));

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
        txtDedusible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDedusibleActionPerformed(evt);
            }
        });

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
        Deduciblemenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeduciblemenorActionPerformed(evt);
            }
        });

        Deduciblemayor.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        Deduciblemayor.setText("+Deducible");
        Deduciblemayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeduciblemayorActionPerformed(evt);
            }
        });

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

        AseguradoraImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Proyecto/Aseguradora.png"))); // NOI18N

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
                                .addComponent(jLabel3)
                                .addGap(58, 58, 58)
                                .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(34, 34, 34)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(TipodVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(AseguradoraImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(UsoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addGap(77, 77, 77)
                        .addComponent(MarcaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)
                        .addGap(23, 23, 23)
                        .addComponent(txtValVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Cotizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel12)
                        .addGap(10, 10, 10)
                        .addComponent(txtDedusible, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PosibleCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtPosibleDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77)
                        .addComponent(MostrarDato))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Deduciblemenor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Deduciblemayor)
                        .addGap(18, 18, 18)
                        .addComponent(Solicitar)
                        .addGap(27, 27, 27)
                        .addComponent(Regreso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(81, 81, 81)
                                .addComponent(lineaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(72, 72, 72)
                                .addComponent(ModeloVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3))
                            .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4))
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(TipodVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AseguradoraImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(UsoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(lineaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11))
                    .addComponent(txtCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtDedusible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PosibleCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtPosibleDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(MostrarDato)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Deduciblemenor)
                    .addComponent(Deduciblemayor)
                    .addComponent(Solicitar)
                    .addComponent(Regreso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        try {
            datos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La cagaste");
        }
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
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDPI.getText().isEmpty() || txtTelefono.getText().isEmpty() || TipodVehiculo.getSelectedItem().equals("Elige una Opcion") || UsoVehiculo.getSelectedItem().equals("Elige una Opcion") || MarcaVehiculo.getSelectedItem().equals("Elige una Opcion")|| lineaVehiculo.getSelectedItem().equals("Elige una Opcion") || MarcaVehiculo.getSelectedItem().equals("Elige una Opcion") || txtValVehiculo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor Llena todos los datos");
        }else{

            telefono = Integer.parseInt(txtTelefono.getText());
            costos = Double.parseDouble(txtValVehiculo.getText());
            modelo = Integer.parseInt(ModeloVehiculo.getSelectedItem().toString());
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String tipoV = TipodVehiculo.getSelectedItem().toString();
            String usoV = UsoVehiculo.getSelectedItem().toString();
            String marcaV =  MarcaVehiculo.getSelectedItem().toString();
            String dpi = txtDPI.getText();
            String linea = lineaVehiculo.getSelectedItem().toString();
            personita.solicitarSeguro(nombre,apellido,tipoV ,usoV ,marcaV,dpi,linea,telefono,modelo,costos);
            
            String prima = txtCostoPrima.getText();
            String deducible = txtDedusible.getText();
            String posPrima = PosibleCostoPrima.getText();
            String posDedu = txtPosibleDeducible.getText();
            String vr = String.valueOf( cotizar.valorReal(costo, porsModelo));
            String cost = txtValVehiculo.getText();
            
            cotizar.guardadCotizacion(prima, deducible, posPrima, posDedu,  vr, cost, dpi);
            System.out.println(vr);
            JOptionPane.showMessageDialog(null, "Solicitado");
        }
        
    }//GEN-LAST:event_SolicitarActionPerformed

    private void DeduciblemayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeduciblemayorActionPerformed
        try {
            double dedu;
            dedu=+0.1;
            cotizar.CostoDeducible(costo);
            txtPosibleDeducible.setText(df.format(cotizar.CostoDeducible(costo)+dedu));
            dedu=+0.1;
            
            double prim;
            prim =-0.03;
            PosibleCostoPrima.setText(df.format( cotizar.CostoPrima(cotizar.PrimaTotal(costo, cotizar.PTR(porsMarca, porsLinea, porsUso)))+prim));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede calcular aun");
        }
        
    }//GEN-LAST:event_DeduciblemayorActionPerformed

    private void DeduciblemenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeduciblemenorActionPerformed
        try {
            double dedu;
            dedu=-0.1;
            cotizar.CostoDeducible(costo);
            txtPosibleDeducible.setText(df.format(cotizar.CostoDeducible(costo)+dedu));
            
            double prim;
            prim =+0.03;
            PosibleCostoPrima.setText(df.format( cotizar.CostoPrima(cotizar.PrimaTotal(costo, cotizar.PTR(porsMarca, porsLinea, porsUso)))+prim));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede calcular aun");
        }
    }//GEN-LAST:event_DeduciblemenorActionPerformed

    private void lineaVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineaVehiculoActionPerformed
        
    }//GEN-LAST:event_lineaVehiculoActionPerformed

    private void TipodVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipodVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipodVehiculoActionPerformed

    private void UsoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsoVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsoVehiculoActionPerformed

    private void txtDedusibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDedusibleActionPerformed
        
    }//GEN-LAST:event_txtDedusibleActionPerformed

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
    private javax.swing.JComboBox MarcaVehiculo;
    private javax.swing.JComboBox ModeloVehiculo;
    private javax.swing.JButton MostrarDato;
    private javax.swing.JTextField PosibleCostoPrima;
    private javax.swing.JButton Regreso;
    private javax.swing.JButton Solicitar;
    private javax.swing.JComboBox TipodVehiculo;
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
    private javax.swing.JComboBox lineaVehiculo;
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

