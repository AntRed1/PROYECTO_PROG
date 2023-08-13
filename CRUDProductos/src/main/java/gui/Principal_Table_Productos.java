package gui;

import conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal_Table_Productos extends javax.swing.JFrame {

    public Principal_Table_Productos() {
        super("Tabla_Productos");
        initComponents();
        setLocationRelativeTo(null);

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtable_productos.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionSQL conn = new ConexionSQL();
            Connection con = conn.getConnection();

            String SQL_SELECT_PRO = "SELECT Id_Producto, NombreProducto, MarcaProducto, CategoriaProducto, PrecioProducto, StockProducto FROM productos";
            ps = con.prepareStatement(SQL_SELECT_PRO);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();

            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Id_Producto");
            modelo.addColumn("NombreProducto");
            modelo.addColumn("MarcaProducto");
            modelo.addColumn("CategoriaProducto");
            modelo.addColumn("PrecioProducto");
            modelo.addColumn("StockProducto");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {

                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);

            }

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_productos = new javax.swing.JTable();
        jbtn_atrasinterfaz_usuario_product = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jbtn_registrar_productos = new javax.swing.JButton();
        jbtn_borrar_productos = new javax.swing.JButton();
        jbtn_actualizar_registro_producto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos Registrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        jtable_productos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Producto", "NombreProducto", "MarcaProducto", "CategoriaProducto", "PrecioProducto", "StockProducto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_productos);

        jbtn_atrasinterfaz_usuario_product.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\Volver_Atras.png")); // NOI18N
        jbtn_atrasinterfaz_usuario_product.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_atrasinterfaz_usuario_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_atrasinterfaz_usuario_productActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jbtn_registrar_productos.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\Guadar.png")); // NOI18N
        jbtn_registrar_productos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_registrar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_registrar_productosActionPerformed(evt);
            }
        });

        jbtn_borrar_productos.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\borrar.png")); // NOI18N
        jbtn_borrar_productos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_borrar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_borrar_productosActionPerformed(evt);
            }
        });

        jbtn_actualizar_registro_producto.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\Update.png")); // NOI18N
        jbtn_actualizar_registro_producto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_actualizar_registro_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_actualizar_registro_productoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jbtn_registrar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jbtn_borrar_productos)
                        .addGap(67, 67, 67)
                        .addComponent(jbtn_actualizar_registro_producto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_atrasinterfaz_usuario_product)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbtn_registrar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_atrasinterfaz_usuario_product)
                    .addComponent(jbtn_borrar_productos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_actualizar_registro_producto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_atrasinterfaz_usuario_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_atrasinterfaz_usuario_productActionPerformed

        Interfaz_Usuarios_Productos IUP = new Interfaz_Usuarios_Productos();
        IUP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_atrasinterfaz_usuario_productActionPerformed

    private void jbtn_registrar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_registrar_productosActionPerformed

        Registo_Productos rp = new Registo_Productos();
        rp.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_jbtn_registrar_productosActionPerformed

    private void jbtn_borrar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_borrar_productosActionPerformed
        ConexionSQL delete = new ConexionSQL();
        DefaultTableModel dtm = new DefaultTableModel();
        PreparedStatement ps = null;

        try {
            JOptionPane.showMessageDialog(null, "Eliminado Correctamente.");
            Connection conn = delete.getConnection();
            int fila = jtable_productos.getSelectedRow();
            String codigo = jtable_productos.getValueAt(fila, 0).toString();

            ps = conn.prepareStatement("DELETE FROM productos WHERE Id_Producto = ?");
            ps.setString(1, codigo);
            ps.execute();

            dtm.removeRow(fila);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_jbtn_borrar_productosActionPerformed

    private void jbtn_actualizar_registro_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_actualizar_registro_productoActionPerformed
        Actualizar_Registo_Productos arp = new Actualizar_Registo_Productos();
        arp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_actualizar_registro_productoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtn_actualizar_registro_producto;
    private javax.swing.JButton jbtn_atrasinterfaz_usuario_product;
    private javax.swing.JButton jbtn_borrar_productos;
    private javax.swing.JButton jbtn_registrar_productos;
    private javax.swing.JTable jtable_productos;
    // End of variables declaration//GEN-END:variables
}
