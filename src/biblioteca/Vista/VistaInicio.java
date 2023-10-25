
package biblioteca.Vista;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;




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
        FrasesAleatorias ();
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
        jBactualiza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLfecha = new javax.swing.JLabel();
        jLhora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 0, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLfrase.setFont(new java.awt.Font("Vivaldi", 0, 48)); // NOI18N
        jLfrase.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(jLfrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 770, 80));

        jBactualiza.setBackground(new java.awt.Color(255, 255, 255));
        jBactualiza.setText("ok");
        jBactualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizaActionPerformed(evt);
            }
        });
        jPanel4.add(jBactualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 30, 28));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Sistema de Gestion para Biblioteca75. Controle y administre de forma optica y fail el flujo de prestamos y devoluciones de libros");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 660, 120));

        jLfecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLfecha.setForeground(new java.awt.Color(51, 51, 51));

        jLhora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLhora.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Bienvenidos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLhora, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLhora, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void jBactualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizaActionPerformed

        ArrayList<String> frases = new ArrayList<>();
        frases.add("La lectura es una conversación con los mejores amigos.");
        frases.add("Un libro abierto es un cerebro que habla;"
            + " cerrado, un amigo que espera; "
            + "olvidado, un alma que perdona;"
            + " destruido, un corazón que llora." );
        frases.add("La creatividad es la inteligencia divirtiéndose." );
        frases.add("El éxito es la suma de pequeños esfuerzos repetidos día tras día." );
        frases.add("Un libro es un sueño que tienes en tus manos.");
        frases.add("Leer es viajar sin moverse.");
        frases.add("La lectura es a la mente lo que el ejercicio al cuerpo.");

        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(frases.size());

        jLfrase.setText(frases.get(indiceAleatorio));
    }//GEN-LAST:event_jBactualizaActionPerformed

    
    private void mostrarFecha(){
        Date fechaActual= new Date();
        SimpleDateFormat formatofecha= new SimpleDateFormat("EEEE dd 'de' MMMM  'de' YYYY");
        String fechaFormateada= formatofecha.format(fechaActual);
        jLfecha.setText(fechaFormateada);
        
    }
    
    

public void FrasesAleatorias (){
     
        ArrayList<String> frases = new ArrayList<>();
        frases.add("La lectura es una conversación con los mejores amigos.");
        frases.add("Un libro abierto es un cerebro que habla; cerrado, un amigo que espera; "
                + "olvidado, un alma que perdona; destruido, un corazón que llora." );
        frases.add("La creatividad es la inteligencia divirtiéndose." );
        frases.add("El éxito es la suma de pequeños esfuerzos repetidos día tras día." );
        frases.add("Un libro es un sueño que tienes en tus manos.");
        frases.add("Leer es viajar sin moverse.");
        frases.add("La lectura es a la mente lo que el ejercicio al cuerpo.");
        
        
        
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(frases.size());
        
        
        System.out.println(frases.get(indiceAleatorio));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBactualiza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLfecha;
    private javax.swing.JLabel jLfrase;
    private javax.swing.JLabel jLhora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
