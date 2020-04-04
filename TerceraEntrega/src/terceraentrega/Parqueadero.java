package terceraentrega;

public class Parqueadero extends javax.swing.JFrame {

    public Parqueadero() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregar = new javax.swing.JPanel();
        Info1 = new javax.swing.JLabel();
        nProp = new javax.swing.JTextField();
        mVel = new javax.swing.JTextField();
        pVel = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        hora = new javax.swing.JTextField();
        min = new javax.swing.JTextField();
        am = new javax.swing.JRadioButton();
        pm = new javax.swing.JRadioButton();
        Info2 = new javax.swing.JLabel();
        bicicleta = new javax.swing.JButton();
        moto = new javax.swing.JButton();
        carro = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        pres = new javax.swing.JLabel();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(999, 999));
        setMinimumSize(new java.awt.Dimension(1, 1));
        setPreferredSize(new java.awt.Dimension(560, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregar.setLayout(null);

        Info1.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        Info1.setText("INGRESE LOS SIGUIENTES DATOS:");
        agregar.add(Info1);
        Info1.setBounds(20, 10, 320, 24);

        nProp.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        nProp.setText("Nombre del Propietario");
        agregar.add(nProp);
        nProp.setBounds(20, 50, 250, 25);

        mVel.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        mVel.setText("Model del vehiculo");
        mVel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVelActionPerformed(evt);
            }
        });
        agregar.add(mVel);
        mVel.setBounds(290, 50, 250, 25);

        pVel.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        pVel.setText("Placa del vehiculo");
        agregar.add(pVel);
        pVel.setBounds(20, 90, 250, 25);

        año.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        año.setText("AA");
        agregar.add(año);
        año.setBounds(20, 130, 45, 20);

        mes.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        mes.setText("MM");
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        agregar.add(mes);
        mes.setBounds(70, 130, 45, 20);

        dia.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        dia.setText("DD");
        agregar.add(dia);
        dia.setBounds(120, 130, 45, 20);

        hora.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        hora.setText("Hora");
        agregar.add(hora);
        hora.setBounds(20, 160, 45, 20);

        min.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        min.setText("Min");
        agregar.add(min);
        min.setBounds(70, 160, 45, 20);

        am.setText("am");
        agregar.add(am);
        am.setBounds(120, 160, 50, 23);

        pm.setText("pm");
        agregar.add(pm);
        pm.setBounds(170, 160, 50, 23);

        Info2.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        Info2.setText("¿QUE TIPO DE VEHICULO ES?");
        agregar.add(Info2);
        Info2.setBounds(20, 210, 320, 24);

        bicicleta.setText("BICICLETA");
        agregar.add(bicicleta);
        bicicleta.setBounds(20, 250, 100, 50);

        moto.setText("MOTO");
        agregar.add(moto);
        moto.setBounds(140, 250, 100, 50);

        carro.setText("CARRO");
        agregar.add(carro);
        carro.setBounds(260, 250, 100, 50);

        nuevo.setFont(new java.awt.Font("Consolas", 3, 20)); // NOI18N
        nuevo.setText("AGREGAR VEHICULO");
        agregar.add(nuevo);
        nuevo.setBounds(20, 330, 340, 50);

        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 564, 391));

        pres.setFont(new java.awt.Font("Consolas", 1, 33)); // NOI18N
        pres.setText("PARQUEADERO");
        getContentPane().add(pres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 75, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
        Principal ob = new Principal();
        ob.setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesActionPerformed

    private void mVelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVelActionPerformed
     
        
        
    }//GEN-LAST:event_mVelActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Info1;
    private javax.swing.JLabel Info2;
    private javax.swing.JPanel agregar;
    private javax.swing.JRadioButton am;
    private javax.swing.JTextField año;
    private javax.swing.JButton bicicleta;
    private javax.swing.JButton carro;
    private javax.swing.JTextField dia;
    private javax.swing.JTextField hora;
    private javax.swing.JTextField mVel;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField min;
    private javax.swing.JButton moto;
    private javax.swing.JTextField nProp;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField pVel;
    private javax.swing.JRadioButton pm;
    private javax.swing.JLabel pres;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
