
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 
 * 
 * 
 */
public class calculoTriangulos extends javax.swing.JApplet {

    private Object JoptionPanel;

    /**
     * Initializes the applet calculoTriangulos
     * 
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(calculoTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculoTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculoTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculoTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TextLadoA = new javax.swing.JTextField();
        TextLadoC = new javax.swing.JTextField();
        Cantidad = new javax.swing.JLabel();
        TextLadoB = new javax.swing.JTextField();
        TextAltura = new javax.swing.JTextField();
        Cantidad1 = new javax.swing.JLabel();
        Cantidad2 = new javax.swing.JLabel();
        Cantidad3 = new javax.swing.JLabel();
        TextSalidaAngulo = new javax.swing.JTextField();
        TextSalidaArea = new javax.swing.JTextField();
        BtnCalcular = new javax.swing.JToggleButton();
        BtnLimpiar = new javax.swing.JButton();
        dyd = new javax.swing.JLabel();
        TextSalidaNombre1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CALCULAR TRIANGULO");

        TextLadoA.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TextLadoC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Cantidad.setText("Lado A");

        TextLadoB.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TextAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAlturaActionPerformed(evt);
            }
        });

        Cantidad1.setText("Lado B");

        Cantidad2.setText("Lado C");
        Cantidad2.setToolTipText("");

        Cantidad3.setText("Altura");

        TextSalidaAngulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextSalidaAngulo.setEnabled(false);

        TextSalidaArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextSalidaArea.setEnabled(false);

        BtnCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnCalcular.setText("CALCULAR");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });

        BtnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        TextSalidaNombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextSalidaNombre1.setEnabled(false);

        jLabel2.setText("El lado B, se toma como la Base");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dyd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextSalidaAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(83, 83, 83)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(Cantidad)
                                                    .addGap(100, 100, 100)
                                                    .addComponent(Cantidad1)
                                                    .addGap(81, 81, 81)
                                                    .addComponent(Cantidad2))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(58, 58, 58)
                                            .addComponent(TextLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(54, 54, 54)
                                            .addComponent(TextLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(49, 49, 49)
                                            .addComponent(TextLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(78, 78, 78)
                                    .addComponent(Cantidad3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(442, 442, 442)
                                    .addComponent(TextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(BtnCalcular)
                                            .addGap(56, 56, 56)
                                            .addComponent(BtnLimpiar))))))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextSalidaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(152, Short.MAX_VALUE)
                    .addComponent(TextSalidaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(99, 99, 99)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cantidad)
                    .addComponent(Cantidad1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cantidad2)
                        .addComponent(Cantidad3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCalcular)
                    .addComponent(BtnLimpiar))
                .addGap(87, 87, 87)
                .addComponent(TextSalidaAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(TextSalidaArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(dyd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(251, Short.MAX_VALUE)
                    .addComponent(TextSalidaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(133, 133, 133)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAlturaActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        String altura = TextAltura.getText();
        double ladoa = Double.parseDouble(TextLadoA.getText());
        double ladob = Double.parseDouble(TextLadoB.getText());
        double ladoc = Double.parseDouble(TextLadoC.getText());
        
        String triangulo = null;         
        double cosenoa;          
        double cosenob;         
        double cosenoc;           
        
        double convera;        
        double converb;   
        double converc;  


        cosenoa = ((ladob*ladob)+(ladoc*ladoc)-(ladoa*ladoa)) / (-2*(ladoc*ladob));
        cosenob = ((ladoa*ladoa)+(ladoc*ladoc)-(ladob*ladob)) / (-2*(ladoc*ladoa));
        cosenoc = ((ladoc*ladoc)+(ladoa*ladoa)-(ladoc*ladoc)) / (-2*(ladoa*ladob));
        
        convera = Math.toDegrees(Math.acos(cosenoa));        
        converc = Math.toDegrees(Math.acos(cosenob));
        converb = Math.toDegrees(Math.acos(cosenoc));
        
        double area = ladob* Double.parseDouble(altura)/ 2;

        if(altura.length() == 0 ){
            JOptionPane.showMessageDialog(this, "No debe haber campo Vacios");
           // TextSalidaNombre.setText("No tiene altura");
        } else if(ladoa==ladob && ladoa==ladoc){
            triangulo="Equilátero";
             TextSalidaNombre1.setText("El triangulo es : "+ triangulo);
        }else if(ladoa==ladob | ladoc==ladob | ladoa==ladoc ){
              triangulo="Isósceles";         
              TextSalidaNombre1.setText("El triangulo es : "+ triangulo);
         }else{ 
            triangulo="Escaleno";
            TextSalidaNombre1.setText("El triangulo es : "+ triangulo);
         }
        
        switch (triangulo)
        {
            case "Equilátero": 
                TextSalidaAngulo.setText("El angul a es: " + convera +" el b"  + converb +" el C  "+ converc);
                TextSalidaArea.setText("el area es "+area);
                break;
             case "Isósceles":               
               
                TextSalidaAngulo.setText("El angul a es: " + convera +" el b"  + converb +" el C "+ converc );
                TextSalidaArea.setText("el area es "+area);
                break;
                
            case "Escaleno":               
                TextSalidaAngulo.setText("El angul a es: " + convera +" el b"  + converb +" el C "+ converc );
                TextSalidaArea.setText("el area es "+area);
                break;
        }
        dyd.setText("©D&D");
        
       
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TextAltura.setText("");
        TextLadoC.setText("");
        TextLadoB.setText("");
        TextLadoA.setText("");
        TextSalidaArea.setText("");        
        TextSalidaAngulo.setText("");
    }//GEN-LAST:event_BtnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnCalcular;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel Cantidad1;
    private javax.swing.JLabel Cantidad2;
    private javax.swing.JLabel Cantidad3;
    private javax.swing.JTextField TextAltura;
    private javax.swing.JTextField TextLadoA;
    private javax.swing.JTextField TextLadoB;
    private javax.swing.JTextField TextLadoC;
    private javax.swing.JTextField TextSalidaAngulo;
    private javax.swing.JTextField TextSalidaArea;
    private javax.swing.JTextField TextSalidaNombre1;
    private javax.swing.JLabel dyd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
