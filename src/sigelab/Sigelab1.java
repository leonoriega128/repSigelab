/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigelab;

import DAO.UsuarioDAO;
import VO.UsuarioVO;
import java.util.ArrayList;
import Conexion.Conectar;
import java.util.Arrays;
import javax.swing.JPasswordField;

/**
 *
 * @author Leo
 */
public class Sigelab1 extends javax.swing.JFrame {

    /**
     * Creates new form Sigelab1
     */
    public Sigelab1() {
        initComponents();
        this.setLocationRelativeTo(null);
        Conectar c = new Conectar();
        c.getConnection();

    }

    private String legajo = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(176, 204, 51));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jTextField1.setText("222");

        jTextField2.setText("1234");

        jLabel1.setText("Legajo:");

        jLabel2.setText("Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UsuarioDAO U = new UsuarioDAO();
        ArrayList E = new ArrayList();
        String jLeg = jTextField1.getText();
        String jPass = jTextField2.getText();
        E = U.Listar_UsuarioVO();
        for (int i = 0; i < E.size(); i++) {
            String leg = Integer.toString(((UsuarioVO) E.get(i)).getLegajo());
            String pass = (((UsuarioVO) E.get(i)).getPassword());
            if (leg.equalsIgnoreCase(jLeg)) {
                if (pass.equalsIgnoreCase(jPass)) {
                    this.setVisible(false);
                    switch (((UsuarioVO) E.get(i)).getRol()) {
                        case "Coordinador":
                            Coordinador c = new Coordinador();
                            c.setVisible(true);
                            legajo = jTextField1.getText();
                            break;
                        case "docente":
                            Docente d = new Docente();
                            d.setVisible(true);
                            legajo = jTextField1.getText();
                            d.recibirLegajo(legajo);
                            d.obtenerDatos(legajo);
                            break;
                        case "AyudanteL":
                            AyudanteLab ayul = new AyudanteLab();
                            ayul.setVisible(true);
                                legajo = jTextField1.getText();
                                
                            break;
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            UsuarioDAO U = new UsuarioDAO();
            ArrayList E = new ArrayList();
            String jLeg = jTextField1.getText();
            String jPass = jTextField2.getText();
            E = U.Listar_UsuarioVO();
            for (int i = 0; i < E.size(); i++) {
                String leg = Integer.toString(((UsuarioVO) E.get(i)).getLegajo());
                String pass = (((UsuarioVO) E.get(i)).getPassword());
                if (leg.equalsIgnoreCase(jLeg)) {
                    if (pass.equalsIgnoreCase(jPass)) {
                        this.setVisible(false);
                        switch (((UsuarioVO) E.get(i)).getRol()) {
                            case "Coordinador":
                                Coordinador c = new Coordinador();
                                c.setVisible(true);
                                legajo = jTextField1.getText();
                                break;
                            case "docente":
                                Docente d = new Docente();
                                d.setVisible(true);
                                legajo = jTextField1.getText();
                                d.recibirLegajo(legajo);
                                d.obtenerDatos(legajo);
                                break;
                            case "AyudanteL":
                                AyudanteLab ayul = new AyudanteLab();
                                ayul.setVisible(true);
                                break;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed


    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Sigelab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sigelab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sigelab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sigelab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sigelab1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
