
package biblioteca.Vista;


public class VistaPrestamo extends javax.swing.JInternalFrame {

   
    public VistaPrestamo() {
        initComponents();
//        setSize(1100,720);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jBFiltrar = new javax.swing.JButton();
        jBMostrar = new javax.swing.JButton();
        jBInsertar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Id = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1210, 720));
        setPreferredSize(new java.awt.Dimension(1210, 720));

        jPanel1.setBackground(new java.awt.Color(186, 192, 184));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("EDICION DE CONTACTOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 140, 33));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 45, 480, 33));

        jBFiltrar.setBackground(new java.awt.Color(204, 0, 204));
        jBFiltrar.setText("Filtrar");
        jPanel1.add(jBFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jBMostrar.setBackground(new java.awt.Color(204, 0, 204));
        jBMostrar.setText("Mostrar");
        jBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jBMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jBInsertar.setBackground(new java.awt.Color(204, 0, 204));
        jBInsertar.setText("Insertar");
        jBInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(jBInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jBModificar.setBackground(new java.awt.Color(204, 0, 204));
        jBModificar.setText("Modificar");
        jPanel1.add(jBModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jBEliminar.setBackground(new java.awt.Color(204, 0, 204));
        jBEliminar.setText("Eliminar");
        jPanel1.add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        Id.setBackground(new java.awt.Color(255, 255, 255));
        Id.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Id);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 164, 800, 500));

        jPanel2.setBackground(new java.awt.Color(186, 192, 184));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBInsertarActionPerformed

    private void jBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Id;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBFiltrar;
    private javax.swing.JButton jBInsertar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBMostrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
