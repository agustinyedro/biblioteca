
package biblioteca.Vista;

import biblioteca.AccesoData.loginData;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import java.awt.Color;


public class login extends javax.swing.JFrame {
    
    public login(){
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private loginData loginData;



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxContrasenia = new javax.swing.JTextField();
        jTxUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTexOlvidaste = new javax.swing.JTextField();
        jBingresar = new javax.swing.JButton();
        jBcrear = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Inicio De Sesion");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LecturImatges_ la lectura en imatges2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("High Tower Text", 3, 36)); // NOI18N
        jLabel2.setText("Biblioteca 75");

        jLabel3.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jLabel3.setText("Login");

        jTxContrasenia.setBackground(new java.awt.Color(51, 51, 55));
        jTxContrasenia.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jTxContrasenia.setText("CONTRASEÑA");
        jTxContrasenia.setBorder(null);
        jTxContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxContraseniaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxContraseniaFocusLost(evt);
            }
        });
        jTxContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxContraseniaMouseClicked(evt);
            }
        });
        jTxContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxContraseniaActionPerformed(evt);
            }
        });

        jTxUsuario.setBackground(new java.awt.Color(51, 51, 55));
        jTxUsuario.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jTxUsuario.setText("USUARIO");
        jTxUsuario.setBorder(null);
        jTxUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxUsuarioMouseClicked(evt);
            }
        });
        jTxUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxUsuarioActionPerformed(evt);
            }
        });

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);

        jTexOlvidaste.setText("Has olvidado tu contraseña?");
        jTexOlvidaste.setBorder(null);
        jTexOlvidaste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexOlvidasteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTexOlvidasteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTexOlvidasteMouseExited(evt);
            }
        });

        jBingresar.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jBingresar.setText("INGRESAR");
        jBingresar.setBorder(null);
        jBingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBingresarActionPerformed(evt);
            }
        });

        jBcrear.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jBcrear.setText("CREAR");
        jBcrear.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jTxContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTxUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jBcrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBingresar)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTexOlvidaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jTxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTexOlvidaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcrear)
                    .addComponent(jBingresar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBingresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBingresarActionPerformed

    private void jTxUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxUsuarioActionPerformed

    private void jTxUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxUsuarioMouseClicked
        
         if (jTxUsuario.getText().equalsIgnoreCase("Ingrese su usuario")) {
            jTxUsuario.setText("");
        }

        
    }//GEN-LAST:event_jTxUsuarioMouseClicked

    private void jTxContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxContraseniaActionPerformed

    private void jTxContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxContraseniaFocusGained
        if (String.valueOf(jPasswordField1.getPassword()).equalsIgnoreCase("Ingrese su password")) {
            jPasswordField1.setText("");

        }
    }//GEN-LAST:event_jTxContraseniaFocusGained

    private void jTxContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxContraseniaFocusLost
        
         if (String.valueOf(jPasswordField1.getPassword()).isEmpty() || String.valueOf(jPasswordField1.getPassword()).equalsIgnoreCase("Ingrese su password")) {
            jPasswordField1.setText("Ingrese su password");
        }
    }//GEN-LAST:event_jTxContraseniaFocusLost

    private void jTxContraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxContraseniaMouseClicked
        
        if (String.valueOf(jPasswordField1.getPassword()).equalsIgnoreCase("Ingrese su password")) {
            jPasswordField1.setText("");
        }

        
    }//GEN-LAST:event_jTxContraseniaMouseClicked

    private void jTexOlvidasteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexOlvidasteMouseClicked
        
//        VistaRecuperarPassword contrasena = new VistaRecuperarPassword();
//        contrasena.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_jTexOlvidasteMouseClicked

    private void jTexOlvidasteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexOlvidasteMouseEntered
        jTexOlvidaste.setForeground(new Color(255,184,105));
    }//GEN-LAST:event_jTexOlvidasteMouseEntered

    private void jTexOlvidasteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexOlvidasteMouseExited
        
        jTexOlvidaste.setForeground(new Color(228,228,231));
    }//GEN-LAST:event_jTexOlvidasteMouseExited


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcrear;
    private javax.swing.JButton jBingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTexOlvidaste;
    private javax.swing.JTextField jTxContrasenia;
    private javax.swing.JTextField jTxUsuario;
    // End of variables declaration//GEN-END:variables

    
     public static void main(String args[]) {
        
        
        FlatSolarizedLightIJTheme.setup();
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
}