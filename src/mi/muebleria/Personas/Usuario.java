package mi.muebleria.Personas;

import java.io.Serializable;

public class Usuario implements Serializable {

    protected String nombre;
    protected String password;
    protected boolean activo;
    protected String direccion;
    
//getters---------------------------------------------------------------------------------------------
    
    public String getName() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

//setters---------------------------------------------------------------------------------------------------
    
    public void setName(String name) {
        this.nombre = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
