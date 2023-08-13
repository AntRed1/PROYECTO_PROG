package gui;

import conexion.ConexionSQL;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import logica.Productos;

public class Actualizar_Registo_Productos extends javax.swing.JFrame {

    public Actualizar_Registo_Productos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_Actualizar_Productos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtActualizar_NombreProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtActualizar_PrecioProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtActualizar_StockProducto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jbtn_Actualizar_productos = new javax.swing.JButton();
        txtActualizar_MarcaProducto = new javax.swing.JTextField();
        txtActualizar_CategoriaProducto = new javax.swing.JTextField();
        jbtn_volver_atras_tabla_productos = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtActualizar_Id_Producto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_Actualizar_Productos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 0, 24))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Producto");

        txtActualizar_NombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizar_NombreProductoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Marca Producto");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Categoria Producto");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio Producto");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("StockProducto");

        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jbtn_Actualizar_productos.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\Guadar.png")); // NOI18N
        jbtn_Actualizar_productos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_Actualizar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Actualizar_productosActionPerformed(evt);
            }
        });

        txtActualizar_MarcaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizar_MarcaProductoActionPerformed(evt);
            }
        });

        txtActualizar_CategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizar_CategoriaProductoActionPerformed(evt);
            }
        });

        jbtn_volver_atras_tabla_productos.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\Volver_Atras.png")); // NOI18N
        jbtn_volver_atras_tabla_productos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_volver_atras_tabla_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volver_atras_tabla_productosActionPerformed(evt);
            }
        });

        jSeparator2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Id_Producto");

        javax.swing.GroupLayout jp_Actualizar_ProductosLayout = new javax.swing.GroupLayout(jp_Actualizar_Productos);
        jp_Actualizar_Productos.setLayout(jp_Actualizar_ProductosLayout);
        jp_Actualizar_ProductosLayout.setHorizontalGroup(
            jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Actualizar_ProductosLayout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_Actualizar_ProductosLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jbtn_Actualizar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jbtn_volver_atras_tabla_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jp_Actualizar_ProductosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_Actualizar_ProductosLayout.createSequentialGroup()
                        .addGroup(jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtActualizar_NombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtActualizar_PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtActualizar_MarcaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtActualizar_CategoriaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtActualizar_Id_Producto)))
                    .addGroup(jp_Actualizar_ProductosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtActualizar_StockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_Actualizar_ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        jp_Actualizar_ProductosLayout.setVerticalGroup(
            jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Actualizar_ProductosLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActualizar_Id_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtActualizar_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtActualizar_MarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtActualizar_CategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActualizar_PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtActualizar_StockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_Actualizar_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_Actualizar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_volver_atras_tabla_productos))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Actualizar_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Actualizar_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jp_Actualizar_Productos.getAccessibleContext().setAccessibleName("Actualizar Productos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtActualizar_NombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizar_NombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualizar_NombreProductoActionPerformed

    private void jbtn_Actualizar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Actualizar_productosActionPerformed
        ConexionSQL metodos = new ConexionSQL();
        Productos produ = new Productos();

        if (txtActualizar_NombreProducto.getText().isEmpty() || txtActualizar_MarcaProducto.getText().isEmpty() || txtActualizar_CategoriaProducto.getText().isEmpty() || txtActualizar_PrecioProducto.getText().isEmpty() || txtActualizar_StockProducto.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Existen espacios vacios, Favor de verificar.");
        } else {

            try {
                int precio = Integer.parseInt(txtActualizar_PrecioProducto.getText());
                int stock = Integer.parseInt(txtActualizar_StockProducto.getText());
                int id_producto = Integer.parseInt(txtActualizar_Id_Producto.getText());

                produ.setNombreProducto(txtActualizar_NombreProducto.getText());
                produ.setMarcaProducto(txtActualizar_MarcaProducto.getText());
                produ.setCategoriaProducto(txtActualizar_CategoriaProducto.getText());
                produ.setPrecioProducto(precio);
                produ.setStockProducto(stock);
                produ.setId_Producto(id_producto);

                metodos.modificar(produ);
                JOptionPane.showInternalMessageDialog(null, "Actualizacion exitosa!️");
                Principal_Table_Productos ptp = new Principal_Table_Productos();
                ptp.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {

                ex.printStackTrace(System.out);

            }
        }

    }//GEN-LAST:event_jbtn_Actualizar_productosActionPerformed

    private void txtActualizar_MarcaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizar_MarcaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualizar_MarcaProductoActionPerformed

    private void txtActualizar_CategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizar_CategoriaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualizar_CategoriaProductoActionPerformed

    private void jbtn_volver_atras_tabla_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volver_atras_tabla_productosActionPerformed
        Principal_Table_Productos ptp = new Principal_Table_Productos();
        ptp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_volver_atras_tabla_productosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtn_Actualizar_productos;
    private javax.swing.JButton jbtn_volver_atras_tabla_productos;
    private javax.swing.JPanel jp_Actualizar_Productos;
    private javax.swing.JTextField txtActualizar_CategoriaProducto;
    private javax.swing.JTextField txtActualizar_Id_Producto;
    private javax.swing.JTextField txtActualizar_MarcaProducto;
    private javax.swing.JTextField txtActualizar_NombreProducto;
    private javax.swing.JTextField txtActualizar_PrecioProducto;
    private javax.swing.JTextField txtActualizar_StockProducto;
    // End of variables declaration//GEN-END:variables
}
