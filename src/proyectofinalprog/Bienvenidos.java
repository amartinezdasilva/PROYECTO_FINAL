/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalprog;

import java.applet.AudioClip;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
public class Bienvenidos extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenidos
     */
    public Bienvenidos() {
        initComponents();
              AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/proyectofinalprog/JurassicSong.wav"));
        
        sonido.play();
       
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acceder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIENVENIDO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acceder.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        acceder.setForeground(new java.awt.Color(255, 255, 255));
        acceder.setText("ACCEDER");
        acceder.setToolTipText("");
        acceder.setBorder(null);
        acceder.setBorderPainted(false);
        acceder.setContentAreaFilled(false);
        acceder.setDefaultCapable(false);
        acceder.setFocusPainted(false);
        acceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accederMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accederMousePressed(evt);
            }
        });
        acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederActionPerformed(evt);
            }
        });
        getContentPane().add(acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 260, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ENTRADA.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void accederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accederMouseClicked
      
    }//GEN-LAST:event_accederMouseClicked

    private void accederMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accederMousePressed
       
    }//GEN-LAST:event_accederMousePressed

    private void accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederActionPerformed
        Menu obxM = new Menu();
        obxM.setVisible(true);
        Bienvenidos.this.setVisible(false);
        
        
    }//GEN-LAST:event_accederActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceder;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
