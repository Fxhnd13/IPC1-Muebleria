package mi.muebleria.Personas;

import java.util.ArrayList;
import mi.muebleria.Muebles.MuebleInventario;
import mi.muebleria.Papeleria.Compra;
import mi.muebleria.Papeleria.Devolucion;
import mi.muebleria.Papeleria.Factura;

public class Cliente {
    
    private String nombre;
    private int NIT;
    private String direccion;
    private ArrayList<Compra> compras = new ArrayList();
    private ArrayList<Devolucion> devoluciones = new ArrayList();
    
    //METODO CONSTRUCTOR
    public Cliente(String nombre, String direccion, int nit){
        this.nombre = nombre;
        this.direccion = direccion; 
        this.NIT = nit;
    }
    
    //METODO PARA EFECTUAR UNA COMPRA
    public void RealizarCompra(UsuarioVentas usuario, MuebleInventario mueble, Factura factura, String fecha){
        Compra compra = new Compra(usuario, mueble, factura, fecha);
        compras.add(compra);
    }
    
    //METODO PARA EFECTUAR UNA DEVOLUCION
    public void RealizarDevolucion(MuebleInventario mueble, String fecha){
        Devolucion devolucion = new Devolucion(mueble,fecha);
        devoluciones.add(devolucion);
    }
    
    //GETTERS-------------------------------------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public int getNIT() {
        return NIT;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public ArrayList<Compra> getCompras(){
        return compras;
    }
    
    public ArrayList<Devolucion> getDevoluciones(){
        return devoluciones;
    }
    
    //SETTERS 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
