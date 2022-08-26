/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brand
 */
public class Registro {
    private int codigoRegistro;
    private int codigoArticulo;
    private String fecha;
    private String descripcion;
    private double precioUnitario;
    private int existencia;
    private String tipo;

    public Registro() {
        codigoRegistro = 0;
        codigoArticulo = 0;
        fecha = "";
        descripcion = "";
        precioUnitario = 0;
        existencia = 0;
        tipo = "";
    }

    public Registro(int codigoRegistro, int codigoArticulo, String fecha, String descripcion, double precioUnitario, int existencia, String tipo) {
        this.codigoRegistro = codigoRegistro;
        this.codigoArticulo = codigoArticulo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.existencia = existencia;
        this.tipo = tipo;
    }

    public int getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(int codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
