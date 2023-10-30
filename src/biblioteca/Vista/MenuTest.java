
package biblioteca.Vista;

//import biblioteca75.Login;
import biblioteca.AccesoData.LoginData;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
//import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author USURIO
 */
public class MenuTest extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuTest() {
        initComponents();
        //Titulo
        setTitle("ALERLO");
        //Icono
        setIconImage(new ImageIcon(getClass().getResource("/iconos/iconoApp2.png")).getImage());
//    
this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/iconos/Recurso 15.svg"));
   setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        VistaIngreso = new javax.swing.JButton();
        VistaRecuperarContraseña = new javax.swing.JButton();
        PantallaInicio = new javax.swing.JButton();
        VistaRegistrarse = new javax.swing.JButton();
        VistaLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(148, 201, 151));
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(178, 135, 163));

        VistaIngreso.setText("VistaIngreso");
        VistaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VistaIngresoActionPerformed(evt);
            }
        });

        VistaRecuperarContraseña.setText("VistaRecuperarContraseña");
        VistaRecuperarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VistaRecuperarContraseñaActionPerformed(evt);
            }
        });

        PantallaInicio.setText("Pantalla Inicio");
        PantallaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantallaInicioActionPerformed(evt);
            }
        });

        VistaRegistrarse.setText("VistaRegistrarse");
        VistaRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VistaRegistrarseActionPerformed(evt);
            }
        });

        VistaLogin.setText("VistaLogin");
        VistaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VistaLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(VistaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addComponent(PantallaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VistaRecuperarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VistaRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VistaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(VistaLogin)
                    .addGap(18, 18, 18)
                    .addComponent(VistaRegistrarse)
                    .addGap(18, 18, 18)
                    .addComponent(PantallaInicio)
                    .addGap(18, 18, 18)
                    .addComponent(VistaRecuperarContraseña)
                    .addGap(18, 18, 18)
                    .addComponent(VistaIngreso)
                    .addContainerGap(291, Short.MAX_VALUE)))
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

    private void VistaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VistaLoginActionPerformed
        
        VistaLogin p = new VistaLogin();
        p.setVisible(true);
    }//GEN-LAST:event_VistaLoginActionPerformed

    private void VistaRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VistaRegistrarseActionPerformed
        VistaRegistrarse r = new VistaRegistrarse();
        r.setVisible(true);
    }//GEN-LAST:event_VistaRegistrarseActionPerformed

    private void VistaRecuperarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VistaRecuperarContraseñaActionPerformed
        VistaRecuperarContraseña r = new VistaRecuperarContraseña();
        r.setVisible(true);
    }//GEN-LAST:event_VistaRecuperarContraseñaActionPerformed

    private void PantallaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantallaInicioActionPerformed
        PantallaDeInicio r = new PantallaDeInicio();
        r.setVisible(true);
    }//GEN-LAST:event_PantallaInicioActionPerformed

    private void VistaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VistaIngresoActionPerformed
        VistaIngreso r = new VistaIngreso();
        r.setVisible(true);
    }//GEN-LAST:event_VistaIngresoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        FlatSolarizedLightIJTheme.registerCustomDefaultsSource("style");
        FlatSolarizedLightIJTheme.setup();
        
//        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTest().setVisible(true);
            }
        });
    }
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PantallaInicio;
    private javax.swing.JButton VistaIngreso;
    private javax.swing.JButton VistaLogin;
    private javax.swing.JButton VistaRecuperarContraseña;
    private javax.swing.JButton VistaRegistrarse;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
