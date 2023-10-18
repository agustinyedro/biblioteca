
package biblioteca.Vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class VistaIngreso extends javax.swing.JFrame {

   
    public VistaIngreso() {
        initComponents();
        SetImageLabel(jLlibrito,"src/iconos/Sunday Lounge.jpg");
        //setSize(580, 450);
        setLocationRelativeTo(null);
        //SetImageLabel()
    }
    
    
    
    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLinicio = new javax.swing.JLabel();
        JLperfil = new javax.swing.JLabel();
        jLprestamos = new javax.swing.JLabel();
        jLibros = new javax.swing.JLabel();
        jLogout = new javax.swing.JLabel();
        jLlibrito = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(255, 204, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jLabel1.setText("Nuestros clientes son ");

        jLabel2.setText("lo mas importante");

        jLinicio.setBackground(new java.awt.Color(204, 0, 204));
        jLinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/casita.png"))); // NOI18N
        jLinicio.setText("Inicio");
        jLinicio.setIconTextGap(30);
        jLinicio.setOpaque(true);
        jLinicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLinicioFocusGained(evt);
            }
        });
        jLinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLinicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLinicioMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLinicioMousePressed(evt);
            }
        });

        JLperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/persona.png"))); // NOI18N
        JLperfil.setText("Perfil");
        JLperfil.setIconTextGap(30);
        JLperfil.setName(""); // NOI18N
        JLperfil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JLperfilFocusGained(evt);
            }
        });
        JLperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLperfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLperfilMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLperfilMousePressed(evt);
            }
        });

        jLprestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/prestamo.png"))); // NOI18N
        jLprestamos.setText(" Prestamos");
        jLprestamos.setIconTextGap(25);
        jLprestamos.setName(""); // NOI18N

        jLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/librito.png"))); // NOI18N
        jLibros.setText(" Libros");
        jLibros.setAutoscrolls(true);
        jLibros.setIconTextGap(27);

        jLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logout.png"))); // NOI18N
        jLogout.setText("Logout");
        jLogout.setFocusCycleRoot(true);
        jLogout.setIconTextGap(27);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLogout)
                            .addComponent(jLibros)
                            .addComponent(jLprestamos)
                            .addComponent(JLperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLlibrito, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLlibrito, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(107, 107, 107)
                .addComponent(jLinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLperfil)
                .addGap(29, 29, 29)
                .addComponent(jLprestamos)
                .addGap(28, 28, 28)
                .addComponent(jLibros)
                .addGap(33, 33, 33)
                .addComponent(jLogout)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1096, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLinicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLinicioMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
//        panelRound1.setVisible(true);
        VistaInicio edicionView = new VistaInicio();
//      Dimension descot = escritorio.getSize();
//        Dimension Internal = perfilView.getSize();
//        perfilView.setLocation((descot.width - Internal.width) / 2, (descot.height - Internal.height) / 2);
//        perfilView.setResizable(true);
            edicionView.setVisible(true);
//        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) perfilView.getUI();
//        internalFrameUI.setNorthPane(null);
        edicionView.setBorder(null);
       // edicionView.setBackground(new Color(0,0,0,0));
//        escritorio.add(panelRound1);
        escritorio.add(edicionView);
        escritorio.moveToFront(edicionView);
        
        
    }//GEN-LAST:event_jLinicioMouseClicked

    private void jLinicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLinicioMousePressed

escritorio.removeAll();
        escritorio.repaint();
//        panelRound1.setVisible(true);
        VistaInicio perfilView = new VistaInicio();
//        Dimension descot = escritorio.getSize();
//        Dimension Internal = perfilView.getSize();
//        perfilView.setLocation((descot.width - Internal.width) / 2, (descot.height - Internal.height) / 2);
//        perfilView.setResizable(true);
//        perfilView.setVisible(true);
//        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) perfilView.getUI();
//        internalFrameUI.setNorthPane(null);
//        perfilView.setBorder(null);
//        perfilView.setBackground(new Color(0,0,0,0));
//        escritorio.add(panelRound1);
        escritorio.add(perfilView);
        escritorio.moveToFront(perfilView);

    }//GEN-LAST:event_jLinicioMousePressed

    private void jLinicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLinicioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLinicioMouseEntered

    private void jLinicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLinicioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLinicioFocusGained

    private void JLperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLperfilMouseClicked
       escritorio.removeAll();
        escritorio.repaint();
//        panelRound1.setVisible(true);
        VistaPerfil perfilView = new VistaPerfil();
//        Dimension descot = escritorio.getSize();
//        Dimension Internal = perfilView.getSize();
//        perfilView.setLocation((descot.width - Internal.width) / 2, (descot.height - Internal.height) / 2);
//        perfilView.setResizable(true);
        perfilView.setVisible(true);
//        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) perfilView.getUI();
//        internalFrameUI.setNorthPane(null);
//        perfilView.setBorder(null);
//        perfilView.setBackground(new Color(0,0,0,0));
//        escritorio.add(panelRound1);
        escritorio.add(perfilView);
        escritorio.moveToFront(perfilView);
      
    }//GEN-LAST:event_JLperfilMouseClicked

    private void JLperfilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JLperfilFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_JLperfilFocusGained

    private void JLperfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLperfilMousePressed
        
        
        escritorio.repaint();
//        panelRound1.setVisible(true);
        VistaPerfil perfilView = new VistaPerfil();
//        Dimension descot = escritorio.getSize();
//        Dimension Internal = perfilView.getSize();
//        perfilView.setLocation((descot.width - Internal.width) / 2, (descot.height - Internal.height) / 2);
//        perfilView.setResizable(true);
//        perfilView.setVisible(true);
//        BasicInternalFrameUI internalFrameUI = (BasicInternalFrameUI) perfilView.getUI();
//        internalFrameUI.setNorthPane(null);
//        perfilView.setBorder(null);
//        perfilView.setBackground(new Color(0,0,0,0));
//        escritorio.add(panelRound1);
        escritorio.add(perfilView);
        escritorio.moveToFront(perfilView); 
    }//GEN-LAST:event_JLperfilMousePressed

    private void JLperfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLperfilMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JLperfilMouseEntered

    
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
            java.util.logging.Logger.getLogger(VistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLperfil;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLibros;
    private javax.swing.JLabel jLinicio;
    private javax.swing.JLabel jLlibrito;
    private javax.swing.JLabel jLogout;
    private javax.swing.JLabel jLprestamos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
