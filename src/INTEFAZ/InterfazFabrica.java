package INTEFAZ;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mi.muebleria.Funcionamiento.Lector;
import mi.muebleria.Funcionamiento.Muebleria;
import mi.muebleria.Funcionamiento.Registro;
import mi.muebleria.Muebles.MuebleBase;
import mi.muebleria.Muebles.MuebleInventario;
import mi.muebleria.Papeleria.Venta;
import mi.muebleria.Personas.UsuarioFabrica;
import mi.muebleria.Piezas.Pieza;
import mi.muebleria.Piezas.PiezaInventario;

public class InterfazFabrica extends javax.swing.JFrame {
    
    public InterfazFabrica() {
        initComponents();
    }
    
    private UsuarioFabrica usuarioActivo;
    private String orden;
    
    public void setUsuario(UsuarioFabrica user){
        usuarioActivo = user;
        UsuarioActivo.setText(usuarioActivo.getNombre());
    }
    
    public void PiezasPorAgotarse(){
        ArrayList<Pieza> piezas = new ArrayList();
        String[] nombresPiezas = new String[Muebleria.nombresPiezasGuia().length];
        nombresPiezas = Muebleria.nombresPiezasGuia();
        for (int i = 0; i < nombresPiezas.length; i++) {
             Pieza pieza = new Pieza(nombresPiezas[i]);
             pieza.setCantidad(Muebleria.PiezasDisponibles(nombresPiezas[i]).size());
             if(pieza.getCantidad()<8){
                 piezas.add(pieza);
             }
        }
        String[][] arreglo = new String[piezas.size()][2];
        for (int i = 0; i < piezas.size(); i++) {
            arreglo[i][0]=piezas.get(i).getNombrePieza();
            arreglo[i][1]=String.valueOf(piezas.get(i).getCantidad());
        }
        TablaPiezasPorAgotarse.setModel(new javax.swing.table.DefaultTableModel(
                arreglo, 
                new String[] {
                    "Nombre Pieza","Cantidad Disponible"
                }));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearPieza = new javax.swing.JDialog();
        NombrePiezaCrear = new javax.swing.JLabel();
        NombrePiezaCrear1 = new javax.swing.JLabel();
        NombreCreacionPieza = new javax.swing.JTextField();
        PrecioCreacionPieza = new javax.swing.JTextField();
        Crear = new javax.swing.JButton();
        EliminarPieza = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        NombreEliminarPieza = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        ModificarPieza = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        PiezaBuscada = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPiezas = new javax.swing.JTable();
        BuscarPieza = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NumeroDePieza = new javax.swing.JTextField();
        PrecioNuevo = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        EnsamblarMueble = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MuebleAEnsamblar = new javax.swing.JTextField();
        FechaDeEnsamble = new javax.swing.JTextField();
        Ensamblar = new javax.swing.JButton();
        RegistrarMuebleEnsamblado = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        NombreMuebleRegistro = new javax.swing.JTextField();
        BuscadorRegistro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaMueblesEnsamblados = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        CodigoEnVenta = new javax.swing.JTextField();
        PonerEnVenta = new javax.swing.JButton();
        InformacionPiezas = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaPiezasDisponibles = new javax.swing.JTable();
        Ordenar1 = new javax.swing.JButton();
        Ordenar2 = new javax.swing.JButton();
        InformacionMueblesEnsamblados = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaTodosMueblesEnsamblados = new javax.swing.JTable();
        Ordenar4 = new javax.swing.JButton();
        Ordenar3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPiezasPorAgotarse = new javax.swing.JTable();
        JLabel = new javax.swing.JLabel();
        UsuarioActivo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        NombrePiezaCrear.setText("Nombre:");

        NombrePiezaCrear1.setText("Precio:");

        Crear.setText("Crear Pieza");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearPiezaLayout = new javax.swing.GroupLayout(CrearPieza.getContentPane());
        CrearPieza.getContentPane().setLayout(CrearPiezaLayout);
        CrearPiezaLayout.setHorizontalGroup(
            CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearPiezaLayout.createSequentialGroup()
                .addGroup(CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearPiezaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CrearPiezaLayout.createSequentialGroup()
                                .addComponent(NombrePiezaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(NombreCreacionPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CrearPiezaLayout.createSequentialGroup()
                                .addComponent(NombrePiezaCrear1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PrecioCreacionPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CrearPiezaLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(Crear)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CrearPiezaLayout.setVerticalGroup(
            CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearPiezaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombrePiezaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreCreacionPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombrePiezaCrear1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioCreacionPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Crear)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel2.setText("Nombre de la Pieza: ");

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EliminarPiezaLayout = new javax.swing.GroupLayout(EliminarPieza.getContentPane());
        EliminarPieza.getContentPane().setLayout(EliminarPiezaLayout);
        EliminarPiezaLayout.setHorizontalGroup(
            EliminarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPiezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(EliminarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EliminarPiezaLayout.createSequentialGroup()
                        .addComponent(Eliminar)
                        .addGap(0, 177, Short.MAX_VALUE))
                    .addComponent(NombreEliminarPieza))
                .addContainerGap())
        );
        EliminarPiezaLayout.setVerticalGroup(
            EliminarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPiezaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(EliminarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreEliminarPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Eliminar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel3.setText("Nombre: ");

        TablaPiezas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Precio"
            }
        ));
        jScrollPane2.setViewportView(TablaPiezas);

        BuscarPieza.setText("Buscar Pieza");
        BuscarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPiezaActionPerformed(evt);
            }
        });

        jLabel4.setText("No. de Pieza a Modificar: ");

        jLabel5.setText("Precio Nuevo:");

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModificarPiezaLayout = new javax.swing.GroupLayout(ModificarPieza.getContentPane());
        ModificarPieza.getContentPane().setLayout(ModificarPiezaLayout);
        ModificarPiezaLayout.setHorizontalGroup(
            ModificarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarPiezaLayout.createSequentialGroup()
                .addGroup(ModificarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarPiezaLayout.createSequentialGroup()
                        .addGroup(ModificarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModificarPiezaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PiezaBuscada, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ModificarPiezaLayout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(BuscarPieza)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ModificarPiezaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ModificarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarPiezaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ModificarPiezaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(86, 86, 86)
                                .addComponent(PrecioNuevo))
                            .addGroup(ModificarPiezaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumeroDePieza)))))
                .addContainerGap())
            .addGroup(ModificarPiezaLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ModificarPiezaLayout.setVerticalGroup(
            ModificarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarPiezaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModificarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PiezaBuscada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarPieza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ModificarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NumeroDePieza)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ModificarPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Modificar)
                .addContainerGap())
        );

        jLabel6.setText("Nombre del Mueble: ");

        jLabel7.setText("Fecha: ");

        FechaDeEnsamble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaDeEnsambleActionPerformed(evt);
            }
        });

        Ensamblar.setText("Ensamblar Mueble");
        Ensamblar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnsamblarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EnsamblarMuebleLayout = new javax.swing.GroupLayout(EnsamblarMueble.getContentPane());
        EnsamblarMueble.getContentPane().setLayout(EnsamblarMuebleLayout);
        EnsamblarMuebleLayout.setHorizontalGroup(
            EnsamblarMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnsamblarMuebleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EnsamblarMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EnsamblarMuebleLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MuebleAEnsamblar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EnsamblarMuebleLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaDeEnsamble, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Ensamblar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        EnsamblarMuebleLayout.setVerticalGroup(
            EnsamblarMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnsamblarMuebleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EnsamblarMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MuebleAEnsamblar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnsamblarMuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaDeEnsamble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ensamblar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Nombre Mueble: ");

        BuscadorRegistro.setText("Buscar Muebles");
        BuscadorRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorRegistroActionPerformed(evt);
            }
        });

        TablaMueblesEnsamblados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre ", "Codigo Unico"
            }
        ));
        jScrollPane3.setViewportView(TablaMueblesEnsamblados);

        jLabel10.setText("Codigo del Mueble: ");

        PonerEnVenta.setText("Poner En Venta");
        PonerEnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PonerEnVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistrarMuebleEnsambladoLayout = new javax.swing.GroupLayout(RegistrarMuebleEnsamblado.getContentPane());
        RegistrarMuebleEnsamblado.getContentPane().setLayout(RegistrarMuebleEnsambladoLayout);
        RegistrarMuebleEnsambladoLayout.setHorizontalGroup(
            RegistrarMuebleEnsambladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarMuebleEnsambladoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistrarMuebleEnsambladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarMuebleEnsambladoLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(BuscadorRegistro))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RegistrarMuebleEnsambladoLayout.createSequentialGroup()
                        .addGroup(RegistrarMuebleEnsambladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarMuebleEnsambladoLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombreMuebleRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegistrarMuebleEnsambladoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(CodigoEnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegistrarMuebleEnsambladoLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(PonerEnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        RegistrarMuebleEnsambladoLayout.setVerticalGroup(
            RegistrarMuebleEnsambladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarMuebleEnsambladoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistrarMuebleEnsambladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreMuebleRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(BuscadorRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(RegistrarMuebleEnsambladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RegistrarMuebleEnsambladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CodigoEnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PonerEnVenta)
                .addGap(18, 18, 18))
        );

        TablaPiezasDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre Pieza", "Cantidad"
            }
        ));
        jScrollPane4.setViewportView(TablaPiezasDisponibles);

        Ordenar1.setText("Ordenar de Mayor a menor");
        Ordenar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ordenar1ActionPerformed(evt);
            }
        });

        Ordenar2.setText("Ordenar de menor a mayor");
        Ordenar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ordenar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InformacionPiezasLayout = new javax.swing.GroupLayout(InformacionPiezas.getContentPane());
        InformacionPiezas.getContentPane().setLayout(InformacionPiezasLayout);
        InformacionPiezasLayout.setHorizontalGroup(
            InformacionPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionPiezasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformacionPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(InformacionPiezasLayout.createSequentialGroup()
                        .addComponent(Ordenar1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ordenar2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        InformacionPiezasLayout.setVerticalGroup(
            InformacionPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionPiezasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformacionPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ordenar1)
                    .addComponent(Ordenar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablaTodosMueblesEnsamblados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Fecha de ensamble", "Precio", "En Venta"
            }
        ));
        jScrollPane5.setViewportView(TablaTodosMueblesEnsamblados);

        Ordenar4.setText("Ordenar de Menor a Mayor");

        Ordenar3.setText("Ordenar de Mayor a Menor");

        javax.swing.GroupLayout InformacionMueblesEnsambladosLayout = new javax.swing.GroupLayout(InformacionMueblesEnsamblados.getContentPane());
        InformacionMueblesEnsamblados.getContentPane().setLayout(InformacionMueblesEnsambladosLayout);
        InformacionMueblesEnsambladosLayout.setHorizontalGroup(
            InformacionMueblesEnsambladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionMueblesEnsambladosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformacionMueblesEnsambladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformacionMueblesEnsambladosLayout.createSequentialGroup()
                        .addComponent(Ordenar3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ordenar4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InformacionMueblesEnsambladosLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InformacionMueblesEnsambladosLayout.setVerticalGroup(
            InformacionMueblesEnsambladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionMueblesEnsambladosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformacionMueblesEnsambladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ordenar3)
                    .addComponent(Ordenar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaPiezasPorAgotarse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Pieza", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(TablaPiezasPorAgotarse);

        JLabel.setText("Usuario Activo:");

        jMenu2.setText("Piezas");

        jMenuItem1.setText("Crear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Modificar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Muebles");

        jMenuItem4.setText("Ensamblar Mueble");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Registrar Mueble");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Inventario");

        jMenuItem6.setText("Informacion Piezas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Informacion muebles");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioActivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FechaDeEnsambleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaDeEnsambleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaDeEnsambleActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        double precio=0;
        if(NombreCreacionPieza.getText().isEmpty()||PrecioCreacionPieza.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null,"Uno o los dos campos se encuentran vacios","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                precio=Double.parseDouble(PrecioCreacionPieza.getText());
            }catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null, "No se ingreso un valor numero en precio", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            File file = new File("Archivos/Guias/Piezas/"+NombreCreacionPieza.getText());
            if(!file.exists()){
                Pieza pieza = new Pieza(NombreCreacionPieza.getText());
                Registro.GuardarPiezaGuia(pieza);
            }
            PiezaInventario piezaInventario= new PiezaInventario(NombreCreacionPieza.getText(),precio);
            Registro.GuardarPiezaInventario(piezaInventario);
            JOptionPane.showMessageDialog(null, "Se ha añadido exitosamente la pieza");
        }
        NombreCreacionPieza.setText("");
        PrecioCreacionPieza.setText("");
        CrearPieza.setVisible(false);
    }//GEN-LAST:event_CrearActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CrearPieza.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        EliminarPieza.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        double precio=0;
        if(NombreEliminarPieza.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null,"Ingrese el nombre de la pieza","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            File file= new File("Archivos/Guias/Piezas/"+NombreEliminarPieza.getText()+".pzg");
            if(!file.exists()){
                valorLogico = false;
                JOptionPane.showMessageDialog(null, "La pieza ingresada no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            File file = new File("Archivos/Guias/Piezas/"+NombreEliminarPieza.getText()+".pzg");
            file.delete();
            file = new File("Archivos/Inventario/Piezas/"+NombreEliminarPieza.getText());
            file.delete();
        }
        NombreEliminarPieza.setText("");
        EliminarPieza.setVisible(false);
    }//GEN-LAST:event_EliminarActionPerformed

    private void BuscarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPiezaActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        if(PiezaBuscada.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null,"Ingrese el nombre de la pieza","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            File file = new File("Archivos/Guias/Piezas/"+PiezaBuscada.getText()+".pzg");
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "La pieza ingresada no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            PiezaInventario[] piezas = new PiezaInventario[Muebleria.Piezas(PiezaBuscada.getText()).length];
            piezas = Muebleria.Piezas(PiezaBuscada.getText());
            String[][] arreglo = new String[piezas.length][3];
            for (int i = 0; i < piezas.length; i++) {
                arreglo[i][0] = String.valueOf(i+1);
                arreglo[i][1] = piezas[i].getNombrePieza();
                arreglo[i][2] = String.valueOf(piezas[i].getPrecio());
            }
            TablaPiezas.setModel(new javax.swing.table.DefaultTableModel(
                arreglo, 
                new String[] {
                    "No","Nombre Pieza","Precio"
                }));
        }
    }//GEN-LAST:event_BuscarPiezaActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        double precio=0;
        if(PrecioNuevo.getText().isEmpty()||NumeroDePieza.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null,"No ha ingresado el numero de la pieza o el precio nuevo","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                precio = Double.parseDouble(PrecioNuevo.getText());
                Integer.parseInt(NumeroDePieza.getText());
            }catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null,"No se ingreso un valor numero en el numero de Pieza o en el precio","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            if(valorLogico&&valorFormato){
                File file = new File("Archivos/Inventario/Piezas/"+PiezaBuscada.getText());
                if(file.list().length<Integer.parseInt(NumeroDePieza.getText())){
                    valorLogico=false;
                    JOptionPane.showMessageDialog(null,"No existe ese numero de pieza","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if(valorLogico&&valorFormato){
            PiezaInventario piezaa = Registro.getPiezaInventarioEspecifico(PiezaBuscada.getText(), Integer.parseInt(NumeroDePieza.getText()));
            piezaa.setPrecio(precio);
            Registro.sobreEscribirPiezaInventario(piezaa, piezaa.getDireccion());
        }
        PrecioNuevo.setText("");
        NumeroDePieza.setText("");
        PiezaBuscada.setText("");
        ModificarPieza.setVisible(false);
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void EnsamblarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnsamblarActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        if(MuebleAEnsamblar.getText().isEmpty()||FechaDeEnsamble.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null,"Uno o ambos campos están vacios","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            File file = new File("Archivos/Guias/Muebles/"+MuebleAEnsamblar.getText()+".mbg");
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null,"El mueble que desea ensamblar no existe","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            if(Lector.fechaValida(FechaDeEnsamble.getText())==null){
                valorFormato=false;
                JOptionPane.showMessageDialog(null,"La fecha ingresada no es valida","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            MuebleBase muebleGuia = Registro.getMuebleGuia(MuebleAEnsamblar.getText());
            MuebleInventario mueble = new MuebleInventario(usuarioActivo.getNombre(), muebleGuia.getPrecio(), muebleGuia.getNombreMueble(), FechaDeEnsamble.getText());
            Registro.GuardarMuebleInventario(mueble);
        }
    }//GEN-LAST:event_EnsamblarActionPerformed

    private void BuscadorRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorRegistroActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        if(NombreMuebleRegistro.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null,"Ingrese el nombre del mueble","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            File file = new File("Archivos/Guias/Muebles/"+NombreMuebleRegistro.getText()+".mbg");
            if(!file.exists()){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "El mueble ingresado no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            MuebleInventario[] muebles = new MuebleInventario[Muebleria.MueblesEnsamblados(NombreMuebleRegistro.getText()).length];
            muebles = Muebleria.MueblesEnsamblados(NombreMuebleRegistro.getText());
            String[][] arreglo = new String[muebles.length][2];
            for (int i = 0; i < muebles.length; i++) {
                arreglo[i][0] = String.valueOf(muebles[i].getCodigo());
                arreglo[i][1] = muebles[i].getNombreMueble();
            }
            TablaMueblesEnsamblados.setModel(new javax.swing.table.DefaultTableModel(
                arreglo, 
                new String[] {
                    "Codigo","Nombre Mueble"
                }));
        }
    }//GEN-LAST:event_BuscadorRegistroActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ModificarPieza.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        EnsamblarMueble.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        RegistrarMuebleEnsamblado.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void PonerEnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PonerEnVentaActionPerformed
        boolean valorLogico=true;
        boolean valorFormato=true;
        int codigoBuscado=0;
        if(CodigoEnVenta.getText().isEmpty()){
            valorFormato=false;
            JOptionPane.showMessageDialog(null,"No ingreso el codigo de ningun mueble","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                codigoBuscado = Integer.parseInt(CodigoEnVenta.getText());
            }catch(NumberFormatException e){
                valorFormato=false;
                JOptionPane.showMessageDialog(null,"No ingreso un valor numerico en codigo","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            if(codigoBuscado>Registro.codigoGeneralMueble){
                valorLogico=false;
                JOptionPane.showMessageDialog(null, "No existe ese codigo", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(valorLogico&&valorFormato){
            MuebleInventario mueble = Muebleria.mueblePorCodigo(Integer.parseInt(CodigoEnVenta.getText()));
            mueble.setEnVenta(true);
            Registro.sobreEscribirMuebleInventario(mueble,mueble.getDireccion());
        }
    }//GEN-LAST:event_PonerEnVentaActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ArrayList<Pieza> piezas = new ArrayList();
        String[] nombresPiezas = new String[Muebleria.nombresPiezasGuia().length];
        nombresPiezas = Muebleria.nombresPiezasGuia();
        for (int i = 0; i < nombresPiezas.length; i++) {
             Pieza pieza = new Pieza(nombresPiezas[i]);
             pieza.setCantidad(Muebleria.PiezasDisponibles(nombresPiezas[i]).size());
             piezas.add(pieza);
        }
        String[][] arreglo = new String[piezas.size()][2];
        for (int i = 0; i < piezas.size(); i++) {
            arreglo[i][0]=piezas.get(i).getNombrePieza();
            arreglo[i][1]=String.valueOf(piezas.get(i).getCantidad());
        }
        TablaPiezasDisponibles.setModel(new javax.swing.table.DefaultTableModel(
                arreglo, 
                new String[] {
                    "Nombre Pieza","Cantidad Disponible"
                }));
        InformacionPiezas.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void Ordenar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ordenar1ActionPerformed
        ArrayList<Pieza> piezas = new ArrayList();
        String[] nombresPiezas = new String[Muebleria.nombresPiezasGuia().length];
        nombresPiezas = Muebleria.nombresPiezasGuia();
        Pieza piezaAux=null;
        for (int i = 0; i < nombresPiezas.length; i++) {
             Pieza pieza = new Pieza(nombresPiezas[i]);
             pieza.setCantidad(Muebleria.PiezasDisponibles(nombresPiezas[i]).size());
             piezas.add(pieza);
        }
        for (int i = 0; i < piezas.size(); i++) {
            int indiceMenor=i;
            for (int j = i+1; j < piezas.size(); j++) {
                if(piezas.get(j).getCantidad()<piezas.get(indiceMenor).getCantidad()){
                    indiceMenor=j;
                }
            }
            piezaAux = piezas.get(indiceMenor);
            piezas.set(indiceMenor, piezas.get(i));
            piezas.set(i, piezaAux);
        }
        String[][] arreglo = new String[piezas.size()][2];
        for (int i = 0; i < piezas.size(); i++) {
            arreglo[i][0]=piezas.get(i).getNombrePieza();
            arreglo[i][1]=String.valueOf(piezas.get(i).getCantidad());
        }
        TablaPiezasDisponibles.setModel(new javax.swing.table.DefaultTableModel(
                arreglo, 
                new String[] {
                    "Nombre Pieza","Cantidad Disponible"
                }));
    }//GEN-LAST:event_Ordenar1ActionPerformed

    private void Ordenar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ordenar2ActionPerformed
        ArrayList<Pieza> piezas = new ArrayList();
        String[] nombresPiezas = new String[Muebleria.nombresPiezasGuia().length];
        nombresPiezas = Muebleria.nombresPiezasGuia();
        Pieza piezaAux=null;
        for (int i = 0; i < nombresPiezas.length; i++) {
             Pieza pieza = new Pieza(nombresPiezas[i]);
             pieza.setCantidad(Muebleria.PiezasDisponibles(nombresPiezas[i]).size());
             piezas.add(pieza);
        }
        for (int i = 0; i < piezas.size(); i++) {
            int indiceMenor=i;
            for (int j = i+1; j < piezas.size(); j++) {
                if(piezas.get(j).getCantidad()<piezas.get(indiceMenor).getCantidad()){
                    indiceMenor=j;
                }
            }
            piezaAux = piezas.get(indiceMenor);
            piezas.set(indiceMenor, piezas.get(i));
            piezas.set(i, piezaAux);
        }
        ArrayList<Pieza> piezass = new ArrayList();
        for (int i = piezas.size()-1; i >=0; i--) {
            piezass.add(piezas.get(i));
        }
        String[][] arreglo = new String[piezass.size()][2];
        for (int i = 0; i < piezass.size(); i++) {
            arreglo[i][0]=piezass.get(i).getNombrePieza();
            arreglo[i][1]=String.valueOf(piezass.get(i).getCantidad());
        }
        TablaPiezasDisponibles.setModel(new javax.swing.table.DefaultTableModel(
                arreglo, 
                new String[] {
                    "Nombre Pieza","Cantidad Disponible"
                }));
    }//GEN-LAST:event_Ordenar2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ArrayList<MuebleInventario> muebles = new ArrayList();
        String[] nombresMuebles = new String[Muebleria.nombresMueblesGuia().length];
        nombresMuebles = Muebleria.nombresMueblesGuia();
        for (int i = 0; i < nombresMuebles.length; i++) {
            MuebleInventario[] mueblesEnsamblados = new MuebleInventario[Muebleria.mueblesEnsamblados(nombresMuebles[i]).length];
            mueblesEnsamblados = Muebleria.mueblesEnsamblados(nombresMuebles[i]);
            for (int j = 0; j < mueblesEnsamblados.length; j++) {
                muebles.add(mueblesEnsamblados[j]);
            }
        }
        String[][] arreglo = new String[muebles.size()][2];
        for (int i = 0; i < muebles.size(); i++) {
                arreglo[i][0] = muebles.get(i).getFecha();
                arreglo[i][1] = muebles.get(i).getNombreMueble();
            }
            TablaTodosMueblesEnsamblados.setModel(new javax.swing.table.DefaultTableModel(
                arreglo, 
                new String[] {
                    "Fecha de ensamble","Nombre Mueble"
                }));
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
            java.util.logging.Logger.getLogger(InterfazFabrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazFabrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazFabrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazFabrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazFabrica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscadorRegistro;
    private javax.swing.JButton BuscarPieza;
    private javax.swing.JTextField CodigoEnVenta;
    private javax.swing.JButton Crear;
    private javax.swing.JDialog CrearPieza;
    private javax.swing.JButton Eliminar;
    private javax.swing.JDialog EliminarPieza;
    private javax.swing.JButton Ensamblar;
    private javax.swing.JDialog EnsamblarMueble;
    private javax.swing.JTextField FechaDeEnsamble;
    private javax.swing.JDialog InformacionMueblesEnsamblados;
    private javax.swing.JDialog InformacionPiezas;
    private javax.swing.JLabel JLabel;
    private javax.swing.JButton Modificar;
    private javax.swing.JDialog ModificarPieza;
    private javax.swing.JTextField MuebleAEnsamblar;
    private javax.swing.JTextField NombreCreacionPieza;
    private javax.swing.JTextField NombreEliminarPieza;
    private javax.swing.JTextField NombreMuebleRegistro;
    private javax.swing.JLabel NombrePiezaCrear;
    private javax.swing.JLabel NombrePiezaCrear1;
    private javax.swing.JTextField NumeroDePieza;
    private javax.swing.JButton Ordenar1;
    private javax.swing.JButton Ordenar2;
    private javax.swing.JButton Ordenar3;
    private javax.swing.JButton Ordenar4;
    private javax.swing.JTextField PiezaBuscada;
    private javax.swing.JButton PonerEnVenta;
    private javax.swing.JTextField PrecioCreacionPieza;
    private javax.swing.JTextField PrecioNuevo;
    private javax.swing.JDialog RegistrarMuebleEnsamblado;
    private javax.swing.JTable TablaMueblesEnsamblados;
    private javax.swing.JTable TablaPiezas;
    private javax.swing.JTable TablaPiezasDisponibles;
    private javax.swing.JTable TablaPiezasPorAgotarse;
    private javax.swing.JTable TablaTodosMueblesEnsamblados;
    private javax.swing.JLabel UsuarioActivo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
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
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
