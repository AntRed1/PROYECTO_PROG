package gui;

import conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal_Table_Usuarios extends javax.swing.JFrame {

    public Principal_Table_Usuarios() {
        super("Tabla_Usuarios");
        initComponents();
        setLocationRelativeTo(null);
        metodo_refresh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_clientes = new javax.swing.JTable();
        jbtn_atrasinterfaz_usuario_product = new javax.swing.JButton();
        btnRegistrarse_nuevo_cliente = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jbtn_borrar_cliente = new javax.swing.JButton();
        jbtn_Actualizar_Clientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Clientes Registrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        jtable_clientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_user", "Username", "Password", "Nombre", "Apellido", "Telefono", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_clientes);

        jbtn_atrasinterfaz_usuario_product.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\Volver_Atras.png")); // NOI18N
        jbtn_atrasinterfaz_usuario_product.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_atrasinterfaz_usuario_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_atrasinterfaz_usuario_productActionPerformed(evt);
            }
        });

        btnRegistrarse_nuevo_cliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\new.png")); // NOI18N
        btnRegistrarse_nuevo_cliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarse_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarse_nuevo_clienteActionPerformed(evt);
            }
        });

        jSeparator2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jbtn_borrar_cliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\borrar.png")); // NOI18N
        jbtn_borrar_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_borrar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_borrar_clienteActionPerformed(evt);
            }
        });

        jbtn_Actualizar_Clientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\Update_Clientes.png")); // NOI18N
        jbtn_Actualizar_Clientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_Actualizar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Actualizar_ClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnRegistrarse_nuevo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jbtn_borrar_cliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_Actualizar_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jbtn_atrasinterfaz_usuario_product, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbtn_borrar_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarse_nuevo_cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_Actualizar_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbtn_atrasinterfaz_usuario_product, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_atrasinterfaz_usuario_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_atrasinterfaz_usuario_productActionPerformed

        Interfaz_Usuarios_Productos IUP = new Interfaz_Usuarios_Productos();
        IUP.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jbtn_atrasinterfaz_usuario_productActionPerformed

    private void btnRegistrarse_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarse_nuevo_clienteActionPerformed
        Principal_Registro pr = new Principal_Registro();
        pr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarse_nuevo_clienteActionPerformed

    private void jbtn_borrar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_borrar_clienteActionPerformed
        ConexionSQL delete = new ConexionSQL();
        DefaultTableModel dtm = new DefaultTableModel();
        PreparedStatement ps = null;

        try {
            JOptionPane.showMessageDialog(null, "Eliminado Correctamente.");
            Connection conn = delete.getConnection();
            int fila = jtable_clientes.getSelectedRow();
            String codigo = jtable_clientes.getValueAt(fila, 0).toString();

            ps = conn.prepareStatement("DELETE FROM usuarios WHERE Id_user = ?");
            ps.setString(1, codigo);
            ps.execute();

            dtm.removeRow(fila);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }//GEN-LAST:event_jbtn_borrar_clienteActionPerformed

    private void jbtn_Actualizar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Actualizar_ClientesActionPerformed
        Actualizar_Registro_Usuarios aru = new Actualizar_Registro_Usuarios();
        aru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_Actualizar_ClientesActionPerformed

    void metodo_refresh() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtable_clientes.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionSQL conn = new ConexionSQL();
            Connection con = conn.getConnection();

            String SQL_SELECT_US = "SELECT ID_User, Username, Password, Nombre, Apellido, Telefono, Email FROM usuarios";
            ps = con.prepareStatement(SQL_SELECT_US);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();

            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Id_user");
            modelo.addColumn("Username");
            modelo.addColumn("Password");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Telefono");
            modelo.addColumn("Email");

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse_nuevo_cliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtn_Actualizar_Clientes;
    private javax.swing.JButton jbtn_atrasinterfaz_usuario_product;
    private javax.swing.JButton jbtn_borrar_cliente;
    private javax.swing.JTable jtable_clientes;
    // End of variables declaration//GEN-END:variables
}
