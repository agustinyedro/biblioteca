/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca.Vista;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import com.formdev.flatlaf.ui.FlatProgressBarUI;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;

/**
 *
 * @author USURIO
 */
public class PantallaDeInicio extends javax.swing.JFrame {
    private boolean sincarga = false;
    private boolean panelFondo = true;
    private int auxiliar = 0;
    private boolean realizado = false;
    hilo ejecutar = new hilo();

    /**
     * Creates new form PantallaDeInicio
     */
    public PantallaDeInicio() {
        setUndecorated(true);
        initComponents();
        SetImageLabel(fondo, "src/iconos/Recurso 1.png");
        //Para que no se vea nada
        PantallaDeInicio.this.getRootPane().setOpaque(false);
        //Para darle color
        PantallaDeInicio.this.getContentPane().setBackground(new Color(0, 0, 0, 0));
        PantallaDeInicio.this.setBackground(new Color(0, 0, 0, 0));
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        panelRound1.setVisible(false);
        jPanel2.setVisible(false);

    }

    public boolean isSincarga() {
        return sincarga;
    }

    public void setSincarga(boolean sincarga) {
        this.sincarga = sincarga;
    }
    

    public boolean isPanelFondo() {
        return panelFondo;
    }

    public void setPanelFondo(boolean panelFondo) {
        this.panelFondo = panelFondo;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();
        panelRound1 = new biblioteca.Vista.PanelRound();
        jPanel2 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(104, 52, 126));
        text.setText("jLabel1");
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, -1, -1));

        barra.setForeground(new java.awt.Color(219, 147, 166));
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 850, 4));

        panelRound1.setPreferredSize(new java.awt.Dimension(378, 418));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 127, 375, 400));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(panelFondo==true&& sincarga==false){
             if (realizado == false) {
            realizado = true;
            ejecutar.start();
        }
        }else if(sincarga==true){
            text.setVisible(false);
            barra.setVisible(false);
            jPanel2.setVisible(true);
            jPanel2.setBackground(new Color(64, 55, 57, 180));
            PantallaDeInicio.this.setCursor(new Cursor(DEFAULT_CURSOR) {});
            VistaLogin objeto = new VistaLogin();
            objeto.setVisible(true);
            panelRound1.setVisible(true);
            panelRound1.setBackground(new Color(85, 85, 85, 200));
            objeto.setLocation(250, 200);
        }else {
            text.setVisible(false);
            barra.setVisible(false);
            jPanel2.setVisible(true);
            jPanel2.setBackground(new Color(64, 55, 57, 180));
            PantallaDeInicio.this.setCursor(new Cursor(DEFAULT_CURSOR) {});
        }
       
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//        FlatLaf.registerCustomDefaultsSource("style");
        FlatSolarizedLightIJTheme.registerCustomDefaultsSource("style");
        FlatSolarizedLightIJTheme.setup();
        UIManager.put("ProgressBar.foreground", "rgb(255,255,255)");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaDeInicio().setVisible(true);
            }
        });
    }

    private class hilo extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i <= 100; i++) {
                    barra.setValue(i);
                    repaint();
                    switch (i) {
                        case 0:
                            text.setText("Pse-Int");
                            break;
                        case 13:
                            text.setText("Programando en java");
                            break;
                        case 30:
                            text.setText("Desarrolando App");
                            break;
                        case 50: {
                            text.setText("Carga finalizada");
                            barra.setVisible(false);
                            text.setVisible(false);

                            PantallaDeInicio.this.setCursor(new Cursor(DEFAULT_CURSOR) {
                            });
                            VistaLogin objeto = new VistaLogin();

                            objeto.setVisible(true);
                            if (isPanelFondo() ) {
                                panelRound1.setVisible(true);
                            }

                            jPanel2.setVisible(true);
                            panelRound1.setBackground(new Color(85, 85, 85, 200));
                            jPanel2.setBackground(new Color(64, 55, 57, 180));
                            objeto.setLocation(250, 200);
                            break;
                        }

                    }
                    Thread.sleep(60);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(PantallaDeInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel2;
    private biblioteca.Vista.PanelRound panelRound1;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
