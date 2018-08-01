package mi.muebleria.Muebles;

import java.io.Serializable;
import java.time.LocalDate;

public class MuebleInventario implements Serializable {
    
    private double costo;
    private double precio;
    private String nombreMueble;
    private int codigo;
    private String fecha;
    private boolean vendido=false;
    private boolean enVenta=false;
    private boolean devuelto=false;
    private String ensamblador;
    private String direccion;
    
    //METODO CONSTRUCTOR SIN AGREGAR A LA VENTA
    public MuebleInventario(String ensamblador, double precio, String nombre, String fecha){
        this.ensamblador = ensamblador;
        this.precio = precio;
        this.nombreMueble = nombre;
        this.fecha = fecha;
    }
    //METODO CONSTRUCTOR AGREAGANDO A LA VENTA
    public MuebleInventario(String ensamblador, double precio, String nombre, String fecha, boolean venta){
        this.ensamblador = ensamblador;
        this.precio = precio;
        this.nombreMueble = nombre;
        this.fecha = fecha;
        this.enVenta = venta;
    }
    
    //METODO PARA AGREGAR A LA VENTA
    public void EnVenta(){
        this.enVenta=true;
    }
    
    //METODO PARA DEVOLUCION 
    public void Devolucion(){
        this.devuelto = true;
    }
    
    //METODO PARA VENDER
    public void Vendido(){
        this.vendido = true;
    }
    
    //SETTERS--------------------------------------------------------------------------------------------
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombreMueble(String nombreMueble) {
        this.nombreMueble = nombreMueble;
    }

    public void setEnVenta(boolean enVenta) {
        this.enVenta = enVenta;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }
    
    //GETTERS--------------------------------------------------------------------------------------------

    public double getCosto() {
        return costo;
    }

    public String getDireccion(){
        return direccion;
    }
    
    public double getPrecio() {
        return precio;
    }

    public String getNombreMueble() {
        return nombreMueble;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean getVenta() {
        return enVenta;
    }
    
    public boolean getVendido(){
        return vendido;
    }

    public boolean isDevuelto() {
        return devuelto;
    }
}
