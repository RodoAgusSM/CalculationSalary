/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.Sistema;
import javax.swing.JOptionPane;

/**
 *
 * @author Sony
 */
public class RegistroRD extends javax.swing.JFrame {

    private Sistema miModelo;

    public RegistroRD(Sistema modelo) {
        initComponents();
        miModelo = modelo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txtNombre = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        txtIRPF = new javax.swing.JTextField();
        txtMontepio = new javax.swing.JTextField();
        txtFonasa1 = new javax.swing.JTextField();
        txtFonasa2 = new javax.swing.JTextField();
        txtFonasa3 = new javax.swing.JTextField();
        txtFonasa4 = new javax.swing.JTextField();
        txtFRL = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnRegistrarSalir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Registro Recibo Dependiente");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Sueldo");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("IRPF");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Montepio");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("FRL");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Fonasa1");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setText("Fonasa2");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("Fonasa3");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setText("Fonasa4");

        btnRegistrar.setBackground(new java.awt.Color(153, 255, 153));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnRegistrarSalir.setBackground(new java.awt.Color(51, 153, 255));
        btnRegistrarSalir.setText("Registrar y volver");
        btnRegistrarSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalirActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 51));
        btnSalir.setText("Volver");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel6))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFRL, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(txtFonasa4)
                            .addComponent(txtFonasa3)
                            .addComponent(txtFonasa2)
                            .addComponent(txtFonasa1)
                            .addComponent(txtMontepio)
                            .addComponent(txtIRPF)
                            .addComponent(txtSueldo)
                            .addComponent(txtNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(btnRegistrarSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIRPF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMontepio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtFonasa1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFonasa2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtFonasa3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtFonasa4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFRL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (txtNombre.getText().isEmpty() || txtSueldo.getText().isEmpty() || txtIRPF.getText().isEmpty() || txtMontepio.getText().isEmpty() || txtFonasa1.getText().isEmpty() || txtFonasa2.getText().isEmpty() || txtFonasa3.getText().isEmpty() || txtFonasa4.getText().isEmpty() || txtFRL.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan datos del recibo dependiente");
        }
        else 
        {
            try {
                    if (miModelo.ingresarReciboDependiente(txtNombre.getText(), Integer.parseInt(txtSueldo.getText()), Integer.parseInt(txtIRPF.getText()), Integer.parseInt(txtMontepio.getText()), Integer.parseInt(txtFonasa1.getText()), Integer.parseInt(txtFonasa2.getText()), Integer.parseInt(txtFonasa3.getText()), Integer.parseInt(txtFonasa4.getText()), Integer.parseInt(txtFRL.getText()))) {
                        JOptionPane.showMessageDialog(this, "Se registro el recibo dependiente");
                        txtNombre.setText(null);
                        txtSueldo.setText(null);
                        txtIRPF.setText(null);
                        txtMontepio.setText(null);
                        txtFonasa1.setText(null);
                        txtFonasa2.setText(null);
                        txtFonasa3.setText(null);
                        txtFonasa4.setText(null);
                        txtFRL.setText(null);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Ya existe el recibo dependiente con nombre " + txtNombre.getText().toUpperCase());
                    }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Se equivoco, algún dato no es válido");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();       
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int res = JOptionPane.showConfirmDialog(null, "Desea volver al menú principal?",
                "Mensaje", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            this.dispose();
        } else {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnRegistrarSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalirActionPerformed
        if (txtNombre.getText().isEmpty() || txtSueldo.getText().isEmpty() || txtIRPF.getText().isEmpty() || txtMontepio.getText().isEmpty() || txtFonasa1.getText().isEmpty() || txtFonasa2.getText().isEmpty() || txtFonasa3.getText().isEmpty() || txtFonasa4.getText().isEmpty() || txtFRL.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan datos del recibo dependiente");
        } else {
            try {
                    if (miModelo.ingresarReciboDependiente(txtNombre.getText(), Integer.parseInt(txtSueldo.getText()), Integer.parseInt(txtIRPF.getText()), Integer.parseInt(txtMontepio.getText()), Integer.parseInt(txtFonasa1.getText()), Integer.parseInt(txtFonasa2.getText()), Integer.parseInt(txtFonasa3.getText()), Integer.parseInt(txtFonasa4.getText()), Integer.parseInt(txtFRL.getText()))) {
                        JOptionPane.showMessageDialog(this, "Se registro el recibo dependiente");
                        txtNombre.setText(null);
                        txtSueldo.setText(null);
                        txtIRPF.setText(null);
                        txtMontepio.setText(null);
                        txtFonasa1.setText(null);
                        txtFonasa2.setText(null);
                        txtFonasa3.setText(null);
                        txtFonasa4.setText(null);
                        txtFRL.setText(null);
                        this.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Ya existe el recibo dependiente con nombre " + txtNombre.getText().toUpperCase());
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Se equivoco, algún dato no es válido");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
        }
    }//GEN-LAST:event_btnRegistrarSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarSalir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtFRL;
    private javax.swing.JTextField txtFonasa1;
    private javax.swing.JTextField txtFonasa2;
    private javax.swing.JTextField txtFonasa3;
    private javax.swing.JTextField txtFonasa4;
    private javax.swing.JTextField txtIRPF;
    private javax.swing.JTextField txtMontepio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables

}
