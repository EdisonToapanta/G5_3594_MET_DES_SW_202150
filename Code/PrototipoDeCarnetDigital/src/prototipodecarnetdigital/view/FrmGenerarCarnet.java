/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipodecarnetdigital.view;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import prototipodecarnetdigital.controller.ImagenesController;
import prototipodecarnetdigital.controller.ImprimirCarnet;

/**
 *
 * @author BryanPC
 */
public class FrmGenerarCarnet extends javax.swing.JFrame {

    
    
    public FrmGenerarCarnet() {
       
        
        initComponents();
        txtNameRX.setHorizontalAlignment(JTextField.CENTER);
        txtCarreraRX.setHorizontalAlignment(JTextField.CENTER);  
        txtCorreoRX.setHorizontalAlignment(JTextField.CENTER);  
        this.setLocation(950, 150);
        ImagenesController imagen = new ImagenesController();
        pnlCarnet.add(imagen);
        pnlCarnet.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCarnet = new javax.swing.JPanel();
        txtNameRX = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        txtCarreraRX = new javax.swing.JTextField();
        txtCorreoRX = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlCarnet.setBackground(new java.awt.Color(204, 204, 204));

        txtNameRX.setBorder(null);
        txtNameRX.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNameRX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameRXActionPerformed(evt);
            }
        });

        txtCarreraRX.setBorder(null);
        txtCarreraRX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarreraRXActionPerformed(evt);
            }
        });

        txtCorreoRX.setBorder(null);
        txtCorreoRX.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout pnlCarnetLayout = new javax.swing.GroupLayout(pnlCarnet);
        pnlCarnet.setLayout(pnlCarnetLayout);
        pnlCarnetLayout.setHorizontalGroup(
            pnlCarnetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarnetLayout.createSequentialGroup()
                .addGroup(pnlCarnetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCarnetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCarnetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNameRX, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCarreraRX, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreoRX)))
                    .addGroup(pnlCarnetLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCarnetLayout.setVerticalGroup(
            pnlCarnetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarnetLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(txtNameRX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreoRX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCarreraRX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btnImprimir.setText("Guardar Carnet");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar Carnet");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCarnet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnImprimir)
                                .addGap(4, 4, 4)
                                .addComponent(btnEnviar)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimir)
                    .addComponent(btnEnviar))
                .addGap(3, 3, 3)
                .addComponent(btnCerrar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarreraRXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarreraRXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarreraRXActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        ImprimirCarnet carnet = new ImprimirCarnet();
        carnet.printRecord(pnlCarnet);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String correo = txtCorreoRX.getText();    
   
        ImprimirCarnet carnet = new ImprimirCarnet();
        try {
            carnet.enviarCorreo(correo);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Carnet Enviado Correctamente.");
        } catch (MessagingException ex) {
            Logger.getLogger(FrmGenerarCarnet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtNameRXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameRXActionPerformed
        
    }//GEN-LAST:event_txtNameRXActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGenerarCarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGenerarCarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGenerarCarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGenerarCarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGenerarCarnet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnImprimir;
    public javax.swing.JLabel lblImagen;
    private javax.swing.JPanel pnlCarnet;
    public javax.swing.JTextField txtCarreraRX;
    public javax.swing.JTextField txtCorreoRX;
    public javax.swing.JTextField txtNameRX;
    // End of variables declaration//GEN-END:variables
}
