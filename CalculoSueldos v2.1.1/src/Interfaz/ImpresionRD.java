/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.ReciboDependiente;
import Dominio.Sistema;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
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
public class ImpresionRD extends javax.swing.JFrame implements Printable {

    private DefaultTableModel tabla;
    int cont = 0;
    private Sistema miModelo;

    public ImpresionRD(Sistema modelo) {
        initComponents();
        miModelo = modelo;
        cargarMenusDesplegables();
        cargarTabla();
        jTblImpresionRD.setEnabled(false);
    }

    public void mostrarTablaRD(ReciboDependiente unRD) {
        tabla.insertRow(cont, new Object[]{});
        tabla.setValueAt(unRD.getNombre().toUpperCase(), cont, 0);
        tabla.setValueAt(unRD.getSueldo(), cont, 1);
        tabla.setValueAt(unRD.getIRPF(), cont, 2);
        tabla.setValueAt(unRD.getMontepio(), cont, 3);
        tabla.setValueAt(unRD.getFonasa1(), cont, 4);
        tabla.setValueAt(unRD.getFonasa2(), cont, 5);
        tabla.setValueAt(unRD.getFonasa3(), cont, 6);
        tabla.setValueAt(unRD.getFonasa4(), cont, 7);
        tabla.setValueAt(unRD.getFRL(), cont, 8);
        cont++;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImprimir = new javax.swing.JButton();
        jPanelContenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblImpresionRD = new javax.swing.JTable();
        jComboBoxNombre = new javax.swing.JComboBox();
        jComboBoxMes = new javax.swing.JComboBox();
        jComboBoxAnio = new javax.swing.JComboBox();
        jLabelTitular = new javax.swing.JLabel();
        jLabelMes = new javax.swing.JLabel();
        jLabelAnio = new javax.swing.JLabel();

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

        jTblImpresionRD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane1.setViewportView(jTblImpresionRD);

        jComboBoxNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelTitular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTitular.setText("Titular:");

        jLabelMes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMes.setText("Mes:");

        jLabelAnio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelAnio.setText("Año:");

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabelTitular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabelMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabelAnio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitular)
                    .addComponent(jComboBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMes)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnio)
                    .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
    private javax.swing.JComboBox jComboBoxAnio;
    private javax.swing.JComboBox jComboBoxMes;
    private javax.swing.JComboBox jComboBoxNombre;
    private javax.swing.JLabel jLabelAnio;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JLabel jLabelTitular;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblImpresionRD;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        String data[][] = {};
        String[] columnNames = {"Nombre", "Sueldo", "IRPF", "Montepio", "Fonasa1", "Fonasa2", "Fonasa3", "Fonasa4", "FRL"};
        tabla = new DefaultTableModel(data, columnNames);
        jTblImpresionRD.setModel(tabla);
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
