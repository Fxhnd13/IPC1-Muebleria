package mi.muebleria.Papeleria;

import mi.muebleria.Papeleria.Factura;
import mi.muebleria.Personas.Cliente;
import java.io.Serializable;
import mi.muebleria.Muebles.MuebleInventario;

public class Venta implements Serializable{
    
    private String fecha;
    private Cliente cliente;
    private Factura factura;
    private MuebleInventario muebleVendido;
    private double ganancia;
    
//Constructor
    public Venta(Cliente cliente, Factura factura, MuebleInventario muebleVendido, String fecha){
        this.cliente = cliente;
        this.factura = factura;
        this.muebleVendido = muebleVendido;
        this.fecha = fecha;
        this.ganancia = muebleVendido.getPrecio()-muebleVendido.getCosto();
    }
   
    //GETTERS

    public Cliente getCliente() {
        return cliente;
    }

    public Factura getFactura() {
        return factura;
    }

    public MuebleInventario getMuebleVendido() {
        return muebleVendido;
    }

    public String getFecha() {
        return fecha;
    }
    
    public double getGanancia(){
        return ganancia;
    }
    
    //SETTER

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setMuebleVendido(MuebleInventario muebleVendido) {
        this.muebleVendido = muebleVendido;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void setGanancia(int ganancia){
        this.ganancia = ganancia;
    }
    
}
