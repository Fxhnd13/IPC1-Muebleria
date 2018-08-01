package mi.muebleria.Muebles;

import java.io.Serializable;
import java.util.ArrayList;
import mi.muebleria.Piezas.Pieza;

public class MuebleBase implements Serializable {
     
    private String nombreMueble;//NOMBRE DEL MUEBLE
    private double precio;//PRECIO DEL MUEBLE
    private ArrayList<Pieza> piezas = new ArrayList();//LISTA DE PIEZAS QUE USARÁ EL MUEBLE
    private double costo;//COSTO DEL MUEBLE
    private int cantidad;//VARIABLE PARA LLEVAR EL CONTEO DE MUEBLES VENDIDOS DE ESTE TIPO
    private String direccion;
    
    //METODO CONSTRUCTOR 
    public MuebleBase(String nombre, double precio){
        this.nombreMueble = nombre;
        this.precio = precio;
    }
    
    //METODO PARA AGREGAR PIEZAS A UTILIZAR EN EL MUEBLE
    public void NuevaPieza(String nombre, int cantidad){
        Pieza pieza = new Pieza(nombre, cantidad);
        piezas.add(pieza);
    }
    
//GETTERS-------------------------------------------------------------------------
    
    public int getCantidad(){
        return cantidad;
    }

    public String getNombreMueble() {
        return nombreMueble;
    }

    public double getPrecio() {
        return precio;
    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    public double getCosto() {
        return costo;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
//SETTERS

    public void setNombreMueble(String nombreMueble) {
        this.nombreMueble = nombreMueble;
    }
    
    public void setCantidad(){
        this.cantidad++;
    }
    
    public void resetCantidad(){
        this.cantidad=0;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPiezas(ArrayList<Pieza> piezas) {
        this.piezas = piezas;
    }

    public void setCosto(double costo) {
        this.costo =this.costo + costo;
    }
    
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }
    
}
