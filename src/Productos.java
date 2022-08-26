

import java.util.ArrayList;


public class Productos {
    private ArrayList <Producto> productos; 
    
    public Productos() {
        this.productos = new ArrayList();
    }
    public Productos(ArrayList<Producto>lista) {
        this.productos = lista;
    }
    public void addProducto(Producto producto){
        productos.add(producto);
    }
    public Producto getProducto(int pos){
        return productos.get(pos);
    }
    public int getTamaño(){
        return productos.size();
    }
    public void eliminarProducto(int posicion){
       productos.remove(posicion);
    }
    public void modificarProducto(int posicion, Producto detalle){
        productos.set(posicion, detalle);
    }
    
      public Producto getProductoCodigo(int codigo){
        ArrayList<Producto>resultado;
        resultado= new ArrayList();
        
        int pos;
        for(pos=0; pos<getTamaño(); pos++){
            Producto producto  = getProducto(pos);
            if(codigo == producto.getCodigo()){
                resultado.add(getProducto(pos));
            }                      
        }
    return resultado.get((resultado.size()-1));
    }
    
}
