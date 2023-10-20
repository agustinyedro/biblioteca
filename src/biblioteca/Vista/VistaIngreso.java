package biblioteca.Vista;

import biblioteca75.Login;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.JDBCType;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class VistaIngreso extends javax.swing.JFrame {

    private Login login;

    public VistaIngreso() {
        login = new Login();
        initComponents();
        SetImageLabel(jLlibrito1, "src/iconos/Sunday Lounge.jpg");
        panelesRedondos();
        MenuAmpliado.setVisible(false);
    }
    public void panelesRedondos(){
        jPLogout.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
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

        MenuAmpliado = new javax.swing.JPanel();
        jLlibrito = new javax.swing.JLabel();
        JPInicio = new javax.swing.JPanel();
        JLperfil1 = new javax.swing.JLabel();
        JPPerfil = new javax.swing.JPanel();
        JLperfil = new javax.swing.JLabel();
        jPPrestamos = new javax.swing.JPanel();
        jLprestamos = new javax.swing.JLabel();
        jPLibros = new javax.swing.JPanel();
        jLibros = new javax.swing.JLabel();
        jPLogout = new javax.swing.JPanel();
        jLogout = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLDia = new javax.swing.JLabel();
        jLMes = new javax.swing.JLabel();
        jLAño = new javax.swing.JLabel();
        MenuAcotado = new javax.swing.JPanel();
        jPLogout1 = new javax.swing.JPanel();
        jLogout1 = new javax.swing.JLabel();
        jPLibros1 = new javax.swing.JPanel();
        jLibros1 = new javax.swing.JLabel();
        JPPerfil1 = new javax.swing.JPanel();
        JLperfil2 = new javax.swing.JLabel();
        JPInicio1 = new javax.swing.JPanel();
        JLperfil3 = new javax.swing.JLabel();
        jPPrestamos1 = new javax.swing.JPanel();
        jLprestamos1 = new javax.swing.JLabel();
        jLlibrito1 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(255, 204, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuAmpliado.setBackground(new java.awt.Color(146, 81, 184));
        MenuAmpliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuAmpliadoMouseExited(evt);
            }
        });
        MenuAmpliado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MenuAmpliado.add(jLlibrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 60));

        JPInicio.setBackground(new java.awt.Color(146, 81, 184));

        JLperfil1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        JLperfil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/casita_blanca.png"))); // NOI18N
        JLperfil1.setText("INICIO");
        JLperfil1.setIconTextGap(50);
        JLperfil1.setName(""); // NOI18N

        javax.swing.GroupLayout JPInicioLayout = new javax.swing.GroupLayout(JPInicio);
        JPInicio.setLayout(JPInicioLayout);
        JPInicioLayout.setHorizontalGroup(
            JPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPInicioLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(JLperfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPInicioLayout.setVerticalGroup(
            JPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLperfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAmpliado.add(JPInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 280, 43));

        JPPerfil.setBackground(new java.awt.Color(146, 81, 184));

        JLperfil.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        JLperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/persona_blanco.png"))); // NOI18N
        JLperfil.setText("PERFIL");
        JLperfil.setIconTextGap(50);
        JLperfil.setName(""); // NOI18N

        javax.swing.GroupLayout JPPerfilLayout = new javax.swing.GroupLayout(JPPerfil);
        JPPerfil.setLayout(JPPerfilLayout);
        JPPerfilLayout.setHorizontalGroup(
            JPPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPerfilLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(JLperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPPerfilLayout.setVerticalGroup(
            JPPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPerfilLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAmpliado.add(JPPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 280, 43));

        jPPrestamos.setBackground(new java.awt.Color(146, 81, 184));

        jLprestamos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLprestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/prestamo_blanco.png"))); // NOI18N
        jLprestamos.setText("PRESTAMOS");
        jLprestamos.setIconTextGap(50);
        jLprestamos.setName(""); // NOI18N

        javax.swing.GroupLayout jPPrestamosLayout = new javax.swing.GroupLayout(jPPrestamos);
        jPPrestamos.setLayout(jPPrestamosLayout);
        jPPrestamosLayout.setHorizontalGroup(
            jPPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrestamosLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLprestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPPrestamosLayout.setVerticalGroup(
            jPPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrestamosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLprestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAmpliado.add(jPPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 280, 43));

        jPLibros.setBackground(new java.awt.Color(146, 81, 184));

        jLibros.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/librito_blamco.png"))); // NOI18N
        jLibros.setText("LIBROS");
        jLibros.setAutoscrolls(true);
        jLibros.setIconTextGap(50);

        javax.swing.GroupLayout jPLibrosLayout = new javax.swing.GroupLayout(jPLibros);
        jPLibros.setLayout(jPLibrosLayout);
        jPLibrosLayout.setHorizontalGroup(
            jPLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLibrosLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPLibrosLayout.setVerticalGroup(
            jPLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLibrosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAmpliado.add(jPLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 280, 43));

        jPLogout.setBackground(new java.awt.Color(146, 81, 184));

        jLogout.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/logout_blanco.png"))); // NOI18N
        jLogout.setText("LOGOUT");
        jLogout.setFocusCycleRoot(true);
        jLogout.setIconTextGap(50);
        jLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPLogoutLayout = new javax.swing.GroupLayout(jPLogout);
        jPLogout.setLayout(jPLogoutLayout);
        jPLogoutLayout.setHorizontalGroup(
            jPLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLogoutLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPLogoutLayout.setVerticalGroup(
            jPLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLogoutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAmpliado.add(jPLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 280, 43));

        jLNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNombre.setText("jLabel1");
        MenuAmpliado.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 70, -1));

        jLDia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDia.setText("jLabel1");
        MenuAmpliado.add(jLDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 70, -1));

        jLMes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMes.setText("jLabel1");
        MenuAmpliado.add(jLMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, -1));

        jLAño.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLAño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAño.setText("jLabel1");
        MenuAmpliado.add(jLAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 70, -1));

        getContentPane().add(MenuAmpliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 788));

        MenuAcotado.setBackground(new java.awt.Color(146, 81, 184));
        MenuAcotado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuAcotadoMouseEntered(evt);
            }
        });
        MenuAcotado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPLogout1.setBackground(new java.awt.Color(146, 81, 184));

        jLogout1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLogout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/logout_blanco.png"))); // NOI18N
        jLogout1.setFocusCycleRoot(true);
        jLogout1.setIconTextGap(50);
        jLogout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLogout1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLogout1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLogout1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPLogout1Layout = new javax.swing.GroupLayout(jPLogout1);
        jPLogout1.setLayout(jPLogout1Layout);
        jPLogout1Layout.setHorizontalGroup(
            jPLogout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLogout1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLogout1)
                .addGap(224, 224, 224))
        );
        jPLogout1Layout.setVerticalGroup(
            jPLogout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLogout1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAcotado.add(jPLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 60, 43));

        jPLibros1.setBackground(new java.awt.Color(146, 81, 184));

        jLibros1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLibros1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/librito_blamco.png"))); // NOI18N
        jLibros1.setAutoscrolls(true);
        jLibros1.setIconTextGap(50);

        javax.swing.GroupLayout jPLibros1Layout = new javax.swing.GroupLayout(jPLibros1);
        jPLibros1.setLayout(jPLibros1Layout);
        jPLibros1Layout.setHorizontalGroup(
            jPLibros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLibros1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLibros1)
                .addGap(224, 224, 224))
        );
        jPLibros1Layout.setVerticalGroup(
            jPLibros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLibros1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLibros1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAcotado.add(jPLibros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 60, 43));

        JPPerfil1.setBackground(new java.awt.Color(146, 81, 184));

        JLperfil2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        JLperfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/persona_blanco.png"))); // NOI18N
        JLperfil2.setIconTextGap(50);
        JLperfil2.setName(""); // NOI18N

        javax.swing.GroupLayout JPPerfil1Layout = new javax.swing.GroupLayout(JPPerfil1);
        JPPerfil1.setLayout(JPPerfil1Layout);
        JPPerfil1Layout.setHorizontalGroup(
            JPPerfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPerfil1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLperfil2)
                .addGap(224, 224, 224))
        );
        JPPerfil1Layout.setVerticalGroup(
            JPPerfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPerfil1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLperfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAcotado.add(JPPerfil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 60, 43));

        JPInicio1.setBackground(new java.awt.Color(146, 81, 184));

        JLperfil3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        JLperfil3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/casita_blanca.png"))); // NOI18N
        JLperfil3.setIconTextGap(50);
        JLperfil3.setName(""); // NOI18N

        javax.swing.GroupLayout JPInicio1Layout = new javax.swing.GroupLayout(JPInicio1);
        JPInicio1.setLayout(JPInicio1Layout);
        JPInicio1Layout.setHorizontalGroup(
            JPInicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPInicio1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLperfil3)
                .addGap(224, 224, 224))
        );
        JPInicio1Layout.setVerticalGroup(
            JPInicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPInicio1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLperfil3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAcotado.add(JPInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 60, 43));

        jPPrestamos1.setBackground(new java.awt.Color(146, 81, 184));

        jLprestamos1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLprestamos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/prestamo_blanco.png"))); // NOI18N
        jLprestamos1.setIconTextGap(50);
        jLprestamos1.setName(""); // NOI18N

        javax.swing.GroupLayout jPPrestamos1Layout = new javax.swing.GroupLayout(jPPrestamos1);
        jPPrestamos1.setLayout(jPPrestamos1Layout);
        jPPrestamos1Layout.setHorizontalGroup(
            jPPrestamos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrestamos1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLprestamos1)
                .addGap(224, 224, 224))
        );
        jPPrestamos1Layout.setVerticalGroup(
            jPPrestamos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrestamos1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLprestamos1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAcotado.add(jPPrestamos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 60, 43));
        MenuAcotado.add(jLlibrito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 145, 136));

        getContentPane().add(MenuAcotado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 790));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 960, 720));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogoutMouseClicked
        String si = "SI";
        String no = "NO";
        String cancelar = "Cancelar";
        Object[] opciones = {si, no};

        
        
        jPLogout.setBackground(new Color(157, 82, 148));
        int confirmacion = JOptionPane.showOptionDialog(this, "¿Cerrar sesión?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, si);
//                    System.out.println(confirmacion);
        if (confirmacion == 0) {
            this.setVisible(false);
            PantallaDeInicio p  = new PantallaDeInicio();
            p.setSincarga(true);
            p.setVisible(true);
        }
    }//GEN-LAST:event_jLogoutMouseClicked

    private void jLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogoutMouseEntered
        jPLogout.setBackground(new Color(157, 82, 148));
    }//GEN-LAST:event_jLogoutMouseEntered

    private void jLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogoutMouseExited
        jPLogout.setBackground(new Color(146,81,184));
    }//GEN-LAST:event_jLogoutMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Date date = new Date();
        jLNombre.setText(login.getLector().getNombre());
        jLDia.setText(String.valueOf(date.getDay()));
        jLMes.setText(String.valueOf(date.getMonth()));
        jLAño.setText(String.valueOf(date.getYear()));
    }//GEN-LAST:event_formWindowOpened

    private void jLogout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogout1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLogout1MouseClicked

    private void jLogout1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogout1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLogout1MouseEntered

    private void jLogout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogout1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLogout1MouseExited

    private void MenuAcotadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAcotadoMouseEntered
        Timer timer = new Timer(280, new ActionListener() { // 1000 ms = 1 segundo
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuAcotado.setVisible(false);
                MenuAmpliado.setVisible(true);
            }
        });
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_MenuAcotadoMouseEntered

    private void MenuAmpliadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAmpliadoMouseExited
        Timer timer = new Timer(280, new ActionListener() { // 1000 ms = 1 segundo
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuAcotado.setVisible(true);
                MenuAmpliado.setVisible(false);
            }
        });
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_MenuAmpliadoMouseExited

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
//            java.util.logging.Logger.getLogger(VistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaIngreso().setVisible(true);
//            }
//        });
//    }
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLperfil;
    private javax.swing.JLabel JLperfil1;
    private javax.swing.JLabel JLperfil2;
    private javax.swing.JLabel JLperfil3;
    private javax.swing.JPanel JPInicio;
    private javax.swing.JPanel JPInicio1;
    private javax.swing.JPanel JPPerfil;
    private javax.swing.JPanel JPPerfil1;
    private javax.swing.JPanel MenuAcotado;
    private javax.swing.JPanel MenuAmpliado;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLAño;
    private javax.swing.JLabel jLDia;
    private javax.swing.JLabel jLMes;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLibros;
    private javax.swing.JLabel jLibros1;
    private javax.swing.JLabel jLlibrito;
    private javax.swing.JLabel jLlibrito1;
    private javax.swing.JLabel jLogout;
    private javax.swing.JLabel jLogout1;
    private javax.swing.JLabel jLprestamos;
    private javax.swing.JLabel jLprestamos1;
    private javax.swing.JPanel jPLibros;
    private javax.swing.JPanel jPLibros1;
    private javax.swing.JPanel jPLogout;
    private javax.swing.JPanel jPLogout1;
    private javax.swing.JPanel jPPrestamos;
    private javax.swing.JPanel jPPrestamos1;
    // End of variables declaration//GEN-END:variables
}
