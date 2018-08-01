package mi.muebleria.Funcionamiento;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mi.muebleria.Muebles.MuebleBase;
import mi.muebleria.Muebles.MuebleInventario;
import mi.muebleria.Papeleria.Compra;
import mi.muebleria.Papeleria.Devolucion;
import mi.muebleria.Papeleria.Factura;
import mi.muebleria.Papeleria.Venta;
import mi.muebleria.Personas.Cliente;
import mi.muebleria.Personas.UsuarioFabrica;
import mi.muebleria.Personas.UsuarioFinanciero;
import mi.muebleria.Personas.UsuarioVentas;
import mi.muebleria.Piezas.Pieza;
import mi.muebleria.Piezas.PiezaInventario;

public class Registro {
    
    //VARIABLES
    static int numeroDeFactura;
    static int numeroDeVenta;
    static int numeroDeMueble;
    static int numeroDeCompra;
    static int numeroDePieza;
    public static int codigoGeneralMueble;
    static int numeroDeDevolucion;
    
    //METODO PARA CREAR CARPETAS NECESARIAS
    public static void CrearCarpetas(){
        File file = new File("Archivos/Inventario/Muebles");
        if (!file.exists()){
            file.mkdirs();
        }
        file = new File("Archivos/Inventario/Piezas");
        if (!file.exists()){
            file.mkdirs();
        }
        file = new File("Archivos/Guias/Muebles");
        if (!file.exists()){
            file.mkdirs();
        }
        file = new File("Archivos/Guias/Piezas");
        if (!file.exists()){
            file.mkdirs();
        }
        file = new File("Archivos/Usuarios/Fabrica");
        if (!file.exists()){
            file.mkdirs();
        }
        file = new File("Archivos/Usuarios/Ventas");
        if (!file.exists()){
            file.mkdirs();
        }
        file = new File("Archivos/Usuarios/Administracion");
        if (!file.exists()){
            file.mkdirs();
        }
        file = new File("Archivos/Ventas");
        if (!file.exists()){
            file.mkdir();
        }
        file = new File("Archivos/Facturas");
        if (!file.exists()){
            file.mkdir();
        }
        file = new File("Archivos/Clientes");
        if (!file.exists()){
            file.mkdir();
        }
        file = new File("Archivos/Compras");
        if (!file.exists()){
            file.mkdir();
        }
        file = new File("Archivos/Devoluciones");
        if (!file.exists()){
            file.mkdir();
        }
        DatosIniciales();
    }
    
    //METODO PARA LLEVAR CONTEO DE LAS COMPRAS Y DE LAS FACTURAS REALIZADAS
    public static void DatosIniciales(){
        File file = null;
        file = new File("Archivos/Facturas");
        numeroDeFactura = file.list().length;
        if(numeroDeFactura<1){
            numeroDeFactura=0;
        }
        file = new File("Archivos/Usuarios/Administracion");
        int numero = file.list().length;
        if(numero<1){
            UsuarioFinanciero usuario = new UsuarioFinanciero("Administrador","123456789");
            GuardarUsuarioAdministracion(usuario);
        }
        Muebleria.conteoGeneralMuebles();
        Muebleria.gananciasTotales();
    }
    
    //METODO PARA GUARDAR UN USUARIO
    public static void GuadarUsuarioFabrica(UsuarioFabrica usuario){
        File file = new File("Archivos/Usuarios/Fabrica/"+usuario.getName()+".usr");
        usuario.setDireccion("Archivos/Usuarios/Fabrica/"+usuario.getName()+".usr");
        FileOutputStream flujo=null;
        ObjectOutputStream usuarioFabrica=null;
        try{
            flujo = new FileOutputStream(file);
            usuarioFabrica = new ObjectOutputStream(flujo);
            usuarioFabrica.writeObject(usuario);
            usuarioFabrica.close();
            flujo.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    //METODO PARA SOBREESCRIBIR UN USUARIO
    public static void SobreEscribirUsuarioFabrica(UsuarioFabrica usuario, String direccion){
        File file = new File(direccion);
        FileOutputStream flujo=null;
        ObjectOutputStream usuarioFabrica=null;
        try{
            flujo = new FileOutputStream(file);
            usuarioFabrica = new ObjectOutputStream(flujo);
            usuarioFabrica.writeObject(usuario);
            usuarioFabrica.close();
            flujo.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA GUARDAR UN USUARIO DE VENTAS
    public static void GuardarUsuarioVentas(UsuarioVentas usuario){
        File file = new File("Archivos/Usuarios/Ventas/"+usuario.getName()+".usr");
        usuario.setDireccion("Archivos/Usuarios/Ventas/"+usuario.getName()+".usr");
        FileOutputStream flujo=null;
        ObjectOutputStream guardador=null;
        try{
            flujo = new FileOutputStream(file);
            guardador= new ObjectOutputStream(flujo);
            guardador.writeObject(usuario);
            guardador.close();
            flujo.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA SOBREESCRIBIR UN USUARIO VENTAS
    public static void SobreEscribirUsuarioVentas(UsuarioVentas usuario, String direccion){
        File file = new File(direccion);
        FileOutputStream flujo=null;
        ObjectOutputStream guardador=null;
        try{
            flujo = new FileOutputStream(file);
            guardador= new ObjectOutputStream(flujo);
            guardador.writeObject(usuario);
            guardador.close();
            flujo.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA GUARDAR UN USUARIO DE ADMINISTRACION
    public static void GuardarUsuarioAdministracion(UsuarioFinanciero usuario){
        File file = new File("Archivos/Usuarios/Administracion/"+usuario.getName()+".usr");
        usuario.setDireccion("Archivos/Usuarios/Administracion/"+usuario.getName()+".usr");
        FileOutputStream flujo= null;
        ObjectOutputStream guardador = null;
        try{
            flujo = new FileOutputStream(file);
            guardador= new ObjectOutputStream(flujo);
            guardador.writeObject(usuario);
            guardador.close();
            flujo.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO APRA SOBREESCRIBIR UN USUARIO DE ADMINSITRACION
    public static void SobreEscribirUsuarioAdministracion(UsuarioFinanciero usuario, String direccion){
        File file = new File(direccion);
        FileOutputStream flujo= null;
        ObjectOutputStream guardador = null;
        try{
            flujo = new FileOutputStream(file);
            guardador= new ObjectOutputStream(flujo);
            guardador.writeObject(usuario);
            guardador.close();
            flujo.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    //METODO PARA GUARDAR UN MUEBLEGUIA
    public static void GuardarMuebleGuia(MuebleBase mueble){
        File file = new File("Archivos/Guias/Muebles/"+mueble.getNombreMueble()+".mbg");
        mueble.setDireccion("Archivos/Guias/Muebles/"+mueble.getNombreMueble()+".mbg");
        FileOutputStream flujo = null;
        ObjectOutputStream muebleGuia = null;
        try{
            flujo = new FileOutputStream(file);
            muebleGuia = new ObjectOutputStream(flujo);
            muebleGuia.writeObject(mueble);
            muebleGuia.close();
            flujo.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA SOBREESCRIBIR UN MUEBLE GUIA
    public static void SobreEscribirMuebleGuia(MuebleBase mueble,String direccion){
        File file = new File(direccion);
        FileOutputStream flujo = null;
        ObjectOutputStream muebleGuia = null;
        try{
            flujo = new FileOutputStream(file);
            muebleGuia = new ObjectOutputStream(flujo);
            muebleGuia.writeObject(mueble);
            muebleGuia.close();
            flujo.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA GUARDAR UN MUEBLE DE INVENTARIO
    public static void GuardarMuebleInventario(MuebleInventario mueble){
        File file = new File("Archivos/Inventario/Muebles/"+mueble.getNombreMueble());
        if (!file.exists()){
            file.mkdir();
        }
        numeroDeMueble = file.list().length;
        numeroDeMueble++;
        codigoGeneralMueble++;
        mueble.setCodigo(codigoGeneralMueble);
        file = new File("Archivos/Inventario/Muebles/"+mueble.getNombreMueble()+"/"+mueble.getNombreMueble()+numeroDeMueble+".mbi");
        mueble.setDireccion("Archivos/Inventario/Muebles/"+mueble.getNombreMueble()+"/"+mueble.getNombreMueble()+numeroDeMueble+".mbi");
        FileOutputStream flujo = null;
        ObjectOutputStream muebleGuia = null;
        try{
            flujo = new FileOutputStream(file);
            muebleGuia = new ObjectOutputStream(flujo);
            muebleGuia.writeObject(mueble);
            muebleGuia.close();
            flujo.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PAR SOBREEESCRIBIR UN MUEBLEINVENTARIO
    public static void sobreEscribirMuebleInventario(MuebleInventario mueble, String direccion){
        File file = new File(direccion);
        FileOutputStream flujo = null;
        ObjectOutputStream muebleGuia = null;
        try{
            flujo = new FileOutputStream(file);
            muebleGuia = new ObjectOutputStream(flujo);
            muebleGuia.writeObject(mueble);
            muebleGuia.close();
            flujo.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA GUARDAR PIEZAS GUIA
    public static void GuardarPiezaGuia(Pieza pieza){
        File file = new File("Archivos/Guias/Piezas/"+pieza.getNombrePieza()+".pzg");
        FileOutputStream flujo = null;
        ObjectOutputStream piezaGuia = null;
        try{
            flujo = new FileOutputStream(file);
            piezaGuia = new ObjectOutputStream(flujo);
            piezaGuia.writeObject(pieza);
            piezaGuia.close();
            flujo.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA GUARDAR PIEZAS DE INVENTARIO
    public static void GuardarPiezaInventario(PiezaInventario pieza){
        File file = new File("Archivos/Inventario/Piezas/"+pieza.getNombrePieza());
        if (!file.exists()){
            file.mkdir();
        }
        numeroDePieza = file.list().length;
        numeroDePieza++;
        file = new File("Archivos/Inventario/Piezas/"+pieza.getNombrePieza()+"/"+pieza.getNombrePieza()+numeroDePieza+".pzi");
        pieza.setDireccion("Archivos/Inventario/Piezas/"+pieza.getNombrePieza()+"/"+pieza.getNombrePieza()+numeroDePieza+".pzi");
        FileOutputStream flujo = null;
        ObjectOutputStream piezaGuia = null;
        try{
            flujo = new FileOutputStream(file);
            piezaGuia = new ObjectOutputStream(flujo);
            piezaGuia.writeObject(pieza);
            piezaGuia.close();
            flujo.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA SOBREESCRIBIR UNA PIEZA 
    public static void sobreEscribirPiezaInventario(PiezaInventario pieza, String direccion){
        File file = new File(direccion);
        FileOutputStream flujo=null;
        ObjectOutputStream piezaGuia=null;
        try{
            flujo= new FileOutputStream(file);
            piezaGuia = new ObjectOutputStream(flujo);
            piezaGuia.writeObject(pieza);
            piezaGuia.close();
            flujo.close();
        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA GUARDAR VENTAS
    public static void GuardarVenta(Venta venta){
        String fecha = venta.getFecha().replace("/","_");
        File file = new File("Archivos/Ventas/"+fecha);
        if (!file.exists()){
            file.mkdir();
        }
        numeroDeVenta = file.list().length;
        numeroDeVenta++;
        file = new File("Archivos/Ventas/"+fecha+"/"+numeroDeVenta+".vnt");
        FileOutputStream flujo = null;
        ObjectOutputStream ventaGuia = null;
        try{
            flujo = new FileOutputStream(file);
            ventaGuia = new ObjectOutputStream(flujo);
            ventaGuia.writeObject(venta);
            ventaGuia.close();
            flujo.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA GUARDAR DEVOLUCION
    public static void GuardarDevolucion(Devolucion devolucion){
        String fecha = devolucion.getFecha().replace("/","_");
        File file = new File("Archivos/Devoluciones/"+fecha);
        if(!file.exists()){
            file.mkdir();
        }
        numeroDeDevolucion = file.list().length;
        numeroDeDevolucion++;
        file = new File("Archivos/Devoluciones/"+fecha+"/"+numeroDeDevolucion+".dvl");
        FileOutputStream flujo=null;
        ObjectOutputStream devolucionGuia=null;
        try{
            flujo = new FileOutputStream(file);
            devolucionGuia = new ObjectOutputStream(flujo);
            devolucionGuia.writeObject(devolucion);
            devolucionGuia.close();
            flujo.close();
        } catch (FileNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
}
    
    //METODO PARA GUARDAR COMPRAS
    public static void GuardarCompra(Compra compra){
        File file = new File("Archivos/Compras/"+compra.getCliente().getNIT());
        if (!file.exists()){
            file.mkdir();
        }
        numeroDeCompra = file.list().length;
        numeroDeCompra++;
        file = new File("Archivos/Compras/"+compra.getCliente().getNIT()+"/"+numeroDeCompra+".cmp");
        FileOutputStream flujo = null;
        ObjectOutputStream compraGuia = null;
        try{
            flujo = new FileOutputStream(file);
            compraGuia = new ObjectOutputStream(flujo);
            compraGuia.writeObject(compra);
            compraGuia.close();
            flujo.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA GUARDAR FACTURAS
    public static void GuardarFactura(Factura factura){
        numeroDeFactura++;
        factura.setNumero(numeroDeFactura);
        File file = new File("Archivos/Facturas/"+numeroDeFactura+".fct");
        FileOutputStream flujo = null;
        ObjectOutputStream facturaGuia = null;
        try{
            flujo = new FileOutputStream(file);
            facturaGuia = new ObjectOutputStream(flujo);
            facturaGuia.writeObject(factura);
            facturaGuia.close();
            flujo.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA GUARDAR CLIENTES
    public static void GuardarCliente(Cliente cliente){
        File file = new File("Archivos/Clientes/"+cliente.getNIT()+".cln");
        cliente.setDireccion("Archivos/Licnetes/"+cliente.getNIT()+".cln");
        FileOutputStream flujo = null;
        ObjectOutputStream clienteGuia = null;
        try{
            flujo = new FileOutputStream(file);
            clienteGuia = new ObjectOutputStream(flujo);
            clienteGuia.writeObject(cliente);
            clienteGuia.close();
            flujo.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA SOBREESCRIBIR CLIENTE
    public static void SobreEscribirCliente(Cliente cliente, String direccion){
        File file = new File(direccion);
        FileOutputStream flujo = null;
        ObjectOutputStream clienteGuia = null;
        try{
            flujo = new FileOutputStream(file);
            clienteGuia = new ObjectOutputStream(flujo);
            clienteGuia.writeObject(cliente);
            clienteGuia.close();
            flujo.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //METODO PARA ACCEDER A UN CLIENTE
    public static Cliente getCliente(int nit){
        Cliente cliente = null;
        File file = new File("Archivos/Clientes/"+nit+".cln");
        FileInputStream flujo = null;
        ObjectInputStream clienteRecuperado = null;
        try{
            flujo = new FileInputStream(file);
            clienteRecuperado = new ObjectInputStream(flujo);
            cliente = (Cliente)clienteRecuperado.readObject();
            clienteRecuperado.close();
            flujo.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(ClassNotFoundException ex ){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return cliente;
    }
    
    //METODO PARA ACCEDER A UN USUARIO DE FABRICA
    public static UsuarioFabrica getUsuarioFabrica(String nombre){
        UsuarioFabrica usuario = null;
        File file = new File("Archivos/Usuarios/Fabrica/"+nombre+".usr");
        if(file.exists()){
            FileInputStream flujo = null;
            ObjectInputStream usuarioRecuperado = null;
            try{
                flujo = new FileInputStream(file);
                usuarioRecuperado = new ObjectInputStream(flujo);
                usuario = (UsuarioFabrica)usuarioRecuperado.readObject();
                flujo.close();
                usuarioRecuperado.close();
            } catch(FileNotFoundException ex){
                JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
            } catch(IOException ex){
                JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
            } catch(ClassNotFoundException ex ){
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }    
        return usuario;
    }
    
    //METODO PARA ACCEDER A UN USUARIO DE VENTAS
    public static UsuarioVentas getUsuarioVentas(String nombre){
        UsuarioVentas usuario = null;
        File file = new File("Archivos/Usuarios/Ventas/"+nombre+".usr");
        if(file.exists()){
            FileInputStream flujo = null;
            ObjectInputStream usuarioRecuperado = null;
            try{
                flujo = new FileInputStream(file);
                usuarioRecuperado = new ObjectInputStream(flujo);
                usuario = (UsuarioVentas)usuarioRecuperado.readObject();
                usuarioRecuperado.close();
                flujo.close();
            } catch(FileNotFoundException ex){
                JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
            } catch(IOException ex){
                JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
            } catch(ClassNotFoundException ex ){
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return usuario;
    }
    
    //METODO PARA ACCEDER A UN USUARIO DE ADMINISTRACION
    public static UsuarioFinanciero getUsuarioAdministracion(String nombre){
        UsuarioFinanciero usuario = null;
        File file = new File("Archivos/Usuarios/Administracion/"+nombre+".usr");
        if(file.exists()){    
            FileInputStream flujo = null;
            ObjectInputStream usuarioRecuperado = null;
            try{
                flujo = new FileInputStream(file);
                usuarioRecuperado = new ObjectInputStream(flujo);
                usuario = (UsuarioFinanciero)usuarioRecuperado.readObject();
                usuarioRecuperado.close();
                flujo.close();
            } catch(FileNotFoundException ex){
                JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
            } catch(IOException ex){
                JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
            } catch(ClassNotFoundException ex ){
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return usuario;
    }
    
    //METODO PARA ACCEDER A UNA FACTURA
    public static Factura getFactura(int numero){
        Factura factura = null;
        File file = new File("Archivos/Facturas/"+numero+".fct");
        FileInputStream flujo = null;
        ObjectInputStream recuperador = null;
        try{
            flujo = new FileInputStream(file);
            recuperador = new ObjectInputStream(flujo);
            factura = (Factura)recuperador.readObject();
            flujo.close();
            recuperador.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(ClassNotFoundException ex ){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return factura;
    }
    
    //METODO PARA ACCEDER A UN MUEBLEGUIA
    public static MuebleBase getMuebleGuia(String nombre){
        MuebleBase mueble = null;
        File file = new File("Archivos/Guias/Muebles/"+nombre+".mbg");
        FileInputStream flujo = null;
        ObjectInputStream recuperador = null;
        try{
            flujo = new FileInputStream(file);
            recuperador = new ObjectInputStream(flujo);
            mueble = (MuebleBase)recuperador.readObject();
            flujo.close();
            recuperador.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(ClassNotFoundException ex ){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return mueble;
    }
    
    //METODO PARA ACCEDER A UN MUEBLE DE INVENTARIO
    public static MuebleInventario getMuebleInventario(String nombre){
        MuebleInventario mueble = null;
        File file = new File("Archivos/Inventario/Muebles/"+nombre+"/"+nombre+"#.mbi");
        FileInputStream flujo = null;
        ObjectInputStream recuperador = null;
        try{
            flujo = new FileInputStream(file);
            recuperador = new ObjectInputStream(flujo);
            mueble = (MuebleInventario)recuperador.readObject();
            flujo.close();
            recuperador.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(ClassNotFoundException ex ){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return mueble;
    }
    
    //METODO PARA ACCEDER A UN MUEBLE DE INVENTARIO ESPECIFICO
    public static MuebleInventario getMuebleInventarioEspecifico(String nombre, int numero){
        MuebleInventario mueble= null;
        File file = new File("Archivos/Inventario/Muebles/"+nombre+"/"+nombre+numero+".mbi");
        FileInputStream flujo = null;
        ObjectInputStream MuebleGuia = null;
        try{
            flujo = new FileInputStream(file);
            MuebleGuia = new ObjectInputStream(flujo);
            mueble = (MuebleInventario)MuebleGuia.readObject();
            MuebleGuia.close();
            flujo.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(ClassNotFoundException ex ){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return mueble;
    }
    
    //METODO PARA ACCEDER A UNA PIEZAGUIA
    public static Pieza getPiezaGuia(String nombre){
        Pieza pieza = null;
        File file = new File("Archivos/Guias/Piezas/"+nombre+".pzg");
        FileInputStream flujo = null;
        ObjectInputStream recuperador = null;
        try{
            flujo = new FileInputStream(file);
            recuperador = new ObjectInputStream(flujo);
            pieza = (Pieza)recuperador.readObject();
            flujo.close();
            recuperador.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(ClassNotFoundException ex ){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return pieza;
    }
    
    //METODO PARA ACCEDER A UNA PIEZA DE INVENTARIO
    public static PiezaInventario getPiezaInventario(String nombre){
        PiezaInventario pieza = null;
        File file = new File("Archivos/Inventario/Piezas/"+nombre+"/"+nombre+"#.pzi");
        FileInputStream flujo = null;
        ObjectInputStream recuperador = null;
        try{
            flujo = new FileInputStream(file);
            recuperador = new ObjectInputStream(flujo);
            pieza = (PiezaInventario)recuperador.readObject();
            flujo.close();
            recuperador.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(ClassNotFoundException ex ){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return pieza;
    }
    
    //METODO PARA ACCEER A UNA PIEZA DE INVENTARIO ESPECIFICA
    public static PiezaInventario getPiezaInventarioEspecifico(String nombre, int numero){
        PiezaInventario pieza = null;
        File file = new File("Archivos/Inventario/Piezas/"+nombre+"/"+nombre+numero+".pzi");
        FileInputStream flujo = null;
        ObjectInputStream recuperador = null;
        try{
            flujo = new FileInputStream(file);
            recuperador = new ObjectInputStream(flujo);
            pieza = (PiezaInventario)recuperador.readObject();
            flujo.close();
            recuperador.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(ClassNotFoundException ex ){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return pieza;
    }
   
    //METODO PARA ACCEDER A UNA VENTA
    public static Venta getVenta(String fecha, int numero){
        Venta venta = null;
        File file = new File("Archivos/Ventas/"+fecha+"/"+numero+".vnt");
        FileInputStream flujo = null;
        ObjectInputStream recuperador= null;
        try{
            flujo = new FileInputStream(file);
            recuperador = new ObjectInputStream(flujo);
            venta = (Venta)recuperador.readObject();
            recuperador.close();
            flujo.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(ClassNotFoundException ex ){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return venta;
    }
    
    //METODO PARA ACCEDER A UNA DEVOLUCION
    public static Devolucion getDevolucion(String fecha, int numero){
        Devolucion devolucion = null;
        File file = new File("Archivos/Devoluciones/"+fecha+"/"+numero+".dvl");
        FileInputStream flujo = null;
        ObjectInputStream recuperador= null;
        try{
            flujo = new FileInputStream(file);
            recuperador= new ObjectInputStream(flujo);
            devolucion = (Devolucion)recuperador.readObject();
            recuperador.close();
            flujo.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(ClassNotFoundException ex ){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return devolucion;
    }
    
    //METODO PARA ACCEDER A UNA COMPRA
    public static Compra getCompra(int nit, int numero){
        Compra compra = null;
        File file = new File("Archivos/Compras/"+nit+"/"+numero+".cmp");
        FileInputStream flujo = null;
        ObjectInputStream recuperador= null;
        try{
            flujo = new FileInputStream(file);
            recuperador = new ObjectInputStream(flujo);
            compra = (Compra)recuperador.readObject();
            recuperador.close();
            flujo.close();
        }
         catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al encontrar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al recuperar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(ClassNotFoundException ex ){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return compra;
    }
}
