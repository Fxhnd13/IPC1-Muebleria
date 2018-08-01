package mi.muebleria.Piezas;

import mi.muebleria.Piezas.Pieza;
import java.io.Serializable;

public class PiezaInventario implements Serializable {
    private String nombrePieza;//NOMBRE DE LA PIEZA
    private double precio;//PRECIO DE LA PIEZA 
    private int cantidad;//CANTIDAD DE PIEZAS QUE SE POSEEN DE ESTE TIPO
    private boolean usable; //SI ESTA PIEZA YA HA SIDO USADA, ES DECIR YA NO EXISTE EN EL INVENTARIO
    private String direccion;//DIRECCION DE LA RUTA DONDE SE ENCUENTRA GUARDADA LA PIEZA
    
    //METODO CONSTRUCTOR
    public PiezaInventario(String nombre, double precio, int cantidad){
        this.nombrePieza = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.usable = true;
    }
    
    //METODO CONSTRUCTOR
    public PiezaInventario(String nombre, double precio){
        this.nombrePieza = nombre;
        this.precio = precio;
        this.usable=true;
    }
    
    //METODO PARA CUANDO SE USA ESTA PIEZA EN ALGUN MUEBLE
    public void UsarPieza(int cantidad){
        if(this.cantidad>=cantidad){
            this.cantidad = this.cantidad-cantidad;
        }
    }
    
    //METODO PARA CUANDO SE COMPRAN ESTE TIPO DE PIEZAS
    public void IngresoPiezas(int cantidad){
        this.cantidad = this.cantidad + cantidad;
    }
    
    //GETTERS---------------------------------------------------------------------------------

    public String getNombrePieza() {
        return nombrePieza;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public boolean getUsable(){
        return usable;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    //SETTERS-------------------------------------------------------------------------------------

    public void setNombrePieza(String nombrePieza) {
        this.nombrePieza = nombrePieza;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setUsable(boolean usable){
        this.usable = usable;
    }
    
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }
    
}
