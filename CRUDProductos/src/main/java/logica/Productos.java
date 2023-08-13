package logica;

public class Productos {

//Atributos//
    private int id_Producto;
    private String NombreProducto;
    private String MarcaProducto;
    private String CategoriaProducto;
    private int PrecioProducto;
    private int StockProducto;

    public Productos() {
    }

    public Productos(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public Productos(int id_Producto, String NombreProducto, String MarcaProducto, String CategoriaProducto, int PrecioProducto, int StockProducto) {
        this.id_Producto = id_Producto;
        this.NombreProducto = NombreProducto;
        this.MarcaProducto = MarcaProducto;
        this.CategoriaProducto = CategoriaProducto;
        this.PrecioProducto = PrecioProducto;
        this.StockProducto = StockProducto;
    }

    public Productos(String NombreProducto, String MarcaProducto, String CategoriaProducto, int PrecioProducto, int StockProducto) {
        this.NombreProducto = NombreProducto;
        this.MarcaProducto = MarcaProducto;
        this.CategoriaProducto = CategoriaProducto;
        this.PrecioProducto = PrecioProducto;
        this.StockProducto = StockProducto;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getMarcaProducto() {
        return MarcaProducto;
    }

    public void setMarcaProducto(String MarcaProducto) {
        this.MarcaProducto = MarcaProducto;
    }

    public String getCategoriaProducto() {
        return CategoriaProducto;
    }

    public void setCategoriaProducto(String CategoriaProducto) {
        this.CategoriaProducto = CategoriaProducto;
    }

    public int getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(int PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public int getStockProducto() {
        return StockProducto;
    }

    public void setStockProducto(int StockProducto) {
        this.StockProducto = StockProducto;
    }

    @Override
    public String toString() {
        return id_Producto + "\t" + NombreProducto + "\t" + MarcaProducto + "\t" + CategoriaProducto + "\t" + PrecioProducto + "\t" + StockProducto;
    }

}
