
package biblioteca.Vista;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import static java.util.Collections.copy;
import javax.swing.JPanel;




public class VistaInicio extends javax.swing.JInternalFrame implements Runnable{
String hora, minutos, segundos;
Thread hilo;



   
    public VistaInicio() {
        initComponents();
//        jLfecha.setText(mostrarFecha());
        hilo= new Thread(this);
        hilo.start();
        setVisible(true);
        hora();
        run();
        mostrarFecha();
        jLabel1.setText("<html><head><style>body { text-align: center; }</style></head><body><strong>Encuentra libros con una sola búsqueda</strong><br><br>Desde 2023 hasta la fecha, Alerlo ha facilitado la búsqueda de cualquier libro al mejor precio.Ya sea<br> que desee la copia de lectura más barata o una edición coleccionable, con Alerlo encontrará el libro<br> adecuado.<em>Alerlo.com<em> busca en los inventarios de más de 100.000 libreros en todo el mundo y accede<br> a millones de libros en un solo paso.</body></html>");
                
                 FrasesAleatorias ();
        jPanel4.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:60");
        jPanel2.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:60");
        jLCopiright.setText("<html><p>&copy; 2023 Grupo75 - Argentina Programa 4.0</p></html>");
    }
    
    public class RoundJPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();
        Ellipse2D shape = new Ellipse2D.Double(0, 0, width, height);

        g2d.setClip(shape);
        g2d.fill(shape);
        g2d.dispose();
    }
}







    
   public void hora(){
       Calendar calendario= new GregorianCalendar();
       Date horaActual = new Date();
       calendario.setTime(horaActual);
       hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+
               calendario.get(Calendar.HOUR_OF_DAY);
       minutos=calendario.get(Calendar.MINUTE)>9?""+ calendario.get(Calendar.MINUTE):"0"+ calendario.get(Calendar.MINUTE);
       segundos=calendario.get(Calendar.SECOND)>9?""+ calendario.get(Calendar.SECOND):"0"+ calendario.get(Calendar.SECOND);
   
   }

    
   public void run(){
       //while
       Thread current= Thread.currentThread();
       while(current==hilo){
           hora();
           jLhora.setText( hora+":"+minutos+":"+segundos);
       }
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLfrase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLCopiright = new javax.swing.JLabel();
        jLfecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLhora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(178, 135, 163));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 720));

        jPanel4.setBackground(new java.awt.Color(204, 0, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLfrase.setFont(new java.awt.Font("Vivaldi", 0, 48)); // NOI18N
        jLfrase.setForeground(new java.awt.Color(219, 215, 210));
        jLfrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLfrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLfrase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLfrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1140, 180));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(219, 215, 210));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1140, 240));

        jLCopiright.setForeground(new java.awt.Color(219, 215, 210));
        jPanel4.add(jLCopiright, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 400, 40));

        jLfecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLfecha.setForeground(new java.awt.Color(219, 215, 210));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(219, 215, 210));
        jLabel2.setText("Bienvenidos");

        jLhora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLhora.setForeground(new java.awt.Color(219, 215, 210));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(219, 215, 210));
        jLabel3.setText("Hoy es");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLhora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLhora, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1200, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        FrasesAleatorias();
    }//GEN-LAST:event_formFocusGained

    
    private void mostrarFecha(){
        Date fechaActual= new Date();
        SimpleDateFormat formatofecha= new SimpleDateFormat("EEEE dd 'de' MMMM  'de' YYYY");
        String fechaFormateada= formatofecha.format(fechaActual);
        jLfecha.setText(fechaFormateada);
        
    }
    
    

public void FrasesAleatorias (){
     
        ArrayList<String> frases = new ArrayList<>();
        frases.add("La lectura es una conversación con los mejores amigos.");
        frases.add("<html>Un libro abierto es un cerebro que habla; <br> cerrado, un amigo que espera;<br> olvidado, un alma que perdona; <br> destruido, un corazón que llora.</html>" );
        frases.add("La creatividad es la inteligencia divirtiéndose." );
        frases.add("<html>El éxito es la suma de pequeños esfuerzos <br>repetidos día tras día.</html>" );
        frases.add("Un libro es un sueño que tienes en tus manos.");
        frases.add("Leer es viajar sin moverse.");
        frases.add("La lectura es a la mente lo que el ejercicio al cuerpo.");
        
        
        
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(frases.size());
        
        
        jLfrase.setText(frases.get(indiceAleatorio));
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLCopiright;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLfecha;
    private javax.swing.JLabel jLfrase;
    private javax.swing.JLabel jLhora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
