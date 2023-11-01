package biblioteca.Vista;

import biblioteca75.Login;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.JDBCType;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class VistaIngreso extends javax.swing.JFrame {

    private Login login;
    private int tamañoDeEscritorio;
    private boolean perfil = false;
    private boolean libro = false;

    public VistaIngreso(Login login) {
        this.login = login;
        initComponents();
//        SetImageLabel(jLabel1, "src/iconos/perfil/imagen6.png");
        jPanel1.setVisible(false);
        panelesRedondos();
//        asociarPaneles();
        MenuAmpliado.setVisible(false);
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
    }

    public boolean isPerfil() {
        return perfil;
    }

    public void setPerfil(boolean perfil) {
        this.perfil = perfil;
    }

    public boolean isLibro() {
        return libro;
    }

    public void setLibro(boolean libro) {
        this.libro = libro;
    }

    
    
    public JPanel[] paneles() {
        JPanel[] paneles = new JPanel[10];
        paneles[0] = JPInicio;
        paneles[1] = JPPerfil;
        paneles[2] = jPLibros;
        paneles[3] = jPLogout;
        paneles[4] = jPPrestamos;
        paneles[5] = JPInicio1;
        paneles[6] = JPPerfil1;
        paneles[7] = jPLibros1;
        paneles[8] = jPLogout1;
        paneles[9] = jPPrestamos1;
        return paneles;
    }

    public void panelesRedondos() {
        jPLogout.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
        jPLogout1.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
        JPPerfil.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
        JPPerfil1.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
        JPInicio.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
        JPInicio1.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
        jPLibros.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
        jPLibros1.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
        jPPrestamos.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
        jPPrestamos1.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
        MenuAcotado.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
        MenuAmpliado.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30;");
    }

    public void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jImg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        MenuAmpliado = new javax.swing.JPanel();
        jLlibrito = new javax.swing.JLabel();
        JPInicio = new javax.swing.JPanel();
        JLInicio = new javax.swing.JLabel();
        JPPerfil = new javax.swing.JPanel();
        JLperfil = new javax.swing.JLabel();
        jPPrestamos = new javax.swing.JPanel();
        jLprestamos = new javax.swing.JLabel();
        jPLibros = new javax.swing.JPanel();
        jLibros = new javax.swing.JLabel();
        jPPremium = new javax.swing.JPanel();
        jLPremium = new javax.swing.JLabel();
        jPLogout = new javax.swing.JPanel();
        jLogout = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        MenuAcotado = new javax.swing.JPanel();
        jLlibrito1 = new javax.swing.JLabel();
        jPLibros1 = new javax.swing.JPanel();
        jLibros1 = new javax.swing.JLabel();
        jPPrestamos1 = new javax.swing.JPanel();
        jLprestamos1 = new javax.swing.JLabel();
        JPInicio1 = new javax.swing.JPanel();
        JLperfil3 = new javax.swing.JLabel();
        jPPremium1 = new javax.swing.JPanel();
        jLPremium1 = new javax.swing.JLabel();
        jPLogout1 = new javax.swing.JPanel();
        jLogout1 = new javax.swing.JLabel();
        JPPerfil1 = new javax.swing.JPanel();
        JLperfil2 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(255, 204, 255));
        setMinimumSize(new java.awt.Dimension(1290, 760));
        setPreferredSize(new java.awt.Dimension(1290, 760));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, 50));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        MenuAmpliado.setBackground(new java.awt.Color(98, 51, 125));
        MenuAmpliado.setMinimumSize(new java.awt.Dimension(290, 720));
        MenuAmpliado.setName(""); // NOI18N
        MenuAmpliado.setVerifyInputWhenFocusTarget(false);
        MenuAmpliado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MenuAmpliado.add(jLlibrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 60, 60));
        jLlibrito.getAccessibleContext().setAccessibleDescription("");

        JPInicio.setBackground(new java.awt.Color(98, 51, 125));

        JLInicio.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        JLInicio.setForeground(new java.awt.Color(255, 255, 255));
        JLInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/casita_blanca.png"))); // NOI18N
        JLInicio.setText("Inicio");
        JLInicio.setIconTextGap(50);
        JLInicio.setName(""); // NOI18N
        JLInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLInicioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout JPInicioLayout = new javax.swing.GroupLayout(JPInicio);
        JPInicio.setLayout(JPInicioLayout);
        JPInicioLayout.setHorizontalGroup(
            JPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        JPInicioLayout.setVerticalGroup(
            JPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );

        MenuAmpliado.add(JPInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, 43));

        JPPerfil.setBackground(new java.awt.Color(98, 51, 125));

        JLperfil.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        JLperfil.setForeground(new java.awt.Color(255, 255, 255));
        JLperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/persona_blanco.png"))); // NOI18N
        JLperfil.setText("Perfil");
        JLperfil.setIconTextGap(50);
        JLperfil.setName(""); // NOI18N
        JLperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLperfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLperfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLperfilMouseExited(evt);
            }
        });

        javax.swing.GroupLayout JPPerfilLayout = new javax.swing.GroupLayout(JPPerfil);
        JPPerfil.setLayout(JPPerfilLayout);
        JPPerfilLayout.setHorizontalGroup(
            JPPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPerfilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        JPPerfilLayout.setVerticalGroup(
            JPPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPerfilLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAmpliado.add(JPPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 43));

        jPPrestamos.setBackground(new java.awt.Color(98, 51, 125));

        jLprestamos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLprestamos.setForeground(new java.awt.Color(255, 255, 255));
        jLprestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/prestamo_blanco.png"))); // NOI18N
        jLprestamos.setText("Prestamos");
        jLprestamos.setIconTextGap(50);
        jLprestamos.setName(""); // NOI18N
        jLprestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLprestamosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLprestamosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLprestamosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPPrestamosLayout = new javax.swing.GroupLayout(jPPrestamos);
        jPPrestamos.setLayout(jPPrestamosLayout);
        jPPrestamosLayout.setHorizontalGroup(
            jPPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrestamosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLprestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPPrestamosLayout.setVerticalGroup(
            jPPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrestamosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLprestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAmpliado.add(jPPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 270, 43));

        jPLibros.setBackground(new java.awt.Color(98, 51, 125));

        jLibros.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLibros.setForeground(new java.awt.Color(255, 255, 255));
        jLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/librito_blamco.png"))); // NOI18N
        jLibros.setText("Libros");
        jLibros.setAutoscrolls(true);
        jLibros.setIconTextGap(50);
        jLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLibrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLibrosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPLibrosLayout = new javax.swing.GroupLayout(jPLibros);
        jPLibros.setLayout(jPLibrosLayout);
        jPLibrosLayout.setHorizontalGroup(
            jPLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLibrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPLibrosLayout.setVerticalGroup(
            jPLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLibrosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAmpliado.add(jPLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 43));

        jPPremium.setBackground(new java.awt.Color(98, 51, 125));

        jLPremium.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLPremium.setForeground(new java.awt.Color(255, 255, 255));
        jLPremium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/diamante182.png"))); // NOI18N
        jLPremium.setText("Premium");
        jLPremium.setFocusCycleRoot(true);
        jLPremium.setIconTextGap(50);
        jLPremium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPremiumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLPremiumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLPremiumMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPPremiumLayout = new javax.swing.GroupLayout(jPPremium);
        jPPremium.setLayout(jPPremiumLayout);
        jPPremiumLayout.setHorizontalGroup(
            jPPremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPremiumLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPPremiumLayout.setVerticalGroup(
            jPPremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPremiumLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAmpliado.add(jPPremium, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 270, 43));

        jPLogout.setBackground(new java.awt.Color(98, 51, 125));

        jLogout.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLogout.setForeground(new java.awt.Color(255, 255, 255));
        jLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/logout_blanco.png"))); // NOI18N
        jLogout.setText("Logout");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPLogoutLayout.setVerticalGroup(
            jPLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLogoutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAmpliado.add(jPLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 270, 43));

        jLNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuAmpliado.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 190, 150));

        getContentPane().add(MenuAmpliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 720));

        MenuAcotado.setBackground(new java.awt.Color(98, 51, 125));
        MenuAcotado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuAcotadoMouseEntered(evt);
            }
        });
        MenuAcotado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MenuAcotado.add(jLlibrito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 60));

        jPLibros1.setBackground(new java.awt.Color(98, 51, 125));

        jLibros1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLibros1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/librito_blamco.png"))); // NOI18N
        jLibros1.setAutoscrolls(true);
        jLibros1.setIconTextGap(50);

        javax.swing.GroupLayout jPLibros1Layout = new javax.swing.GroupLayout(jPLibros1);
        jPLibros1.setLayout(jPLibros1Layout);
        jPLibros1Layout.setHorizontalGroup(
            jPLibros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLibros1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLibros1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPLibros1Layout.setVerticalGroup(
            jPLibros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLibros1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
        );

        MenuAcotado.add(jPLibros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 60, 43));

        jPPrestamos1.setBackground(new java.awt.Color(98, 51, 125));

        jLprestamos1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLprestamos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/prestamo_blanco.png"))); // NOI18N
        jLprestamos1.setIconTextGap(50);
        jLprestamos1.setName(""); // NOI18N

        javax.swing.GroupLayout jPPrestamos1Layout = new javax.swing.GroupLayout(jPPrestamos1);
        jPPrestamos1.setLayout(jPPrestamos1Layout);
        jPPrestamos1Layout.setHorizontalGroup(
            jPPrestamos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrestamos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLprestamos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPPrestamos1Layout.setVerticalGroup(
            jPPrestamos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLprestamos1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
        );

        MenuAcotado.add(jPPrestamos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 60, 43));

        JPInicio1.setBackground(new java.awt.Color(98, 51, 125));

        JLperfil3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        JLperfil3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/casita_blanca.png"))); // NOI18N
        JLperfil3.setIconTextGap(50);
        JLperfil3.setName(""); // NOI18N

        javax.swing.GroupLayout JPInicio1Layout = new javax.swing.GroupLayout(JPInicio1);
        JPInicio1.setLayout(JPInicio1Layout);
        JPInicio1Layout.setHorizontalGroup(
            JPInicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPInicio1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLperfil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPInicio1Layout.setVerticalGroup(
            JPInicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLperfil3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
        );

        MenuAcotado.add(JPInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 60, 43));

        jPPremium1.setBackground(new java.awt.Color(98, 51, 125));

        jLPremium1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLPremium1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/diamante182.png"))); // NOI18N
        jLPremium1.setFocusCycleRoot(true);
        jLPremium1.setIconTextGap(50);
        jLPremium1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPremium1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLPremium1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLPremium1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPPremium1Layout = new javax.swing.GroupLayout(jPPremium1);
        jPPremium1.setLayout(jPPremium1Layout);
        jPPremium1Layout.setHorizontalGroup(
            jPPremium1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPremium1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLPremium1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
        );
        jPPremium1Layout.setVerticalGroup(
            jPPremium1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLPremium1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        MenuAcotado.add(jPPremium1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 60, 43));

        jPLogout1.setBackground(new java.awt.Color(98, 51, 125));

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
                .addContainerGap()
                .addComponent(jLogout1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPLogout1Layout.setVerticalGroup(
            jPLogout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
        );

        MenuAcotado.add(jPLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 60, 43));

        JPPerfil1.setBackground(new java.awt.Color(98, 51, 125));

        JLperfil2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        JLperfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/persona_blanco.png"))); // NOI18N
        JLperfil2.setIconTextGap(50);
        JLperfil2.setName(""); // NOI18N

        javax.swing.GroupLayout JPPerfil1Layout = new javax.swing.GroupLayout(JPPerfil1);
        JPPerfil1.setLayout(JPPerfil1Layout);
        JPPerfil1Layout.setHorizontalGroup(
            JPPerfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPerfil1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLperfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        JPPerfil1Layout.setVerticalGroup(
            JPPerfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLperfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        MenuAcotado.add(JPPerfil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 60, 43));

        getContentPane().add(MenuAcotado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 65, 720));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1210, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1210, 720));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogoutMouseClicked
        String si = "SI";
        String no = "NO";
        String cancelar = "Cancelar";
        Object[] opciones = {si, no};
        darleColorPanel(jPLogout, jPLogout1);
        int confirmacion = JOptionPane.showOptionDialog(this, "¿Cerrar sesión?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, si);
        if (confirmacion == 0) {
            this.setVisible(false);
            PantallaDeInicio p = new PantallaDeInicio();
            p.setSincarga(true);
            p.setVisible(true);
        }
    }//GEN-LAST:event_jLogoutMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLNombre.setText(login.getLector().getNombre());
        if (login.getNombreImg() == null) {
            SetImageLabel(jImg, "src/iconos/perfil/imagen6.png");
        } else {
            SetImageLabel(jImg, "src/iconos/perfil/" + login.getNombreImg());

        }

        if (perfil == false && libro == false) {
            escritorio.removeAll();
            escritorio.repaint();
            VistaInicio materiaView = new VistaInicio();
            Dimension descot = escritorio.getSize();
            materiaView.setSize(descot);
            materiaView.setVisible(true);
            BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) materiaView.getUI();
            internalFrameUI.setNorthPane(null);
            materiaView.setBorder(null);
            materiaView.setBackground(new Color(0, 0, 0, 0));
            achicarMenu();
            materiaView.requestFocus();
            escritorio.add(materiaView);
            escritorio.moveToFront(materiaView);
            darleColorPanel(JPInicio, JPInicio1);
        } else if (libro == true && perfil == false){
            escritorio.removeAll();
        escritorio.repaint();
        VistaPrestamo materiaView = new VistaPrestamo(login);
        Dimension descot = escritorio.getSize();
        materiaView.setSize(descot);
        materiaView.setVisible(true);
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) materiaView.getUI();
        internalFrameUI.setNorthPane(null);
        materiaView.setBorder(null);
        materiaView.setBackground(new Color(0, 0, 0, 0));
        achicarMenu();
//        materiaView.setLogin(login);
        escritorio.add(materiaView);
        escritorio.moveToFront(materiaView);
        darleColorPanel(jPPrestamos, jPPrestamos1);
        }
        else {
            escritorio.removeAll();
            escritorio.repaint();
            VistaPerfil materiaView = new VistaPerfil(login);
            Dimension descot = escritorio.getSize();
            materiaView.setSize(descot);
            materiaView.setVisible(true);
            BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) materiaView.getUI();
            internalFrameUI.setNorthPane(null);
            materiaView.setBorder(null);
            materiaView.setBackground(new Color(0, 0, 0, 0));
            achicarMenu();
//        materiaView.setLogin(login);
            escritorio.add(materiaView);
            escritorio.moveToFront(materiaView);
            darleColorPanel(JPPerfil, JPPerfil1);
        }


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
                jPanel1.setVisible(true);
                MenuAmpliado.setVisible(true);
            }
        });
        timer.setRepeats(false);
        timer.start();

//        escritorio.removeAll();
//        escritorio.repaint();
    }//GEN-LAST:event_MenuAcotadoMouseEntered

    private void JLperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLperfilMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        VistaPerfil materiaView = new VistaPerfil(login);
        Dimension descot = escritorio.getSize();
        materiaView.setSize(descot);
        materiaView.setVisible(true);
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) materiaView.getUI();
        internalFrameUI.setNorthPane(null);
        materiaView.setBorder(null);
        materiaView.setBackground(new Color(0, 0, 0, 0));
        achicarMenu();
//        materiaView.setLogin(login);
        escritorio.add(materiaView);
        escritorio.moveToFront(materiaView);
        darleColorPanel(JPPerfil, JPPerfil1);

    }//GEN-LAST:event_JLperfilMouseClicked

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        Timer timer = new Timer(280, new ActionListener() { // 1000 ms = 1 segundo
            @Override
            public void actionPerformed(ActionEvent e) {

                MenuAcotado.setVisible(true);
                jPanel1.setVisible(false);
                MenuAmpliado.setVisible(false);
            }
        });
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_jPanel1MouseExited

    private void jLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogoutMouseExited
        jPLogout.setBackground(new Color(98, 51, 125));
    }//GEN-LAST:event_jLogoutMouseExited

    private void jLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogoutMouseEntered
        jPLogout.setBackground(new Color(111, 58, 141));
    }//GEN-LAST:event_jLogoutMouseEntered

    private void JLInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLInicioMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        VistaInicio materiaView = new VistaInicio();
        Dimension descot = escritorio.getSize();
        materiaView.setSize(descot);
        materiaView.setVisible(true);
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) materiaView.getUI();
        internalFrameUI.setNorthPane(null);
        materiaView.setBorder(null);
        materiaView.setBackground(new Color(0, 0, 0, 0));
        achicarMenu();
        escritorio.add(materiaView);
        escritorio.moveToFront(materiaView);
        darleColorPanel(JPInicio, JPInicio1);
    }//GEN-LAST:event_JLInicioMouseClicked

    private void jLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLibrosMouseEntered
        jPLibros.setBackground(new Color(111, 58, 141));
    }//GEN-LAST:event_jLibrosMouseEntered

    private void jLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLibrosMouseExited
        jPLibros.setBackground(new Color(98, 51, 125));
    }//GEN-LAST:event_jLibrosMouseExited

    private void jLprestamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLprestamosMouseEntered
        jPPrestamos.setBackground(new Color(111, 58, 141));
    }//GEN-LAST:event_jLprestamosMouseEntered

    private void jLprestamosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLprestamosMouseExited
        jPPrestamos.setBackground(new Color(98, 51, 125));
    }//GEN-LAST:event_jLprestamosMouseExited

    private void JLperfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLperfilMouseEntered
        JPPerfil.setBackground(new Color(111, 58, 141));
    }//GEN-LAST:event_JLperfilMouseEntered

    private void JLperfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLperfilMouseExited
        JPPerfil.setBackground(new Color(98, 51, 125));
    }//GEN-LAST:event_JLperfilMouseExited

    private void JLInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLInicioMouseEntered
        JPInicio.setBackground(new Color(111, 58, 141));
    }//GEN-LAST:event_JLInicioMouseEntered

    private void JLInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLInicioMouseExited
        JPInicio.setBackground(new Color(98, 51, 125));
    }//GEN-LAST:event_JLInicioMouseExited

    private void jLprestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLprestamosMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        VistaPrestamo materiaView = new VistaPrestamo(login);
        Dimension descot = escritorio.getSize();
        materiaView.setSize(descot);
        materiaView.setVisible(true);
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) materiaView.getUI();
        internalFrameUI.setNorthPane(null);
        materiaView.setBorder(null);
        materiaView.setBackground(new Color(0, 0, 0, 0));
        achicarMenu();
//        materiaView.setLogin(login);
        escritorio.add(materiaView);
        escritorio.moveToFront(materiaView);
        darleColorPanel(jPPrestamos, jPPrestamos1);
    }//GEN-LAST:event_jLprestamosMouseClicked

    private void jLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLibrosMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        VistaLibro materiaView = new VistaLibro();
        Dimension descot = escritorio.getSize();
        materiaView.setSize(descot);
        materiaView.setVisible(true);
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) materiaView.getUI();
        internalFrameUI.setNorthPane(null);
        materiaView.setBorder(null);
        materiaView.setBackground(new Color(0, 0, 0, 0));
        achicarMenu();
        escritorio.add(materiaView);
        escritorio.moveToFront(materiaView);
        darleColorPanel(jPLibros1, jPLibros1);

        materiaView.setLogin(login);
    }//GEN-LAST:event_jLibrosMouseClicked

    private void jLPremiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPremiumMouseClicked
        new VistaPremium().setVisible(true);
    }//GEN-LAST:event_jLPremiumMouseClicked

    private void jLPremiumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPremiumMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLPremiumMouseEntered

    private void jLPremiumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPremiumMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLPremiumMouseExited

    private void jLPremium1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPremium1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLPremium1MouseClicked

    private void jLPremium1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPremium1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLPremium1MouseEntered

    private void jLPremium1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPremium1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLPremium1MouseExited

    public void achicarMenu() {
        Timer timer = new Timer(280, new ActionListener() { // 1000 ms = 1 segundo
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuAcotado.setVisible(true);
                jPanel1.setVisible(false);
                MenuAmpliado.setVisible(false);
            }
        });
        timer.setRepeats(false);
        timer.start();

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

    private void darleColorPanel(JPanel panel, JPanel panel2) {
        for (JPanel p : paneles()) {
            if (p != panel && p != panel2) {
                p.setBackground(new Color(98, 51, 125));
            } else {
                panel.setBackground(new Color(111, 58, 141));
                panel2.setBackground(new Color(111, 58, 141));
            }
        }
    }

    public Login getLogin() {
        return login;
    }

    public void IngresoPrestamo() {
        escritorio.removeAll();
        escritorio.repaint();
        VistaPrestamo materiaView = new VistaPrestamo(login);
        Dimension descot = escritorio.getSize();
        materiaView.setSize(descot);
        materiaView.setVisible(true);
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) materiaView.getUI();
        internalFrameUI.setNorthPane(null);
        materiaView.setBorder(null);
        materiaView.setBackground(new Color(0, 0, 0, 0));
        achicarMenu();
//        materiaView.setLogin(login);
        escritorio.add(materiaView);
        escritorio.moveToFront(materiaView);
        darleColorPanel(jPPrestamos, jPPrestamos1);
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public JLabel getjLabel1() {
        return jImg;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jImg = jLabel1;
    }

public void vistaPrestamo (){
    escritorio.removeAll();
        escritorio.repaint();
        VistaPrestamo materiaView = new VistaPrestamo(login);
        Dimension descot = escritorio.getSize();
        materiaView.setSize(descot);
        materiaView.setVisible(true);
        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) materiaView.getUI();
        internalFrameUI.setNorthPane(null);
        materiaView.setBorder(null);
        materiaView.setBackground(new Color(0, 0, 0, 0));
        achicarMenu();
//        materiaView.setLogin(login);
        escritorio.add(materiaView);
        escritorio.moveToFront(materiaView);
        darleColorPanel(jPPrestamos, jPPrestamos1);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLInicio;
    private javax.swing.JLabel JLperfil;
    private javax.swing.JLabel JLperfil2;
    private javax.swing.JLabel JLperfil3;
    private javax.swing.JPanel JPInicio;
    private javax.swing.JPanel JPInicio1;
    private javax.swing.JPanel JPPerfil;
    private javax.swing.JPanel JPPerfil1;
    private javax.swing.JPanel MenuAcotado;
    private javax.swing.JPanel MenuAmpliado;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jImg;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPremium;
    private javax.swing.JLabel jLPremium1;
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
    private javax.swing.JPanel jPPremium;
    private javax.swing.JPanel jPPremium1;
    private javax.swing.JPanel jPPrestamos;
    private javax.swing.JPanel jPPrestamos1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
