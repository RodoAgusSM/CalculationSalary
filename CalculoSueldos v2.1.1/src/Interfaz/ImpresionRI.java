/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.ReciboIndependiente;
import Dominio.Sistema;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sony
 */
public class ImpresionRI extends javax.swing.JFrame  implements Printable {

    private DefaultTableModel tabla;
    int cont = 0;
    private Sistema miModelo;

    public ImpresionRI(Sistema modelo) {
        initComponents();
        miModelo = modelo;
        cargarMenusDesplegables();
        cargarTablaRI();
        jTblImpresionRI.setEnabled(false);
    }

    public void mostrarTablaRI(ReciboIndependiente unRI) {
        tabla.insertRow(cont, new Object[]{});
        tabla.setValueAt(unRI.getNombre().toUpperCase(), cont, 0);
        tabla.setValueAt(unRI.getSueldo(), cont, 1);
        tabla.setValueAt(unRI.getIRPF(), cont, 2);
        tabla.setValueAt(unRI.getIVA(), cont, 3);
        cont++;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImprimir = new javax.swing.JButton();
        jPanelContenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblImpresionRI = new javax.swing.JTable();
        jLabelTitular = new javax.swing.JLabel();
        jComboBoxNombre = new javax.swing.JComboBox();
        jLabelMes = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox();
        jLabelAnio = new javax.swing.JLabel();
        jComboBoxAnio = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(102, 255, 102));
        btnImprimir.setText("Imprimir");
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jTblImpresionRI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTblImpresionRI);

        jLabelTitular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTitular.setText("Titular:");

        jComboBoxNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelMes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMes.setText("Mes:");

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelAnio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelAnio.setText("Año:");

        jComboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabelTitular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jLabelMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabelAnio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitular)
                    .addComponent(jComboBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMes)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnio)
                    .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        job.printDialog();
        job.print();
    } catch (PrinterException ex) {
       Logger.getLogger(ImpresionRI.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox jComboBoxAnio;
    private javax.swing.JComboBox jComboBoxMes;
    private javax.swing.JComboBox jComboBoxNombre;
    private javax.swing.JLabel jLabelAnio;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JLabel jLabelTitular;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblImpresionRI;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaRI() {
        String data[][] = {};
        String[] columnNames = {"Nombre", "Sueldo", "IRPF", "IVA"};
        tabla = new DefaultTableModel(data, columnNames);
        jTblImpresionRI.setModel(tabla);
    }
    
      private void cargarMenusDesplegables() {
        jComboBoxNombre.removeAllItems();
        jComboBoxMes.removeAllItems();
        jComboBoxAnio.removeAllItems();
        jComboBoxNombre.addItem("Rodolfo");
        jComboBoxNombre.addItem("Cecilia");
        jComboBoxMes.addItem("Enero");
        jComboBoxMes.addItem("Febrero");
        jComboBoxMes.addItem("Marzo");
        jComboBoxMes.addItem("Abril");
        jComboBoxMes.addItem("Mayo");
        jComboBoxMes.addItem("Junio");
        jComboBoxMes.addItem("Julio");
        jComboBoxMes.addItem("Agosto");
        jComboBoxMes.addItem("Setiembre");
        jComboBoxMes.addItem("Octubre");
        jComboBoxMes.addItem("Noviembre");
        jComboBoxMes.addItem("Diciembre");
        for (int anio = 2019; anio < 2040; anio++) {
             jComboBoxAnio.addItem(anio);
        }
    }
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D)graphics;
        AffineTransform originalTransform = g2d.getTransform();
        double scaleX = pageFormat.getImageableWidth() / this.getWidth();
        double scaleY = pageFormat.getImageableHeight() / this.getHeight();
        double scale = Math.min(scaleX, scaleY);
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        g2d.scale(scale, scale);
        jPanelContenedor.printAll(g2d);
        g2d.setTransform(originalTransform);
        return PAGE_EXISTS;
    }
}
