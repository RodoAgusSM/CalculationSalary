/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.ReciboDependiente;
import Dominio.ReciboFicto;
import Dominio.ReciboIndependiente;
import Dominio.Sistema;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sony
 */
public class ImpresionCIRPF extends javax.swing.JFrame {

    private DefaultTableModel tabla;
    int cont = 0;
    private Sistema miModelo;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    public ImpresionCIRPF(Sistema modelo) {
        initComponents();
        miModelo = modelo;
        cargarTablaCRD();
        jTblImpresionCIRPF.setEnabled(false);
    }

    public void mostrarTablaCIRPF() {
        for (int i = 0; i < miModelo.getListaRecibosDependientes().size(); i++) {
            ReciboDependiente rD = miModelo.getListaRecibosDependientes().get(i);
            a = a + rD.getIRPF();
        }
        for (int i = 0; i < miModelo.getListaRecibosIndependientes().size(); i++) {
            ReciboIndependiente rI = miModelo.getListaRecibosIndependientes().get(i);
            b = b + rI.getIRPF();
        }
        for (int i = 0; i < miModelo.getListaRecibosFictos().size(); i++) {
            ReciboFicto rF = miModelo.getListaRecibosFictos().get(i);
            c = c + rF.getIRPF();
        }
        d = a + b + c;
        tabla.insertRow(cont, new Object[]{});
        tabla.setValueAt(d, cont, 0);
        cont++;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblImpresionCIRPF = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(102, 255, 102));
        btnImprimir.setText("Imprimir");
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jTblImpresionCIRPF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(jTblImpresionCIRPF);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try {
            jTblImpresionCIRPF.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ImpresionRD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int res = JOptionPane.showConfirmDialog(null, "Desea volver al menú principal?",
                "Mensaje", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            this.dispose();
        } else {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblImpresionCIRPF;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaCRD() {
        String data[][] = {};
        String[] columnNames = {"IRPF"};
        tabla = new DefaultTableModel(data, columnNames);
        jTblImpresionCIRPF.setModel(tabla);
    }

}
