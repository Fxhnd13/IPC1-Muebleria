package mi.muebleria.Piezas;

import java.io.Serializable;

public class Pieza implements Serializable{
  
    private String nombrePieza; //NOMBRE DE LA PIEZA
    private double precio;   //PRECIO DE LA PIEZA
    private int cantidad; //CANTIDAD USADA PARA CIERTO TIPO DE MUEBLE
    
    //METODO CONSTRUCTOR SOLO PARA EL NOMBRE 
    public Pieza(String nombre){
        this.nombrePieza= nombre;
    }
    
    //METODO CONSTRUCTOR
    public Pieza(String nombre, double precio){
        this.nombrePieza = nombre;
        this.precio = precio;
    }
    
    //METODO CONSTRUCTOR PARA MUEBLE
    public Pieza(String nombre, int cantidad){
        this.nombrePieza = nombre;
        this.cantidad = cantidad;;
    }
    
    //GETTERS----------------------------------------------------------------------------------

    public String getNombrePieza() {
        return nombrePieza;
    }

    public double getPrecio() {
        return precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    //SETTERS

    public void setNombrePieza(String nombrePieza) {
        this.nombrePieza = nombrePieza;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
}
