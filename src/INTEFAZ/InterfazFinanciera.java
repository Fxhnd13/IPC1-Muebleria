package INTEFAZ;

import HILOS.MostrarHilo;
import java.io.File;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import mi.muebleria.Funcionamiento.Lector;
import mi.muebleria.Funcionamiento.Muebleria;
import mi.muebleria.Funcionamiento.Registro;
import mi.muebleria.Muebles.MuebleBase;
import mi.muebleria.Papeleria.Venta;
import mi.muebleria.Personas.UsuarioFabrica;
import mi.muebleria.Personas.UsuarioFinanciero;
import mi.muebleria.Personas.UsuarioVentas;

public class InterfazFinanciera extends javax.swing.JFrame {

    public InterfazFinanciera() {
        initComponents();
    }
    
    private UsuarioFinanciero usuario;
    private String orden;
    static DefaultListModel modelo = new DefaultListModel();
    static JList lista = new JList();
    public int tiempo;
    
    public void setUsuario(UsuarioFinanciero user){
        usuario=user;
        UsuarioActivo.setText(usuario.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogoFechas = new javax.swing.JDialog();
        LabelFecha1 = new javax.swing.JLabel();
        LabelFecha2 = new javax.swing.JLabel();
        FechaInicial = new javax.swing.JTextField();
        FechaFinal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        DialogoTablaVentas = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        ExportarVentas = new javax.swing.JButton();
        DialogoEjecucion = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaEjecucion = new javax.swing.JList<>();
        DialogoBuscador = new javax.swing.JDialog();
        Buscador = new javax.swing.JFileChooser();
        CrearMueble = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        MuebleCrear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        MueblePrecio = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        AgregarPieza = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MuebleAgregar = new javax.swing.JTextField();
        PiezaAgregar = new javax.swing.JTextField();
        Cantidad = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        EliminarPieza = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaPiezas = new javax.swing.JTable();
        NombreMuebleEliminar = new javax.swing.JTextField();
        Posicion = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        ModificarPrecio = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        EliminarMueble = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        MuebleEliminado = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        CrearUsuario = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreParaUsuario = new javax.swing.JTextField();
        PassWordParaUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AreaDeUsuario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        EliminarUsuario = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        NombreUsuarioEliminar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        LabelUsuario = new javax.swing.JLabel();
        UsuarioActivo = new javax.swing.JLabel();
        CargaDatos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Reportes = new javax.swing.JMenu();
        ReporteVentas = new javax.swing.JMenuItem();
        ReporteDevoluciones = new javax.swing.JMenuItem();
        ReporteGanancias = new javax.swing.JMenuItem();
        ReporteUsuarioVentas = new javax.swing.JMenuItem();
        ReporteMuebleMas = new javax.swing.JMenuItem();
        ReporteMuebleMenos = new javax.swing.JMenuItem();
        AdministracionMuebles = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        LabelFecha1.setText("Fecha Inicial: ");

        LabelFecha2.setText("Fecha Final: ");

        jButton1.setText("Iniciar Busqueda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogoFechasLayout = new javax.swing.GroupLayout(DialogoFechas.getContentPane());
        DialogoFechas.getContentPane().setLayout(DialogoFechasLayout);
        DialogoFechasLayout.setHorizontalGroup(
            DialogoFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoFechasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogoFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DialogoFechasLayout.createSequentialGroup()
                        .addComponent(LabelFecha1)
                        .addGap(18, 18, 18)
                        .addComponent(FechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DialogoFechasLayout.createSequentialGroup()
                        .addComponent(LabelFecha2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogoFechasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(68, 68, 68))
        );
        DialogoFechasLayout.setVerticalGroup(
            DialogoFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoFechasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogoFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DialogoFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Mueble vendido", "No. Factura", "Fecha", "Ganancia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaVentas);

        ExportarVentas.setText("Exportar a archivo HTML");

        javax.swing.GroupLayout DialogoTablaVentasLayout = new javax.swing.GroupLayout(DialogoTablaVentas.getContentPane());
        DialogoTablaVentas.getContentPane().setLayout(DialogoTablaVentasLayout);
        DialogoTablaVentasLayout.setHorizontalGroup(
            DialogoTablaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogoTablaVentasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(DialogoTablaVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExportarVentas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DialogoTablaVentasLayout.setVerticalGroup(
            DialogoTablaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoTablaVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(ExportarVentas)
                .addContainerGap())
        );

        ListaEjecucion.setModel(modelo);
        jScrollPane2.setViewportView(ListaEjecucion);

        javax.swing.GroupLayout DialogoEjecucionLayout = new javax.swing.GroupLayout(DialogoEjecucion.getContentPane());
        DialogoEjecucion.getContentPane().setLayout(DialogoEjecucionLayout);
        DialogoEjecucionLayout.setHorizontalGroup(
            DialogoEjecucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoEjecucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DialogoEjecucionLayout.setVerticalGroup(
            DialogoEjecucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoEjecucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogoBuscadorLayout = new javax.swing.GroupLayout(DialogoBuscador.getContentPane());
        DialogoBuscador.getContentPane().setLayout(DialogoBuscadorLayout);
        DialogoBuscadorLayout.setHorizontalGroup(
            DialogoBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoBuscadorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        DialogoBuscadorLayout.setVerticalGroup(
            DialogoBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Buscador, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        jLabel6.setText("Nombre del mueble: ");

        jLabel7.setText("Precio del mueble: ");

        jButton5.setText("Crear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearMuebleLayout = new javax.swing.GroupLayout(CrearMueble.getContentPane());
        CrearMueble.getContentPane().setLayout(CrearMuebleLayout);
        CrearMuebleLayout.setHorizontalGroup(
            CrearMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearMuebleLayout.createSequentialGroup()
                .addGroup(CrearMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearMuebleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CrearMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CrearMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MueblePrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MuebleCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CrearMuebleLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        CrearMuebleLayout.setVerticalGroup(
            CrearMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearMuebleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CrearMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(MuebleCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CrearMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(MueblePrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Nombre de la pieza:");

        jLabel9.setText("Nombre del mueble: ");

        jLabel10.setText("Cantidad:");

        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AgregarPiezaLayout = new javax.swing.GroupLayout(AgregarPieza.getContentPane());
        AgregarPieza.getContentPane().setLayout(AgregarPiezaLayout);
        AgregarPiezaLayout.setHorizontalGroup(
            AgregarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPiezaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgregarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AgregarPiezaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MuebleAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AgregarPiezaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(PiezaAgregar))
                    .addGroup(AgregarPiezaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        AgregarPiezaLayout.setVerticalGroup(
            AgregarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPiezaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgregarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(MuebleAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(PiezaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setText("Nombre del mueble: ");

        jLabel12.setText("Posicion:");

        TablaPiezas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Posicion", "Nombre pieza", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(TablaPiezas);

        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Eliminar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EliminarPiezaLayout = new javax.swing.GroupLayout(EliminarPieza.getContentPane());
        EliminarPieza.getContentPane().setLayout(EliminarPiezaLayout);
        EliminarPiezaLayout.setHorizontalGroup(
            EliminarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPiezaLayout.createSequentialGroup()
                .addGroup(EliminarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EliminarPiezaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(EliminarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EliminarPiezaLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EliminarPiezaLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EliminarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7)
                                    .addComponent(NombreMuebleEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(EliminarPiezaLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton8)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        EliminarPiezaLayout.setVerticalGroup(
            EliminarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPiezaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EliminarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(NombreMuebleEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(EliminarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel13.setText("Nombre Mueble: ");

        jLabel14.setText("Precio nuevo:");

        jButton9.setText("Modificar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModificarPrecioLayout = new javax.swing.GroupLayout(ModificarPrecio.getContentPane());
        ModificarPrecio.getContentPane().setLayout(ModificarPrecioLayout);
        ModificarPrecioLayout.setHorizontalGroup(
            ModificarPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarPrecioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModificarPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ModificarPrecioLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ModificarPrecioLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        ModificarPrecioLayout.setVerticalGroup(
            ModificarPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarPrecioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModificarPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Nombre Mueble: ");

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EliminarMuebleLayout = new javax.swing.GroupLayout(EliminarMueble.getContentPane());
        EliminarMueble.getContentPane().setLayout(EliminarMuebleLayout);
        EliminarMuebleLayout.setHorizontalGroup(
            EliminarMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarMuebleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EliminarMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(MuebleEliminado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EliminarMuebleLayout.setVerticalGroup(
            EliminarMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarMuebleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EliminarMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MuebleEliminado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Contraseña:");

        jLabel3.setText("Area:");

        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearUsuarioLayout = new javax.swing.GroupLayout(CrearUsuario.getContentPane());
        CrearUsuario.getContentPane().setLayout(CrearUsuarioLayout);
        CrearUsuarioLayout.setHorizontalGroup(
            CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CrearUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NombreParaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CrearUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PassWordParaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CrearUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AreaDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CrearUsuarioLayout.setVerticalGroup(
            CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreParaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassWordParaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AreaDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Nombre de usuario: ");

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EliminarUsuarioLayout = new javax.swing.GroupLayout(EliminarUsuario.getContentPane());
        EliminarUsuario.getContentPane().setLayout(EliminarUsuarioLayout);
        EliminarUsuarioLayout.setHorizontalGroup(
            EliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarUsuarioLayout.createSequentialGroup()
                .addGroup(EliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EliminarUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(NombreUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EliminarUsuarioLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        EliminarUsuarioLayout.setVerticalGroup(
            EliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NombreUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelUsuario.setText("Usuario Activo: ");

        CargaDatos.setText("Cargar Datos");
        CargaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaDatosActionPerformed(evt);
            }
        });

        Reportes.setText("Reportes");

        ReporteVentas.setText("Reporte de Ventas");
        ReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteVentasActionPerformed(evt);
            }
        });
        Reportes.add(ReporteVentas);

        ReporteDevoluciones.setText("Reporte de devoluciones");
        ReporteDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteDevolucionesActionPerformed(evt);
            }
        });
        Reportes.add(ReporteDevoluciones);

        ReporteGanancias.setText("Reporte de ganancias");
        ReporteGanancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteGananciasActionPerformed(evt);
            }
        });
        Reportes.add(ReporteGanancias);

        ReporteUsuarioVentas.setText("Reporte de usuario con mas ventas");
        ReporteUsuarioVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteUsuarioVentasActionPerformed(evt);
            }
        });
        Reportes.add(ReporteUsuarioVentas);

        ReporteMuebleMas.setText("Reporte de mueble más vendido");
        ReporteMuebleMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteMuebleMasActionPerformed(evt);
            }
        });
        Reportes.add(ReporteMuebleMas);

        ReporteMuebleMenos.setText("Reporte de mueble menos vendido");
        ReporteMuebleMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteMuebleMenosActionPerformed(evt);
            }
        });
        Reportes.add(ReporteMuebleMenos);

        jMenuBar1.add(Reportes);

        AdministracionMuebles.setText("Administracion ");
        AdministracionMuebles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdministracionMueblesMouseClicked(evt);
            }
        });

        jMenu1.setText("Muebles");

        jMenuItem3.setText("Crear");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Eliminar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenu2.setText("Modificar");

        jMenuItem5.setText("Agregar Pieza");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Remover Pieza");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Precio");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenu1.add(jMenu2);

        AdministracionMuebles.add(jMenu1);

        jMenu3.setText("Usuarios");

        jMenuItem1.setText("Crear Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem8.setText("Cancelar Usuario");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        AdministracionMuebles.add(jMenu3);

        jMenuBar1.add(AdministracionMuebles);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelUsuario)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CargaDatos)
                        .addGap(80, 80, 80)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(UsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CargaDatos)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteVentasActionPerformed
        DialogoFechas.setVisible(true);
        orden="VENTAS";
    }//GEN-LAST:event_ReporteVentasActionPerformed

    private void ReporteMuebleMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteMuebleMasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReporteMuebleMasActionPerformed

    private void ReporteDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteDevolucionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReporteDevolucionesActionPerformed

    private void ReporteGananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteGananciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReporteGananciasActionPerformed

    private void ReporteUsuarioVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteUsuarioVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReporteUsuarioVentasActionPerformed

    private void ReporteMuebleMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteMuebleMenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReporteMuebleMenosActionPerformed

    private void AdministracionMueblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdministracionMueblesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AdministracionMueblesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DialogoFechas.setVisible(false);
        LocalDate fechaDeInicio=null;
        LocalDate fechaDeFinal=null;
        if(FechaInicial.getText().isEmpty()){
            fechaDeInicio = LocalDate.of(1000, 01, 01);
        }else{
            if(Lector.fechaValida(FechaInicial.getText())!=null){
                fechaDeInicio=Lector.fechaValida(FechaInicial.getText());
            }else{
                JOptionPane.showMessageDialog(null, "Una o ambas fechas no son validas", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(FechaFinal.getText().isEmpty()){
            fechaDeFinal=LocalDate.of(9999, 01, 01);
        }else{
            if(Lector.fechaValida(FechaFinal.getText())!=null){
                fechaDeInicio=Lector.fechaValida(FechaFinal.getText());
            }else{
                JOptionPane.showMessageDialog(null, "Una o ambas fechas no son validas", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(orden.equals("VENTAS")){
            Venta[] ventas = new Venta[Muebleria.ventasEnIntervaloDeTiempo(fechaDeInicio,fechaDeFinal).size()];
            for (int i = 0; i < ventas.length; i++) {
                    ventas[i] = Muebleria.ventasEnIntervaloDeTiempo(fechaDeInicio, fechaDeFinal).get(i);
            }
                String[][] arreglo = new String[ventas.length][4];
                for (int i = 0; i < ventas.length; i++) {
                    arreglo[i][0]=ventas[i].getMuebleVendido().getNombreMueble();
                    arreglo[i][1]=String.valueOf(ventas[i].getFactura().getNumero());
                    arreglo[i][2]=ventas[i].getFecha();
                    arreglo[i][3]=String.valueOf(ventas[i].getGanancia());
                }

                TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
                arreglo,
                new String [] {
                    "Mueble vendido", "No. de Factura", "Fecha", "Ganancia"
                }
            ));
            DialogoTablaVentas.setVisible(true);
        }
        FechaInicial.setText("");
        FechaFinal.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CargaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaDatosActionPerformed
        DialogoBuscador.setVisible(true);
    }//GEN-LAST:event_CargaDatosActionPerformed

    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed
        String comando = evt.getActionCommand();
        if(comando.equals(JFileChooser.APPROVE_SELECTION)){
            tiempo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tiempo entre ejecucion de linea a linea: ","Tiempo", JOptionPane.QUESTION_MESSAGE));            
            DialogoBuscador.setVisible(false);
            DialogoEjecucion.setVisible(true);
            Runnable mostrarDatos = new MostrarHilo(Buscador.getSelectedFile());
            Thread hilo = new Thread(mostrarDatos);
            hilo.start();
        }
        if(comando.equals(JFileChooser.CANCEL_SELECTION)){
            Buscador.setVisible(false);
        }
    }//GEN-LAST:event_BuscadorActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CrearMueble.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        EliminarMueble.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        AgregarPieza.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        EliminarPieza.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ModificarPrecio.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CrearUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        EliminarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        if(NombreParaUsuario.getText().isEmpty()||PassWordParaUsuario.getText().isEmpty()||AreaDeUsuario.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            File file = new File("Archivos/Usuarios/Fabrica/"+NombreParaUsuario.getText()+".usr");
            if(file.exists())valorLogico=false;
            file = new File("Archivos/Usuarios/Ventas/"+NombreParaUsuario.getText()+".usr");
            if(file.exists())valorLogico=false;
            file = new File("Archivos/Usuarios/Administracion/"+NombreParaUsuario.getText()+".usr");
            if(file.exists())valorLogico=false;
            if(!valorLogico)JOptionPane.showMessageDialog(null,"Ya existe un usuario con ese nombre","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            try{
                Integer.parseInt(AreaDeUsuario.getText());
            }catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null,"No se ingreso un valor numerico en el area","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            if(valorLogico&&valorFormato){
                if(!(Integer.parseInt(AreaDeUsuario.getText())==1)||!(Integer.parseInt(AreaDeUsuario.getText())==2)||!(Integer.parseInt(AreaDeUsuario.getText())==3)){
                    valorLogico=false;
                    JOptionPane.showMessageDialog(null, "No existe el area indicada","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if(valorLogico&&valorFormato){
            if(PassWordParaUsuario.getText().length()<6){
                valorFormato=false;
                JOptionPane.showMessageDialog(null,"La contraseña debe tener al menos 6 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            if(Integer.parseInt(AreaDeUsuario.getText())==1){
                UsuarioFabrica usuario = new UsuarioFabrica(NombreParaUsuario.getText(),PassWordParaUsuario.getText());
                Registro.GuadarUsuarioFabrica(usuario);
            }
            if(Integer.parseInt(AreaDeUsuario.getText())==2){
                UsuarioVentas usuario = new UsuarioVentas(NombreParaUsuario.getText(),PassWordParaUsuario.getText());
                Registro.GuardarUsuarioVentas(usuario);
            }
            if(Integer.parseInt(AreaDeUsuario.getText())==3){
                UsuarioFinanciero usuario = new UsuarioFinanciero(NombreParaUsuario.getText(),PassWordParaUsuario.getText());
                Registro.GuardarUsuarioAdministracion(usuario);
            }
        }
        NombreParaUsuario.setText("");
        PassWordParaUsuario.setText("");
        AreaDeUsuario.setText("");
        CrearUsuario.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        String nombre=null;
        int ubicacion=0;
        if(NombreUsuarioEliminar.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null, "Debe llenar el campo","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            nombre=NombreUsuarioEliminar.getText();
            File file = new File("Archivos/Usuarios/Fabrica/"+nombre);
            File file2 = new File("Archivos/Usuarios/Ventas/"+nombre);
            File file3 = new File("Archivos/Usuarios/Adminstracion/"+nombre);
            if(!file.exists()||!file2.exists()||!file3.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "No existe el usuario ingresado","ERROR",JOptionPane.ERROR_MESSAGE);
            }else{
                if(file.exists()){
                    ubicacion=1;
                }
                if(file2.exists()){
                    ubicacion=2;
                }
                if(file3.exists()){
                    ubicacion=3;
                }
            }
        }
        if(valorLogico&&valorFormato){
            if(ubicacion==1){
                UsuarioFabrica usuario = Registro.getUsuarioFabrica(nombre);
                usuario.setActivo();
                Registro.SobreEscribirUsuarioFabrica(usuario, usuario.getDireccion());
            }
            if(ubicacion==2){
                UsuarioVentas usuario = Registro.getUsuarioVentas(nombre);
                usuario.setActivo();
                Registro.SobreEscribirUsuarioVentas(usuario, usuario.getDireccion());
            }
            if(ubicacion==3){
                UsuarioFinanciero usuario = Registro.getUsuarioAdministracion(nombre);
                usuario.setActivo();
                Registro.SobreEscribirUsuarioAdministracion(usuario, usuario.getDireccion());
            }
        }
        NombreUsuarioEliminar.setText("");
        EliminarUsuario.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        String nombre = null;
        if(MuebleEliminado.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null, "Debe llenar el campo","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            nombre = MuebleEliminado.getText();
            File file = new File("Archivos/Guias/Muebles/"+nombre+".mbg");
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "No existe el mueble que se ingreso","ERROR",JOptionPane.ERROR_MESSAGE);  
            }
        }
        if(valorLogico&&valorFormato){
            File file = new File("Archivos/Guias/Muebles/"+nombre+".mbg");
            file.delete();
            file = new File("Archivos/Inventario/Muebles/"+nombre);
            file.delete();
        }
        MuebleEliminado.setText("");
        EliminarMueble.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String nombre=null;
        double precio=0;
        boolean valorLogico=true;
        boolean valorFormato=true;
        if(MuebleCrear.getText().isEmpty()||MueblePrecio.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            try{
                precio= Double.parseDouble(MueblePrecio.getText());
            }catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null, "No se ingreso un valor numerico en el precio","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            nombre=MuebleCrear.getText();
        }
        if(valorLogico&&valorFormato){
            File file = new File("Archivos/Guias/Muebles/"+nombre+".mbg");
            if(file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "Ya existe un mueble con ese nombre","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            MuebleBase mueble = new MuebleBase(nombre,precio);
            Registro.GuardarMuebleGuia(mueble);
        }
        MuebleCrear.setText("");
        MueblePrecio.setText("");
        CrearMueble.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String nombre=null;
        String nombrePieza=null;
        int cantidad=0;
        boolean valorLogico=true;
        boolean valorFormato=true;
        if(MuebleAgregar.getText().isEmpty()||PiezaAgregar.getText().isEmpty()||Cantidad.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            try{
                cantidad = Integer.parseInt(Cantidad.getText());
            }catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null, "No se ingreso un valor numerico en la cantidad","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            nombre=MuebleAgregar.getText();
            nombrePieza=PiezaAgregar.getText();
        }
        if(valorLogico&&valorFormato){
            File file = new File("Archivos/Guias/Muebles/"+nombre+".mbg");
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "El mueble seleccionado no existe","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            file = new File("Archivos/Guias/Piezas/"+nombrePieza+".pzg");
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "la pieza seleccionada no existe","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            MuebleBase mueble = Registro.getMuebleGuia(nombre);
            mueble.NuevaPieza(nombrePieza, cantidad);
            Registro.SobreEscribirMuebleGuia(mueble, mueble.getDireccion());
        }
        MuebleAgregar.setText("");
        PiezaAgregar.setText("");
        Cantidad.setText("");
        AgregarPieza.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String nombre=null;
        boolean valorLogico=true;
        boolean valorFormato=true;
        if(NombreMuebleEliminar.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null, "Debe llenar el campo del nombre del mueble","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            nombre = NombreMuebleEliminar.getText();
            File file = new File("Archivos/Guias/Muebles/"+nombre+".mbg");
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "El mueble seleccionado no existe","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        String[][] arreglo = new String[Registro.getMuebleGuia(nombre).getPiezas().size()][3];
        for (int i = 0; i < Registro.getMuebleGuia(nombre).getPiezas().size(); i++) {
            arreglo[i][0] = String.valueOf(i);
            arreglo[i][1] = Registro.getMuebleGuia(nombre).getPiezas().get(i).getNombrePieza();
            arreglo[i][2] = String.valueOf(Registro.getMuebleGuia(nombre).getPiezas().get(i).getCantidad());
        }
        TablaPiezas.setModel(new javax.swing.table.DefaultTableModel(
            arreglo, 
            new String[] {
                "Posicon","Nombre Pieza","Cantidad"
            }));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String nombre=null;
        int posicion=0;
        boolean valorLogico=true;
        boolean valorFormato=true;
        if(NombreMuebleEliminar.getText().isEmpty()||Posicion.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            try{
                posicion = Integer.parseInt(Posicion.getText());
            }catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null, "No se ingreso un valor numerico en la posicion","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            nombre=NombreMuebleEliminar.getText();
        }
        if(valorLogico&&valorFormato){
            if(Registro.getMuebleGuia(nombre).getPiezas().size()<posicion){
                valorLogico=false;
                JOptionPane.showMessageDialog(null,"La posicion que ingreso no existe","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            MuebleBase mueble = Registro.getMuebleGuia(nombre);
            mueble.getPiezas().remove(posicion);
            Registro.SobreEscribirMuebleGuia(mueble, mueble.getDireccion());
        }
        NombreMuebleEliminar.setText("");
        Posicion.setText("");
        EliminarPieza.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String nombre=null;
        double precio = 0;
        boolean valorLogico=true;
        boolean valorFormato=true;
        if(Nombre.getText().isEmpty()||Precio.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            nombre = Nombre.getText();
            File file = new File("Archivos/Guias/Muebles/"+nombre+".mbg");
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "El mueble seleccionado no existe","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            try{
                precio = Double.parseDouble(Precio.getText());
            }catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null, "No ingreso un valor numerico en el precio","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            MuebleBase mueble = Registro.getMuebleGuia(nombre);
            mueble.setPrecio(precio);
            Registro.SobreEscribirMuebleGuia(mueble, mueble.getDireccion());
        }
        Nombre.setText("");
        Precio.setText("");
        ModificarPrecio.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    public void introducirDatos(String dato){
        modelo.addElement(dato);
        ListaEjecucion.setModel(modelo);
    }
    
    public void CargarDatos(File file){
        File Archivo =file;
        Lector.asignarLineas(Archivo);
        for (int i = 0; i < Lector.getOrdenes().size(); i++) {
            if(Lector.erroresLectura(Lector.getOrdenes().get(i))){
                Lector.realizarOrdenLectura(Lector.getOrdenes().get(i));
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazFinanciera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazFinanciera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazFinanciera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazFinanciera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazFinanciera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdministracionMuebles;
    private javax.swing.JDialog AgregarPieza;
    private javax.swing.JTextField AreaDeUsuario;
    private javax.swing.JFileChooser Buscador;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JButton CargaDatos;
    private javax.swing.JDialog CrearMueble;
    private javax.swing.JDialog CrearUsuario;
    private javax.swing.JDialog DialogoBuscador;
    private javax.swing.JDialog DialogoEjecucion;
    private javax.swing.JDialog DialogoFechas;
    private javax.swing.JDialog DialogoTablaVentas;
    private javax.swing.JDialog EliminarMueble;
    private javax.swing.JDialog EliminarPieza;
    private javax.swing.JDialog EliminarUsuario;
    private javax.swing.JButton ExportarVentas;
    private javax.swing.JTextField FechaFinal;
    private javax.swing.JTextField FechaInicial;
    private javax.swing.JLabel LabelFecha1;
    private javax.swing.JLabel LabelFecha2;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JList<String> ListaEjecucion;
    private javax.swing.JDialog ModificarPrecio;
    private javax.swing.JTextField MuebleAgregar;
    private javax.swing.JTextField MuebleCrear;
    private javax.swing.JTextField MuebleEliminado;
    private javax.swing.JTextField MueblePrecio;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreMuebleEliminar;
    private javax.swing.JTextField NombreParaUsuario;
    private javax.swing.JTextField NombreUsuarioEliminar;
    private javax.swing.JTextField PassWordParaUsuario;
    private javax.swing.JTextField PiezaAgregar;
    private javax.swing.JTextField Posicion;
    private javax.swing.JTextField Precio;
    private javax.swing.JMenuItem ReporteDevoluciones;
    private javax.swing.JMenuItem ReporteGanancias;
    private javax.swing.JMenuItem ReporteMuebleMas;
    private javax.swing.JMenuItem ReporteMuebleMenos;
    private javax.swing.JMenuItem ReporteUsuarioVentas;
    private javax.swing.JMenuItem ReporteVentas;
    private javax.swing.JMenu Reportes;
    private javax.swing.JTable TablaPiezas;
    private javax.swing.JTable TablaVentas;
    private javax.swing.JLabel UsuarioActivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
