
package biblioteca.Vista;


public class VistaInicio extends javax.swing.JInternalFrame {

   
    public VistaInicio() {
        initComponents();
        setSize(1100,720);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPEscritorio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jBFiltrar = new javax.swing.JButton();
        jBMostrar = new javax.swing.JButton();
        jBInsertar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Id = new javax.swing.JTable();

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("EDICION DE CONTACTOS");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));

        jBFiltrar.setBackground(new java.awt.Color(204, 0, 204));
        jBFiltrar.setText("Filtrar");

        jBMostrar.setBackground(new java.awt.Color(204, 0, 204));
        jBMostrar.setText("Mostrar");
        jBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarActionPerformed(evt);
            }
        });

        jBInsertar.setBackground(new java.awt.Color(204, 0, 204));
        jBInsertar.setText("Insertar");
        jBInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertarActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(204, 0, 204));
        jBModificar.setText("Modificar");

        jBEliminar.setBackground(new java.awt.Color(204, 0, 204));
        jBEliminar.setText("Eliminar");

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

        javax.swing.GroupLayout jPEscritorioLayout = new javax.swing.GroupLayout(jPEscritorio);
        jPEscritorio.setLayout(jPEscritorioLayout);
        jPEscritorioLayout.setHorizontalGroup(
            jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEscritorioLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBModificar)
                    .addGroup(jPEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114)
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBFiltrar)
                    .addComponent(jBEliminar))
                .addGap(74, 74, 74))
            .addGroup(jPEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEscritorioLayout.createSequentialGroup()
                        .addComponent(jBMostrar)
                        .addGap(63, 63, 63)
                        .addComponent(jBInsertar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPEscritorioLayout.setVerticalGroup(
            jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEscritorioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBFiltrar)))
                .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEscritorioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBMostrar)
                            .addComponent(jBInsertar)
                            .addComponent(jBModificar)))
                    .addGroup(jPEscritorioLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jBEliminar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBMostrarActionPerformed

    private void jBInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBInsertarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Id;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBFiltrar;
    private javax.swing.JButton jBInsertar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBMostrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPEscritorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
