

package miniproyectopoo2;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    
    private DefaultTableModel modelo;

    public VentanaPrincipal() {
        initComponents();
        modelo= getModeloTabla();        
    }
    
    //Metodo para obtener el modelo de la tabla
    public DefaultTableModel getModeloTabla() {
        return (DefaultTableModel) getTabla().getModel();
    }

    //OBTENER TABLA
    public JTable getTabla() {
        return jTable1;
    }

    //metodo para obtener modelo y tabla.
    //METODO PARA PANEL USUARIO, PARA MANEJAR MEJOR UNA SOLA INSTANCIA EN CADA CASO.
    public void configPanelUsuario(VentanaInicio ventanaInicio) {
        PanelUsuario panelUsuario = new PanelUsuario();
        panelUsuario.setVentanaPrincipal(this);
        panelUsuario.setVentanaInicio(ventanaInicio);
        cambiarPanelContenedor2(panelUsuario);
    }

    //METODO PARA PANEL ADMIN, PARA MANEJAR UNA SOLA INSTANCIA EN CADA CASO.
    public void configPanelAdmin(VentanaInicio ventanaInicio) {
        panelAdmin panelAdmin = new panelAdmin();
        panelAdmin.setVentanaPrincipal(this);
        panelAdmin.setVentanaInicio(ventanaInicio);
        cambiarPanelContenedor2(panelAdmin);
    }

  

    //METODO PARA CAMBIAR EL CONTENIDO DEL SEGUNDO PANEL
    public void cambiarPanelContenedor2(JPanel nuevoPanel) {
        panelContenedor2.removeAll();
        panelContenedor2.setLayout(new BorderLayout());
        panelContenedor2.add(nuevoPanel);
        panelContenedor2.revalidate();
        panelContenedor2.repaint();
        nuevoPanel.setFocusable(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelContenedor2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "PRECIO", "CATEGORIA", "IMAGEN"
            }
        ));
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("SE ABRE ");

        javax.swing.GroupLayout panelContenedor2Layout = new javax.swing.GroupLayout(panelContenedor2);
        panelContenedor2.setLayout(panelContenedor2Layout);
        panelContenedor2Layout.setHorizontalGroup(
            panelContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedor2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(343, 343, 343))
        );
        panelContenedor2Layout.setVerticalGroup(
            panelContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedor2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContenedor1Layout = new javax.swing.GroupLayout(panelContenedor1);
        panelContenedor1.setLayout(panelContenedor1Layout);
        panelContenedor1Layout.setHorizontalGroup(
            panelContenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(panelContenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelContenedor1Layout.setVerticalGroup(
            panelContenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedor1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelContenedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JPanel panelContenedor1;
    private javax.swing.JPanel panelContenedor2;
    // End of variables declaration//GEN-END:variables
}
