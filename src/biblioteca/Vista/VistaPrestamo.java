package biblioteca.Vista;

import biblioteca.AccesoData.EjemplarData;
import biblioteca.AccesoData.LibroData;
import biblioteca.AccesoData.PrestamoData;
import biblioteca75.Ejemplar;
import biblioteca75.Libro;
import biblioteca75.Login;
import biblioteca75.Prestamo;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TabableView;

public class VistaPrestamo extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    Login login = new Login();

    public VistaPrestamo() {
        initComponents();
//        setSize(1100,720);
        Tabla.requestFocus();
        cargarTabla();
        cargarComboBox();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpanelTabla = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jBFiltrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        JPMostrar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        IdPrestamo = new javax.swing.JLabel();
        jTEstadoM = new javax.swing.JTextField();
        jTNSocioM = new javax.swing.JTextField();
        jSDiaDevM = new javax.swing.JSpinner();
        jMonMesDevM = new com.toedter.calendar.JMonthChooser();
        jYAñoDevM = new com.toedter.calendar.JYearChooser();
        jYAñoPresM = new com.toedter.calendar.JYearChooser();
        jSDiaPresM = new javax.swing.JSpinner();
        jMonPresM = new com.toedter.calendar.JMonthChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPModificar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JlIDPrestamo = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        JPDevolver = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        JlIDPrestamo2 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(1210, 715));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1210, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JpanelTabla.setBackground(new java.awt.Color(193, 120, 196));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setText("Buscar...");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jBFiltrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBFiltrar.setText("Filtrar");

        jPanel3.setLayout(new java.awt.BorderLayout());

        Tabla.setBackground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "null", "null", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        scroll.setViewportView(Tabla);

        jPanel3.add(scroll, java.awt.BorderLayout.CENTER);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("PRESTAMOS");

        javax.swing.GroupLayout JpanelTablaLayout = new javax.swing.GroupLayout(JpanelTabla);
        JpanelTabla.setLayout(JpanelTablaLayout);
        JpanelTablaLayout.setHorizontalGroup(
            JpanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelTablaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(JpanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelTablaLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JpanelTablaLayout.setVerticalGroup(
            JpanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelTablaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel17)
                .addGap(46, 46, 46)
                .addGroup(JpanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(JpanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 720));

        JPMostrar.setBackground(new java.awt.Color(193, 120, 196));
        JPMostrar.setPreferredSize(new java.awt.Dimension(375, 637));
        JPMostrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Datos del prestamo");
        JPMostrar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 370, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("A continuacion podras Modificar los Datos");
        JPMostrar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 374, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("ID Prestamo: ");
        JPMostrar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 111, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Libro");
        JPMostrar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 156, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Fecha Prestamo");
        JPMostrar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 243, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Fecha Devolucion");
        JPMostrar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 330, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Nr Socio");
        JPMostrar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 417, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Estado");
        JPMostrar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 504, -1, -1));

        IdPrestamo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IdPrestamo.setText("ID Prestamo: ");
        JPMostrar.add(IdPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 111, -1, -1));

        jTEstadoM.setEnabled(false);
        JPMostrar.add(jTEstadoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 547, 289, -1));

        jTNSocioM.setEnabled(false);
        JPMostrar.add(jTNSocioM, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 460, 289, -1));
        JPMostrar.add(jSDiaDevM, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 380, -1, -1));
        JPMostrar.add(jMonMesDevM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));
        JPMostrar.add(jYAñoDevM, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));
        JPMostrar.add(jYAñoPresM, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));
        JPMostrar.add(jSDiaPresM, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 290, -1, -1));
        JPMostrar.add(jMonPresM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        JPMostrar.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 290, -1));

        jTabbedPane2.addTab("Nuevo Prestamo", JPMostrar);

        jPModificar.setBackground(new java.awt.Color(193, 120, 196));
        jPModificar.setMinimumSize(new java.awt.Dimension(375, 615));
        jPModificar.setPreferredSize(new java.awt.Dimension(375, 615));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos del prestamo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("A continuacion podras Modificar los Datos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("ID Prestamo: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Libro");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Fecha Prestamo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Fecha Devolucion");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nr Socio");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Estado");

        JlIDPrestamo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JlIDPrestamo.setText("ID Prestamo: ");

        jTextField3.setEnabled(false);

        jTextField5.setEnabled(false);

        jTextField6.setEnabled(false);

        jTextField7.setEnabled(false);

        jButton2.setText("ENVIAR");

        javax.swing.GroupLayout jPModificarLayout = new javax.swing.GroupLayout(jPModificar);
        jPModificar.setLayout(jPModificarLayout);
        jPModificarLayout.setHorizontalGroup(
            jPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPModificarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPModificarLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(JlIDPrestamo)
                        .addGap(10, 10, 10))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6)
                    .addComponent(jTextField3)
                    .addComponent(jTextField7)
                    .addComponent(jTextField5)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPModificarLayout.setVerticalGroup(
            jPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPModificarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(jPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JlIDPrestamo))
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jTabbedPane2.addTab("Editar", jPModificar);

        JPDevolver.setBackground(new java.awt.Color(193, 120, 196));
        JPDevolver.setPreferredSize(new java.awt.Dimension(375, 637));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Datos del prestamo");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("A continuacion podras Modificar los Datos");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("ID Prestamo: ");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Libro");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Fecha Prestamo");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Fecha Devolucion");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Nr Socio");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Estado");

        JlIDPrestamo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JlIDPrestamo2.setText("ID Prestamo: ");

        jTextField11.setEnabled(false);

        jTextField12.setEnabled(false);

        jTextField13.setEnabled(false);

        jTextField14.setEnabled(false);

        javax.swing.GroupLayout JPDevolverLayout = new javax.swing.GroupLayout(JPDevolver);
        JPDevolver.setLayout(JPDevolverLayout);
        JPDevolverLayout.setHorizontalGroup(
            JPDevolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(JPDevolverLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(JPDevolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPDevolverLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(JlIDPrestamo2)
                        .addGap(10, 10, 10))
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jTextField13)
                    .addComponent(jTextField11)
                    .addComponent(jTextField14)
                    .addComponent(jTextField12)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        JPDevolverLayout.setVerticalGroup(
            JPDevolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDevolverLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18)
                .addGap(8, 8, 8)
                .addComponent(jLabel19)
                .addGap(31, 31, 31)
                .addGroup(JPDevolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(JlIDPrestamo2))
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        jTabbedPane2.addTab("Devolver", JPDevolver);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        borrarFilas();
        PrestamoData prestamoData = new PrestamoData();
        EjemplarData ejemplarData = new EjemplarData();
        LibroData libroData = new LibroData();
        boolean siHay = false;
        login = getLogin();
        for (Prestamo prod : prestamoData.obtenerPrestamos()) {
            Ejemplar ejemplar = ejemplarData.buscarEjemplar(prod.getEjemplar().getCodigo());
            Libro libro = libroData.buscarLibro(String.valueOf(ejemplar.getCodigo()));
            if ((libro.getTitulo().toLowerCase().startsWith(jTextField1.getText()) || prod.getFechaFin().toString().toLowerCase().startsWith(jTextField1.getText()) || prod.getFechaInicio().toString().toLowerCase().startsWith(jTextField1.getText())) && prod.getLector().getNroSocio() == login.getLector().getNroSocio()) {
                if (!jTextField1.getText().isEmpty()) {
                    modelo.addRow(new Object[]{prod.getIdPrestamo(), libro.getTitulo(), prod.getFechaInicio(), prod.getFechaFin()});
                    siHay = true;
                }

            }

        }


    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if (jTextField1.getText().equalsIgnoreCase("Buscar...")) {
            jTextField1.setText("");

        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().isEmpty() || jTextField1.getText().equalsIgnoreCase("Buscar...")) {
            jTextField1.setText("Buscar...");

        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
         IdPrestamo.setText(modelo.getValueAt(Tabla.getSelectedRow(),0).toString());
    }//GEN-LAST:event_TablaMouseClicked

    public void cargarComboBox(){
        LibroData libroData = new LibroData();
        DefaultComboBoxModel<Libro> mdlCombo = new DefaultComboBoxModel(libroData.listarLibros().toArray());
        jComboBox1.setModel(mdlCombo);
    }
    
    public void cargarTabla() {

        Tabla.setModel(modelo);
        modelo.addColumn("ID Prestamo");
        modelo.addColumn("Libro");
        modelo.addColumn("Fecha de Prestamo");
        modelo.addColumn("Fecha de Devolucion");

        Tabla.setDefaultRenderer(Object.class, new TableGradientCell());
        jPModificar.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30");
        JpanelTabla.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:30");
        jPanel3.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:1,1,1,1,$TableHeader.bottomSeparatorColor,,10");
        Tabla.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background");
//        Tabla.putClientProperty(FlatClientProperties.STYLE, ""
//                + "foreground:#141026");
        scroll.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,0,3,0,$Table.background,10,10");
        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverTrackColor:null");

    }

    private void borrarFilas() {
        int f = Tabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdPrestamo;
    private javax.swing.JPanel JPDevolver;
    private javax.swing.JPanel JPMostrar;
    private javax.swing.JLabel JlIDPrestamo;
    private javax.swing.JLabel JlIDPrestamo2;
    private javax.swing.JPanel JpanelTabla;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jBFiltrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Libro> jComboBox1;
    private javax.swing.JComboBox<Libro> jComboBox2;
    private javax.swing.JComboBox<Libro> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonMesDevM;
    private com.toedter.calendar.JMonthChooser jMonPresM;
    private javax.swing.JPanel jPModificar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSDiaDevM;
    private javax.swing.JSpinner jSDiaPresM;
    private javax.swing.JTextField jTEstadoM;
    private javax.swing.JTextField jTNSocioM;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private com.toedter.calendar.JYearChooser jYAñoDevM;
    private com.toedter.calendar.JYearChooser jYAñoPresM;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
