/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca.Vista;

import biblioteca.AccesoData.LectorData;
import biblioteca.AccesoData.LoginData;
import biblioteca75.Lector;
import biblioteca75.Login;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.lang.Integer;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author luzel
 */
public class VistaRegistrarse extends javax.swing.JFrame {

    public VistaRegistrarse() {
        initComponents();
        cargarCombo();
        setSize(580, 395);
        setLocationRelativeTo(null);
        jPanel2.requestFocusInWindow();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        verificacion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBoxPreg = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        jTextContra2 = new javax.swing.JTextField();
        jTextContra = new javax.swing.JTextField();
        jTextUsuario = new javax.swing.JTextField();
        jTextRespuesta = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextMail = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jTextDomicilio = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jButtonRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(44, 33, 89));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(44, 33, 89));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(44, 33, 89));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nuevo Usuario");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 18, 573, 36));

        jPanel2.setBackground(new java.awt.Color(146, 81, 184));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(verificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 126, 18, 18));

        jSeparator1.setBackground(new java.awt.Color(44, 33, 89));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 55, 226, 18));

        jSeparator2.setBackground(new java.awt.Color(44, 33, 89));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 55, 226, 15));

        jSeparator3.setBackground(new java.awt.Color(44, 33, 89));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 98, 226, 10));

        jSeparator4.setBackground(new java.awt.Color(44, 33, 89));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 144, 226, 10));

        jComboBoxPreg.setBackground(new java.awt.Color(146, 81, 184));
        jComboBoxPreg.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxPreg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una pregunta" }));
        jComboBoxPreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxPregMouseClicked(evt);
            }
        });
        jPanel2.add(jComboBoxPreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 160, 226, -1));

        jSeparator5.setBackground(new java.awt.Color(44, 33, 89));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 198, 226, 10));

        jTextContra2.setBackground(new java.awt.Color(146, 81, 184));
        jTextContra2.setForeground(new java.awt.Color(255, 255, 255));
        jTextContra2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextContra2.setText("Repetir Contraseña");
        jTextContra2.setBorder(null);
        jTextContra2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextContra2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextContra2FocusLost(evt);
            }
        });
        jTextContra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextContra2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextContra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 116, 226, -1));

        jTextContra.setBackground(new java.awt.Color(146, 81, 184));
        jTextContra.setForeground(new java.awt.Color(255, 255, 255));
        jTextContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextContra.setText("Contraseña");
        jTextContra.setBorder(null);
        jTextContra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextContraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextContraFocusLost(evt);
            }
        });
        jTextContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextContraActionPerformed(evt);
            }
        });
        jPanel2.add(jTextContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 76, 226, -1));

        jTextUsuario.setBackground(new java.awt.Color(146, 81, 184));
        jTextUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextUsuario.setText("Usuario");
        jTextUsuario.setBorder(null);
        jTextUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextUsuarioFocusLost(evt);
            }
        });
        jPanel2.add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 33, 226, -1));

        jTextRespuesta.setBackground(new java.awt.Color(146, 81, 184));
        jTextRespuesta.setForeground(new java.awt.Color(255, 255, 255));
        jTextRespuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextRespuesta.setText("Respuesta");
        jTextRespuesta.setBorder(null);
        jTextRespuesta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextRespuestaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextRespuestaFocusLost(evt);
            }
        });
        jPanel2.add(jTextRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 215, 226, -1));

        jTextNombre.setBackground(new java.awt.Color(146, 81, 184));
        jTextNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNombre.setText("Nombre");
        jTextNombre.setBorder(null);
        jTextNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextNombreFocusLost(evt);
            }
        });
        jPanel2.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 33, 226, -1));

        jTextApellido.setBackground(new java.awt.Color(146, 81, 184));
        jTextApellido.setForeground(new java.awt.Color(255, 255, 255));
        jTextApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextApellido.setText("Apellido");
        jTextApellido.setBorder(null);
        jTextApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextApellidoFocusLost(evt);
            }
        });
        jPanel2.add(jTextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 76, 226, -1));

        jTextMail.setBackground(new java.awt.Color(146, 81, 184));
        jTextMail.setForeground(new java.awt.Color(255, 255, 255));
        jTextMail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextMail.setText("Mail");
        jTextMail.setBorder(null);
        jTextMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextMailFocusLost(evt);
            }
        });
        jPanel2.add(jTextMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 116, 226, -1));

        jTextTelefono.setBackground(new java.awt.Color(146, 81, 184));
        jTextTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jTextTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTelefono.setText("Teléfono");
        jTextTelefono.setBorder(null);
        jTextTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextTelefonoFocusLost(evt);
            }
        });
        jPanel2.add(jTextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 165, 226, -1));

        jTextDomicilio.setBackground(new java.awt.Color(146, 81, 184));
        jTextDomicilio.setForeground(new java.awt.Color(255, 255, 255));
        jTextDomicilio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextDomicilio.setText("Domicilio");
        jTextDomicilio.setBorder(null);
        jTextDomicilio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextDomicilioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextDomicilioFocusLost(evt);
            }
        });
        jPanel2.add(jTextDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 215, 226, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 98, 226, 12));

        jSeparator7.setBackground(new java.awt.Color(44, 33, 89));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 144, 226, 10));

        jSeparator8.setBackground(new java.awt.Color(44, 33, 89));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 198, 226, 10));

        jSeparator9.setBackground(new java.awt.Color(44, 33, 89));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 237, 226, -1));

        jSeparator10.setBackground(new java.awt.Color(44, 33, 89));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 237, 226, 10));

        jButtonRegistrarse.setBackground(new java.awt.Color(44, 33, 89));
        jButtonRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarse.setText("Registrarse");
        jButtonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 253, 112, 33));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 576, 306));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 576, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextContra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextContra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextContra2ActionPerformed

    private void jTextContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextContraActionPerformed

    private void jTextUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextUsuarioFocusLost
        ValidacionDeUsuario();
        if (jTextUsuario.getText().isEmpty() || jTextUsuario.getText().equalsIgnoreCase("usuario")) {
            jTextUsuario.setText("Usuario");
        }
    }//GEN-LAST:event_jTextUsuarioFocusLost

    private void jTextUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextUsuarioFocusGained
        if (jTextUsuario.getText().equalsIgnoreCase("usuario")) {
            jTextUsuario.setText("");
        }
    }//GEN-LAST:event_jTextUsuarioFocusGained

    private void jTextContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextContraFocusGained
        if (jTextContra.getText().equalsIgnoreCase("contraseña")) {
            jTextContra.setText("");
        }
    }//GEN-LAST:event_jTextContraFocusGained

    private void jTextContraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextContraFocusLost
        if (jTextContra.getText().isEmpty() || jTextContra.getText().equalsIgnoreCase("contraseña")) {
            jTextContra.setText("Contraseña");
        }
    }//GEN-LAST:event_jTextContraFocusLost

    private void jTextContra2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextContra2FocusGained
        if (jTextContra2.getText().equalsIgnoreCase("repetir contraseña")) {
            jTextContra2.setText("");
        }
    }//GEN-LAST:event_jTextContra2FocusGained

    private void jTextContra2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextContra2FocusLost
        if (jTextContra2.getText().isEmpty() || jTextContra2.getText().equalsIgnoreCase("repetir contraseña")) {
            jTextContra2.setText("Repetir Contraseña");
        }
        String contra1 = jTextContra.getText();
        String contra2 = jTextContra2.getText();
        boolean sonIguales = contra1.equals(contra2);
        if (!sonIguales) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }
    }//GEN-LAST:event_jTextContra2FocusLost

    private void jComboBoxPregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxPregMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPregMouseClicked

    private void jTextRespuestaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextRespuestaFocusGained
        if (jTextRespuesta.getText().equalsIgnoreCase("respuesta")) {
            jTextRespuesta.setText("");
        }
    }//GEN-LAST:event_jTextRespuestaFocusGained

    private void jTextRespuestaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextRespuestaFocusLost
        if (jTextRespuesta.getText().isEmpty() || jTextRespuesta.getText().equalsIgnoreCase("respuesta")) {
            jTextRespuesta.setText("Respuesta");
        }
    }//GEN-LAST:event_jTextRespuestaFocusLost

    private void jTextNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNombreFocusGained
        if (jTextNombre.getText().equalsIgnoreCase("nombre")) {
            jTextNombre.setText("");
        }
    }//GEN-LAST:event_jTextNombreFocusGained

    private void jTextNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNombreFocusLost
        ValidacionDeNombre();
        if (jTextNombre.getText().isEmpty() || jTextNombre.getText().equalsIgnoreCase("nombre")) {
            jTextNombre.setText("Nombre");
        }
    }//GEN-LAST:event_jTextNombreFocusLost

    private void jTextApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextApellidoFocusGained
        if (jTextApellido.getText().equalsIgnoreCase("apellido")) {
            jTextApellido.setText("");
        }
    }//GEN-LAST:event_jTextApellidoFocusGained

    private void jTextApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextApellidoFocusLost
        ValidacionDeApellido();
        if (jTextApellido.getText().isEmpty() || jTextApellido.getText().equalsIgnoreCase("apellido")) {
            jTextApellido.setText("Apellido");
        }
    }//GEN-LAST:event_jTextApellidoFocusLost

    private void jTextMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextMailFocusGained
        if (jTextMail.getText().equalsIgnoreCase("mail")) {
            jTextMail.setText("");
        }
    }//GEN-LAST:event_jTextMailFocusGained

    private void jTextMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextMailFocusLost
        if (jTextMail.getText().isEmpty() || jTextMail.getText().equalsIgnoreCase("mail")) {
            jTextMail.setText("Mail");
        }
        String email = jTextMail.getText();
        if (validarEmail(email)) {
            SetImageLabel(verificacion, "src/iconos/correcto.png");

        } else {

            SetImageLabel(verificacion, "src/iconos/incorrecto.png");
        }
        this.setVisible(true);
    }//GEN-LAST:event_jTextMailFocusLost

    private void jTextTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTelefonoFocusGained
        if (jTextTelefono.getText().equalsIgnoreCase("teléfono")) {
            jTextTelefono.setText("");
        }
    }//GEN-LAST:event_jTextTelefonoFocusGained

    private void jTextTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTelefonoFocusLost
        ValidacionDeTelefono();
        if (jTextTelefono.getText().isEmpty() || jTextTelefono.getText().equalsIgnoreCase("teléfono")) {
            jTextTelefono.setText("Teléfono");
        }
    }//GEN-LAST:event_jTextTelefonoFocusLost

    private void jTextDomicilioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDomicilioFocusGained
        if (jTextDomicilio.getText().equalsIgnoreCase("domicilio")) {
            jTextDomicilio.setText("");
        }
    }//GEN-LAST:event_jTextDomicilioFocusGained

    private void jTextDomicilioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDomicilioFocusLost
        if (jTextDomicilio.getText().isEmpty() || jTextDomicilio.getText().equalsIgnoreCase("domicilio")) {
            jTextDomicilio.setText("Domicilio");
        }
    }//GEN-LAST:event_jTextDomicilioFocusLost

    private void jButtonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarseActionPerformed

        if (jTextApellido.getText().isEmpty() || jTextContra.getText().isEmpty() || jTextContra2.getText().isEmpty()
                || jTextDomicilio.getText().isEmpty() || jTextMail.getText().isEmpty() || jTextNombre.getText().isEmpty()
                || jTextRespuesta.getText().isEmpty() || jTextTelefono.getText().isEmpty() || jTextUsuario.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Complete todos los campos.");
            return;
        } else {
            String nombre = jTextNombre.getText();
            String apellido = jTextApellido.getText();
            String domicilio = jTextDomicilio.getText();
            String mail = jTextMail.getText();
            boolean estado = true;
            int telefono = Integer.parseInt(jTextTelefono.getText());

            Lector lector = new Lector(nombre, apellido, domicilio, mail, estado, telefono);
            System.out.println(lector);
            LectorData lectorData = new LectorData();
            lectorData.guardarLector(lector);

            if (lector.getNroSocio() != 0) {
                String usuario = jTextUsuario.getText();
                String contrasenia = jTextContra.getText();
                String pregunta = jComboBoxPreg.getSelectedItem().toString();
                String respuesta = jTextRespuesta.getText();

                Login login = new Login(usuario, contrasenia, lector, pregunta, respuesta);
                LoginData loginData = new LoginData();
                loginData.guardarLogin(login);

                jTextNombre.setText("");
                jTextApellido.setText("");
                jTextDomicilio.setText("");
                jTextMail.setText("");
                estado = false;
                jTextTelefono.setText("");
                
                new VistaLogin().setVisible(true);
                this.setVisible(false);

            }
        }

        // Valores: nombre, apellido, domicilio, mail, estado, telefono

    }//GEN-LAST:event_jButtonRegistrarseActionPerformed

    private boolean estadoLector;

    public void actualizarEstadoLector(boolean nuevoEstado) {
        estadoLector = nuevoEstado;
    }

    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    public void cargarCombo() {
        DefaultComboBoxModel<String> mdlCombo = new DefaultComboBoxModel(preguntas().toArray());
        jComboBoxPreg.setModel(mdlCombo);
    }

    public List<String> preguntas() {
        List<String> preguntas = new ArrayList<>();

        preguntas.add("¿Como se llamaba tu primer pareja?");
        preguntas.add("¿Como se llamaba tu primer mascota?");
        preguntas.add("¿Cual es tu lugar favorito?");
        preguntas.add("¿Cual es tu juego favorito?");

        return preguntas;
    }

    public static boolean validarEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    }

    public void ValidacionDeNombre() {

        try {
            validarNombre(jTextNombre.getText());
            System.out.println("El nombre es válido: " + jTextNombre.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void validarNombre(String nombre) throws NumberFormatException {
        // Verificar que el apellido no esté vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new NumberFormatException("El nombre no puede estar vacío.");
        }

        // Verificar que el apellido contenga solo letras, espacios y apóstrofes
        if (!nombre.matches("^[a-zA-Z\\s']+")) {
            throw new NumberFormatException("El nombre contiene caracteres no permitidos.");
        }

        // Verificar que la longitud del apellido sea razonable (por ejemplo, entre 2 y 50 caracteres)
        if (nombre.length() < 2 || nombre.length() > 50) {
            throw new NumberFormatException("La longitud del nombre no es válida.");
        }
    }

    public void ValidacionDeApellido() {

        try {
            validarNombre(jTextApellido.getText());
            System.out.println("El apellido es válido: " + jTextApellido.getText());
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

        if (validarNumeroTelefono(jTextTelefono.getText())) {
            System.out.println("El número de telefono es válido:" + jTextTelefono.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Número de teléfono inválido: " + jTextTelefono.getText() + " Formtato : 00-00000-00000");

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

    public void ValidacionDeUsuario() {

        try {
            validarNombreUsuario(jTextUsuario.getText());
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

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VistaRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaRegistrarse().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarse;
    private javax.swing.JComboBox<String> jComboBoxPreg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextContra;
    private javax.swing.JTextField jTextContra2;
    private javax.swing.JTextField jTextDomicilio;
    private javax.swing.JTextField jTextMail;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextRespuesta;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JTextField jTextUsuario;
    private javax.swing.JLabel verificacion;
    // End of variables declaration//GEN-END:variables

}
