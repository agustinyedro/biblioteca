
package biblioteca.Vista;

import biblioteca.AccesoData.LoginData;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import java.awt.Color;


public class Login extends javax.swing.JFrame {
    private LoginData loginData;
    
    public Login(){
        initComponents();
        this.setLocationRelativeTo(null);
        init();
    }

  
    public void init(){
        jPanel3.requestFocus();
        jPasswordField1.setBackground(new Color(0,0,0,0));
        jTxUsuario.setBackground(new Color(0,0,0,0));
        jTexOlvidaste.setBackground(new Color(0,0,0,0));
//        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTexOlvidaste = new javax.swing.JTextField();
        BtnIngresar = new javax.swing.JButton();
        BtnIngresar1 = new javax.swing.JButton();

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
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Biblioteca 75");

        jLabel3.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");

        jTxUsuario.setBackground(new java.awt.Color(51, 51, 55));
        jTxUsuario.setFont(new java.awt.Font("High Tower Text", 3, 18)); // NOI18N
        jTxUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxUsuario.setText("Usuario");
        jTxUsuario.setBorder(null);
        jTxUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxUsuarioFocusLost(evt);
            }
        });
        jTxUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxUsuarioActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("Ingrese su password");
        jPasswordField1.setBorder(null);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });

        jTexOlvidaste.setText("¿Has olvidado tu contraseña?");
        jTexOlvidaste.setBorder(null);
        jTexOlvidaste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        BtnIngresar.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        BtnIngresar.setText("INGRESAR");
        BtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIngresar.setMargin(new java.awt.Insets(5, 14, 0, 14));

        BtnIngresar1.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        BtnIngresar1.setText("REGISTRARSE");
        BtnIngresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIngresar1.setMargin(new java.awt.Insets(5, 14, 0, 14));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(BtnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnIngresar)
                        .addGap(25, 25, 25))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTexOlvidaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTexOlvidaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIngresar1)
                    .addComponent(BtnIngresar))
                .addGap(18, 18, 18))
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

    private void jTexOlvidasteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexOlvidasteMouseExited

        jTexOlvidaste.setForeground(new Color(46,78,88));
    }//GEN-LAST:event_jTexOlvidasteMouseExited

    private void jTexOlvidasteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexOlvidasteMouseEntered
        jTexOlvidaste.setForeground(new Color(255,87,34));
    }//GEN-LAST:event_jTexOlvidasteMouseEntered

    private void jTexOlvidasteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexOlvidasteMouseClicked

        //        VistaRecuperarPassword contrasena = new VistaRecuperarPassword();
        //        contrasena.setVisible(true);
        //        this.setVisible(false);
    }//GEN-LAST:event_jTexOlvidasteMouseClicked

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty()||String.valueOf(jPasswordField1.getPassword()).equalsIgnoreCase("Ingrese su password")) {
            jPasswordField1.setText("Ingrese su password");
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        if (String.valueOf(jPasswordField1.getPassword()).equalsIgnoreCase("Ingrese su password")) {
            jPasswordField1.setText("");
        }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jTxUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxUsuarioActionPerformed

    private void jTxUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxUsuarioFocusLost
        if (jTxUsuario.getText().isEmpty()||jTxUsuario.getText().equalsIgnoreCase("usuario")) {
            jTxUsuario.setText("Usuario");
        }
    }//GEN-LAST:event_jTxUsuarioFocusLost

    private void jTxUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxUsuarioFocusGained
        if (jTxUsuario.getText().equalsIgnoreCase("usuario")) {
            jTxUsuario.setText("");
        }
    }//GEN-LAST:event_jTxUsuarioFocusGained


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnIngresar1;
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
    private javax.swing.JTextField jTxUsuario;
    // End of variables declaration//GEN-END:variables

    
//     public static void main(String args[]) {
//        
//        
//        FlatSolarizedLightIJTheme.setup();
//        
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuTest().setVisible(true);
//            }
//        });
//    }
}