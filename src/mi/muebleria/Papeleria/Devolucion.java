package mi.muebleria.Papeleria;

import mi.muebleria.Muebles.MuebleInventario;
import mi.muebleria.Personas.Cliente;

public class Devolucion {
    
    private MuebleInventario mueble;
    private String fecha;
    private Cliente cliente;
    private Factura factura;
    
    //METODO CONSTRUCTOR PARA CLIENTE
    public Devolucion(MuebleInventario mueble, String fecha){
        this.mueble = mueble;
        this.fecha = fecha;
    }
    
    //METODO CONSTRUCTOR PARA ARCHIVO DE DEVOLUCION
    public Devolucion(MuebleInventario mueble, String fecha, Cliente cliente, Factura factura){
        this.mueble = mueble;
        this.fecha = fecha;
        this.cliente = cliente;
        this.factura = factura;
    }
    
    //GETTERS------------------------------------------------------------------------

    public MuebleInventario getMueble() {
        return mueble;
    }

    public String getFecha() {
        return fecha;
    }
    
    public Factura getFactura(){
        return factura;
    }
    
    //SETTERS-----------------------------------------------------------------------

    public void setMueble(MuebleInventario mueble) {
        this.mueble = mueble;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
