package Vista;

public class JFmenuInventario extends javax.swing.JFrame {
    
    public JFmenuInventario() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        CambiosColorBoton.configurarCambiosColor(jLingresos, jPingresos);
        CambiosColorBoton.configurarCambiosColor(jLegresos, jPegresos);
        CambiosColorBoton.configurarCambiosColor(jLadministracion, jPadministracion);
        CambiosColorBoton.configurarCambiosColor(jLcompras, jPcompras);
        CambiosColorBoton.configurarCambiosColor(jLreportes, jPreportes);
        CambiosColorBoton.configurarCambiosColor(jLsalir, jPsalir);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPadministracion = new javax.swing.JPanel();
        jLadministracion = new javax.swing.JLabel();
        jPingresos = new javax.swing.JPanel();
        jLingresos = new javax.swing.JLabel();
        jPegresos = new javax.swing.JPanel();
        jLegresos = new javax.swing.JLabel();
        jPsalir = new javax.swing.JPanel();
        jLsalir = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPcompras = new javax.swing.JPanel();
        jLcompras = new javax.swing.JLabel();
        jPreportes = new javax.swing.JPanel();
        jLreportes = new javax.swing.JLabel();
        jLimagenLogo = new javax.swing.JLabel();
        jLimagenDoodle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 134, 190));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INVENTARIO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 50));

        jPadministracion.setBackground(new java.awt.Color(153, 204, 255));

        jLadministracion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLadministracion.setForeground(new java.awt.Color(255, 255, 255));
        jLadministracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLadministracion.setText("ADMINISTRACIÓN");
        jLadministracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLadministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLadministracionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPadministracionLayout = new javax.swing.GroupLayout(jPadministracion);
        jPadministracion.setLayout(jPadministracionLayout);
        jPadministracionLayout.setHorizontalGroup(
            jPadministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPadministracionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLadministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPadministracionLayout.setVerticalGroup(
            jPadministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPadministracionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLadministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPadministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 270, 40));

        jPingresos.setBackground(new java.awt.Color(153, 204, 255));

        jLingresos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLingresos.setForeground(new java.awt.Color(255, 255, 255));
        jLingresos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLingresos.setText("INGRESOS");
        jLingresos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLingresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLingresosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPingresosLayout = new javax.swing.GroupLayout(jPingresos);
        jPingresos.setLayout(jPingresosLayout);
        jPingresosLayout.setHorizontalGroup(
            jPingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPingresosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPingresosLayout.setVerticalGroup(
            jPingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPingresosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPingresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 270, 40));

        jPegresos.setBackground(new java.awt.Color(153, 204, 255));

        jLegresos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLegresos.setForeground(new java.awt.Color(255, 255, 255));
        jLegresos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLegresos.setText("EGRESOS");
        jLegresos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLegresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLegresosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPegresosLayout = new javax.swing.GroupLayout(jPegresos);
        jPegresos.setLayout(jPegresosLayout);
        jPegresosLayout.setHorizontalGroup(
            jPegresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPegresosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLegresos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPegresosLayout.setVerticalGroup(
            jPegresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPegresosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLegresos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPegresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 270, 40));

        jPsalir.setBackground(new java.awt.Color(153, 204, 255));

        jLsalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLsalir.setForeground(new java.awt.Color(255, 255, 255));
        jLsalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLsalir.setText("SALIR");
        jLsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLsalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPsalirLayout = new javax.swing.GroupLayout(jPsalir);
        jPsalir.setLayout(jPsalirLayout);
        jPsalirLayout.setHorizontalGroup(
            jPsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPsalirLayout.createSequentialGroup()
                .addComponent(jLsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPsalirLayout.setVerticalGroup(
            jPsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPsalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 350, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        jLabel3.setText("HOSPITAL EPN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGISTRO CLIENTES");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 270, 50));

        jPcompras.setBackground(new java.awt.Color(153, 204, 255));

        jLcompras.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLcompras.setForeground(new java.awt.Color(255, 255, 255));
        jLcompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLcompras.setText("COMPRAS");
        jLcompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLcompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLcomprasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPcomprasLayout = new javax.swing.GroupLayout(jPcompras);
        jPcompras.setLayout(jPcomprasLayout);
        jPcomprasLayout.setHorizontalGroup(
            jPcomprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcomprasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLcompras, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPcomprasLayout.setVerticalGroup(
            jPcomprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcomprasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLcompras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPcompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, 40));

        jPreportes.setBackground(new java.awt.Color(153, 204, 255));

        jLreportes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLreportes.setForeground(new java.awt.Color(255, 255, 255));
        jLreportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLreportes.setText("REPORTES");
        jLreportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLreportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLreportesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPreportesLayout = new javax.swing.GroupLayout(jPreportes);
        jPreportes.setLayout(jPreportesLayout);
        jPreportesLayout.setHorizontalGroup(
            jPreportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPreportesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLreportes, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPreportesLayout.setVerticalGroup(
            jPreportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPreportesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLreportes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPreportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, 40));

        jLimagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin título-4.png"))); // NOI18N
        jPanel1.add(jLimagenLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLimagenDoodle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/doodle.jpg"))); // NOI18N
        jLimagenDoodle.setText("jLabel4");
        jPanel1.add(jLimagenDoodle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 290, 510));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 430, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLingresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLingresosMouseClicked
        ingresos ingre = new ingresos();
        ingre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLingresosMouseClicked

    private void jLadministracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLadministracionMouseClicked
        administracion admi = new administracion();
        admi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLadministracionMouseClicked

    private void jLegresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLegresosMouseClicked
        egresos egre = new egresos();
        egre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLegresosMouseClicked

    private void jLsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLsalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLsalirMouseClicked

    private void jLreportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLreportesMouseClicked
        reportes repor = new reportes();
        repor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLreportesMouseClicked

    private void jLcomprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLcomprasMouseClicked
        compras com = new compras();
        com.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLcomprasMouseClicked

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
            java.util.logging.Logger.getLogger(JFmenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFmenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFmenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFmenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFmenuInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLadministracion;
    private javax.swing.JLabel jLcompras;
    private javax.swing.JLabel jLegresos;
    private javax.swing.JLabel jLimagenDoodle;
    private javax.swing.JLabel jLimagenLogo;
    private javax.swing.JLabel jLingresos;
    private javax.swing.JLabel jLreportes;
    private javax.swing.JLabel jLsalir;
    private javax.swing.JPanel jPadministracion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPcompras;
    private javax.swing.JPanel jPegresos;
    private javax.swing.JPanel jPingresos;
    private javax.swing.JPanel jPreportes;
    private javax.swing.JPanel jPsalir;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
