package logica;

public class Usuarios {

//Atributos//
    private int Id_user;
    private String Username;
    private String Password;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Email;

    public Usuarios() {
    }

    public Usuarios(int Id_user) {
        this.Id_user = Id_user;
    }

    public Usuarios(int Id_user, String Username, String Password) {
        this.Id_user = Id_user;
        this.Username = Username;
        this.Password = Password;
    }

    public Usuarios(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public Usuarios(int Id_user, String Username, String Password, String Nombre, String Apellido, String Telefono, String Email) {
        this.Id_user = Id_user;
        this.Username = Username;
        this.Password = Password;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public int getId_user() {
        return Id_user;
    }

    public void setId_user(int Id_user) {
        this.Id_user = Id_user;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return Id_user + "\t" + Username + "\t" + Password + "\t" + Nombre + "\t" + Apellido + "\t" + Telefono + "\t" + Email;
    }

}
