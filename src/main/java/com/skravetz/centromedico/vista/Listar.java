/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.skravetz.centromedico.vista;

import com.skravetz.centromedico.controlador.Registro;
import com.skravetz.centromedico.modelo.Paciente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebastiankravetz
 */
public class Listar extends javax.swing.JFrame {

    /**
     * Creates new form ListaCarreras
     */
    public Listar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_listaPacientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField_rutPacienteBuscar = new javax.swing.JTextField();
        jBtn_listarPacientes = new javax.swing.JButton();
        jButton_salirListar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable_listaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Rut", "Nombre", "Género", "Edad", "Dirección", "Ciudad", "Isapre", "Donante"
            }
        ));
        jScrollPane2.setViewportView(jTable_listaPacientes);

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese rut aquí (formato 11111111-1)"));

        jTextField_rutPacienteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_rutPacienteBuscarActionPerformed(evt);
            }
        });

        jBtn_listarPacientes.setText("Buscar");
        jBtn_listarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_listarPacientesActionPerformed(evt);
            }
        });

        jButton_salirListar.setText("Salir");
        jButton_salirListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTextField_rutPacienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtn_listarPacientes)
                .addGap(18, 18, 18)
                .addComponent(jButton_salirListar)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_rutPacienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn_listarPacientes)
                    .addComponent(jButton_salirListar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar por Rut Paciente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_listarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_listarPacientesActionPerformed
        // TODO add your handling code here:
        
        String rutBusqueda = this.jTextField_rutPacienteBuscar.getText();
        Registro pacientesController = new Registro();
        List<Paciente> listaPacientes = new ArrayList<>();
        
        
        if(rutBusqueda.length() == 0 || rutBusqueda.trim().equals("")){
            try {
                listaPacientes = pacientesController.listarPacientes();
            } catch (SQLException e) {
                System.out.println("Error listando pacientes desde SQL: " + e.getMessage());
            }
            DefaultTableModel modeloTabla = (DefaultTableModel) this.jTable_listaPacientes.getModel();
            modeloTabla.setRowCount(0);

            for (Paciente paciente : listaPacientes) {
                String rut = paciente.getRut();
                String nombre = paciente.getNombre();
                String genero = paciente.getGenero();
                int edad = paciente.getEdad();
                String direccion = paciente.getDireccion();
                String ciudad = paciente.getCiudad();
                String isapre = paciente.getIsapre();
                boolean donante = paciente.isDonante();
                modeloTabla.addRow(new Object[]{rut,nombre,genero,edad,direccion,ciudad,isapre,donante});
            }
        } else {
            try {
                listaPacientes = pacientesController.listarPacientes(rutBusqueda);
            } catch (SQLException e) {
                System.out.println("Error listando pacientes desde SQL: " + e.getMessage());
            }
            DefaultTableModel modeloTabla = (DefaultTableModel) this.jTable_listaPacientes.getModel();
            modeloTabla.setRowCount(0);

            for (Paciente paciente : listaPacientes) {
                String rut = paciente.getRut();
                String nombre = paciente.getNombre();
                String genero = paciente.getGenero();
                int edad = paciente.getEdad();
                String direccion = paciente.getDireccion();
                String ciudad = paciente.getCiudad();
                String isapre = paciente.getIsapre();
                boolean donante = paciente.isDonante();
                modeloTabla.addRow(new Object[]{rut,nombre,genero,edad,direccion,ciudad,isapre,donante});
            }
        }
        
        
        
    }//GEN-LAST:event_jBtn_listarPacientesActionPerformed

    private void jTextField_rutPacienteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_rutPacienteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_rutPacienteBuscarActionPerformed

    private void jButton_salirListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirListarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton_salirListarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_listarPacientes;
    private javax.swing.JButton jButton_salirListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_listaPacientes;
    private javax.swing.JTextField jTextField_rutPacienteBuscar;
    // End of variables declaration//GEN-END:variables

        
}