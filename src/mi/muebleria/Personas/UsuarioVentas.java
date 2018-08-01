package mi.muebleria.Personas;

import mi.muebleria.Personas.Usuario;
import mi.muebleria.Personas.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
import mi.muebleria.Muebles.MuebleInventario;
import mi.muebleria.Papeleria.Factura;
import mi.muebleria.Papeleria.Venta;

public class UsuarioVentas extends Usuario implements Serializable {
    
    
    ArrayList<Venta> ventas = new ArrayList();
       
    //CONSTRUCTOR
    public UsuarioVentas(String name, String password){
       this.nombre = name;
       this.password = password;
       this.activo = true;
    }
    
//getters-------------------------------------------------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }
    
    public boolean getActivo(){
        return activo;
    }
    
    public String getDireccion(){
        return direccion;
    }
   
//setters------------------------------------------------------------------------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setActivo(){
        if(activo){
            activo=false;
        }else{
            activo=true;
        }
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    //METODO AL REALIZAR UNA VENTA
    public void RelizarVenta(Factura factura, MuebleInventario mueble, Cliente cliente, String fecha){
        Venta venta = new Venta(cliente, factura, mueble, fecha);
        this.ventas.add(venta);
    }
}
