/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import javax.swing.JFrame;

/**
 *
 * @author Ayton
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form frame_login
     */
    public Login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        BtAcceder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtRegistrarse = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(getPreferredSize());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 102));
        jLabel2.setText("LOGIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 17, -1, -1));

        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 62, 270, -1));

        TFUsuario.setText("Usuario");
        TFUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFUsuarioFocusGained(evt);
            }
        });
        TFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 85, 274, -1));

        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 126, 270, -1));

        PasswordField.setText("      ");
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
        });
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 149, 274, -1));

        BtAcceder.setBackground(new java.awt.Color(0, 204, 102));
        BtAcceder.setText("Acceder");
        BtAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAccederActionPerformed(evt);
            }
        });
        jPanel1.add(BtAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 199, -1, -1));

        jLabel5.setText("No tienes una cuenta?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 247, -1, -1));

        BtRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtRegistrarse.setForeground(new java.awt.Color(0, 204, 102));
        BtRegistrarse.setText("Registrate");
        BtRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(BtRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 245, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo saga.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 182, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFUsuarioActionPerformed

    private void BtRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRegistrarseActionPerformed
        
        registrarse RegistrateFrame = new registrarse ();
        RegistrateFrame.setVisible(true);
        RegistrateFrame.pack();
        RegistrateFrame.setLocationRelativeTo (null);
        this.dispose();
        
    }//GEN-LAST:event_BtRegistrarseActionPerformed

    private void TFUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFUsuarioFocusGained
        // TODO add your handling code here:
        if (TFUsuario.getText().equals("Usuario")){
            TFUsuario.setText("");
        }
    }//GEN-LAST:event_TFUsuarioFocusGained

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        // TODO add your handling code here:
        String password = new String(PasswordField.getPassword());
        if (password.equals("      ")){
            PasswordField.setText("");
        }
        

    }//GEN-LAST:event_PasswordFieldFocusGained

    private void BtAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAccederActionPerformed
        // TODO add your handling code here:
        Empleado e=new EmpleadoDAO().empleadoRead(TFUsuario.getText());
        Cliente c=new ClienteDAO().clienteRead(TFUsuario.getText());
        if (e.getUsuario().equals(TFUsuario.getText())){
            setVisible(false);
            JFrame Stock= new Stock();
            Stock.setVisible(true);
            
        }else if(c.getUsuario().equals(TFUsuario.getText())){
            setVisible(false);
            JFrame buscadorr =new buscadorr();
            buscadorr.setVisible(true);
        }
        
    }//GEN-LAST:event_BtAccederActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAcceder;
    private javax.swing.JButton BtRegistrarse;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
