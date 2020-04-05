package terceraentrega;

public class Parqueadero extends javax.swing.JFrame {

    public Parqueadero() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioBotones = new javax.swing.ButtonGroup();
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
        Info2 = new javax.swing.JLabel();
        bicicleta = new javax.swing.JButton();
        moto = new javax.swing.JButton();
        carro = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        am_pm = new javax.swing.JPanel();
        am = new javax.swing.JRadioButton();
        pm = new javax.swing.JRadioButton();
        pres = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Info3 = new javax.swing.JLabel();
        mosCarro = new javax.swing.JLabel();
        mosMoto = new javax.swing.JLabel();
        mosBicicleta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(1500, 700));
        setMinimumSize(new java.awt.Dimension(1, 1));
        setPreferredSize(new java.awt.Dimension(560, 595));
        setResizable(false);
        setSize(new java.awt.Dimension(565, 565));
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

        Info2.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        Info2.setText("¿QUE TIPO DE VEHICULO ES?");
        agregar.add(Info2);
        Info2.setBounds(20, 210, 320, 24);

        bicicleta.setText("BICICLETA");
        bicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bicicletaActionPerformed(evt);
            }
        });
        agregar.add(bicicleta);
        bicicleta.setBounds(20, 250, 100, 50);

        moto.setText("MOTO");
        moto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motoActionPerformed(evt);
            }
        });
        agregar.add(moto);
        moto.setBounds(140, 250, 100, 50);

        carro.setText("CARRO");
        carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carroActionPerformed(evt);
            }
        });
        agregar.add(carro);
        carro.setBounds(260, 250, 100, 50);

        nuevo.setFont(new java.awt.Font("Consolas", 3, 20)); // NOI18N
        nuevo.setText("AGREGAR VEHICULO");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        agregar.add(nuevo);
        nuevo.setBounds(20, 330, 340, 50);

        radioBotones.add(am);
        am.setText("am");
        am_pm.add(am);

        radioBotones.add(pm);
        pm.setText("pm");
        pm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmActionPerformed(evt);
            }
        });
        am_pm.add(pm);

        agregar.add(am_pm);
        am_pm.setBounds(120, 150, 100, 30);

        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 141, 564, 380));

        pres.setFont(new java.awt.Font("Consolas", 1, 33)); // NOI18N
        pres.setText("PARQUEADERO");
        getContentPane().add(pres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 75, -1));

        jPanel1.setLayout(null);

        Info3.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        Info3.setText("CAPACIDAD DEL PARQUEADERO");
        jPanel1.add(Info3);
        Info3.setBounds(20, 10, 280, 24);

        mosCarro.setText("De x vehiculos hay: 0");
        jPanel1.add(mosCarro);
        mosCarro.setBounds(20, 60, 250, 20);

        mosMoto.setText("De x motos hay: 0");
        jPanel1.add(mosMoto);
        mosMoto.setBounds(20, 35, 250, 20);

        mosBicicleta.setText("De x bicicletas hay: 0");
        jPanel1.add(mosBicicleta);
        mosBicicleta.setBounds(270, 35, 250, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 570, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
        Principal ob = new Principal();
        ob.setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed

    }//GEN-LAST:event_mesActionPerformed
    private void mVelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVelActionPerformed
      
    }//GEN-LAST:event_mVelActionPerformed
    private void bicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bicicletaActionPerformed

    }//GEN-LAST:event_bicicletaActionPerformed
    private void motoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motoActionPerformed

    }//GEN-LAST:event_motoActionPerformed
    private void carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carroActionPerformed

    }//GEN-LAST:event_carroActionPerformed
    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed

    }//GEN-LAST:event_nuevoActionPerformed

    private void pmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pmActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parqueadero().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Info1;
    private javax.swing.JLabel Info2;
    private javax.swing.JLabel Info3;
    private javax.swing.JPanel agregar;
    private javax.swing.JRadioButton am;
    private javax.swing.JPanel am_pm;
    private javax.swing.JTextField año;
    private javax.swing.JButton bicicleta;
    private javax.swing.JButton carro;
    private javax.swing.JTextField dia;
    private javax.swing.JTextField hora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mVel;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField min;
    private javax.swing.JLabel mosBicicleta;
    private javax.swing.JLabel mosCarro;
    private javax.swing.JLabel mosMoto;
    private javax.swing.JButton moto;
    private javax.swing.JTextField nProp;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField pVel;
    private javax.swing.JRadioButton pm;
    private javax.swing.JLabel pres;
    private javax.swing.ButtonGroup radioBotones;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
