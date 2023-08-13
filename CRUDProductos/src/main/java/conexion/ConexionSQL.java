package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import logica.Productos;
import logica.Usuarios;

public class ConexionSQL {

    // Atributos Sentencias SQL de la Tabla Usuarios //
    private static final String SQL_INSERT_US = "INSERT INTO usuarios (Username, Password, Nombre, Apellido, Telefono, Email) VALUES(?, ?, ?, ?, ?, ?)";
    private static final String SQL_WHERE_US = "SELECT count(Id_user) FROM usuarios WHERE Username = ?";

    // Atributos Sentencias SQL de la Tabla Productos //
    private static final String SQL_INSERT_PRO = "INSERT INTO productos  (NombreProducto, MarcaProducto, CategoriaProducto, PrecioProducto, StockProducto) VALUES(?, ?, ?, ?, ?)";

    // Atributos para establecer la conexion a la BD//
    private static final String base = "almacenitlafinal";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/" + base
            + "?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORDS = "@Emulador1";
    private Connection con = null;

    public Connection getConnection() throws SQLException {// Metodo de Conexion//

        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORDS);
    }

    public static void close(ResultSet rs) throws SQLException {// Metodo para cerrar las conexiones que abre el ResulSet//
        rs.close();
    }

    public static void close(Statement smtm) throws SQLException { // Metodo para cerrar las conexiones que abre el Statement//
        smtm.close();
    }

    public static void close(PreparedStatement smtm) throws SQLException {// Metodo para cerrar las conexiones que abre el PreparedStatement//
        smtm.close();
    }

    public static void close(Connection conn) throws SQLException {// Metodo para cerrar las conexiones que abre Connection//
        conn.close();
    }

    public boolean registrar(Usuarios user) throws SQLException {// Este metodo registra los usuarios//

        PreparedStatement ps = null;
        Connection con = getConnection();
        try {
            ps = con.prepareStatement(SQL_INSERT_US);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getNombre());
            ps.setString(4, user.getApellido());
            ps.setString(5, user.getTelefono());
            ps.setString(6, user.getEmail());
            ps.execute();
            return true;

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);
        } finally {
            close(ps);
        }

        return false;
    }

    public boolean registrarpro(Productos products) throws SQLException {// Registra los Productos//

        PreparedStatement ps = null;
        Connection con = getConnection();
        try {
            ps = con.prepareStatement(SQL_INSERT_PRO);
            ps.setString(1, products.getNombreProducto());
            ps.setString(2, products.getMarcaProducto());
            ps.setString(3, products.getCategoriaProducto());
            ps.setInt(4, products.getPrecioProducto());
            ps.setInt(5, products.getStockProducto());
            ps.execute();
            return true;

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);
        } finally {
            close(ps);
        }

        return false;
    }

    public boolean modificar(Productos mod) throws SQLException {// Actualizar Productos//
        Connection cn = getConnection();
        PreparedStatement ps = null;

        String sql = "UPDATE productos SET NombreProducto = ?, MarcaProducto = ?, CategoriaProducto = ?, PrecioProducto = ?, StockProducto = ? WHERE Id_Producto = ?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, mod.getNombreProducto());
            ps.setString(2, mod.getMarcaProducto());
            ps.setString(3, mod.getCategoriaProducto());
            ps.setInt(4, mod.getPrecioProducto());
            ps.setInt(5, mod.getStockProducto());
            ps.setInt(6, mod.getId_Producto());

            ps.executeUpdate();
            cn.close();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

            return false;
        }
    }

    public boolean modificar(Usuarios mod_user) throws SQLException {// Actualizar Usuarios//
        Connection cn = getConnection();
        PreparedStatement ps = null;

        String sql = "UPDATE usuarios SET Username = ?, Password = ?, Nombre = ?, Apellido = ?, Telefono = ?, Email = ?  WHERE Id_user = ?;";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, mod_user.getUsername());
            ps.setString(2, mod_user.getPassword());
            ps.setString(3, mod_user.getNombre());
            ps.setString(4, mod_user.getApellido());
            ps.setString(5, mod_user.getTelefono());
            ps.setString(6, mod_user.getEmail());
            ps.setInt(7, mod_user.getId_user());

            ps.executeUpdate();
            cn.close();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

            return false;
        }
    }

    public int buscar_user(String user_login) throws SQLException {// validar si el usuario existe en la TABLA USUARIOS//

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection con2 = getConnection();

        try {

            stmt = con2.prepareStatement(SQL_WHERE_US);
            stmt.setString(1, user_login);
            rs = stmt.executeQuery();

            if (rs.next()) {

                return rs.getInt(1);

            }
            return 1;

        } catch (SQLException e) {

            e.printStackTrace(System.out);
            return 1;

        } finally {// al finalizar se cerraran las conexiones//
            try {
                close(rs);
                close(stmt);
                close(con2);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
    }

    public boolean validarEmail(String email) {// Metodo para validar el correo//
        // Funcion para validar el patron del correo que se va establecer//
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mat = pattern.matcher(email);
        return mat.find();
    }

}
