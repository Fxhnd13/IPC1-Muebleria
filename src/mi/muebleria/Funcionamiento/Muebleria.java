/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.muebleria.Funcionamiento;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import static mi.muebleria.Funcionamiento.Registro.getPiezaInventarioEspecifico;
import mi.muebleria.Muebles.MuebleInventario;
import mi.muebleria.Papeleria.Venta;
import mi.muebleria.Piezas.Pieza;
import mi.muebleria.Piezas.PiezaInventario;

public class Muebleria {
   
    static double gananciasTotales=0;
    
    //METODO PARA TENER UNA LISTA DE LAS PIEZAS DISPONIBLES
    public static ArrayList<PiezaInventario> PiezasDisponibles(String nombre){
        File file = new File("Archivos/Inventario/Piezas/"+nombre);
        ArrayList<PiezaInventario> piezas = new ArrayList();
        for (int i = 1; i <= file.list().length; i++) {
            if(getPiezaInventarioEspecifico(nombre,i).getUsable()){
                piezas.add(getPiezaInventarioEspecifico(nombre,i));
            }
        }
        //PiezaInventario[] piezasDisponibles = new PiezaInventario[piezas.size()];
        //for (int i = 0; i < piezas.size(); i++) {
        //    piezasDisponibles[i]=piezas.get(i);
        //}
        return piezas;
    }
    
    //METODO PARA TENER UNA LISTA DE LOS MUEBLES ENSAMBLADOS
    public static MuebleInventario[] MueblesEnsamblados(String nombre){
        File file = new File("Archivos/Inventario/Muebles/"+nombre);
        ArrayList<MuebleInventario> muebles = new ArrayList();
        for (int i = 1; i <=file.list().length ; i++) {
            if((!Registro.getMuebleInventarioEspecifico(nombre, i).getVenta())&&(!Registro.getMuebleInventarioEspecifico(nombre,i).getVendido())){
                muebles.add(Registro.getMuebleInventarioEspecifico(nombre, i));
            }
        }
        MuebleInventario[] mueblesEnsamblados = new MuebleInventario[muebles.size()];
        for (int i = 0; i < muebles.size(); i++) {
            mueblesEnsamblados[i]=muebles.get(i);
        }
        return mueblesEnsamblados;
    }
    
    //METODO PARA TENER UNA LISTA DE LOS MUEBLES EN VENTA
    public static MuebleInventario[] MueblesEnVenta(String nombre){
        File file = new File("Archivos/Inventario/Muebles/"+nombre);
        ArrayList<MuebleInventario> muebles = new ArrayList();
        for (int i = 1; i <=file.list().length; i++) {
            if((Registro.getMuebleInventarioEspecifico(nombre, i).getVenta())&&(!Registro.getMuebleInventarioEspecifico(nombre,i).getVendido())){
                muebles.add(Registro.getMuebleInventarioEspecifico(nombre, i));
            }
        }
        MuebleInventario[] mueblesEnsamblados = new MuebleInventario[muebles.size()];
        for (int i = 0; i < muebles.size(); i++) {
            mueblesEnsamblados[i]=muebles.get(i);
        }
        return mueblesEnsamblados;
    }
    
    //METODO PARA TENER UNA LISTA DE LOS MUEBLES SOLO ENSAMBLADOS
    public static MuebleInventario[] mueblesEnsamblados(String nombre){
        File file = new File("Archivos/Inventario/Muebles/"+nombre);
        ArrayList<MuebleInventario> muebles = new ArrayList();
        for (int i = 1; i <=file.list().length ; i++) {
            if((!Registro.getMuebleInventarioEspecifico(nombre,i).getVendido())){
                muebles.add(Registro.getMuebleInventarioEspecifico(nombre, i));
            }
        }
        MuebleInventario[] mueblesEnsamblados = new MuebleInventario[muebles.size()];
        for (int i = 0; i < muebles.size(); i++) {
            mueblesEnsamblados[i]=muebles.get(i);
        }
        return mueblesEnsamblados;
    }
    
    //METODO PARA TENER LISTA DE UN TIPO ESPECIFICO DE PIEZAS
    public static PiezaInventario[] Piezas(String nombre){
        File file = new File("Archivos/Inventario/Piezas/"+nombre);
        ArrayList<PiezaInventario> piezas = new ArrayList();
        for (int i = 1; i <= file.list().length; i++) {
            piezas.add(getPiezaInventarioEspecifico(nombre,i));
        }
        PiezaInventario[] piezasExistentes = new PiezaInventario[piezas.size()];
        for (int i = 0; i < piezas.size(); i++) {
            piezasExistentes[i]=piezas.get(i);
        }
        return piezasExistentes;
    }
    
    //METODO PARA EL CODIGO DE MUEBLES
    public static void conteoGeneralMuebles(){
        String[] arreglo = new String[nombresMueblesGuia().length];
        arreglo = nombresMueblesGuia();
        for (int i = 0; i < arreglo.length; i++) {
            File file = new File("Archivos/Inventario/Muebles/"+arreglo[i]);
            if(file.exists()){
                Registro.codigoGeneralMueble = Registro.codigoGeneralMueble+file.list().length;
            }
        }    
    }
    
    //METODO DE ARREGLO CON LOS NOMBRES DE LOS MUEBLES DISPONIBLES
    public static String[] nombresMueblesGuia(){
        File file = new File("Archivos/Guias/Muebles");
        String[] arreglo = new String[file.list().length];
        for (int i = 0; i < file.list().length; i++) {
            String linea = file.list()[i];
            String nombre = linea.substring(0,linea.length()-4);
            arreglo[i] = nombre;
        }
        return arreglo;
    }
    
    //METODO DE ARREGLO CON LOS NOMBRES DE LAS PIEZAS EXISTENTES
    public static String[] nombresPiezasGuia(){
        File file = new File("Archivos/Guias/Piezas");
        String[] arreglo = new String[file.list().length];
        for (int i = 0; i < file.list().length; i++) {
            String linea = file.list()[i];
            String nombre = linea.substring(0,linea.length()-4);
            arreglo[i]=nombre;
        }
        return arreglo;
    }
    
    //METODO PARA TENER LAS GANANCIAS TOTALES
    public static double gananciasTotales(){
        File file = new File("Archivos/Ventas");
        String[] arreglo = new String[file.list().length];
        if(file.list().length>0){
            for (int i = 0; i < file.list().length; i++) {
                File file2 = new File("Archivos/Ventas/"+file.list()[i]);
                if(file2.list().length>0){
                    for (int j = 0; j < file2.list().length; j++) {
                        gananciasTotales = gananciasTotales + Registro.getVenta(file.list()[i], j).getGanancia();
                    }
                }
            }
        }
    return gananciasTotales;
    }
    
    //METODO PARA HABILITAR UNA DEVOLUCION
    public static boolean devolucionValida(String fecha1, String fecha2){
        boolean valor=true;
        LocalDate fechaInicial;
        LocalDate fechaFinal;
        fechaInicial = LocalDate.parse(fecha1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        fechaFinal = LocalDate.parse(fecha2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period diferencia = fechaInicial.until(fechaFinal);
        if(diferencia.getYears()!=0){
            valor=false;
        }
        if(diferencia.getMonths()!=0){
            if(diferencia.getDays()>7){
                valor=false;
            }
        }else{
            if(diferencia.getDays()>7){
                valor=false;
            }
        }
        
        return valor;
    }
    
    //METODO PARA ACCEDER A LAS VENTAS EN UN PERIODO DE TIEMPO
    public static ArrayList<Venta> ventasEnIntervaloDeTiempo(LocalDate FechaInicial, LocalDate FechaFinal){
        ArrayList<Venta> ventas = new ArrayList();
        File file = new File("Archivos/Ventas");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (int i = 0; i < file.list().length; i++) {
            String fecha = file.list()[i].replace("_","/");
            LocalDate Fecha = LocalDate.parse(fecha, formato);
            if(Fecha.isAfter(FechaInicial)&&Fecha.isBefore(FechaFinal)){
                File file2 = new File("Archivos/Ventas/"+file.list()[i]);
                for (int j = 1; j <= file2.list().length; j++) {
                    Venta venta = Registro.getVenta(file.list()[i], j);
                    ventas.add(venta);
                }
            }
        }
    return ventas;
    }
    
    //METODO PARA ACCEDER A LAS VENTAS DE UN DIA
    public static ArrayList<Venta> ventasDe(String fecha){
        ArrayList<Venta> ventas = new ArrayList();
        String Fecha = fecha.replace("/","_");
        File file = new File("Archivos/Ventas/"+Fecha);
        for (int i = 0; i < file.list().length; i++) {
            Venta venta = Registro.getVenta(fecha, i);
            ventas.add(venta);
        }
        return ventas;
    }
    
    //METODO PARA BUSCAR UN MUEBLE POR SU CODIGO
    public static MuebleInventario mueblePorCodigo(int codigo){
        String[] nombresMuebles = new String[nombresMueblesGuia().length];
        nombresMuebles = nombresMueblesGuia();
        MuebleInventario mueble = null;
        for (int i = 0; i < nombresMuebles.length; i++) {
            File file = new File("Archivos/Inventario/Muebles/"+nombresMuebles[i]);
            for (int j = 1; j <= file.list().length; j++) {
                if(Registro.getMuebleInventarioEspecifico(nombresMuebles[i], j).getCodigo()==codigo){
                    mueble = Registro.getMuebleInventarioEspecifico(nombresMuebles[i], j);
                }
            }
        }
        return mueble;
    }
    
    //METODO PARA LAS PIEZAS DISPONIBLES
    public static Pieza[] piezasDisponibles(){
        String[] nombresPiezas = new String[nombresPiezasGuia().length];
        ArrayList<Pieza> piezas = new ArrayList();
        for (int i = 0; i < nombresPiezas.length; i++) {
            File file = new File("Archivos/Inventario/Piezas/"+nombresPiezas[i]);
            Pieza pieza = new Pieza(nombresPiezas[i]);
            pieza.setCantidad(PiezasDisponibles(nombresPiezas[i]).size());
            piezas.add(pieza);
        }
        Pieza[] piezass = new Pieza[piezas.size()];
        for (int i = 0; i < piezas.size(); i++) {
            piezass[i] = piezas.get(i);
        }
        return piezass;
    }
}
