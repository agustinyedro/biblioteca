package biblioteca.Vista;

import biblioteca.AccesoData.LoginData;
//import biblioteca.AccesoData.LoginData1;
import biblioteca75.Login;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import java.awt.Color;

public class VistaLogin extends javax.swing.JFrame {
//    private LoginData loginData;

    public VistaLogin() {
        setUndecorated(true);
        initComponents();
        jLerror.setVisible(false);
        this.setLocationRelativeTo(null);
        init();
        setBackground(new Color(0, 0, 0, 0));
    }

    public void init() {
        panelRound1.requestFocus();
//        jPanel3.putClientProperty( FlatClientProperties.STYLE, "arc: 100");
        jPasswordField1.setBackground(new Color(0, 0, 0, 0));
        jTxUsuario.setBackground(new Color(0, 0, 0, 0));
        jTexOlvidaste.setBackground(new Color(0, 0, 0, 0));
//        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new biblioteca.Vista.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTexOlvidaste = new javax.swing.JTextField();
        BtnIngresar = new javax.swing.JButton();
        BtnIngresar1 = new javax.swing.JButton();
        jLerror = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Inicio De Sesion");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Biblioteca 75");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");

        jTxUsuario.setBackground(new java.awt.Color(51, 51, 55));
        jTxUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        BtnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnIngresar.setText("INGRESAR");
        BtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIngresar.setMargin(new java.awt.Insets(0, 14, 4, 14));
        BtnIngresar.setMaximumSize(null);
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        BtnIngresar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnIngresar1.setText("REGISTRARSE");
        BtnIngresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIngresar1.setMargin(new java.awt.Insets(0, 14, 4, 14));
        BtnIngresar1.setMaximumSize(null);
        BtnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresar1ActionPerformed(evt);
            }
        });

        jLerror.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLerror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLerror.setText("Login");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addContainerGap(8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTexOlvidaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(35, 35, 35))
                        .addGroup(panelRound1Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(BtnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLerror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLerror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTexOlvidaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTexOlvidasteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexOlvidasteMouseExited

        jTexOlvidaste.setForeground(new Color(46, 78, 88));
    }//GEN-LAST:event_jTexOlvidasteMouseExited

    private void jTexOlvidasteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexOlvidasteMouseEntered
        jTexOlvidaste.setForeground(new Color(255, 87, 34));
    }//GEN-LAST:event_jTexOlvidasteMouseEntered

    private void jTexOlvidasteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexOlvidasteMouseClicked
        VistaRecuperarContraseña contrasena = new VistaRecuperarContraseña();
        PantallaDeInicio p = new PantallaDeInicio();
        p.setVisible(true);
        p.setPanelFondo(false);
        contrasena.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jTexOlvidasteMouseClicked

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty() || String.valueOf(jPasswordField1.getPassword()).equalsIgnoreCase("Ingrese su password")) {
            jPasswordField1.setText("Ingrese su password");
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        if (String.valueOf(jPasswordField1.getPassword()).equalsIgnoreCase("Ingrese su password")) {
            jPasswordField1.setText("");
            jSeparator2.setForeground(new Color(200, 202, 192));
            jSeparator2.setBackground(new Color(200, 202, 192));
            jLerror.setVisible(false);

        }

    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jTxUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxUsuarioFocusLost
        if (jTxUsuario.getText().isEmpty() || jTxUsuario.getText().equalsIgnoreCase("usuario")) {
            jTxUsuario.setText("Usuario");

        }
    }//GEN-LAST:event_jTxUsuarioFocusLost

    private void jTxUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxUsuarioFocusGained
        if (jTxUsuario.getText().equalsIgnoreCase("usuario")) {
            jTxUsuario.setText("");
            jSeparator1.setForeground(new Color(200, 202, 192));
            jSeparator1.setBackground(new Color(200, 202, 192));
            jLerror.setVisible(false);
        }
    }//GEN-LAST:event_jTxUsuarioFocusGained

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        LoginData loginData = new LoginData();

        try {
            Login usuario = loginData.buscarLoginPorUsuario(jTxUsuario.getText());
            if (jTxUsuario.getText().equals(usuario.getUsuario()) && String.valueOf(jPasswordField1.getPassword()).equals(usuario.getContrasenia())) {
                VistaIngreso menu = new VistaIngreso();
                menu.setVisible(true);
                this.setVisible(false);
            }
//            if (jTxtUsuario.getText().isEmpty()) {
//                jLerror.setForeground(Color.red);
//                jLerror.setText("*ingrese un usuario ");
//                jLerror.setVisible(true);
//                jSeparator2.setForeground(Color.red);
//                jSeparator2.setBackground(Color.red);
//
//            } else if (String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
//                jLerror.setForeground(Color.red);
//                jLerror.setText("*ingrese una contraseña ");
//                jLerror.setVisible(true);
//                jSeparator1.setForeground(Color.red);
//                jSeparator1.setBackground(Color.red);
//            }
        } catch (NullPointerException e) {
            jLerror.setForeground(Color.red);
            jLerror.setText("*Usuario y/o contraseña incorrecto");
            jLerror.setVisible(true);
            jSeparator1.setForeground(Color.red);
            jSeparator1.setBackground(Color.red);
            jSeparator2.setForeground(Color.red);
            jSeparator2.setBackground(Color.red);

        } finally {
            panelRound1.requestFocus();
        }
    }//GEN-LAST:event_BtnIngresarActionPerformed

    private void BtnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresar1ActionPerformed
        VistaRegistrarse objeto = new VistaRegistrarse();
        PantallaDeInicio p = new PantallaDeInicio();
        p.setVisible(true);
        p.setPanelFondo(false);
        objeto.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_BtnIngresar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnIngresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLerror;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTexOlvidaste;
    private javax.swing.JTextField jTxUsuario;
    private biblioteca.Vista.PanelRound panelRound1;
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
