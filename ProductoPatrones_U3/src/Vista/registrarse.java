
package Vista;

import Controlador.Dirección;
import Modelo.Cliente;
import Modelo.ClienteDAO;
import javax.swing.JOptionPane;


public class registrarse extends javax.swing.JFrame {

    private Dirección dir;
    private DireccionJ direc;
    public registrarse() {
        initComponents();
        if (direc == null) {
   
            direc = new DireccionJ();
    }
        direc.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TFusuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFcontraseña = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtDireccion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        BtRegistrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Tfnombres = new javax.swing.JTextField();
        Tfapellidos = new javax.swing.JTextField();
        Tfemail = new javax.swing.JTextField();
        Tftelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(getPreferredSize());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 83, 72, -1));

        TFusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TFusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 106, 76, -1));

        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 83, 102, -1));

        TFcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcontraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(TFcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 106, 148, -1));

        jLabel5.setText("Nombres");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 147, 76, -1));

        jLabel6.setText("Apellidos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 217, 76, -1));

        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 287, 76, -1));

        BtDireccion.setText("Agregar Direccion");
        BtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(BtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 386, -1, -1));

        jLabel8.setText("Telefono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 357, 76, -1));

        BtRegistrar.setBackground(new java.awt.Color(0, 204, 102));
        BtRegistrar.setText("Confirmar registro");
        BtRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 436, 176, 33));

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("REGISTRO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(107, 107, 107))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, -1));
        jPanel1.add(Tfnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 176, 242, -1));
        jPanel1.add(Tfapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 246, 242, -1));
        jPanel1.add(Tfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 240, -1));
        jPanel1.add(Tftelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 386, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFusuarioActionPerformed

    private void BtRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRegistrarActionPerformed
        // TODO add your handling code here:
        System.out.println(dir);
        dir=direc.getDireccion();
        String sm=dir.getCalle();
        System.out.println(sm);
        if (sm.equals("")) {
            JOptionPane.showMessageDialog(this, "Necesita llenar la dirección.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        Cliente c= new Cliente(1, TFusuario.getText(), new String(TFcontraseña.getPassword()), Tfnombres.getText(), Tfapellidos.getText(), Tfemail.getText(),dir , Integer.parseInt(Tftelefono.getText()));
        ClienteDAO cD= new ClienteDAO();
        cD.clienteCreate(c);
        System.out.println(c);
        new Login().setVisible(true);
        this.dispose();
        


    }//GEN-LAST:event_BtRegistrarActionPerformed

    private void BtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDireccionActionPerformed
        // TODO add your handling code here:
        direc.setVisible(true);
        
    }//GEN-LAST:event_BtDireccionActionPerformed

    private void TFcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcontraseñaActionPerformed

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtDireccion;
    private javax.swing.JButton BtRegistrar;
    private javax.swing.JPasswordField TFcontraseña;
    private javax.swing.JTextField TFusuario;
    private javax.swing.JTextField Tfapellidos;
    private javax.swing.JTextField Tfemail;
    private javax.swing.JTextField Tfnombres;
    private javax.swing.JTextField Tftelefono;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
