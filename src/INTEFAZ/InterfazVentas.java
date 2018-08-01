package INTEFAZ;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mi.muebleria.Funcionamiento.Lector;
import mi.muebleria.Funcionamiento.Muebleria;
import mi.muebleria.Funcionamiento.Registro;
import mi.muebleria.Muebles.MuebleInventario;
import mi.muebleria.Papeleria.Compra;
import mi.muebleria.Papeleria.Devolucion;
import mi.muebleria.Papeleria.Factura;
import mi.muebleria.Papeleria.Venta;
import mi.muebleria.Personas.Cliente;
import mi.muebleria.Personas.UsuarioFabrica;
import mi.muebleria.Personas.UsuarioVentas;

public class InterfazVentas extends javax.swing.JFrame {

    public InterfazVentas() {
        initComponents();
    }
    
    private UsuarioVentas usuarioActivo;
    private int codigo;
    private int nit;
    private Cliente cliente;
    private String orden;
    private double gananciasTotales;
    
    public void setUsuario(UsuarioVentas user){
        usuarioActivo = user;
        UsuarioActivo.setText(usuarioActivo.getNombre());
        gananciasTotales = Muebleria.gananciasTotales();
        GananciasTotales.setText(String.valueOf(gananciasTotales));
    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Venta = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BuscarClienteExistente = new javax.swing.JButton();
        CodigoProducto = new javax.swing.JTextField();
        NITCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NombreCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FechaDeCompra = new javax.swing.JTextField();
        RealizarCompra = new javax.swing.JButton();
        DireccionCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Devolucion = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NumeroDeFacturaDevolucion = new javax.swing.JTextField();
        FechaDevolucion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ComprasCliente = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        NitClienteCompra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeCompras = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        DevolucionesCliente = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        NitClienteDevoluciones = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDeDevoluciones = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        MueblesDisponibles = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaMueblesEnVenta = new javax.swing.JTable();
        DetallesFactura = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        ConsultaFactura = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        ConsultaVentasDelDia = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        FechaDeVentas = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaVentasEnUnDia = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UsuarioActivo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GananciasTotales = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        Venta.setFocusCycleRoot(false);

        jLabel3.setText("Codigo del producto: ");

        jLabel4.setText("NIT: ");

        BuscarClienteExistente.setText("Buscar Cliente");
        BuscarClienteExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteExistenteActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre:");

        jLabel6.setText("Fecha:");

        RealizarCompra.setText("Realiza Compra");
        RealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarCompraActionPerformed(evt);
            }
        });

        jLabel7.setText("Direccion:");

        javax.swing.GroupLayout VentaLayout = new javax.swing.GroupLayout(Venta.getContentPane());
        Venta.getContentPane().setLayout(VentaLayout);
        VentaLayout.setHorizontalGroup(
            VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentaLayout.createSequentialGroup()
                .addGroup(VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentaLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(VentaLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NITCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(VentaLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(BuscarClienteExistente)))
                .addGap(86, 86, 86))
            .addGroup(VentaLayout.createSequentialGroup()
                .addGroup(VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentaLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(VentaLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(VentaLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(VentaLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(RealizarCompra)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VentaLayout.setVerticalGroup(
            VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NITCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarClienteExistente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RealizarCompra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Numero de Factura: ");

        jLabel9.setText("Fecha de Hoy:");

        jButton1.setText("Devolver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DevolucionLayout = new javax.swing.GroupLayout(Devolucion.getContentPane());
        Devolucion.getContentPane().setLayout(DevolucionLayout);
        DevolucionLayout.setHorizontalGroup(
            DevolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DevolucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DevolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DevolucionLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addComponent(NumeroDeFacturaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DevolucionLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DevolucionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        DevolucionLayout.setVerticalGroup(
            DevolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DevolucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DevolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(NumeroDeFacturaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DevolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(FechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel10.setText("Nit del cliente: ");

        TablaDeCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mueble ", "Fecha ", "No. de Factura"
            }
        ));
        jScrollPane1.setViewportView(TablaDeCompras);

        jButton2.setText("Buscar Compras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ComprasClienteLayout = new javax.swing.GroupLayout(ComprasCliente.getContentPane());
        ComprasCliente.getContentPane().setLayout(ComprasClienteLayout);
        ComprasClienteLayout.setHorizontalGroup(
            ComprasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComprasClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ComprasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ComprasClienteLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)
                        .addComponent(NitClienteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        ComprasClienteLayout.setVerticalGroup(
            ComprasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComprasClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ComprasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ComprasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(NitClienteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel11.setText("Nit del Cliente:");

        TablaDeDevoluciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mueble", "Fecha", "No. Factura"
            }
        ));
        jScrollPane2.setViewportView(TablaDeDevoluciones);

        jButton3.setText("Buscar Devoluciones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DevolucionesClienteLayout = new javax.swing.GroupLayout(DevolucionesCliente.getContentPane());
        DevolucionesCliente.getContentPane().setLayout(DevolucionesClienteLayout);
        DevolucionesClienteLayout.setHorizontalGroup(
            DevolucionesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DevolucionesClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DevolucionesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(DevolucionesClienteLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NitClienteDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        DevolucionesClienteLayout.setVerticalGroup(
            DevolucionesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DevolucionesClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DevolucionesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(NitClienteDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TablaMueblesEnVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mueble", "Codigo", "Precio"
            }
        ));
        jScrollPane3.setViewportView(TablaMueblesEnVenta);

        javax.swing.GroupLayout MueblesDisponiblesLayout = new javax.swing.GroupLayout(MueblesDisponibles.getContentPane());
        MueblesDisponibles.getContentPane().setLayout(MueblesDisponiblesLayout);
        MueblesDisponiblesLayout.setHorizontalGroup(
            MueblesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(MueblesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MueblesDisponiblesLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        MueblesDisponiblesLayout.setVerticalGroup(
            MueblesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
            .addGroup(MueblesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MueblesDisponiblesLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel12.setText("Numero de Factura: ");

        jButton4.setText("Buscar Factura");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DetallesFacturaLayout = new javax.swing.GroupLayout(DetallesFactura.getContentPane());
        DetallesFactura.getContentPane().setLayout(DetallesFacturaLayout);
        DetallesFacturaLayout.setHorizontalGroup(
            DetallesFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetallesFacturaLayout.createSequentialGroup()
                .addGroup(DetallesFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetallesFacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addGap(4, 4, 4)
                        .addComponent(ConsultaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DetallesFacturaLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        DetallesFacturaLayout.setVerticalGroup(
            DetallesFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetallesFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DetallesFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ConsultaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setText("Ventas del dia: ");

        TablaVentasEnUnDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mueble Vendido", "Ganancia", "Fecha"
            }
        ));
        jScrollPane4.setViewportView(TablaVentasEnUnDia);

        jButton5.setText("Buscar Ventas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsultaVentasDelDiaLayout = new javax.swing.GroupLayout(ConsultaVentasDelDia.getContentPane());
        ConsultaVentasDelDia.getContentPane().setLayout(ConsultaVentasDelDiaLayout);
        ConsultaVentasDelDiaLayout.setHorizontalGroup(
            ConsultaVentasDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaVentasDelDiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultaVentasDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultaVentasDelDiaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(FechaDeVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        ConsultaVentasDelDiaLayout.setVerticalGroup(
            ConsultaVentasDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaVentasDelDiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultaVentasDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(FechaDeVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario Activo: ");

        jLabel2.setText("Ganancias Totales: ");

        jMenu1.setText("Movimientos");

        jMenuItem1.setText("Devolucion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Venta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jMenuItem3.setText("Compras de un cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Devolucion de un cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Muebles Disponibles en la sala de ventas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Detalles de una factura");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Ventas del dia");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GananciasTotales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UsuarioActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(GananciasTotales))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarClienteExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteExistenteActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        if(NITCliente.getText().isEmpty()&&CodigoProducto.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null,"No se ingreso un nit o un codigo de producto","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            try{
                nit = Integer.parseInt(NITCliente.getText());
                codigo = Integer.parseInt(CodigoProducto.getText());
            } catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null,"No se ingreso un valor numero en el codigo del producto o en el nit","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            File file = new File("Archivos/Clientes/"+nit+".cln");
            if(!file.exists()){
                JOptionPane.showMessageDialog(null, "No se encuentra registrado este nit, por favor ingrese los datos correspondientes","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
            }else{
                NombreCliente.setText(Registro.getCliente(nit).getNombre());
                DireccionCliente.setText(Registro.getCliente(nit).getDireccion());
                cliente = Registro.getCliente(nit);
            }
        }
    }//GEN-LAST:event_BuscarClienteExistenteActionPerformed

    private void RealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarCompraActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        if(CodigoProducto.getText().isEmpty()||NombreCliente.getText().isEmpty()||NITCliente.getText().isEmpty()||FechaDeCompra.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null, "No se ingresaron todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            if(Lector.fechaValida(FechaDeCompra.getText())==null){
                valorFormato=false;
                JOptionPane.showMessageDialog(null,"La fecha ingresada no es valida","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            if(!Muebleria.mueblePorCodigo(Integer.parseInt(CodigoProducto.getText())).getVenta()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "El mueble seleccionado no esta a la venta","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            File file = new File("Archivos/Clientes/"+nit+".cln");
            if(!file.exists()){
                cliente = new Cliente(NombreCliente.getText(),DireccionCliente.getText(),Integer.parseInt(NITCliente.getText()));
                Registro.GuardarCliente(cliente);
            }
            Factura factura = new Factura(usuarioActivo,Integer.parseInt(NITCliente.getText()),FechaDeCompra.getText(),Muebleria.mueblePorCodigo(codigo));
            cliente.RealizarCompra(usuarioActivo, Muebleria.mueblePorCodigo(codigo), factura, FechaDeCompra.getText());
            Venta venta = new Venta(cliente,factura,Muebleria.mueblePorCodigo(codigo),FechaDeCompra.getText());
            Compra compra = new Compra(cliente,usuarioActivo,Muebleria.mueblePorCodigo(codigo),factura,FechaDeCompra.getText());
            MuebleInventario mueble = Muebleria.mueblePorCodigo(codigo);
            mueble.Vendido();
            Registro.sobreEscribirMuebleInventario(mueble, mueble.getDireccion());
            Registro.GuardarVenta(venta);
            Registro.GuardarCompra(compra);
            Registro.SobreEscribirCliente(cliente, cliente.getDireccion());
            Registro.GuardarFactura(factura);
        }
        NombreCliente.setText("");
        DireccionCliente.setText("");
        FechaDeCompra.setText("");
        CodigoProducto.setText("");
        cliente=null;
        Venta.setVisible(false);
    }//GEN-LAST:event_RealizarCompraActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Venta.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean valorFormato=true;
        boolean valorLogico=true;
        int perdida;
        if(NumeroDeFacturaDevolucion.getText().isEmpty()||FechaDevolucion.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            int numero=0;
            try{
                numero=Integer.parseInt(NumeroDeFacturaDevolucion.getText());
            }catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null, "No se ingreso un valor numero en el numero de factura","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            File file = new File("Archivos/Facturas/"+numero);
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "No existe ese numero de Factura","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            Lector.fechaValida(FechaDevolucion.getText());
            if(Muebleria.devolucionValida(Registro.getFactura(Integer.parseInt(NumeroDeFacturaDevolucion.getText())).getFecha(), FechaDevolucion.getText())){
               MuebleInventario muebleDevuelto = Registro.getFactura(Integer.parseInt(NumeroDeFacturaDevolucion.getText())).getMuebleComprado();
               cliente = Registro.getCliente(Registro.getFactura(Integer.parseInt(NumeroDeFacturaDevolucion.getText())).getComprador());
               Factura factura = Registro.getFactura(Integer.parseInt(NumeroDeFacturaDevolucion.getText()));
               Devolucion devolucion = new Devolucion(muebleDevuelto, FechaDevolucion.getText(),cliente,factura);
               cliente.RealizarDevolucion(muebleDevuelto, FechaDevolucion.getText());
               Registro.SobreEscribirCliente(cliente, cliente.getDireccion());
               Registro.GuardarDevolucion(devolucion);
               gananciasTotales=gananciasTotales-(muebleDevuelto.getCosto()/3);
               GananciasTotales.setText(String.valueOf(gananciasTotales));
            }
        }
        NumeroDeFacturaDevolucion.setText("");
        FechaDevolucion.setText("");
        Devolucion.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        int numero=0;
        if(NitClienteCompra.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null,"Debe ingresar un numero para buscar al cliente","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            try{
                numero = Integer.parseInt(NitClienteCompra.getText());
            }catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null,"No se ingreso un valor numerico","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            File file = new File("Archivos/Factura/"+numero);
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null,"El nit que ingreso no existe","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            Compra[] compras = new Compra[Registro.getCliente(nit).getCompras().size()];
            for (int i = 0; i < Registro.getCliente(nit).getCompras().size(); i++) {
                compras[i] = Registro.getCliente(nit).getCompras().get(i);
            }
            String[][] arreglo = new String[compras.length][3];
            for (int i = 0; i < compras.length; i++) {
                arreglo[i][0]=compras[i].getMuebleComprado().getNombreMueble();
                arreglo[i][1]=compras[i].getFecha();
                arreglo[i][2]=String.valueOf(compras[i].getFactura().getNumero());
            }
            TablaDeCompras.setModel(new javax.swing.table.DefaultTableModel(
                arreglo, 
                new String[] {
                    "Mueble","Fecha de Compra","No. de factura"
                }));
        }
        NitClienteCompra.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ComprasCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        int numero=0;
        if(NitClienteDevoluciones.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null,"Debe ingresar un numero para buscar al cliente","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            try{
                numero = Integer.parseInt(NitClienteDevoluciones.getText());
            }catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null,"No se ingreso un valor numerico","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            File file = new File("Archivos/Devoluciones/"+numero);
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null,"El nit que ingreso no existe","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            Devolucion[] compras = new Devolucion[Registro.getCliente(nit).getCompras().size()];
            for (int i = 0; i < Registro.getCliente(nit).getDevoluciones().size(); i++) {
                compras[i] = Registro.getCliente(nit).getDevoluciones().get(i);
            }
            String[][] arreglo = new String[compras.length][3];
            for (int i = 0; i < compras.length; i++) {
                arreglo[i][0]=compras[i].getMueble().getNombreMueble();
                arreglo[i][1]=compras[i].getFecha();
                arreglo[i][2]=String.valueOf(compras[i].getFactura().getNumero());
            }
            TablaDeDevoluciones.setModel(new javax.swing.table.DefaultTableModel(
                arreglo, 
                new String[] {
                    "Mueble","Fecha de devolucion","No. de factura"
                }));
        }
        NitClienteDevoluciones.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DevolucionesCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ArrayList<MuebleInventario> muebles = new ArrayList();
        String[] nombresMuebles = new String[Muebleria.nombresMueblesGuia().length];
        nombresMuebles = Muebleria.nombresMueblesGuia();
        for (int i = 0; i < nombresMuebles.length; i++) {
            MuebleInventario[] mueblesEnsamblados = new MuebleInventario[Muebleria.MueblesEnVenta(nombresMuebles[i]).length];
            mueblesEnsamblados = Muebleria.MueblesEnVenta(nombresMuebles[i]);
            for (int j = 0; j < mueblesEnsamblados.length; j++) {
                muebles.add(mueblesEnsamblados[j]);
            }
        }
        String[][] arreglo = new String[muebles.size()][3];
        for (int i = 0; i < muebles.size(); i++) {
                arreglo[i][0] = muebles.get(i).getNombreMueble();
                arreglo[i][1] = String.valueOf(muebles.get(i).getCodigo());
                arreglo[i][2] = String.valueOf(muebles.get(i).getPrecio());
            }
            TablaMueblesEnVenta.setModel(new javax.swing.table.DefaultTableModel(
                arreglo, 
                new String[] {
                    "Mueble","Codigo","Precio"
                }));
        MueblesDisponibles.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        int numero=0;
        if(ConsultaFactura.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null, "Por favor llene el campo correspondiente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            try{
                numero = Integer.parseInt(ConsultaFactura.getText());
            }catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null,"No se ingreso un valor numerico","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            File file = new File("Archivos/Facturas/"+numero+".fct");
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null,"El numero de factura no existe","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            Factura factura = Registro.getFactura(numero);
            JOptionPane.showMessageDialog(null,"Numero: "+numero+"\nMueble vendido: "+factura.getMuebleComprado().getNombreMueble()+"\nFecha: "+factura.getFecha()+"\nCliente: "+Registro.getCliente(factura.getComprador()).getNombre(), "DATOS", JOptionPane.INFORMATION_MESSAGE);
        }
        ConsultaFactura.setText("");
        DetallesFactura.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        if(FechaDeVentas.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null, "No se ingreso ninguna fecha","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(valorLogico&&valorFormato){
            if(Lector.fechaValida(FechaDeVentas.getText())==null){
                valorFormato=false;
                JOptionPane.showMessageDialog(null,"La fecha ingresada no es valida","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            String fecha = FechaDeVentas.getText().replace("/", "_");
            File file = new File("Archivo/Ventas/"+fecha);
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "Ese dia no se ha realizado ninguna venta","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            Venta[] ventas = new Venta[Muebleria.ventasDe(FechaDeVentas.getText()).size()];
            for (int i = 0; i < ventas.length; i++) {
                ventas[i] = Muebleria.ventasDe(FechaDeVentas.getText()).get(i);
            }
            String[][] arreglo = new String[ventas.length][3];
            for (int i = 0; i < ventas.length; i++) {
                arreglo[i][0] = ventas[i].getMuebleVendido().getNombreMueble();
                arreglo[i][1] = String.valueOf(ventas[i].getGanancia());
                arreglo[i][2] = ventas[i].getFecha();
            }
            TablaVentasEnUnDia.setModel(new javax.swing.table.DefaultTableModel(
                arreglo, 
                new String[] {
                    "Mueble vendido","Ganancia","Fecha"
            }));
        }
        FechaDeVentas.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        DevolucionesCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        DetallesFactura.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ConsultaVentasDelDia.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed


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
            java.util.logging.Logger.getLogger(InterfazVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarClienteExistente;
    private javax.swing.JTextField CodigoProducto;
    private javax.swing.JDialog ComprasCliente;
    private javax.swing.JTextField ConsultaFactura;
    private javax.swing.JDialog ConsultaVentasDelDia;
    private javax.swing.JDialog DetallesFactura;
    private javax.swing.JDialog Devolucion;
    private javax.swing.JDialog DevolucionesCliente;
    private javax.swing.JTextField DireccionCliente;
    private javax.swing.JTextField FechaDeCompra;
    private javax.swing.JTextField FechaDeVentas;
    private javax.swing.JTextField FechaDevolucion;
    private javax.swing.JLabel GananciasTotales;
    private javax.swing.JDialog MueblesDisponibles;
    private javax.swing.JTextField NITCliente;
    private javax.swing.JTextField NitClienteCompra;
    private javax.swing.JTextField NitClienteDevoluciones;
    private javax.swing.JTextField NombreCliente;
    private javax.swing.JTextField NumeroDeFacturaDevolucion;
    private javax.swing.JButton RealizarCompra;
    private javax.swing.JTable TablaDeCompras;
    private javax.swing.JTable TablaDeDevoluciones;
    private javax.swing.JTable TablaMueblesEnVenta;
    private javax.swing.JTable TablaVentasEnUnDia;
    private javax.swing.JLabel UsuarioActivo;
    private javax.swing.JDialog Venta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
