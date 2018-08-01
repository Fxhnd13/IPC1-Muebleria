package mi.muebleria.Papeleria;

import mi.muebleria.Muebles.MuebleInventario;
import mi.muebleria.Personas.Cliente;
import mi.muebleria.Personas.UsuarioVentas;

public class Factura {
    
    private int nitComprador;
    private UsuarioVentas vendedor;
    private String fecha;
    private MuebleInventario muebleComprado;
    private int numero;
    
    //METODO CONSTRUCTOR
    public Factura(UsuarioVentas vendedor, int NitComprador, String fecha, MuebleInventario mueble){
        this.nitComprador = NitComprador;
        this.vendedor= vendedor;
        this.fecha = fecha;
        this.muebleComprado = mueble;
    }
    
    //GETTERS--------------------------------------------------------------------------------

    public int getComprador() {
        return nitComprador;
    }

    public String getFecha() {
        return fecha;
    }

    public MuebleInventario getMuebleComprado() {
        return muebleComprado;
    }
    
    public int getNumero(){
        return numero;
    }
    
    //SETTERS 

    public void setComprador(int comprador) {
        this.nitComprador = comprador;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMuebleComprado(MuebleInventario muebleComprado) {
        this.muebleComprado = muebleComprado;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
}
