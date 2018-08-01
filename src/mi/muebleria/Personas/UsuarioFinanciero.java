package mi.muebleria.Personas;

import mi.muebleria.Personas.Usuario;
import java.io.Serializable;

public class UsuarioFinanciero extends Usuario implements Serializable{
   
    //CONSTRUCTOR
   public UsuarioFinanciero(String name, String password){
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
    
    public void setDireccion(String direcion){
        this.direccion = direccion;
    }
    
}
