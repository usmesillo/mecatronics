/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.com.gm.jdbc.mecatronics.interfaz;

import Datos.Fecha;
import Datos.MecatronicsDAO;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Jaime
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        PanelPrincipal p1=new PanelPrincipal();
        p1.setSize(690,420);
        p1.setLocation(0,0);
        contenido.removeAll();
        contenido.add(p1,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
       
        panelPrincipal.setBackground(new Color(19, 102, 192));
        labelFecha.setText(Fecha.darMesCompleto());
        labelBienvenido.setText("Bienvenido " +MecatronicsDAO.empleadoActual.getNombre());
        
        ajustarImagenes.ajustarImagen(logoCasa, "src/main/java/assets/imagenes/casa.png");
          ajustarImagenes.ajustarImagen(logoClientes, "src/main/java/assets/imagenes/clientes.png");
           ajustarImagenes.ajustarImagen(logoPlanes, "src/main/java/assets/imagenes/wifi.png");
         
        
    }
    
    public static void cambiarPanel(JPanel panel){
        panel.setSize(690,420);
        panel.setLocation(0,0);
        contenido.removeAll();
        contenido.add(panel,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelMecatronics = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        labelPrincipal = new javax.swing.JLabel();
        logoCasa = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        labelClientes = new javax.swing.JLabel();
        logoClientes = new javax.swing.JLabel();
        panelPlanes = new javax.swing.JPanel();
        labelPlanes = new javax.swing.JLabel();
        logoPlanes = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelFecha = new javax.swing.JLabel();
        labelBienvenido = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(13, 73, 161));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMecatronics.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelMecatronics.setForeground(new java.awt.Color(255, 255, 255));
        labelMecatronics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMecatronics.setText("Mecatronics");
        labelMecatronics.setToolTipText("");
        labelMecatronics.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(labelMecatronics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 232, 52));

        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSeparator1.setMaximumSize(new java.awt.Dimension(50000, 32767));
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 20));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 83, 142, 6));

        jPanel3.setBackground(new java.awt.Color(16, 90, 171));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(16, 90, 171));

        labelPrincipal.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        labelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        labelPrincipal.setText("Principal");
        labelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPrincipalMouseClicked(evt);
            }
        });

        logoCasa.setText("jLabel2");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(labelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 237, 57));

        panelClientes.setBackground(new java.awt.Color(16, 90, 171));

        labelClientes.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        labelClientes.setForeground(new java.awt.Color(255, 255, 255));
        labelClientes.setText("Clientes");
        labelClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelClientesMouseClicked(evt);
            }
        });

        logoClientes.setText("jLabel2");

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(labelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(panelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, -1));

        panelPlanes.setBackground(new java.awt.Color(16, 90, 171));

        labelPlanes.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        labelPlanes.setForeground(new java.awt.Color(255, 255, 255));
        labelPlanes.setText("Planes");
        labelPlanes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPlanes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPlanesMouseClicked(evt);
            }
        });

        logoPlanes.setText("jLabel2");

        javax.swing.GroupLayout panelPlanesLayout = new javax.swing.GroupLayout(panelPlanes);
        panelPlanes.setLayout(panelPlanesLayout);
        panelPlanesLayout.setHorizontalGroup(
            panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlanesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPlanesLayout.setVerticalGroup(
            panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(labelPlanes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(panelPlanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 139, 232, 330));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        jPanel4.setBackground(new java.awt.Color(24, 118, 208));

        labelFecha.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setText("Fecha");

        labelBienvenido.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        labelBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        labelBienvenido.setText("Bienvenido");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(labelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 690, 190));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 690, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPrincipalMouseClicked
      
      panelPrincipal.setBackground(new Color(19, 102, 192));
      panelClientes.setBackground(new Color(16, 90, 171));
        panelPlanes.setBackground(new Color(16, 90, 171));
      
        PanelPrincipal p1=new PanelPrincipal();
        p1.setSize(690,420);
        p1.setLocation(0,0);
        contenido.removeAll();
        contenido.add(p1,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
      
    }//GEN-LAST:event_labelPrincipalMouseClicked

    private void labelClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelClientesMouseClicked
        panelClientes.setBackground(new Color(19, 102, 192));
        panelPrincipal.setBackground(new Color(16, 90, 171));
         panelPlanes.setBackground(new Color(16, 90, 171));
        PanelCliente p1=new PanelCliente();
        p1.setSize(690,420);
        p1.setLocation(0,0);
        contenido.removeAll();
        contenido.add(p1,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_labelClientesMouseClicked

    private void labelPlanesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPlanesMouseClicked
      
        panelPlanes.setBackground(new Color(19, 102, 192));
        panelClientes.setBackground(new Color(16, 90, 171));
        panelPrincipal.setBackground(new Color(16, 90, 171));
    }//GEN-LAST:event_labelPlanesMouseClicked

    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel contenido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelBienvenido;
    private javax.swing.JLabel labelClientes;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelMecatronics;
    private javax.swing.JLabel labelPlanes;
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JLabel logoCasa;
    private javax.swing.JLabel logoClientes;
    private javax.swing.JLabel logoPlanes;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelPlanes;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
