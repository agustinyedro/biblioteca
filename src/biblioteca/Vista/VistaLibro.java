/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package biblioteca.Vista;

import biblioteca.AccesoData.EjemplarData;
import biblioteca.AccesoData.LectorData;
import biblioteca.AccesoData.LibroData;
import biblioteca.AccesoData.LoginData;
import biblioteca.AccesoData.PrestamoData;
import biblioteca75.Ejemplar;
import biblioteca75.Lector;
import biblioteca75.Libro;
import biblioteca75.Login;
import biblioteca75.Prestamo;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Image;
import java.time.LocalDate;
import java.sql.Date;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luzel
 */
public final class VistaLibro extends javax.swing.JInternalFrame {

    Login login = new Login();

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            for (int i = 0; i < tabla.getColumnCount(); i++) {
                for (int j = 0; j < tabla.getRowCount(); j++) {
                    return false;
                }
            }
            return false;
        }
    };
    JTable tabla = new JTable(modelo);
    JScrollPane scrollPane = new JScrollPane(tabla);

    LibroData libroData;

    public VistaLibro() {
        initComponents();

        cargarTabla();
        this.add(scrollPane);
        jPanel1.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:60");

    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextTitulo = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextAutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextIsbn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextAnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextGenero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextEditorial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        verificacion = new javax.swing.JLabel();
        jBReservar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(193, 120, 196));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Título:");

        jTextTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTituloActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Autor:");

        jTextAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAutorFocusLost(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ISBN:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Género:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Editorial:");

        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Disponible:");

        jBReservar.setText("Reservar");
        jBReservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBReservarMouseClicked(evt);
            }
        });

        jBAgregar.setText("Nuevo Préstamo");
        jBAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextAutor)
                                        .addGap(201, 201, 201))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextTitulo)
                                        .addGap(57, 57, 57)
                                        .addComponent(jBBuscar))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextGenero))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextIsbn)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextAnio)
                                        .addGap(77, 77, 77))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextEditorial)))
                                .addGap(27, 27, 27)))
                        .addGap(59, 59, 59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(408, 408, 408)
                        .addComponent(jBReservar)
                        .addGap(18, 18, 18)
                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(34, 34, 34)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTextGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBAgregar)
                        .addComponent(jBReservar)
                        .addComponent(jLabel7)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTituloActionPerformed

    public static Set<Libro> buscarLibrosFiltrados(List<Libro> productos, String filtroTitulo, String filtroAutor, Integer filtroISBN, Integer filtroAnio, String filtroGenero, String filtroEditorial) {
        Set<Libro> resultados = new HashSet<>(); // Usamos un conjunto en lugar de una lista

        filtroTitulo = filtroTitulo.toLowerCase();
        filtroAutor = filtroAutor.toLowerCase();
        filtroGenero = filtroGenero.toLowerCase();
        filtroEditorial = filtroEditorial.toLowerCase();

        for (Libro producto : productos) {
            boolean cumpleFiltros = true;

            String titulo = producto.getTitulo().toLowerCase();
            String autor = producto.getAutor().toLowerCase();
            String genero = producto.getTipo().toLowerCase();
            String editorial = producto.getEditorial().toLowerCase();

            if (filtroTitulo != null && !filtroTitulo.isEmpty()) {
                cumpleFiltros = cumpleFiltros && titulo.contains(filtroTitulo);
            }

            if (filtroAutor != null && !filtroAutor.isEmpty()) {
                cumpleFiltros = cumpleFiltros && autor.contains(filtroAutor);
            }

            if (filtroISBN != null) {
                cumpleFiltros = cumpleFiltros && producto.getIsbn() == filtroISBN;
            }

            if (filtroAnio != null) {
                cumpleFiltros = cumpleFiltros && producto.getAnio() == filtroAnio;
            }

            if (filtroGenero != null && !filtroGenero.isEmpty()) {
                cumpleFiltros = cumpleFiltros && genero.contains(filtroGenero);
            }

            if (filtroEditorial != null && !filtroEditorial.isEmpty()) {
                cumpleFiltros = cumpleFiltros && editorial.contains(filtroEditorial);
            }

            if (cumpleFiltros) {
                resultados.add(producto);
            }
        }

        return resultados;
    }

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        LibroData libro = new LibroData();

        List<Libro> listaDeLibros = libro.listarLibros();

        String titulo = jTextTitulo.getText();
        String autor = jTextAutor.getText();
        Integer isbn = null;
        Integer anio = null;
        String tipo = jTextGenero.getText();
        String editorial = jTextEditorial.getText();

        try {
            if (!jTextIsbn.getText().isEmpty()) {
                isbn = Integer.valueOf(jTextIsbn.getText());
            }
            if (!jTextAnio.getText().isEmpty()) {
                anio = Integer.parseInt(jTextAnio.getText());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ISBN y el año deben ser números válidos.");
            return;
        }

        Set<Libro> resultados = buscarLibrosFiltrados(listaDeLibros, titulo, autor, isbn, anio, tipo, editorial);

        borrarFilas();
        for (Libro libros : resultados) {
            Object[] fila = {
                libros.getTitulo(),
                libros.getAutor(),
                libros.getIsbn(),
                libros.getAnio(),
                libros.getTipo(),
                libros.getEditorial()
            };
            modelo.addRow(fila);
        }

        jTextAnio.setText("");
        jTextAutor.setText("");
        jTextEditorial.setText("");
        jTextGenero.setText("");
        jTextIsbn.setText("");
        jTextTitulo.setText("");
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTextAutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAutorFocusLost

    }//GEN-LAST:event_jTextAutorFocusLost

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        //  TablaSeleccion();

    }//GEN-LAST:event_jTable1FocusGained

    private void jBReservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBReservarMouseClicked
        // VA LO DE PREMIUM
        Premium();
    }//GEN-LAST:event_jBReservarMouseClicked

    private void jBAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAgregarMouseClicked
        // MISMO METODO QUE AL AGREGAR PRESTAMO
        Lector lector = new Lector();
        LoginData loginD = new LoginData();
        LectorData lectorD = new LectorData();
        LibroData libro = new LibroData();
        EjemplarData ejemplar = new EjemplarData();
        Prestamo prest = new Prestamo();
        Ejemplar ejem = null;
        PrestamoData prestamo = new PrestamoData();

        Libro libro1 = libro.buscarLibro(modelo.getValueAt(jTable1.getSelectedRow(), 2).toString());

        for (Ejemplar buscar : ejemplar.listarEjemplar()) {
            if (buscar.getLibro().getIdLibro() == libro1.getIdLibro() && buscar.getCantidadDeEjemplares() != 0 && buscar.isEstado()) {
                ejem = new Ejemplar(buscar.getCodigo(), buscar.getLibro(), buscar.getCantidadDeEjemplares(), buscar.isEstado());

            }
        }

        if (ejem != null) {
            prest.setFechaInicio(Date.valueOf(LocalDate.now()));
            LocalDate fechaactual = LocalDate.now();
            prest.setFechaFin(Date.valueOf(fechaactual.plusDays(7)));
            prest.setEjemplar(ejem);

            prest.setLector(login.getLector());
            prest.setEstado(true);

            prestamo.guardarPrestamo(prest);

            if (prestamo.B == 0) {
                VistaIngreso p = new VistaIngreso();
                p.IngresoPrestamo();
                p.setLogin(login);
                p.setVisible(true);
                this.setVisible(false);

            }

        } else {
            JOptionPane.showMessageDialog(null, "No hay ejemplares disponibles.");
            Premium();
        }


    }//GEN-LAST:event_jBAgregarMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        TablaSeleccion();
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBReservar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextAnio;
    private javax.swing.JTextField jTextAutor;
    private javax.swing.JTextField jTextEditorial;
    private javax.swing.JTextField jTextGenero;
    private javax.swing.JTextField jTextIsbn;
    private javax.swing.JTextField jTextTitulo;
    private javax.swing.JLabel verificacion;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {

        jTable1.setModel(modelo);

        modelo.addColumn("Título");
        modelo.addColumn("Autor");
        modelo.addColumn("ISBN");
        modelo.addColumn("Año");
        modelo.addColumn("Género");
        modelo.addColumn("Editorial");

        
        jTable1.setDefaultRenderer(Object.class,
                new TableGradientCell());

        jPanel1.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:1,1,1,1,$TableHeader.bottomSeparatorColor,,10");
        jTable1.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background");
        jTable1.putClientProperty(FlatClientProperties.STYLE, ""
                + "foreground:#141026");
        jScrollPane1.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,0,3,0,$Table.background,10,10");
        jScrollPane1.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverTrackColor:null");

    }

    private void borrarFilas() {
        int f = jTable1.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    public void Premium() {
        int respuesta = JOptionPane.showOptionDialog(this, "Para reservar este libro, debe suscribirse al plan Premium.",
                "Suscripción Premium Requerida",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Suscribir", "Cancelar"},
                "Suscribir");
        if (respuesta == JOptionPane.YES_OPTION) {
            //this.setVisible(false);
            VistaPremium p = new VistaPremium();
            p.setVisible(true);
            //JOptionPane.showMessageDialog(this, "Gracias por suscribirte al plan Premium.", "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            return;
            //JOptionPane.showMessageDialog(this, "Has cancelado la suscripción.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // LLAMO A UNA LISTA QUE SOLO ME MUESTRA LOS LIBROS QUE ESTAN DISPONIBLES (LIBRODATA LINEA 125)
    public void TablaSeleccion() {
        // Agregar un ListSelectionListener para manejar la selección de filas

        jTable1.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            // if (!e.getValueIsAdjusting()) { // Evita eventos duplicados
            EjemplarData ejemplar = new EjemplarData();
            Ejemplar ejem = null;
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow != -1) { // -1 significa que no hay filas seleccionadas
                // Realiza la acción que desees con la fila seleccionada
                int isbn = (int) modelo.getValueAt(selectedRow, 3);
                Libro libro = new LibroData().buscarLibro(String.valueOf(isbn));
                for (Ejemplar buscar : ejemplar.listarEjemplar()) {
                    if (buscar.getLibro().getIdLibro() == libro.getIdLibro()) {
                        ejem = new Ejemplar(buscar.getCodigo(), buscar.getLibro(), buscar.getCantidadDeEjemplares(), buscar.isEstado());
                    }
                }
                if (ejem != null) {
                    if (ejem.isEstado()) {
                        SetImageLabel(verificacion, "src/iconos/correcto.png");
                        System.out.println("Correcto");
                    }
                } else {
                    SetImageLabel(verificacion, "src/iconos/incorrecto.png");
                    System.out.println("Funcionaaaaaaa");

                }
            }
            //}
        });

        this.setVisible(true);
    }

    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
}
