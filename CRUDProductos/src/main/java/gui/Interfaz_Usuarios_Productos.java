package gui;

public class Interfaz_Usuarios_Productos extends javax.swing.JFrame {

    public Interfaz_Usuarios_Productos() {
        super("Elegir Usuario & Producto");
        initComponents();
        setLocationRelativeTo(null);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnacceso_productos = new javax.swing.JButton();
        jbtnacceso_usuarios2 = new javax.swing.JButton();
        btnVolverAtras_Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbtnacceso_productos.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\Productos.png")); // NOI18N
        jbtnacceso_productos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 0, 14), new java.awt.Color(255, 102, 102))); // NOI18N
        jbtnacceso_productos.setMaximumSize(new java.awt.Dimension(540, 524));
        jbtnacceso_productos.setMinimumSize(new java.awt.Dimension(540, 524));
        jbtnacceso_productos.setPreferredSize(new java.awt.Dimension(540, 524));
        jbtnacceso_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnacceso_productosActionPerformed(evt);
            }
        });

        jbtnacceso_usuarios2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\ReDdeath Dropbox\\Anthony Rojas\\PC\\Desktop\\Programas\\Itla\\2023-C-2\\Materias\\Programación I\\Practicas\\SISTEMA DE GESTIÓN ALMACÉN\\CRUDProductos\\src\\main\\resources\\imgs\\User.png")); // NOI18N
        jbtnacceso_usuarios2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 0, 14), new java.awt.Color(255, 102, 102))); // NOI18N
        jbtnacceso_usuarios2.setMaximumSize(new java.awt.Dimension(540, 524));
        jbtnacceso_usuarios2.setMinimumSize(new java.awt.Dimension(540, 524));
        jbtnacceso_usuarios2.setPreferredSize(new java.awt.Dimension(540, 524));
        jbtnacceso_usuarios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnacceso_usuarios2ActionPerformed(evt);
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
                .addGap(70, 70, 70)
                .addComponent(jbtnacceso_usuarios2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jbtnacceso_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolverAtras_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnacceso_usuarios2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbtnacceso_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnVolverAtras_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnacceso_usuarios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnacceso_usuarios2ActionPerformed
        this.dispose();
        Principal_Table_Usuarios ptu = new Principal_Table_Usuarios();
        ptu.setVisible(true);
        
    }//GEN-LAST:event_jbtnacceso_usuarios2ActionPerformed

    private void jbtnacceso_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnacceso_productosActionPerformed
        this.dispose();
        Principal_Table_Productos ptp = new Principal_Table_Productos();
        ptp.setVisible(true);
    }//GEN-LAST:event_jbtnacceso_productosActionPerformed

    private void btnVolverAtras_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtras_LoginActionPerformed
        this.dispose();
        Principal_Login pl = new Principal_Login();
        pl.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnVolverAtras_LoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverAtras_Login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnacceso_productos;
    private javax.swing.JButton jbtnacceso_usuarios2;
    // End of variables declaration//GEN-END:variables
}
