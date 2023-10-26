package biblioteca.Vista;

import biblioteca.AccesoData.EjemplarData;
import biblioteca.AccesoData.LectorData;
import biblioteca.AccesoData.LibroData;
import biblioteca.AccesoData.PrestamoData;
import biblioteca75.Ejemplar;
import biblioteca75.Libro;
import biblioteca75.Login;
import biblioteca75.Prestamo;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.*;
import java.awt.Image;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TabableView;

public class VistaPrestamo extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    Login login = new Login();

    public VistaPrestamo() {
        initComponents();
//        setSize(1100,720);
        Tabla.requestFocus();
        cargarTabla();
        cargarComboBox();
        IdPrestamo.setVisible(false);
        jBNuevoPrestamo.setEnabled(false);

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
        jBNuevoPrestamo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        scroll2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        jTBuscarLibro = new javax.swing.JTextField();
        jSDia = new javax.swing.JSpinner();
        jMonMes = new com.toedter.calendar.JMonthChooser();
        jYAño = new com.toedter.calendar.JYearChooser();
        jPModificar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IdPrestamo = new javax.swing.JLabel();
        jTEstado = new javax.swing.JTextField();
        jTNrSocio = new javax.swing.JTextField();
        jCBoxLibrosEditar = new javax.swing.JComboBox<>();
        JBEditar = new javax.swing.JButton();
        jSDia1 = new javax.swing.JSpinner();
        jMonMes1 = new com.toedter.calendar.JMonthChooser();
        jYAño1 = new com.toedter.calendar.JYearChooser();
        jSDia2 = new javax.swing.JSpinner();
        jMonMes2 = new com.toedter.calendar.JMonthChooser();
        jYAño2 = new com.toedter.calendar.JYearChooser();
        JPDevolver = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        JlIDPrestamo2 = new javax.swing.JLabel();
        jCBoxPrestamo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSDia3 = new javax.swing.JSpinner();
        jMonMes3 = new com.toedter.calendar.JMonthChooser();
        jYAño3 = new com.toedter.calendar.JYearChooser();

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

        jTabbedPane2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane2FocusGained(evt);
            }
        });

        JPMostrar.setBackground(new java.awt.Color(193, 120, 196));
        JPMostrar.setPreferredSize(new java.awt.Dimension(375, 637));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Datos del prestamo");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("A continuacion podras cargar un nuevo prestamo");

        jBNuevoPrestamo.setText("ENVIAR");
        jBNuevoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoPrestamoActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        scroll2.setViewportView(Tabla2);

        jPanel1.add(scroll2, java.awt.BorderLayout.CENTER);

        jTBuscarLibro.setBackground(new java.awt.Color(255, 255, 255));
        jTBuscarLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTBuscarLibro.setText("Buscar...");
        jTBuscarLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTBuscarLibroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTBuscarLibroFocusLost(evt);
            }
        });
        jTBuscarLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscarLibroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout JPMostrarLayout = new javax.swing.GroupLayout(JPMostrar);
        JPMostrar.setLayout(JPMostrarLayout);
        JPMostrarLayout.setHorizontalGroup(
            JPMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMostrarLayout.createSequentialGroup()
                .addGroup(JPMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPMostrarLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(JPMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPMostrarLayout.createSequentialGroup()
                                .addComponent(jSDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMonMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jYAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1))
        );
        JPMostrarLayout.setVerticalGroup(
            JPMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMostrarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(8, 8, 8)
                .addComponent(jLabel10)
                .addGap(30, 30, 30)
                .addGroup(JPMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jMonMes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jYAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jTBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jBNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Nuevo Prestamo", JPMostrar);
        JPMostrar.getAccessibleContext().setAccessibleName("Nuevo Prestamo");
        JPMostrar.getAccessibleContext().setAccessibleDescription("");

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

        IdPrestamo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IdPrestamo.setText("ID Prestamo: ");

        jTEstado.setEditable(false);
        jTEstado.setEnabled(false);

        jTNrSocio.setEditable(false);
        jTNrSocio.setEnabled(false);

        JBEditar.setText("EDITAR");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPModificarLayout = new javax.swing.GroupLayout(jPModificar);
        jPModificar.setLayout(jPModificarLayout);
        jPModificarLayout.setHorizontalGroup(
            jPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPModificarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPModificarLayout.createSequentialGroup()
                        .addComponent(jSDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMonMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jYAño2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPModificarLayout.createSequentialGroup()
                        .addComponent(jSDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMonMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jYAño1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPModificarLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                            .addComponent(IdPrestamo)
                            .addGap(10, 10, 10))
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jTNrSocio)
                        .addComponent(jTEstado)
                        .addComponent(jCBoxLibrosEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(IdPrestamo))
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jCBoxLibrosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jMonMes1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jYAño1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jMonMes2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jYAño2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jTNrSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jTEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(JBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jTabbedPane2.addTab("Editar", jPModificar);
        jPModificar.getAccessibleContext().setAccessibleName("Editar");
        jPModificar.getAccessibleContext().setAccessibleDescription("");

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
        jLabel21.setText("Prestamo");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Fecha Devolucion");

        JlIDPrestamo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JlIDPrestamo2.setText("ID Prestamo: ");

        jButton1.setText("DEVOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                        .addComponent(jSDia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jMonMes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jYAño3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPDevolverLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(JlIDPrestamo2)
                        .addGap(10, 10, 10))
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jCBoxPrestamo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBoxPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(27, 27, 27)
                .addGroup(JPDevolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPDevolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSDia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jMonMes3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jYAño3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Devolver", JPDevolver);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, 720));
        jTabbedPane2.getAccessibleContext().setAccessibleName("");

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
        IdPrestamo.setText(modelo.getValueAt(Tabla.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_TablaMouseClicked

    private void jTBuscarLibroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscarLibroFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscarLibroFocusGained

    private void jTBuscarLibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscarLibroFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscarLibroFocusLost

    private void jTBuscarLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscarLibroKeyReleased
        borrarFilas();
        for (Libro prod : new LibroData().listarLibros()) {
//            Ejemplar ejemplar = ejemplarData.buscarEjemplar(prod.getEjemplar().getCodigo());
//            Libro libro = libroData.buscarLibro(String.valueOf(ejemplar.getCodigo()));
            if (prod.getTitulo().startsWith(jTBuscarLibro.getText())
                    || prod.getAutor().startsWith(jTBuscarLibro.getText())
                    || String.valueOf(prod.getAnio()).startsWith(jTBuscarLibro.getText())
                    || prod.getEditorial().startsWith(jTBuscarLibro.getText())
                    || String.valueOf(prod.getIsbn()).startsWith(jTBuscarLibro.getText())
                    || prod.getTipo().startsWith(jTBuscarLibro.getText())) {
                if (prod.isEstado()) {
                    modelo2.addRow(new Object[]{prod.getTitulo(), prod.getAutor(), new ImageIcon("src/iconos/correcto.png")});
                } else {
                    modelo2.addRow(new Object[]{prod.getTitulo(), prod.getAutor(), new ImageIcon("src/iconos/incorrecto.png")});
                }

            }

        }
    }//GEN-LAST:event_jTBuscarLibroKeyReleased

    private void fechaActual() {
        jSDia.setValue(LocalDate.now().getDayOfMonth());
        jMonMes.setMonth(LocalDate.now().getMonthValue());
        jYAño.setYear(LocalDate.now().getYear());
    }

    private void jBNuevoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoPrestamoActionPerformed
        if (Tabla2.isRowSelected(Tabla2.getSelectedRow())) {
            jBNuevoPrestamo.setEnabled(true);
            Prestamo presta = new Prestamo();
            Ejemplar ejemplar = null;
            Libro libro = new LibroData().buscarLibro(modelo2.getValueAt(Tabla2.getSelectedRow(), 0).toString());
            LocalDate fecha = LocalDate.of(jYAño.getYear(), jMonMes.getMonth(), Integer.parseInt(jSDia.getValue().toString()));
            presta.setFechaInicio(Date.valueOf(fecha));
            presta.setFechaFin(null);
            presta.setLector(login.getLector());
            for (Ejemplar object : new EjemplarData().listarEjemplar()) {
                if (object.getLibro().getIdLibro() == libro.getIdLibro() && object.getCantidadDeEjemplares() != 0 && object.isEstado()) {
                    ejemplar = object;
                }
            }
            if (ejemplar != null) {
                presta.setEjemplar(ejemplar);
            }
            presta.setEstado(true);
            new PrestamoData().guardarPrestamo(presta);
            JOptionPane.showMessageDialog(null, "Recuerda que la fecha de devolucion es " + Date.valueOf(LocalDate.now().plusDays(7)));
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un libro con ejemplares disponibles");
        }

    }//GEN-LAST:event_jBNuevoPrestamoActionPerformed

    private void jTabbedPane2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane2FocusGained
        Prestamo prestamo = new Prestamo();
        if (jTabbedPane2.getTabComponentAt(jTabbedPane2.getSelectedIndex()).getName().equals("Nuevo Prestamo")) {
            cargarTabla2();
            fechaActual();
        } else if (jTabbedPane2.getTabComponentAt(jTabbedPane2.getSelectedIndex()).getName().equals("Editar")) {
            if (Tabla.isRowSelected(Tabla.getSelectedRow())) {
                prestamo = new PrestamoData().buscarPrestamo(Integer.parseInt(modelo.getValueAt(Tabla.getSelectedRow(), 0).toString()));
                IdPrestamo.setText(modelo.getValueAt(Tabla.getSelectedRow(), 0).toString());
                IdPrestamo.setVisible(true);
                jCBoxLibrosEditar.setSelectedItem(new LibroData().buscarLibro(modelo.getValueAt(Tabla.getSelectedRow(), 1).toString()));
                jSDia1.setValue(prestamo.getFechaInicio().toLocalDate().getDayOfMonth());
                jMonMes1.setMonth(prestamo.getFechaInicio().toLocalDate().getMonthValue());
                jYAño1.setYear(prestamo.getFechaInicio().toLocalDate().getYear());

                jSDia2.setValue(prestamo.getFechaInicio().toLocalDate().plusDays(7).getDayOfMonth());
                jMonMes2.setMonth(prestamo.getFechaInicio().toLocalDate().plusDays(7).getMonthValue());
                jYAño2.setYear(prestamo.getFechaInicio().toLocalDate().plusDays(7).getYear());

                jSDia2.setEnabled(false);
                jMonMes2.setEnabled(false);
                jYAño2.setEnabled(false);
                jTNrSocio.setText(String.valueOf(login.getLector().getNroSocio()));
                String estado;
                if (prestamo.isEstado()) {
                    estado = "Prestado";
                } else if (prestamo.isEstado() && prestamo.getFechaFin() == null) {
                    estado = "Plazo Vencido";
                } else {
                    estado = "Devuelto";
                }
                jTEstado.setText(estado);
            } else {
                JOptionPane.showMessageDialog(null, "Por Favor Elija algun prestamo para editar");
            }
        } else {
            cargarComboBoxPrestamos();

        }
    }//GEN-LAST:event_jTabbedPane2FocusGained

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        Prestamo prestamo = new Prestamo();

        if (Tabla.isRowSelected(Tabla.getSelectedRow())) {
            prestamo.setIdPrestamo(Integer.parseInt(IdPrestamo.getText()));
            prestamo.setFechaInicio(Date.valueOf(LocalDate.of(jYAño1.getYear(), jMonMes1.getMonth(), Integer.parseInt(jSDia1.getValue().toString()))));
            prestamo.setFechaFin(Date.valueOf(LocalDate.of(jYAño2.getYear(), jMonMes2.getMonth(), Integer.parseInt(jSDia2.getValue().toString()))));
            for (Ejemplar ejemplar : new EjemplarData().listarEjemplar()) {
                Libro libro = (Libro) jCBoxLibrosEditar.getSelectedItem();
                if (ejemplar.getLibro().getIdLibro() == libro.getIdLibro() && ejemplar.getCantidadDeEjemplares() != 0 && ejemplar.isEstado()) {
                    prestamo.setEjemplar(ejemplar);
                } else {
                    JOptionPane.showMessageDialog(null, "Debes seleccionar un libro con ejemplares disponibles");
                }
            }

            prestamo.setLector(new LectorData().buscarLector(Integer.parseInt(jTNrSocio.getText())));
            prestamo.setEstado(isIcon);
            new PrestamoData().modificarPrestamo(prestamo);
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor Elija algun prestamo para editar");
        }


    }//GEN-LAST:event_JBEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jCBoxPrestamo.getItemAt(jCBoxPrestamo.getSelectedIndex()).toString().isEmpty()) {
            jSDia3.setValue(LocalDate.now().getDayOfMonth());
            jMonMes3.setMonth(Integer.parseInt(LocalDate.now().getMonth().toString()));
            jYAño3.setYear(LocalDate.now().getYear());
            LocalDate fecha = LocalDate.of(jYAño3.getYear(), jMonMes3.getMonth(), Integer.parseInt(jSDia3.getValue().toString()));
        }else{
            JOptionPane.showMessageDialog(null, "Por Favor Elija algun prestamo para devolver");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cargarComboBox() {
        LibroData libroData = new LibroData();
        DefaultComboBoxModel<Libro> mdlCombo = new DefaultComboBoxModel(libroData.listarLibros().toArray());
        jCBoxLibrosEditar.setModel(mdlCombo);
    }

    public void cargarComboBoxPrestamos() {
        LibroData libroData = new LibroData();
        DefaultComboBoxModel<Prestamo> mdlCombo = new DefaultComboBoxModel(new PrestamoData().obtenerPrestamos().toArray());
        jCBoxPrestamo.setModel(mdlCombo);
    }

    public void cargarTabla() {

        Tabla.setModel(modelo);
        modelo.addColumn("ID Prestamo");
        modelo.addColumn("Libro");
        modelo.addColumn("Fecha de Prestamo");
        modelo.addColumn("Fecha de Devolucion");

        Tabla
                .setDefaultRenderer(Object.class,
                        new TableGradientCell());
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

    public void cargarTabla2() {

        Tabla2.setModel(modelo);
        modelo2.addColumn("Titulo");
        modelo2.addColumn("Autor");
        modelo2.addColumn("Disponibilidad");

        Tabla2
                .setDefaultRenderer(Object.class,
                        new TableGradientCell());

        jPanel1.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:1,1,1,1,$TableHeader.bottomSeparatorColor,,10");
        Tabla2.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background");
//        Tabla.putClientProperty(FlatClientProperties.STYLE, ""
//                + "foreground:#141026");
        scroll2.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,0,3,0,$Table.background,10,10");
        scroll2.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverTrackColor:null");

    }

    private void borrarFilas() {
        int f = Tabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdPrestamo;
    private javax.swing.JButton JBEditar;
    private javax.swing.JPanel JPDevolver;
    private javax.swing.JPanel JPMostrar;
    private javax.swing.JLabel JlIDPrestamo2;
    private javax.swing.JPanel JpanelTabla;
    private javax.swing.JTable Tabla;
    private javax.swing.JTable Tabla2;
    private javax.swing.JButton jBFiltrar;
    private javax.swing.JButton jBNuevoPrestamo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Libro> jCBoxLibrosEditar;
    private javax.swing.JComboBox<Prestamo> jCBoxPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonMes;
    private com.toedter.calendar.JMonthChooser jMonMes1;
    private com.toedter.calendar.JMonthChooser jMonMes2;
    private com.toedter.calendar.JMonthChooser jMonMes3;
    private javax.swing.JPanel jPModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSDia;
    private javax.swing.JSpinner jSDia1;
    private javax.swing.JSpinner jSDia2;
    private javax.swing.JSpinner jSDia3;
    private javax.swing.JTextField jTBuscarLibro;
    private javax.swing.JTextField jTEstado;
    private javax.swing.JTextField jTNrSocio;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JYearChooser jYAño;
    private com.toedter.calendar.JYearChooser jYAño1;
    private com.toedter.calendar.JYearChooser jYAño2;
    private com.toedter.calendar.JYearChooser jYAño3;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll2;
    // End of variables declaration//GEN-END:variables
}
