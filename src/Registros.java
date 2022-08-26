
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brand
 */
public class Registros {
        private ArrayList <Registro> registros; 
    
    public Registros() {
        this.registros = new ArrayList();
    }
    public Registros(ArrayList<Registro>lista) {
        this.registros = lista;
    }
    public void addRegistro(Registro registro){
        registros.add(registro);
    }
    public Registro getRegistro(int pos){
        return registros.get(pos);
    }
    
    public ArrayList buscarRegistroCodigoProducto(int codigo){
        ArrayList<Integer>resultado;
        resultado= new ArrayList();
        
        int pos;
        for(pos=0; pos<getTamaño(); pos++){
            Registro registro  = getRegistro(pos);
            if(codigo == registro.getCodigoArticulo()){
                resultado.add(pos);
            }                      
        }
    return resultado;
    }
    
    public Registro getRegistroPos(int codigo, int posRegistro){
        ArrayList<Registro>resultado;
        resultado= new ArrayList();
        
        int pos;
        for(pos=0; pos<getTamaño(); pos++){
            Registro registro  = getRegistro(pos);
            if(codigo == registro.getCodigoArticulo()){
                resultado.add(getRegistro(pos));
            }                      
        }
    return resultado.get(posRegistro);
    }
    
    public Registro getRegistroMovimiento(int codigo){
        ArrayList<Registro>resultado;
        resultado= new ArrayList();
        
        int pos;
        for(pos=0; pos<getTamaño(); pos++){
            Registro registro  = getRegistro(pos);
            if(codigo == registro.getCodigoArticulo()){
                resultado.add(getRegistro(pos));
            }                      
        }
    return resultado.get((resultado.size()-1));
    }
    
    public int getTamaño(){
        return registros.size();
    }
    public void eliminarRegistro(int posicion){
       registros.remove(posicion);
    }
    public void modificarRegistro(int posicion, Registro detalle){
        registros.set(posicion, detalle);
    }
    
    
}
