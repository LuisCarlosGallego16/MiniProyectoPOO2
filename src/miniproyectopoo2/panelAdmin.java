/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package miniproyectopoo2;

import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author luisc
 */
public class PanelAdmin extends javax.swing.JPanel {

    /**
     * Creates new form PanelAdmin
     */
    private VentanaPrincipal ventanaPrincipal;
    private VentanaInicio ventanaInicio;

    public PanelAdmin() {
        initComponents();
    }

    //Metodos para pasar las instancias a los panales.
    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public void setVentanaInicio(VentanaInicio ventanaInicio) {
        this.ventanaInicio = ventanaInicio;
    }

    //GETTERS FORMULARIO
    public String getCampoCodigoProducto() {
        return campoCodigoProducto.getText();
    }

    public String getCampoNombreProducto() {
        return campoNombreProducto.getText();
    }

    public String getCampoPrecioProducto() {
        return campoPrecioProducto.getText();
    }

    public String getCampoCategoriaProducto() {
        return campoCodigoProducto.getText();
    }

    public String getCampoImagenProducto() {
        return campoImagenProducto.getText();
    }

    //SETTERS FORMULARIO
    public void setCampoCodigoProducto(String texto) {
        this.campoCodigoProducto.setText(texto);

    }

    public void setCampoNombreProducto(String texto) {
        this.campoNombreProducto.setText(texto);
    }

    public void setCampoPrecioProducto(String texto) {
        this.campoPrecioProducto.setText(texto);
    }

    public void setCampoCategoriaProducto(String texto) {
        this.campoCategoriaProducto.setText(texto);
    }

    public void setCampoImagenProducto(String texto) {
        this.campoImagenProducto.setText(texto);
    }

    //Metodo para crear y guardar datos en archivo xml
    public void guardarXML(String nombreArchivo) {
        try {
            DefaultTableModel modelo = ventanaPrincipal.getModeloTabla();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = (Document) builder.newDocument();

            Element raiz = documento.createElement("productos");
            documento.appendChild(raiz);

            for (int i = 0; i < modelo.getRowCount(); i++) {
                Element producto = documento.createElement("producto");

                Element codigo = documento.createElement("codigo");
                codigo.appendChild(documento.createTextNode(modelo.getValueAt(i, 0).toString()));
                producto.appendChild(codigo);

                Element nombre = documento.createElement("nombre");
                nombre.appendChild(documento.createTextNode(modelo.getValueAt(i, 1).toString()));
                producto.appendChild(nombre);

                Element precio = documento.createElement("precio");
                precio.appendChild(documento.createTextNode(modelo.getValueAt(i, 2).toString()));
                producto.appendChild(precio);

                Element categoria = documento.createElement("categoria");
                categoria.appendChild(documento.createTextNode(modelo.getValueAt(i, 3).toString()));
                producto.appendChild(categoria);

                Element imagen = documento.createElement("imagen");
                categoria.appendChild(documento.createTextNode(modelo.getValueAt(i, 4).toString()));
                producto.appendChild(imagen);
                raiz.appendChild(producto);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource domSource = new DOMSource(documento);
            StreamResult streamResult = new StreamResult(new File(nombreArchivo));
            transformer.transform(domSource, streamResult);

            System.out.println("Archivo XML generado correctamente: " + nombreArchivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    
    
    public void cargarDesdeXML(String nombreArchivo) {
        try {
            DefaultTableModel modelo = ventanaPrincipal.getModeloTabla();
            File archivo = new File(nombreArchivo);

            // Verificar si el archivo existe
            if (!archivo.exists()) {
                System.out.println("El archivo XML no existe. Se creará uno nuevo cuando se guarde.");
                return;
            }

            // Cargar el archivo XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(archivo);

            // Obtener el nodo raíz y los nodos de productos
            NodeList listaProductos = documento.getElementsByTagName("producto");

            // Limpiar el modelo de la tabla
            modelo.setRowCount(0);

            //agregar las filas al modelo de la tabla
            for (int i = 0; i < listaProductos.getLength(); i++) {
                Node productoNode = listaProductos.item(i);

                if (productoNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element producto = (Element) productoNode;

                    String codigo = producto.getElementsByTagName("codigo").item(0).getTextContent();
                    String nombre = producto.getElementsByTagName("nombre").item(0).getTextContent();
                    String precio = producto.getElementsByTagName("precio").item(0).getTextContent();
                    String categoria = producto.getElementsByTagName("categoria").item(0).getTextContent();
                    String imagen = producto.getElementsByTagName("categoria").item(0).getTextContent();
                    // Agregar los datos al modelo de la tabla
                    modelo.addRow(new Object[]{codigo, nombre, precio, categoria, imagen});
                }
            }

            System.out.println("Datos cargados desde el archivo XML.");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los datos desde el archivo XML");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        etiquetaTitulo2 = new javax.swing.JLabel();
        etiquetaTitulo3 = new javax.swing.JLabel();
        etiquetaTitulo4 = new javax.swing.JLabel();
        etiquetaTitulo5 = new javax.swing.JLabel();
        etiquetaTitulo6 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        campoCodigoProducto = new javax.swing.JTextField();
        campoNombreProducto = new javax.swing.JTextField();
        campoPrecioProducto = new javax.swing.JTextField();
        campoCategoriaProducto = new javax.swing.JTextField();
        campoImagenProducto = new javax.swing.JTextField();
        botonCargar = new javax.swing.JButton();

        etiquetaTitulo1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        etiquetaTitulo1.setText("MODIFICACIONES DE PRODUCTOS");

        jButton1.setText("volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        etiquetaTitulo2.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        etiquetaTitulo2.setText("CODIGO PRODUCTO:");

        etiquetaTitulo3.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        etiquetaTitulo3.setText("NOMBRE PRODUCTO:");

        etiquetaTitulo4.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        etiquetaTitulo4.setText("PRECIO PRODUCTO:");

        etiquetaTitulo5.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        etiquetaTitulo5.setText("CATEGORIA PRODUCTO:");

        etiquetaTitulo6.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        etiquetaTitulo6.setText("IMAGEN PRODUCTO:");

        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonEditar.setText("EDITAR");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        campoCodigoProducto.setToolTipText("");

        botonCargar.setText("CARGAR");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaTitulo1)
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etiquetaTitulo4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaTitulo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNombreProducto)
                            .addComponent(campoPrecioProducto)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCategoriaProducto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoImagenProducto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCargar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(botonGuardar)
                .addGap(109, 109, 109)
                .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(botonEliminar)
                .addGap(89, 89, 89)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo2)
                    .addComponent(campoCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaTitulo3)
                    .addComponent(campoNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo4)
                    .addComponent(campoPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo5)
                    .addComponent(campoCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTitulo6)
                    .addComponent(campoImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCargar)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿ESTÁS SEGURO DE SALIR?", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            if (ventanaPrincipal != null) {
                ventanaPrincipal.dispose();
            }
            if (ventanaInicio != null) {
                ventanaInicio.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "TE HAZ QUEDADO");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        DefaultTableModel modelo = ventanaPrincipal.getModeloTabla();
        String codigoProducto = getCampoCodigoProducto();
        String nombreProducto = getCampoNombreProducto();
        String precioProducto = getCampoPrecioProducto();
        String categoriaProducto = getCampoCategoriaProducto();
        String imagenProducto = getCampoImagenProducto();

        if (codigoProducto.isEmpty() || nombreProducto.isEmpty() || precioProducto.isEmpty() || categoriaProducto.isEmpty() || imagenProducto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "TODOS LOS CAMPOS DEBEN DE ESTAR COMPLETOS", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {
            Object nuevaFila[] = {codigoProducto, nombreProducto, precioProducto, categoriaProducto, imagenProducto};
            modelo.addRow(nuevaFila);

            campoCodigoProducto.setText("");
            campoNombreProducto.setText("");
            campoPrecioProducto.setText("");
            campoCategoriaProducto.setText("");
            campoImagenProducto.setText("");
            guardarXML("productos.xml");

        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        DefaultTableModel modelo = ventanaPrincipal.getModeloTabla();
        int filaSeleccionada = ventanaPrincipal.obtenerFila();
        if (filaSeleccionada != -1) {
            String codigoProducto = getCampoCodigoProducto();
            String nombreProducto = getCampoNombreProducto();
            String precioProducto = getCampoPrecioProducto();
            String categoriaProducto = getCampoCategoriaProducto();
            String imagenProducto = getCampoImagenProducto();

            if (codigoProducto.isEmpty() || nombreProducto.isEmpty() || precioProducto.isEmpty() || categoriaProducto.isEmpty() || imagenProducto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "TODOS LOS CAMPOS DEBEN DE ESTAR COMPLETOS", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            } else {

                modelo.setValueAt(codigoProducto, filaSeleccionada, 0);
                modelo.setValueAt(nombreProducto, filaSeleccionada, 1);
                modelo.setValueAt(precioProducto, filaSeleccionada, 2);
                modelo.setValueAt(categoriaProducto, filaSeleccionada, 3);
                modelo.setValueAt(imagenProducto, filaSeleccionada, 4);
                guardarXML("productos.xml");

                campoCodigoProducto.setText("");
                campoNombreProducto.setText("");
                campoPrecioProducto.setText("");
                campoCategoriaProducto.setText("");
                campoImagenProducto.setText("");
            }
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        DefaultTableModel modelo = ventanaPrincipal.getModeloTabla();
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿ESTAS SEGURO DE ELIMINAR EL PRODUCTO?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            int filaSeleccionada = ventanaPrincipal.obtenerFila();
            if (filaSeleccionada != -1) {
                modelo.removeRow(filaSeleccionada);
                guardarXML("productos.xml");
                campoCodigoProducto.setText("");
                campoNombreProducto.setText("");
                campoPrecioProducto.setText("");
                campoCategoriaProducto.setText("");
                campoImagenProducto.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "CANCELADO");
        }


    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        cargarDesdeXML("productos.xml");
    }//GEN-LAST:event_botonCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoCategoriaProducto;
    private javax.swing.JTextField campoCodigoProducto;
    private javax.swing.JTextField campoImagenProducto;
    private javax.swing.JTextField campoNombreProducto;
    private javax.swing.JTextField campoPrecioProducto;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JLabel etiquetaTitulo2;
    private javax.swing.JLabel etiquetaTitulo3;
    private javax.swing.JLabel etiquetaTitulo4;
    private javax.swing.JLabel etiquetaTitulo5;
    private javax.swing.JLabel etiquetaTitulo6;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
