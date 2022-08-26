
public class Producto {
    private int codigo;
    private String articulo;
    private String localizacion;
    private String proveedor;
    private int minimo;
    private int maximo;
    private String unidades;
    
    
    

    public Producto() {
        codigo = 0;
        articulo= "";
        localizacion = "";
        proveedor = "";
        minimo = 0;
        maximo = 0;
        unidades="";
    }

    public Producto(int codigo, String articulo, String localizacion, String proveedor, int minimo, int maximo, String unidades) {
        this.codigo = codigo;
        this.articulo = articulo;
        this.localizacion = localizacion;
        this.proveedor = proveedor;
        this.minimo = minimo;
        this.maximo = maximo;
        this.unidades = unidades;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    
}
