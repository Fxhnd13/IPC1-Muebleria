package mi.muebleria.Funcionamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mi.muebleria.Muebles.MuebleBase;
import mi.muebleria.Muebles.MuebleInventario;
import mi.muebleria.Personas.UsuarioFabrica;
import mi.muebleria.Personas.UsuarioFinanciero;
import mi.muebleria.Personas.UsuarioVentas;
import mi.muebleria.Piezas.Pieza;
import mi.muebleria.Piezas.PiezaInventario;

public class Lector {
    
    static private ArrayList<String> ejecucion = new ArrayList<String>();//variable de lo que se realizo
    static private ArrayList<String> ordenes = new ArrayList<String>();//variable de lo que se debe realizar
       
    public static boolean erroresLectura(String a){
        boolean valor =true; 
        boolean valorLogico=true;
        boolean valorFormato=true;
        String linea = a;
        int posicion = linea.indexOf("(");
        String orden = linea.substring(0,posicion);
        String datos = linea.substring(posicion+1,linea.length()-1);
        String[] arreglo = new String[datos.split(",").length];
        arreglo = datos.split(",");
        if (orden.equals("USUARIO")){
            if(arreglo.length!=3){
                valorFormato=false;
                ejecucion.add("Error en el formato, no estan completos los campos");
            }
            if(valorLogico&&valorFormato){
                try{
                    Integer.parseInt(arreglo[2]);
                } catch(NumberFormatException e){
                    valorFormato=false;
                    ejecucion.add("Error en el formato, no se ingresó un número");
                }
            }
            if(valorLogico&&valorFormato){
                if(!(((Integer.parseInt(arreglo[2]))==1)||((Integer.parseInt(arreglo[2]))==2)||((Integer.parseInt(arreglo[2]))==3))){
                    valorLogico=false;
                    ejecucion.add("Error lógico, no existe el area seleccionada");
                }
            }
            if(valorLogico&&valorFormato){
                String nombre = eliminarComillas(arreglo[0]);
                int tipo = Integer.parseInt(arreglo[2]);
                File file = null;
                file = new File("Archivos/Usuarios/Fabrica/"+nombre+".usr");
                if(file.exists())valorLogico=false;
                file = new File("Archivos/Usuarios/Ventas/"+nombre+".usr");
                if(file.exists())valorLogico=false;
                file = new File("Archivos/Usuarios/Administracion/"+nombre+".usr");
                if(file.exists())valorLogico=false;
                if(!valorLogico)ejecucion.add("Error logico, un usuario con ese nombre ya existe");
            }
            if(valorLogico&&valorFormato){
                String nombre= eliminarComillas(arreglo[0]);
                if (nombre.length()<1)valorFormato=false;
                String password = eliminarComillas(arreglo[1]);
                if (password.length()<6){
                    valorFormato=false;
                    ejecucion.add("Error Formato, la constraseña debe tener mas de 6 caracteres");
                }
            }
            if(!valorLogico||!valorFormato)valor=false;
        }
        if(orden.equals("PIEZA")){
            if(arreglo.length!=2){
                valorFormato=false;
                ejecucion.add("Error de formato, no estan todos los campos necesarios llenos");
            }
            if(valorLogico&&valorFormato){
                try{
                    Double.parseDouble(arreglo[1]);
                }catch(NumberFormatException e){
                    valorLogico=false;
                    ejecucion.add("Error de formato, no se ingreso un valor numerico");
                }
            }
            if(valorLogico&&valorFormato){
                String nombre = eliminarComillas(arreglo[0]);
                if(nombre.length()<1){
                    valorFormato=false;
                    ejecucion.add("Error de formato, la pieza debe tener al menos un caracter para ser procesada");
                }
            }
        }
        if(orden.equals("MUEBLE")){
            if(arreglo.length!=2){
                valorFormato=false;
                ejecucion.add("Error de formato, no se encuentran todos los campos necesarios");
            }
            String nombre=null;
            if(valorLogico&&valorFormato){
                nombre = eliminarComillas(arreglo[0]);
            }
            if(valorLogico&&valorFormato){
                try{
                    Double.parseDouble(arreglo[1]);
                }catch(NumberFormatException e){
                    valorFormato=false;
                    ejecucion.add("Error de formato, no se ingreso un valor numerico");
                }
            }
            if(valorLogico&&valorFormato){
                File file = new File("Archivos/Guias/Muebles/"+nombre+".mbg");
                if(file.exists()){
                    valorLogico=false;
                    ejecucion.add("Error logico, el archivo ya existe");
                }
            }
            if(valorLogico&&valorFormato){
                if(nombre.length()<1){
                    valorFormato=false;
                    ejecucion.add("Error de formato, el mueble debe tener al menos un caracter para ser procesado");
                }
            }
        }
        if(orden.equals("MUEBLE_PIEZAS")){
            String nombreMueble = null;
            String nombrePieza = null;
            if(arreglo.length!=3){
                valorFormato=false;
                ejecucion.add("Error de formato, no se encuentran todos los campos necesarios");
            }
            if(valorLogico&&valorFormato){
                nombreMueble= eliminarComillas(arreglo[0]);
                nombrePieza = eliminarComillas(arreglo[1]);
            }
            if(valorLogico&&valorFormato){
                try{
                    Integer.parseInt(arreglo[2]);
                } catch(NumberFormatException e ){
                    valorFormato=false;
                    ejecucion.add("Error de formato, no se ingreso un valor numerico");
                }
            }
            if(valorLogico&&valorFormato){
                File file = new File("Archivos/Guias/Muebles/"+nombreMueble+".mbg");
                if(!file.exists()){
                    valorLogico=false;
                    ejecucion.add("Error logico, la pieza/mueble no existe");
                }
                file = new File("Archivos/Guias/Piezas/"+nombrePieza+".pzg");
                if(!file.exists()){
                    valorLogico=false;
                    ejecucion.add("Error logico, la pieza/mueble no existe");
                }
            }
        }
        if(orden.equals("ENSAMBLAR_MUEBLE")){
            String nombreMueble = null;
            MuebleBase mueble = null;
            String nombreUsuario = null;
            String fecha= null;
            if(arreglo.length!=3){
                valorFormato=false;
                ejecucion.add("Error de formato, no se encuentran todos los campos necesarios");
            }
            if(valorLogico&&valorFormato){
                nombreMueble = eliminarComillas(arreglo[0]);
                mueble = Registro.getMuebleGuia(nombreMueble);
                nombreUsuario = arreglo[1];
                fecha = eliminarComillas(arreglo[2]);
            }
            if(valorLogico&&valorFormato){
                if(Registro.getUsuarioFabrica(nombreUsuario)==null){
                    valorLogico=false;
                    ejecucion.add("Error logico, un usuario que no sea de la fabrica no puede ensamblar");
                }   
            }
            if(valorLogico&&valorFormato){ 
                if(Registro.getMuebleGuia(nombreMueble)==null){
                    valorLogico=false;
                    ejecucion.add("Error logico, el mueble seleccionado no existe");
                }
            }
            if(valorLogico&&valorFormato){
                try{
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate.parse(fecha, formato);
                } catch(DateTimeParseException e){
                    ejecucion.add("Error de formato, la fecha ingresada no existe o no es una fecha");
                    valorFormato=false;
                }
            }
            if(valorLogico&&valorFormato){
                for (int i = 0; i < mueble.getPiezas().size(); i++) {
                    if(mueble.getPiezas().get(i).getCantidad()>Muebleria.PiezasDisponibles(mueble.getPiezas().get(i).getNombrePieza()).size()){
                     valorLogico=false;
                     ejecucion.add("Error logico, no se encuentran la cantidad de piezas necesarias para hacer el mueble seleccionado");
                    }
                }
            }
        }
        if(!valorLogico||!valorFormato)valor=false;
        return valor;
    }
    
    public static void realizarOrdenLectura(String a){
        int posicionParentesis = a.indexOf("(");
        String orden = a.substring(0,posicionParentesis);
        String datos = a.substring(posicionParentesis+1,a.length()-1);
        String[] arreglo = new String[datos.split(",").length];
        arreglo = datos.split(",");
        if(orden.equals("USUARIO")){
            String nombre = eliminarComillas(arreglo[0]);
            String password = eliminarComillas(arreglo[1]);
            int tipo = Integer.parseInt(arreglo[2]);
            if(tipo==1){
                UsuarioFabrica usuario = new UsuarioFabrica(nombre, password);
                Registro.GuadarUsuarioFabrica(usuario);
            }
            if(tipo==2){
                UsuarioVentas usuario = new UsuarioVentas(nombre, password);
                Registro.GuardarUsuarioVentas(usuario);
            }
            if(tipo==3){
                UsuarioFinanciero usuario = new UsuarioFinanciero(nombre, password);
                Registro.GuardarUsuarioAdministracion(usuario);
            }   
            ejecucion.add("Usuario creado con exito");
        }
        if(orden.equals("PIEZA")){
            String nombre = eliminarComillas(arreglo[0]);
            double precio = Double.parseDouble(arreglo[1]);
            PiezaInventario pieza = new PiezaInventario(nombre,precio);
            Registro.GuardarPiezaInventario(pieza);
            File file = new File("Archivos/Guias/Piezas/"+nombre+".mbg");
            if(!file.exists()){
                Pieza pieza1 = new Pieza(nombre);
                Registro.GuardarPiezaGuia(pieza1);
            }
            ejecucion.add("Pieza agregada con exito");
        }
        if(orden.equals("MUEBLE")){
            String nombre = eliminarComillas(arreglo[0]);
            double precio = Double.parseDouble(arreglo[1]);
            MuebleBase mueble = new MuebleBase(nombre,precio);
            Registro.GuardarMuebleGuia(mueble);
            ejecucion.add("Mueble creado con exito");
        }
        if(orden.equals("MUEBLE_PIEZAS")){
            String nombreMueble = eliminarComillas(arreglo[0]);
            String nombrePieza = eliminarComillas(arreglo[1]);
            int cantidad = Integer.parseInt(arreglo[2]);
            MuebleBase mueble = Registro.getMuebleGuia(nombreMueble);
            mueble.NuevaPieza(nombrePieza, cantidad);
            Registro.GuardarMuebleGuia(mueble);
            ejecucion.add("Pieza "+ nombrePieza+ " agregada al mueble "+nombreMueble);
        }
        if(orden.equals("ENSAMBLAR_MUEBLE")){
            String nombreMueble = eliminarComillas(arreglo[0]);
            String nombreUsuario = arreglo[1];
            String fecha = eliminarComillas(arreglo[2]);
            MuebleBase mueble = Registro.getMuebleGuia(nombreMueble);
            Pieza[] piezasNecesarias = new Pieza[mueble.getPiezas().size()];
            for (int i = 0; i < mueble.getPiezas().size(); i++) {
                piezasNecesarias[i] = mueble.getPiezas().get(i);
            }
            for (int i = 0; i < piezasNecesarias.length; i++) {
                PiezaInventario[] piezasDisponibles = new PiezaInventario[Muebleria.PiezasDisponibles(piezasNecesarias[i].getNombrePieza()).size()];
                for (int j = 0; j < Muebleria.PiezasDisponibles(piezasNecesarias[i].getNombrePieza()).size(); j++) {
                    piezasDisponibles[j] = Muebleria.PiezasDisponibles(piezasNecesarias[i].getNombrePieza()).get(j);
                }
                for (int j = 0; j < piezasNecesarias[i].getCantidad(); j++) {
                    piezasDisponibles[j].setUsable(false);
                }
                for (int j = 0; j < piezasDisponibles.length; j++) {
                    Registro.sobreEscribirPiezaInventario(piezasDisponibles[j], piezasDisponibles[j].getDireccion());
                }
            }
            MuebleInventario muebleInventario = new MuebleInventario(nombreUsuario,mueble.getPrecio(),nombreMueble,fecha);
            Registro.GuardarMuebleInventario(muebleInventario);
            ejecucion.add("Mueble Ensamblado");
        }
    }
        
    public static void asignarLineas(File file){
    FileReader flujo;
    BufferedReader lectura = null;
    try {
        flujo = new FileReader(file);
        lectura = new BufferedReader(flujo);
        String a;
            while((a=lectura.readLine())!=null){
                    ordenes.add(a);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error: no se encontro el archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error: no se pudo acceer al archivo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ArrayList<String> getOrdenes(){
        return ordenes;
    }
    
    public static ArrayList<String> getEjecucion(){
        return ejecucion;
    }
    
    public static String eliminarComillas(String a){
        String cadena=null;
        cadena = a.substring(1,a.length()-1);
    return cadena;
    }
    
    public static boolean compararFechas(String fecha1, String fecha2){
        boolean valor = false;
        int dia1= Integer.parseInt(fecha1.split("/")[0]);
        int mes1= Integer.parseInt(fecha1.split("/")[1]);
        int ano1= Integer.parseInt(fecha1.split("/")[2]);
        int dia2= Integer.parseInt(fecha2.split("/")[0]);
        int mes2= Integer.parseInt(fecha2.split("/")[1]);
        int ano2= Integer.parseInt(fecha2.split("/")[2]);
        if(ano2>ano1) valor=true;
        if((ano2==ano1)&&(mes2>mes1)) valor=true;
        if((ano2==ano1)&&(mes2==mes1)&&(dia2>dia1)) valor=true;
    return valor;
    }
    
    public static LocalDate fechaValida(String fecha){
        boolean valor=true;
        LocalDate Fecha=null;
        try{
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            Fecha = LocalDate.parse(fecha, formato);
        } catch(DateTimeParseException e){
            valor=false;
        }
        return Fecha;
    }
}
