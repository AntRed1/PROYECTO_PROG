package gui;

import logica.Usuarios;
import conexion.ConexionSQL;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Principal_Registro extends javax.swing.JFrame {

    public Principal_Registro() {
        super("CRUD");
        initComponents();
        setLocationRelativeTo(null);
        this.dispose();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRegistroUsuario = new javax.swing.JTextField();
        txtRegistroConstrasena = new javax.swing.JPasswordField();
        btnRegistro_en_Tabla = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtRegistroConfirmarConstrasena = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtRegistroNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRegistroApellido = new javax.swing.JTextField();
        txtRegistroTelefono = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRegistroEmail = new javax.swing.JFormattedTextField();
        btnVolverAtras_Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel1.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña:");

        txtRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroUsuarioActionPerformed(evt);
            }
        });

        txtRegistroConstrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroConstrasenaActionPerformed(evt);
            }
        });

        btnRegistro_en_Tabla.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\Guadar.png")); // NOI18N
        btnRegistro_en_Tabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistro_en_Tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistro_en_TablaActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jSeparator2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("<html>Confirmar Contraseña:</>");

        txtRegistroConfirmarConstrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroConfirmarConstrasenaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Apellidos:");

        txtRegistroTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroTelefonoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Telefono:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Email:");

        txtRegistroEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroEmailActionPerformed(evt);
            }
        });

        btnVolverAtras_Login.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\Volver_Atras.png")); // NOI18N
        btnVolverAtras_Login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolverAtras_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAtras_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtRegistroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtRegistroApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtRegistroUsuario)
                                                    .addComponent(txtRegistroConstrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(txtRegistroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRegistroConfirmarConstrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtRegistroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnRegistro_en_Tabla)
                        .addGap(67, 67, 67)
                        .addComponent(btnVolverAtras_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRegistroConstrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistroConfirmarConstrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRegistroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRegistroApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistro_en_Tabla)
                    .addComponent(btnVolverAtras_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroUsuarioActionPerformed

    private void txtRegistroTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroTelefonoActionPerformed

    private void txtRegistroEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroEmailActionPerformed

    private void btnRegistro_en_TablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro_en_TablaActionPerformed

        ConexionSQL metodosql = new ConexionSQL();

        Usuarios user = new Usuarios();

        String pass = new String(txtRegistroConstrasena.getPassword());
        String passconf = new String(txtRegistroConfirmarConstrasena.getPassword());

        try {
            if (metodosql.buscar_user(txtRegistroUsuario.getText()) == 0) {

                if (metodosql.validarEmail(txtRegistroEmail.getText())) {

                    if (pass.equals(passconf)) {

                        user.setUsername(txtRegistroUsuario.getText());
                        user.setPassword(txtRegistroConstrasena.getText());
                        user.setNombre(txtRegistroNombre.getText());
                        user.setApellido(txtRegistroApellido.getText());
                        user.setTelefono(txtRegistroTelefono.getText());
                        user.setEmail(txtRegistroEmail.getText());
                        user.setId_user(1);

                        if (txtRegistroUsuario.getText().isEmpty() || txtRegistroConstrasena.getText().isEmpty() || txtRegistroConfirmarConstrasena.getText().isEmpty() || txtRegistroNombre.getText().isEmpty() || txtRegistroApellido.getText().isEmpty() || txtRegistroTelefono.getText().isEmpty() || txtRegistroEmail.getText().isEmpty()) {
                            JOptionPane.showInternalMessageDialog(null, "Existen espacios vacios, Favor de verificar.");
                        } else {

                            JOptionPane.showInternalMessageDialog(null, "Registro exitoso, puedes iniciar sesion");
                            Principal_Login pl = new Principal_Login();
                            pl.setVisible(true);
                            pl.setLocationRelativeTo(null);
                            this.dispose();

                            try {

                                metodosql.registrar(user);

                            } catch (SQLException ex) {

                                ex.printStackTrace(System.out);
                            }

                        }

                    } else {
                        JOptionPane.showInternalMessageDialog(null, "Las contraseñas no coinciden.");
                    }
                } else {
                    JOptionPane.showInternalMessageDialog(null, "El correo no es valido, favor intentelo de nuevo.");
                }
            } else {
                JOptionPane.showInternalMessageDialog(null, "El usuario ya existe, favor intentelo de nuevo.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_btnRegistro_en_TablaActionPerformed

    private void txtRegistroConstrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroConstrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroConstrasenaActionPerformed

    private void txtRegistroConfirmarConstrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroConfirmarConstrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroConfirmarConstrasenaActionPerformed

    private void btnVolverAtras_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtras_LoginActionPerformed
        this.dispose();
        Principal_Login pl = new Principal_Login();
        pl.setVisible(true);
    }//GEN-LAST:event_btnVolverAtras_LoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro_en_Tabla;
    private javax.swing.JButton btnVolverAtras_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtRegistroApellido;
    private javax.swing.JPasswordField txtRegistroConfirmarConstrasena;
    private javax.swing.JPasswordField txtRegistroConstrasena;
    private javax.swing.JFormattedTextField txtRegistroEmail;
    private javax.swing.JTextField txtRegistroNombre;
    private javax.swing.JFormattedTextField txtRegistroTelefono;
    private javax.swing.JTextField txtRegistroUsuario;
    // End of variables declaration//GEN-END:variables
}
