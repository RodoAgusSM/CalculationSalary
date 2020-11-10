package Interfaz;

import Dominio.ReciboDependiente;
import Dominio.ReciboFicto;
import Dominio.ReciboIndependiente;
import Dominio.Sistema;
import java.io.IOException;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    private Sistema miSistema;

    public Sistema getMiSistema() {
        return miSistema;
    }

    public void setMiSistema(Sistema miSistema) {
        this.miSistema = miSistema;
    }

    public MenuPrincipal(Sistema sistema) {
        initComponents();

        miSistema = sistema;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRRD = new javax.swing.JButton();
        btnRRI = new javax.swing.JButton();
        btnRRF = new javax.swing.JButton();
        btnBRD = new javax.swing.JButton();
        btnBRI = new javax.swing.JButton();
        btnBRF = new javax.swing.JButton();
        btnCRD = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCRI = new javax.swing.JButton();
        btnCRF = new javax.swing.JButton();
        btnIRPF = new javax.swing.JButton();
        btnLRD = new javax.swing.JButton();
        btnLRI = new javax.swing.JButton();
        btnLRF = new javax.swing.JButton();
        btnICRD = new javax.swing.JButton();
        btnICRI = new javax.swing.JButton();
        btnICRF = new javax.swing.JButton();
        btnICIRPF = new javax.swing.JButton();
        btnGA = new javax.swing.JButton();
        btnCA = new javax.swing.JButton();
        Desarrollador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 640));
        setPreferredSize(new java.awt.Dimension(1280, 680));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Calculo sueldos");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnRRD.setBackground(new java.awt.Color(255, 102, 102));
        btnRRD.setText("Registro recibo dependiente");
        btnRRD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRRD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRRDActionPerformed(evt);
            }
        });

        btnRRI.setBackground(new java.awt.Color(255, 102, 102));
        btnRRI.setText("Registro recibo independiente");
        btnRRI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRRIActionPerformed(evt);
            }
        });

        btnRRF.setBackground(new java.awt.Color(255, 102, 102));
        btnRRF.setText("Registro recibo ficto");
        btnRRF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRRFActionPerformed(evt);
            }
        });

        btnBRD.setBackground(new java.awt.Color(204, 153, 255));
        btnBRD.setText("Borrar recibo dependiente");
        btnBRD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBRD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBRDActionPerformed(evt);
            }
        });

        btnBRI.setBackground(new java.awt.Color(204, 153, 255));
        btnBRI.setText("Borrar recibo independiente");
        btnBRI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBRIActionPerformed(evt);
            }
        });

        btnBRF.setBackground(new java.awt.Color(204, 153, 255));
        btnBRF.setText("Borrar recibo ficto");
        btnBRF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBRFActionPerformed(evt);
            }
        });

        btnCRD.setBackground(new java.awt.Color(153, 153, 255));
        btnCRD.setText("Calculos recibos dependientes");
        btnCRD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCRD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCRDActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 51));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCRI.setBackground(new java.awt.Color(153, 153, 255));
        btnCRI.setText("Calculos recibos independientes");
        btnCRI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCRIActionPerformed(evt);
            }
        });

        btnCRF.setBackground(new java.awt.Color(153, 153, 255));
        btnCRF.setText("Calculos recibos fictos");
        btnCRF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCRFActionPerformed(evt);
            }
        });

        btnIRPF.setBackground(new java.awt.Color(153, 255, 153));
        btnIRPF.setText("Calculo IRPF");
        btnIRPF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIRPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIRPFActionPerformed(evt);
            }
        });

        btnLRD.setBackground(new java.awt.Color(0, 255, 204));
        btnLRD.setText("Lista recibos dependientes");
        btnLRD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLRD.setPreferredSize(new java.awt.Dimension(193, 23));
        btnLRD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLRDActionPerformed(evt);
            }
        });

        btnLRI.setBackground(new java.awt.Color(0, 255, 204));
        btnLRI.setText("Lista recibos independientes");
        btnLRI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLRIActionPerformed(evt);
            }
        });

        btnLRF.setBackground(new java.awt.Color(0, 255, 204));
        btnLRF.setText("Lista recibos fictos");
        btnLRF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLRF.setMaximumSize(new java.awt.Dimension(193, 23));
        btnLRF.setMinimumSize(new java.awt.Dimension(193, 23));
        btnLRF.setPreferredSize(new java.awt.Dimension(193, 23));
        btnLRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLRFActionPerformed(evt);
            }
        });

        btnICRD.setBackground(new java.awt.Color(204, 204, 0));
        btnICRD.setText("Impresion calculos recibos dependientes");
        btnICRD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnICRD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICRDActionPerformed(evt);
            }
        });

        btnICRI.setBackground(new java.awt.Color(204, 204, 0));
        btnICRI.setText("Impresion calculos recibos independientes");
        btnICRI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnICRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICRIActionPerformed(evt);
            }
        });

        btnICRF.setBackground(new java.awt.Color(204, 204, 0));
        btnICRF.setText("Impresion calculos recibos fictos");
        btnICRF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnICRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICRFActionPerformed(evt);
            }
        });

        btnICIRPF.setBackground(new java.awt.Color(153, 255, 153));
        btnICIRPF.setText("Impresion calculo IRPF");
        btnICIRPF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnICIRPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICIRPFActionPerformed(evt);
            }
        });

        btnGA.setBackground(new java.awt.Color(0, 204, 204));
        btnGA.setText("Guardar archivo");
        btnGA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGAActionPerformed(evt);
            }
        });

        btnCA.setBackground(new java.awt.Color(0, 204, 204));
        btnCA.setText("Cargar archivo");
        btnCA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAActionPerformed(evt);
            }
        });

        Desarrollador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Desarrollador.setText("Desarrollador: Rodolfo Agustín Silva Messano");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRRD, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnBRD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnLRD, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btnCRD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnICRD, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRRI, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnBRI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnLRI, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btnCRI, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnICRI, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRRF, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBRF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnLRF, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btnCRF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnICRF, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290)
                        .addComponent(Desarrollador)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIRPF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCA, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnICIRPF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(391, 391, 391))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(490, 490, 490))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRRD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBRD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLRD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCRD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnICRD, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRRI, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBRI, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLRI, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCRI, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnICRI, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRRF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBRF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLRF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCRF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnICRF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnICIRPF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIRPF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Desarrollador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRRDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRRDActionPerformed
        RegistroRD ventana = new RegistroRD(miSistema);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnRRDActionPerformed

    private void btnRRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRRIActionPerformed
        RegistroRI ventana = new RegistroRI(miSistema);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnRRIActionPerformed

    private void btnBRDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBRDActionPerformed
        if (this.getMiSistema().getListaRecibosDependientes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo dependiente en el sistema para borrar ", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            BorrarRD ventana = new BorrarRD(miSistema);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnBRDActionPerformed

    private void btnBRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBRIActionPerformed
        if (this.getMiSistema().getListaRecibosIndependientes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo independiente en el sistema para borrar ", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            BorrarRI ventana = new BorrarRI(miSistema);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnBRIActionPerformed

    private void btnBRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBRFActionPerformed
        if (this.getMiSistema().getListaRecibosFictos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo ficto en el sistema para borrar ", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            BorrarRF ventana = new BorrarRF(miSistema);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnBRFActionPerformed

    private void btnCRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCRFActionPerformed
        if (this.getMiSistema().getListaRecibosFictos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo ficto en el sistema, imposible calcular", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            CalculosRF ventana = new CalculosRF(miSistema);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnCRFActionPerformed

    private void btnIRPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIRPFActionPerformed
        if (this.getMiSistema().getListaRecibosDependientes().isEmpty() && this.getMiSistema().getListaRecibosIndependientes().isEmpty() && this.getMiSistema().getListaRecibosFictos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo en el sistema, imposible calcular", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            CalculoIRPF ventana = new CalculoIRPF(miSistema);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnIRPFActionPerformed

    private void btnRRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRRFActionPerformed
        RegistroRF ventana = new RegistroRF(miSistema);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnRRFActionPerformed

    private void btnCRDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCRDActionPerformed
        if (this.getMiSistema().getListaRecibosDependientes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo dependiente en el sistema, imposible calcular", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            CalculosRD ventana = new CalculosRD(miSistema);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnCRDActionPerformed

    private void btnCRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCRIActionPerformed
        if (this.getMiSistema().getListaRecibosIndependientes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo independiente en el sistema, imposible calcular", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            CalculosRI ventana = new CalculosRI(miSistema);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnCRIActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int res = JOptionPane.showConfirmDialog(null, "Desea salir del programa sueldos?",
                "Mensaje", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnLRDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLRDActionPerformed
        if (this.getMiSistema().getListaRecibosDependientes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo dependiente en el sistema", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            ImpresionRD impresion = new ImpresionRD(miSistema);
            impresion.setLocationRelativeTo(null);
            impresion.setVisible(true);
            for (int i = 0; i < miSistema.getListaRecibosDependientes().size(); i++) {
                ReciboDependiente unRD = (ReciboDependiente) miSistema.getListaRecibosDependientes().get(i);
                impresion.mostrarTablaRD(unRD);
            }
        }
    }//GEN-LAST:event_btnLRDActionPerformed

    private void btnICRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICRIActionPerformed
        if (this.getMiSistema().getListaRecibosIndependientes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo independiente en el sistema", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            ImpresionCRI impresion = new ImpresionCRI(miSistema);
            impresion.setLocationRelativeTo(null);
            impresion.setVisible(true);
            impresion.mostrarTablaCRI();
        }
    }//GEN-LAST:event_btnICRIActionPerformed

    private void btnICRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICRFActionPerformed
        if (this.getMiSistema().getListaRecibosFictos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo ficto en el sistema", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            ImpresionCRF impresion = new ImpresionCRF(miSistema);
            impresion.setLocationRelativeTo(null);
            impresion.setVisible(true);
            impresion.mostrarTablaCRF();
        }
    }//GEN-LAST:event_btnICRFActionPerformed

    private void btnLRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLRIActionPerformed
        if (this.getMiSistema().getListaRecibosIndependientes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo independiente en el sistema", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            ImpresionRI impresion = new ImpresionRI(miSistema);
            impresion.setLocationRelativeTo(null);
            impresion.setVisible(true);
            for (int i = 0; i < miSistema.getListaRecibosIndependientes().size(); i++) {
                ReciboIndependiente unRI = (ReciboIndependiente) miSistema.getListaRecibosIndependientes().get(i);
                impresion.mostrarTablaRI(unRI);
            }
        }
    }//GEN-LAST:event_btnLRIActionPerformed

    private void btnLRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLRFActionPerformed
        if (this.getMiSistema().getListaRecibosFictos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo ficto en el sistema", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            ImpresionRF impresion = new ImpresionRF(miSistema);
            impresion.setLocationRelativeTo(null);
            impresion.setVisible(true);
            for (int i = 0; i < miSistema.getListaRecibosFictos().size(); i++) {
                ReciboFicto unRF = (ReciboFicto) miSistema.getListaRecibosFictos().get(i);
                impresion.mostrarTablaRF(unRF);
            }
        }
    }//GEN-LAST:event_btnLRFActionPerformed

    private void btnICIRPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICIRPFActionPerformed
        if (this.getMiSistema().getListaRecibosDependientes().isEmpty() && this.getMiSistema().getListaRecibosIndependientes().isEmpty() && this.getMiSistema().getListaRecibosFictos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo en el sistema", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            ImpresionCIRPF impresion = new ImpresionCIRPF(miSistema);
            impresion.setLocationRelativeTo(null);
            impresion.setVisible(true);
            impresion.mostrarTablaCIRPF();
        }
    }//GEN-LAST:event_btnICIRPFActionPerformed

    private void btnICRDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICRDActionPerformed
        if (this.getMiSistema().getListaRecibosDependientes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun recibo dependiente en el sistema", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            ImpresionCRD impresion = new ImpresionCRD(miSistema);
            impresion.setLocationRelativeTo(null);
            impresion.setVisible(true);
            impresion.mostrarTablaCRD();
        }
    }//GEN-LAST:event_btnICRDActionPerformed

    private void btnGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGAActionPerformed
        try {
            String nombre;
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del archivo");
            if (this.getMiSistema().getListaRecibosDependientes().isEmpty() && this.getMiSistema().getListaRecibosIndependientes().isEmpty() && this.getMiSistema().getListaRecibosFictos().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El archivo " + nombre + " esta vacio, por favor borrarlo", "Error", JOptionPane.OK_CANCEL_OPTION);
            }
            miSistema.guardarSistema(miSistema, nombre);
        } catch (IOException err) {
        }
    }//GEN-LAST:event_btnGAActionPerformed

    private void btnCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAActionPerformed
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del archivo");
        Sistema carga = miSistema.obtenerSistema(nombre);
        if (carga.getListaRecibosDependientes().isEmpty() && carga.getListaRecibosIndependientes().isEmpty() && carga.getListaRecibosFictos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No existe el archivo o se encuentra vacio", "Error", JOptionPane.OK_CANCEL_OPTION);
        } else {
            miSistema = carga;
        }
    }//GEN-LAST:event_btnCAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Desarrollador;
    private javax.swing.JButton btnBRD;
    private javax.swing.JButton btnBRF;
    private javax.swing.JButton btnBRI;
    private javax.swing.JButton btnCA;
    private javax.swing.JButton btnCRD;
    private javax.swing.JButton btnCRF;
    private javax.swing.JButton btnCRI;
    private javax.swing.JButton btnGA;
    private javax.swing.JButton btnICIRPF;
    private javax.swing.JButton btnICRD;
    private javax.swing.JButton btnICRF;
    private javax.swing.JButton btnICRI;
    private javax.swing.JButton btnIRPF;
    private javax.swing.JButton btnLRD;
    private javax.swing.JButton btnLRF;
    private javax.swing.JButton btnLRI;
    private javax.swing.JButton btnRRD;
    private javax.swing.JButton btnRRF;
    private javax.swing.JButton btnRRI;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
