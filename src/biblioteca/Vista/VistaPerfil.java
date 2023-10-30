package biblioteca.Vista;

import static biblioteca.Vista.VistaRegistrarse.validarEmail;
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

    private ImageIcon[] imagenes = new ImageIcon[6];
    

    public VistaPerfil() {
        initComponents();
        // SetImageLabel(jLPersonita,"src/iconos/woman.png");
        setSize(1100, 670);
        cargarComboBox();
        cargarImagenComboBox();
        jPanel1.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:60");

    }

    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTNombre = new javax.swing.JTextField();
        jTMail = new javax.swing.JTextField();
        jTusuario = new javax.swing.JTextField();
        jTcel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLCumpleanios = new javax.swing.JLabel();
        jCgenero = new javax.swing.JComboBox<>();
        jLNombre = new javax.swing.JLabel();
        jLemail = new javax.swing.JLabel();
        jLusuario = new javax.swing.JLabel();
        jLTel = new javax.swing.JLabel();
        jLgenero = new javax.swing.JLabel();
        jLPersonita = new javax.swing.JLabel();
        jYAño = new com.toedter.calendar.JYearChooser();
        jMonMes = new com.toedter.calendar.JMonthChooser();
        jSDia = new javax.swing.JSpinner();
        jBEditar = new javax.swing.JButton();
        verificacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTapellido = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jBImg1 = new javax.swing.JButton();
        selector = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(146, 81, 184));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

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

        jTcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcelActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Editar Perfil");

        jLCumpleanios.setForeground(new java.awt.Color(51, 51, 51));
        jLCumpleanios.setText("Cumpleaños");

        jLNombre.setForeground(new java.awt.Color(51, 51, 51));
        jLNombre.setText("Nombre");
        jLNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLNombreMouseClicked(evt);
            }
        });

        jLemail.setForeground(new java.awt.Color(51, 51, 51));
        jLemail.setText("Email");

        jLusuario.setForeground(new java.awt.Color(51, 51, 51));
        jLusuario.setText("Usuario");

        jLTel.setForeground(new java.awt.Color(51, 51, 51));
        jLTel.setText("N° de Telefono");

        jLgenero.setForeground(new java.awt.Color(51, 51, 51));
        jLgenero.setText("Genero");

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

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Apellido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNombre)
                            .addComponent(jLabel2)))
                    .addComponent(jLPersonita, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTMail, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSDia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMonMes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jYAño, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(323, 323, 323))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLusuario)
                    .addComponent(jLCumpleanios)
                    .addComponent(jLemail)
                    .addComponent(jLTel)
                    .addComponent(jLgenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jBEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPersonita, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLusuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLemail)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jYAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMonMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCumpleanios)
                        .addComponent(jSDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLgenero)
                    .addComponent(jCgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jBEditar)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(146, 81, 184));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccionar un Imagen");
        jLabel3.setToolTipText("");

        jBImg1.setText("Selecciona una Imagen");
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

        selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBImg1)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBImg1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcelActionPerformed

    }//GEN-LAST:event_jTcelActionPerformed

    private void jLNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNombreMouseClicked


    }//GEN-LAST:event_jLNombreMouseClicked

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        if (jTapellido.getText().isEmpty() || jTMail.getText().isEmpty() || jTMail.getText().isEmpty()
                || jTusuario.getText().isEmpty() || jTcel.getText().isEmpty() || jSDia.equals("") || jMonMes.equals("")
                || jYAño.equals("") || jCgenero.equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");

        }

        ValidacionDeNombre();
        ValidacionDeTelefono();
        ValidacionDeUsuario();


    }//GEN-LAST:event_jBEditarActionPerformed

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

    private void jBEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEditarMouseClicked

    private void jBImg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBImg1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg1MouseClicked

    private void jBImg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg1ActionPerformed

    private void selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorActionPerformed
        
      
        ImageIcon imagenSeleccionada = (ImageIcon) selector.getSelectedItem();
        
        // Obtén el nombre de la imagen seleccionada
        String nombreImagen = getNombreImagen(imagenSeleccionada);
        System.out.println(nombreImagen);
        
        // Realiza la acción deseada con el nombre de la imagen
    }//GEN-LAST:event_selectorActionPerformed

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

//                        JOptionPane.showMessageDialog(null, "Número de teléfono válido: " + jTcel.getText());
            throw new NullPointerException();
        } else {

            JOptionPane.showMessageDialog(null, "Número de teléfono inválido: " + jTcel.getText());

        }

    }

    public boolean validarNumeroTelefono(String numeroTelefono) {

        if (numeroTelefono.length() != 10) {
            return false;
        }
        String patron = "^01[0-9]{8}$";

        if (numeroTelefono.matches(patron)) {

            return true;
        } else {
            return false;
        }
    }

    class NumeroTelefonoInvalidoException extends Exception {

        public NumeroTelefonoInvalidoException(String mensaje) {
            super(mensaje);
        }
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
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBImg1;
    private javax.swing.JComboBox<String> jCgenero;
    private javax.swing.JLabel jLCumpleanios;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPersonita;
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
