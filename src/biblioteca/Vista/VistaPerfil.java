package biblioteca.Vista;

import biblioteca.AccesoData.LectorData;
import biblioteca.AccesoData.LoginData;
import static biblioteca.Vista.VistaRegistrarse.validarEmail;
import biblioteca75.Lector;
import biblioteca75.Login;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;

public class VistaPerfil extends javax.swing.JInternalFrame {

    private Login login;
    private ImageIcon[] imagenes = new ImageIcon[6];

    public VistaPerfil(Login login) {
        initComponents();
        // SetImageLabel(jLPersonita,"src/iconos/woman.png");
        setSize(1100, 670);
        this.login = login;
        cargarComboBox();
        cargarImagenComboBox();
        jSDia.setForeground(new Color(20, 16, 38));
        jPanel1.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:60");
        jPanel2.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:60");
        selector.putClientProperty(FlatClientProperties.STYLE, ""
                + "buttonBackground:null");
        login = this.getLogin();
//        System.out.println(login);
        cargarLogin();

    }

    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    public void cargarLogin() {
        login = this.getLogin();

        Lector lector = new LectorData().buscarLector(login.getLector().getNroSocio());
        jTNombre.setText(lector.getNombre());
        jTapellido.setText(lector.getApellido());
        jTMail.setText(lector.getMail());
        jTusuario.setText(login.getUsuario());
        jTcel.setText(String.valueOf(lector.getTelefono()));
        for (int i = 0; i < 6; i++) {
            if (login.getNombreImg().equals("imagen" + (i + 1) + ".png")) {
                selector.setSelectedIndex(i);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        selector = new javax.swing.JComboBox<>();
        jBImg1 = new javax.swing.JButton();
        jBCambiarContraseña = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLusuario = new javax.swing.JLabel();
        jMonMes = new com.toedter.calendar.JMonthChooser();
        jCgenero = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTMail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTusuario = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jLgenero = new javax.swing.JLabel();
        jTapellido = new javax.swing.JTextField();
        jSDia = new javax.swing.JSpinner();
        jLemail = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        verificacion = new javax.swing.JLabel();
        jLTel = new javax.swing.JLabel();
        jTcel = new javax.swing.JTextField();
        jLCumpleanios = new javax.swing.JLabel();
        jYAño = new com.toedter.calendar.JYearChooser();
        JBPremium = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1065, 720));
        setMinimumSize(new java.awt.Dimension(1065, 720));
        setPreferredSize(new java.awt.Dimension(1065, 720));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel1.setBackground(new java.awt.Color(146, 81, 184));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccionar un Imagen");
        jLabel3.setToolTipText("");

        selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorActionPerformed(evt);
            }
        });

        jBImg1.setText("Cambiar la imagen");
        jBImg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBImg1MouseClicked(evt);
            }
        });
        jBImg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg1ActionPerformed(evt);
            }
        });

        jBCambiarContraseña.setText("Cambiar tu contraseña");
        jBCambiarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCambiarContraseñaMouseClicked(evt);
            }
        });
        jBCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCambiarContraseñaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(20, 16, 38));

        jLusuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLusuario.setForeground(new java.awt.Color(204, 204, 204));
        jLusuario.setText("Usuario");

        jMonMes.setForeground(new java.awt.Color(20, 16, 38));

        jCgenero.setForeground(new java.awt.Color(20, 16, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Apellido");

        jTMail.setForeground(new java.awt.Color(20, 16, 38));
        jTMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTMailFocusLost(evt);
            }
        });
        jTMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMailActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar tu Perfil");

        jTusuario.setForeground(new java.awt.Color(20, 16, 38));

        jLNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(204, 204, 204));
        jLNombre.setText("Nombre");
        jLNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLNombreMouseClicked(evt);
            }
        });

        jLgenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLgenero.setForeground(new java.awt.Color(204, 204, 204));
        jLgenero.setText("Genero");

        jTapellido.setForeground(new java.awt.Color(20, 16, 38));
        jTapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTapellidoActionPerformed(evt);
            }
        });

        jLemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLemail.setForeground(new java.awt.Color(204, 204, 204));
        jLemail.setText("Email");

        jTNombre.setForeground(new java.awt.Color(20, 16, 38));
        jTNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNombreFocusLost(evt);
            }
        });

        jLTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLTel.setForeground(new java.awt.Color(204, 204, 204));
        jLTel.setText("N° de Telefono");

        jTcel.setForeground(new java.awt.Color(20, 16, 38));
        jTcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcelActionPerformed(evt);
            }
        });

        jLCumpleanios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLCumpleanios.setForeground(new java.awt.Color(204, 204, 204));
        jLCumpleanios.setText("Cumpleaños");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLCumpleanios)
                    .addComponent(jLNombre)
                    .addComponent(jLabel2)
                    .addComponent(jLemail)
                    .addComponent(jLusuario)
                    .addComponent(jLTel)
                    .addComponent(jLgenero))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTMail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTusuario)
                            .addComponent(jTapellido)
                            .addComponent(jTNombre)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jSDia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jMonMes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jYAño, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTcel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(jTMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLemail)
                            .addComponent(verificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLusuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jMonMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jYAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLCumpleanios))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLgenero))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        JBPremium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/diamente18.png"))); // NOI18N
        JBPremium.setText("Hazte Premium");
        JBPremium.setIconTextGap(5);
        JBPremium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBPremiumMouseClicked(evt);
            }
        });
        JBPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPremiumActionPerformed(evt);
            }
        });

        jBEditar.setText("Editar");
        jBEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEditarMouseClicked(evt);
            }
        });
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPremium)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jBImg1)
                .addGap(18, 18, 18)
                .addComponent(jBCambiarContraseña)
                .addGap(18, 18, 18)
                .addComponent(JBPremium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(jBEditar)
                .addGap(124, 124, 124))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBImg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg1ActionPerformed

        ImageIcon imagenSeleccionada = (ImageIcon) selector.getSelectedItem();

        // Obtén el nombre de la imagen seleccionada
        String nombreImagen = getNombreImagen(imagenSeleccionada);

        login.setNombreImg(nombreImagen);
        new LoginData().modificarLogin(login);

        VistaIngreso p = new VistaIngreso(login);
        p.dispose();
        p.setPerfil(true);
        p.setVisible(true);
    }//GEN-LAST:event_jBImg1ActionPerformed

    private void jBImg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBImg1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg1MouseClicked

    private void selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorActionPerformed

        ImageIcon imagenSeleccionada = (ImageIcon) selector.getSelectedItem();

        // Obtén el nombre de la imagen seleccionada
        String nombreImagen = getNombreImagen(imagenSeleccionada);

        // Realiza la acción deseada con el nombre de la imagen
    }//GEN-LAST:event_selectorActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        if (jTapellido.getText().isEmpty() || jTMail.getText().isEmpty() || jTMail.getText().isEmpty()
                || jTusuario.getText().isEmpty() || jTcel.getText().isEmpty() || jSDia.equals("") || jMonMes.equals("")
                || jYAño.equals("") || jCgenero.equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            
        }else{

          Lector lector= new Lector(); 
            
            ValidacionDeNombre();
        ValidacionDeTelefono();
        ValidacionDeUsuario();
        
        lector=new LectorData().buscarLector(login.getLector().getNroSocio());
        
        login.setUsuario(jTusuario.getText());
        lector.setNombre(jTNombre.getText());
        lector.setApellido(jTapellido.getText());
        lector.setMail(jTMail.getText());
        lector.setTelefono(Integer.parseInt(jTcel.getText()));
        login.setLector(lector);
        new LectorData().modificarLector(lector);
        new LoginData().modificarLogin(login);
        }

        
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEditarMouseClicked

    private void jLNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNombreMouseClicked

    }//GEN-LAST:event_jLNombreMouseClicked

    private void jTcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcelActionPerformed

    }//GEN-LAST:event_jTcelActionPerformed

    private void jTMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMailActionPerformed

    }//GEN-LAST:event_jTMailActionPerformed

    private void jTMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMailFocusLost
        String email = jTMail.getText();
        if (validarEmail(email)) {
            SetImageLabel(verificacion, "src/iconos/correcto.png");

        } else {

            SetImageLabel(verificacion, "src/iconos/incorrecto.png");
        }
        this.setVisible(true);
    }//GEN-LAST:event_jTMailFocusLost

    private void jTNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNombreFocusGained
        jTNombre.setText("");
    }//GEN-LAST:event_jTNombreFocusGained

    private void jBCambiarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCambiarContraseñaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCambiarContraseñaMouseClicked

    private void jBCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCambiarContraseñaActionPerformed
        VistaRecuperarContraseña p = new VistaRecuperarContraseña();
        p.setLogin(true);
        p.setVisible(true);
    }//GEN-LAST:event_jBCambiarContraseñaActionPerformed

    private void jTapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTapellidoActionPerformed

    private void JBPremiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBPremiumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JBPremiumMouseClicked

    private void JBPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPremiumActionPerformed
        new VistaPremium().setVisible(true);
    }//GEN-LAST:event_JBPremiumActionPerformed

    private void jTNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNombreFocusLost
        if (jTNombre.getText().isEmpty()) {
            Lector lector = new LectorData().buscarLector(login.getLector().getNroSocio());
            jTNombre.setText(lector.getNombre());
        }
    }//GEN-LAST:event_jTNombreFocusLost

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
//    private void SetImageLabel(JLabel labelName, String root) {
//        ImageIcon image = new ImageIcon(root);
//        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
//        labelName.setIcon(icon);
//        this.repaint();
//    }

    public void ValidacionDeNombre() {

        try {
            validarNombre(jTapellido.getText());
            System.out.println("El apellido es válido: " + jTapellido.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void validarNombre(String apellido) throws NumberFormatException {
        // Verificar que el apellido no esté vacío
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new NumberFormatException("El apellido no puede estar vacío.");
        }

        // Verificar que el apellido contenga solo letras, espacios y apóstrofes
        if (!apellido.matches("^[a-zA-Z\\s']+")) {
            throw new NumberFormatException("El apellido contiene caracteres no permitidos.");
        }

        // Verificar que la longitud del apellido sea razonable (por ejemplo, entre 2 y 50 caracteres)
        if (apellido.length() < 2 || apellido.length() > 50) {
            throw new NumberFormatException("La longitud del apellido no es válida.");
        }
    }

    public void ValidacionDeApellido() {

        try {
            validarNombre(jTapellido.getText());
//            System.out.println("El apellido es válido: " + jTapellido.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void validarApellido(String apellido) throws NumberFormatException {
        // Verificar que el apellido no esté vacío
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new NumberFormatException("El apellido no puede estar vacío.");
        }

        // Verificar que el apellido contenga solo letras, espacios y apóstrofes
        if (!apellido.matches("^[a-zA-Z\\s']+")) {
            throw new NumberFormatException("El apellido contiene caracteres no permitidos.");
        }

        // Verificar que la longitud del apellido sea razonable (por ejemplo, entre 2 y 50 caracteres)
        if (apellido.length() < 2 || apellido.length() > 50) {
            throw new NumberFormatException("La longitud del apellido no es válida.");
        }
    }

    

    public void ValidacionDeTelefono() {

        if (validarNumeroTelefono(jTcel.getText())) {
            System.out.println("El número de telefono es válido:" + jTcel.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Número de teléfono inválido: " + jTcel.getText() + " Formtato : 00-00000-00000");

        }

    }

    private static final String patron = "^(0[1-9]|[1-8][0-9])\\d{10}$";
    private static final Pattern pattern = Pattern.compile(patron);

    public static boolean validarNumeroTelefono(String numeroTelefono) {

        if (numeroTelefono.isEmpty()) {
            return false;
        }

        Matcher matcher = pattern.matcher(numeroTelefono);
        return matcher.matches();
    }

    class NumberFormatException extends Exception {

        public NumberFormatException(String mensaje) {
            super(mensaje);
        }
    }

    public static boolean validarEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {

            JOptionPane.showMessageDialog(null, "ingrese un mail correcto");
            return false;
        }
        return pat.matcher(email).matches();
    }

    public void ValidacionDeUsuario() {

        try {
            validarNombreUsuario(jTusuario.getText());
        } catch (NombreUsuarioInvalidoException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

        }
    }

    public void validarNombreUsuario(String apellidoUsuario) throws NombreUsuarioInvalidoException {

        if (apellidoUsuario == null || apellidoUsuario.trim().isEmpty()) {
            throw new NombreUsuarioInvalidoException("El apellido de usuario no puede estar vacío.");
        }

        Pattern patron = Pattern.compile("^[a-zA-Z0-9_]+$");
        Matcher matcher = patron.matcher(apellidoUsuario);
        if (!apellidoUsuario.matches("^[a-zA-Z\\s']+")) {
            throw new NombreUsuarioInvalidoException("El apellido contiene caracteres no permitidos.");
        }

        if (apellidoUsuario.length() < 4 || apellidoUsuario.length() > 20) {
            throw new NombreUsuarioInvalidoException("La longitud del apellido de usuario no es válida.");
        }
    }

    class NombreUsuarioInvalidoException extends Exception {

        public NombreUsuarioInvalidoException(String mensaje) {
            super(mensaje);
        }
    }

    private void cargarComboBox() {

        DefaultComboBoxModel<String> mdlCombo = new DefaultComboBoxModel(generos().toArray());
        jCgenero.setModel(mdlCombo);
    }

    public List<String> generos() {
        List<String> Eleccion = new ArrayList<>();

        Eleccion.add("Femenino");
        Eleccion.add("¿Masculino");
        Eleccion.add("Binario");
        Eleccion.add("Otro");

        return Eleccion;

    }

    private void cargarImagenComboBox() {
        try {
            BufferedImage imagen1 = ImageIO.read(getClass().getResource("/iconos/perfil/imagen1.png"));
            BufferedImage imagen2 = ImageIO.read(getClass().getResource("/iconos/perfil/imagen2.png"));
            BufferedImage imagen3 = ImageIO.read(getClass().getResource("/iconos/perfil/imagen3.png"));
            BufferedImage imagen4 = ImageIO.read(getClass().getResource("/iconos/perfil/imagen4.png"));
            BufferedImage imagen5 = ImageIO.read(getClass().getResource("/iconos/perfil/imagen5.png"));
            BufferedImage imagen6 = ImageIO.read(getClass().getResource("/iconos/perfil/imagen6.png"));

            int anchoDeseado = 100; // Ancho deseado para las imágenes
            int altoDeseado = 100; // Alto deseado para las imágenes

            imagenes[0] = new ImageIcon(imagen1.getScaledInstance(anchoDeseado, altoDeseado, Image.SCALE_SMOOTH));
            imagenes[1] = new ImageIcon(imagen2.getScaledInstance(anchoDeseado, altoDeseado, Image.SCALE_SMOOTH));
            imagenes[2] = new ImageIcon(imagen3.getScaledInstance(anchoDeseado, altoDeseado, Image.SCALE_SMOOTH));
            imagenes[3] = new ImageIcon(imagen4.getScaledInstance(anchoDeseado, altoDeseado, Image.SCALE_SMOOTH));
            imagenes[4] = new ImageIcon(imagen5.getScaledInstance(anchoDeseado, altoDeseado, Image.SCALE_SMOOTH));
            imagenes[5] = new ImageIcon(imagen6.getScaledInstance(anchoDeseado, altoDeseado, Image.SCALE_SMOOTH));
        } catch (IOException e) {
            e.printStackTrace();
        }

        DefaultComboBoxModel<ImageIcon> mdlCombo = new DefaultComboBoxModel(imagenes);

        selector.setModel(mdlCombo);
        selector.setRenderer(new ImageComboBoxRenderer());
    }

    private String getNombreImagen(ImageIcon imagen) {
        // Itera sobre el array de imágenes y encuentra el nombre correspondiente
        for (int i = 0; i < imagenes.length; i++) {
            if (imagenes[i].equals(imagen)) {
                String nombre = "imagen" + (i + 1) + ".png"; // Esto es solo un ejemplo, ajusta el formato del nombre según tus necesidades
                return nombre;
            }
        }
        return null; // Devuelve null si no se encuentra la imagen
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBPremium;
    private javax.swing.JButton jBCambiarContraseña;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBImg1;
    private javax.swing.JComboBox<String> jCgenero;
    private javax.swing.JLabel jLCumpleanios;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLgenero;
    private javax.swing.JLabel jLusuario;
    private com.toedter.calendar.JMonthChooser jMonMes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSDia;
    private javax.swing.JTextField jTMail;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTcel;
    private javax.swing.JTextField jTusuario;
    private com.toedter.calendar.JYearChooser jYAño;
    private javax.swing.JComboBox<ImageIcon> selector;
    private javax.swing.JLabel verificacion;
    // End of variables declaration//GEN-END:variables
}

class ImageComboBoxRenderer extends JLabel implements ListCellRenderer<ImageIcon> {

    @Override
    public Component getListCellRendererComponent(JList<? extends ImageIcon> list, ImageIcon value, int index, boolean isSelected, boolean cellHasFocus) {
        setIcon(value);
        return this;
    }
}
