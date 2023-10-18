
package biblioteca.Vista;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import java.awt.Image;
import java.awt.Toolkit;
//import java.awt.Image;
import javax.swing.ImageIcon;


public class MenuTest extends javax.swing.JFrame {

    
    public MenuTest() {
        initComponents();
        //Titulo
        setTitle("ALERLO");
        //Icono
        setIconImage(new ImageIcon(getClass().getResource("/iconos/menu_book_FILL0_wght400_GRAD0_opsz24.png")).getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VistaLogin = new javax.swing.JButton();
        VistaRegistrarse = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        VistaLogin.setText("VistaLogin");
        VistaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VistaLoginActionPerformed(evt);
            }
        });

        VistaRegistrarse.setText("VistaRegistrarse");
        VistaRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VistaRegistrarseActionPerformed(evt);
            }
        });

        jButton1.setText("VistaIngreso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(VistaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(VistaRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(VistaLogin)
                .addGap(18, 18, 18)
                .addComponent(VistaRegistrarse)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VistaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VistaLoginActionPerformed
        
        login p = new login();
        p.setVisible(true);
        
        
    }//GEN-LAST:event_VistaLoginActionPerformed

    private void VistaRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VistaRegistrarseActionPerformed
        VistaRegistrarse r = new VistaRegistrarse();
        r.setVisible(true);
    }//GEN-LAST:event_VistaRegistrarseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        FlatSolarizedLightIJTheme.registerCustomDefaultsSource("style");
        FlatSolarizedLightIJTheme.setup();
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VistaLogin;
    private javax.swing.JButton VistaRegistrarse;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
