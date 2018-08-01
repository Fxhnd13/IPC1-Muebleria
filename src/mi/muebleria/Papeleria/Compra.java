package mi.muebleria.Papeleria;

import mi.muebleria.Muebles.MuebleInventario;
import mi.muebleria.Personas.Cliente;
import mi.muebleria.Personas.UsuarioVentas;

public class Compra {
    
    private String fecha;
    private Cliente cliente;
    private UsuarioVentas usuario;
    private MuebleInventario muebleComprado;
    private Factura factura;
    
    //CONSTRUCTOR
    public Compra(Cliente cliente, UsuarioVentas usuario, MuebleInventario mueble, Factura factura, String fecha){
        this.cliente = cliente;
        this.usuario = usuario;
        this.muebleComprado = mueble;
        this.factura = factura;
        this.fecha = fecha;
    }
    
    //CONSTRUCTOR PARA COMPRA DEL CLIENTE
    public Compra(UsuarioVentas usuario, MuebleInventario mueble, Factura factura, String fecha){
        this.usuario = usuario;
        this.muebleComprado = mueble;
        this.factura = factura;
        this.fecha = fecha;
    }
    
    //GETTERS

    public UsuarioVentas getUsuario() {
        return usuario;
    }

    public MuebleInventario getMuebleComprado() {
        return muebleComprado;
    }

    public Factura getFactura() {
        return factura;
    }

    public String getFecha() {
        return fecha;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    //SETTERS 

    public void setUsuario(UsuarioVentas usuario) {
        this.usuario = usuario;
    }

    public void setMuebleComprado(MuebleInventario muebleComprado) {
        this.muebleComprado = muebleComprado;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
