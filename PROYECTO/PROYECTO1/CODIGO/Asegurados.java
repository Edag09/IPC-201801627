package Org.EduardoAgustin.Ventanas;

import Org.EduardoAgustin.Clases.ControladorPersonas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Asegurados extends javax.swing.JFrame {

    public Asegurados() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Lista de Asegurados");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        LlenarTabla();
    }
    
    ControladorPersonas persona = new ControladorPersonas();
    
    public void LlenarTabla(){
    String Columnas[]={"DPI","Nombre","Estado","Ultima Prima"};
        String Datos[][]= new String[ControladorPersonas.cont][4];
        try {
            for (int fila = 0; fila < Datos.length; fila++) {
                if (Datos[fila][0] == null) {
                    
                    Datos[fila][0] = ControladorPersonas.persona[fila].getDpi();
                    Datos[fila][1] = ControladorPersonas.persona[fila].getNombre();
                    Datos[fila][2] = "Protegido";
                    Datos[fila][3] = "Pagado";
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Trono");
        }
        ListaAsegurados.setModel(new DefaultTableModel(Datos,Columnas));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaAsegurados = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaAsegurados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ListaAsegurados);

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Administrador admin = new Administrador();
      admin.setVisible(true);
      Asegurados.this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaAsegurados;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
