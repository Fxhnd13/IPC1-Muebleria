package mi.muebleria;

import INTEFAZ.INICIO;
import java.io.File;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.util.concurrent.TimeUnit.DAYS;
import javax.swing.JOptionPane;
import mi.muebleria.Funcionamiento.Lector;
import mi.muebleria.Funcionamiento.Muebleria;
import mi.muebleria.Funcionamiento.Registro;
import mi.muebleria.Muebles.MuebleBase;
import mi.muebleria.Piezas.Pieza;

public class MiMuebleria {
    
    public static INICIO inicio;
    
    public static void main(String[] args) {
        File file = new File("Archivos");
        if(!file.exists()){
            Registro.CrearCarpetas();
            JOptionPane.showMessageDialog(null,"Se ha creado un usuario inicial\nNombre: Administrador\nContraseña: 123456789","Usuario Inicial", JOptionPane.INFORMATION_MESSAGE);
        }
        inicio = new INICIO();
        inicio.setVisible(true);
    }
}
