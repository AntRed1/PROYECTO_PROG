package gui;

import conexion.ConexionSQL;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import logica.Usuarios;

public class Actualizar_Registro_Usuarios extends javax.swing.JFrame {

    public Actualizar_Registro_Usuarios() {
        super("Actualizar Usuarios");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtActualizar_Id_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtActualizar_Username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtActualizar_Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtActualizar_Apellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtActualizar_Telefono = new javax.swing.JTextField();
        txtActualizar_Email = new javax.swing.JTextField();
        jbtn_volver_atras_tabla_productos = new javax.swing.JButton();
        jbtn_Actualizar_Clientes = new javax.swing.JButton();
        txtActualizar_Password = new javax.swing.JPasswordField();
        txtActualizar_Conf_Contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jSeparator2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Id_user:");

        txtActualizar_Id_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizar_Id_userActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username:");

        txtActualizar_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizar_UsernameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("<html>Confirmar Contraseña:</>");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Apellido:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Telefono:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Email:");

        jbtn_volver_atras_tabla_productos.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\Volver_Atras.png")); // NOI18N
        jbtn_volver_atras_tabla_productos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_volver_atras_tabla_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volver_atras_tabla_productosActionPerformed(evt);
            }
        });

        jbtn_Actualizar_Clientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\Guadar.png")); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtActualizar_Username)
                                            .addComponent(txtActualizar_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtActualizar_Id_user, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(txtActualizar_Password)
                                            .addComponent(txtActualizar_Conf_Contraseña)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtActualizar_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtActualizar_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtActualizar_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jbtn_Actualizar_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jbtn_volver_atras_tabla_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActualizar_Id_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtActualizar_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtActualizar_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualizar_Conf_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtActualizar_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtActualizar_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtActualizar_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActualizar_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtn_volver_atras_tabla_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_Actualizar_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtActualizar_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizar_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualizar_UsernameActionPerformed

    private void txtActualizar_Id_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizar_Id_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualizar_Id_userActionPerformed

    private void jbtn_volver_atras_tabla_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volver_atras_tabla_productosActionPerformed
        Principal_Table_Usuarios ptu = new Principal_Table_Usuarios();
        ptu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_volver_atras_tabla_productosActionPerformed

    private void jbtn_Actualizar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Actualizar_ClientesActionPerformed
        ConexionSQL metodos = new ConexionSQL();
        Usuarios user = new Usuarios();

        String pass = new String(txtActualizar_Password.getPassword());
        String passconf = new String(txtActualizar_Conf_Contraseña.getPassword());

        if (pass.equals(passconf)) {

            int id_cliente = Integer.parseInt(txtActualizar_Id_user.getText());

            user.setUsername(txtActualizar_Username.getText());
            user.setPassword(txtActualizar_Password.getText());
            user.setNombre(txtActualizar_Nombre.getText());
            user.setApellido(txtActualizar_Apellido.getText());
            user.setTelefono(txtActualizar_Telefono.getText());
            user.setEmail(txtActualizar_Email.getText());
            user.setId_user(id_cliente);

            if (txtActualizar_Id_user.getText().isEmpty() || txtActualizar_Username.getText().isEmpty() || txtActualizar_Password.getText().isEmpty() || txtActualizar_Conf_Contraseña.getText().isEmpty() || txtActualizar_Nombre.getText().isEmpty() || txtActualizar_Apellido.getText().isEmpty() || txtActualizar_Telefono.getText().isEmpty() || txtActualizar_Email.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Existen espacios vacios, Favor de verificar.");

            } else {
                try {
                    metodos.modificar(user);
                    JOptionPane.showInternalMessageDialog(null, "Actualizacion exitosa!️");
                    Principal_Table_Usuarios ptu = new Principal_Table_Usuarios();
                    ptu.setVisible(true);
                    this.dispose();

                } catch (SQLException ex) {

                    ex.printStackTrace(System.out);

                }

            }

        } else {
            JOptionPane.showInternalMessageDialog(null, "Las contraseñas no coinciden.");

        }

    }//GEN-LAST:event_jbtn_Actualizar_ClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtn_Actualizar_Clientes;
    private javax.swing.JButton jbtn_volver_atras_tabla_productos;
    private javax.swing.JTextField txtActualizar_Apellido;
    private javax.swing.JPasswordField txtActualizar_Conf_Contraseña;
    private javax.swing.JTextField txtActualizar_Email;
    private javax.swing.JTextField txtActualizar_Id_user;
    private javax.swing.JTextField txtActualizar_Nombre;
    private javax.swing.JPasswordField txtActualizar_Password;
    private javax.swing.JTextField txtActualizar_Telefono;
    private javax.swing.JTextField txtActualizar_Username;
    // End of variables declaration//GEN-END:variables
}
