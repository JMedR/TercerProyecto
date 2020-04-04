package terceraentrega;

public class Parqueadero extends javax.swing.JFrame {
    // Aqui las variables globales
    int año,mes,dia,hora,min,seg,sel,agregar;
    
    public Parqueadero() {
        initComponents();
        
        
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nuevo = new javax.swing.JButton();
        textoMostrar = new javax.swing.JLabel();
        moto = new javax.swing.JButton();
        carro = new javax.swing.JButton();
        bicicleta = new javax.swing.JButton();
        recibirInfo = new javax.swing.JTextField();
        continuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("PARQUEADERO");

        nuevo.setText("Nuevo vehiculo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        textoMostrar.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        textoMostrar.setText("Seleccione el vehiculo que va a ingresar");

        moto.setText("MOTO");
        moto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motoActionPerformed(evt);
            }
        });

        carro.setText("CARRO");
        carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carroActionPerformed(evt);
            }
        });

        bicicleta.setText("BICICLETAS");
        bicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bicicletaActionPerformed(evt);
            }
        });

        recibirInfo.setEditable(false);
        recibirInfo.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        recibirInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibirInfoActionPerformed(evt);
            }
        });

        continuar.setText("Continuar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(continuar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(textoMostrar)
                        .addComponent(recibirInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(carro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bicicleta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nuevo)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(moto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(carro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recibirInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(continuar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Principal ob = new Principal();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        //String a;
        //a = jTextArea1.getText();
        //jTextArea2.setText(a);
        moto.setVisible(true);
        carro.setVisible(true);
        bicicleta.setVisible(true);
        textoMostrar.setText("Seleccione el vehiculo que va a ingresar");
        agregar = 0;
    }//GEN-LAST:event_nuevoActionPerformed
    private void motoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motoActionPerformed
        //textoMostrar.setText(String.valueOf(validacion)); >>Mostrar un int como string
        moto.setVisible(false);
        carro.setVisible(false);
        bicicleta.setVisible(false);
        
        
        
    }//GEN-LAST:event_motoActionPerformed
    private void carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carroActionPerformed
        moto.setVisible(false);
        carro.setVisible(false);
        bicicleta.setVisible(false);   
        
        
        
    }//GEN-LAST:event_carroActionPerformed
    private void bicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bicicletaActionPerformed
        moto.setVisible(false);
        carro.setVisible(false);
        bicicleta.setVisible(false);    
        
        
        
    }//GEN-LAST:event_bicicletaActionPerformed

    private void recibirInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibirInfoActionPerformed
    }//GEN-LAST:event_recibirInfoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parqueadero().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bicicleta;
    private javax.swing.JButton carro;
    private javax.swing.JButton continuar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton moto;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField recibirInfo;
    private javax.swing.JLabel textoMostrar;
    // End of variables declaration//GEN-END:variables
}
