package HILOS;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import mi.muebleria.Funcionamiento.Lector;
import mi.muebleria.MiMuebleria;

public class MostrarHilo implements Runnable {
    
    File file;
    
    public MostrarHilo(File file){
        this.file = file;
    }
    
    public void run(){
        MiMuebleria.inicio.interfazFinanciera.CargarDatos(file);
        for (int i = 0; i < Lector.getEjecucion().size(); i++) {
            MiMuebleria.inicio.interfazFinanciera.introducirDatos(Lector.getEjecucion().get(i));
            try {
                Thread.sleep(MiMuebleria.inicio.interfazFinanciera.tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(MostrarHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
