/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproyectopoo2;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author luisc
 */
public class VentanaInicio extends javax.swing.JFrame {

    private PanelUsuario panelUsuario;
    private panelAdmin panelAdmin;
    private VentanaPrincipal ventanaPrincipal;

    public VentanaInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo1 = new javax.swing.JLabel();
        etiquetaTitulo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botonContinuar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAyuda = new javax.swing.JMenu();
        menuItemAcercaDe = new javax.swing.JMenuItem();
        jMenuInfo = new javax.swing.JMenu();
        menuItemContacto = new javax.swing.JMenuItem();
        menuItemSoporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        etiquetaTitulo1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        etiquetaTitulo1.setText("BIENVENIDO");
        etiquetaTitulo1.setFocusable(false);

        etiquetaTitulo2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        etiquetaTitulo2.setText("TIENDA TECNOLOGICA VIRTUAL ");
        etiquetaTitulo2.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("PARA CONOCER NUESTROS PRODUCTOS, DALE AL BOTON :)");
        jLabel1.setFocusable(false);

        botonContinuar.setText("CONTINUAR");
        botonContinuar.setFocusable(false);
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });

        botonSalir.setText("SALIR");
        botonSalir.setFocusable(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jMenuBar1.setFocusable(false);

        jMenuAyuda.setText("Ayuda");

        menuItemAcercaDe.setText("Acerda de...");
        menuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenuAyuda.add(menuItemAcercaDe);

        jMenuBar1.add(jMenuAyuda);

        jMenuInfo.setText("Info");

        menuItemContacto.setText("Contactanos");
        menuItemContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemContactoActionPerformed(evt);
            }
        });
        jMenuInfo.add(menuItemContacto);

        menuItemSoporte.setText("Soporte");
        menuItemSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSoporteActionPerformed(evt);
            }
        });
        jMenuInfo.add(menuItemSoporte);

        jMenuBar1.add(jMenuInfo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(botonContinuar)
                .addGap(136, 136, 136)
                .addComponent(botonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo1)
                        .addGap(326, 326, 326))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo2)
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(179, 179, 179))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(etiquetaTitulo1)
                .addGap(18, 18, 18)
                .addComponent(etiquetaTitulo2)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.configPanelUsuario(this);
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_botonContinuarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void menuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAcercaDeActionPerformed
        String mensaje = "SOMOS TIENDA VIRTUAL PARA COMPRAR PRODUCTOS TECNOLOGICOS\n"
                + "\n"
                + "PARA CONOCER NUESTROS PRODUCTOS, DALE CLICK AL BOTON CONTINUAR!\n"
                + "\n"
                + "TODOS NUESTROS CANALES DE AYUDA Y SOPORTE, ESTAN EN NUESTRA OPCION DE 'INFO'";
        JOptionPane.showMessageDialog(this, mensaje, "AYUDA", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_menuItemAcercaDeActionPerformed

    private void menuItemContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemContactoActionPerformed
        String mensaje = "PARA COMUNICARTE CON NOSOTROS HAZLO POR ESTOS CANALES:\n"
                + "\n"
                + "FACEBOOK: tiendavirtualluisito\n"
                + "\n"
                + "INSTAGRAM: @virtualtiendaluisito\n"
                + "\n"
                + "WHATSAPP: 1234556\n"
                + "\n"
                + "SI REQUIERES CUALQUIER TIPO DE AYUDA O SOPORTE, EN LA OPCION 'SOPORTE' ESTAN LOS CONTACTOS ESPECIALIZADOS";

        JOptionPane.showMessageDialog(this, mensaje, "CONTACTANOS", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItemContactoActionPerformed

    private void menuItemSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSoporteActionPerformed
        String mensaje = "SI REQUIERES UN SOPORTE ESPECALIZADO O HABLAR CON UNO DE NUESTROS ASESORES, TENEMOS LOS SIGUIENTES CANALES:\n"
                + "\n"
                + "CORREO ELECTRONICO: tiendavirtualluisito@gmail.com y soportevirtualtiendaluisito@gmail.com \n "
                + "\n"
                + "WHATSAPP: 098765431\n"
                + "\n"
                + "POR ESTOS CANALES NUESTROS ASESORES ESTARAN DISPONIBLES ANTE CUALQUIER DUDA O INQUIETUD!";

        JOptionPane.showMessageDialog(this, mensaje, "SOPORTE", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_menuItemSoporteActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        ventanaPrincipal = new VentanaPrincipal();
        if (evt.getKeyCode() == KeyEvent.VK_A) {
            ventanaPrincipal.configPanelAdmin(this);
            ventanaPrincipal.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JLabel etiquetaTitulo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInfo;
    private javax.swing.JMenuItem menuItemAcercaDe;
    private javax.swing.JMenuItem menuItemContacto;
    private javax.swing.JMenuItem menuItemSoporte;
    // End of variables declaration//GEN-END:variables
}
