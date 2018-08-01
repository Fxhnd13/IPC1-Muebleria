package INTEFAZ;

import java.io.File;
import javax.swing.JOptionPane;
import mi.muebleria.Funcionamiento.Registro;

public class INICIO extends javax.swing.JFrame {

    public INICIO() {
        initComponents();
    }
    
    public InterfazFabrica interfazFabrica;
    public InterfazVentas interfazVentas;
    public InterfazFinanciera interfazFinanciera;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PassWord = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Iniciador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        NombreIngresado = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        PassWordIngresada = new javax.swing.JTextPane();
        Mensaje1 = new javax.swing.JLabel();
        Mensaje2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PassWord.setText("Contraseña:");

        Nombre.setText("Nombre Usuario:");

        Iniciador.setText("Iniciar Sesion");
        Iniciador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciadorActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(NombreIngresado);

        jScrollPane2.setViewportView(PassWordIngresada);

        Mensaje1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Mensaje1.setForeground(new java.awt.Color(255, 0, 0));
        Mensaje1.setText("*Verifique que el nombre de usuario y contraseña esten correctamente escritos");

        Mensaje2.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        Mensaje2.setForeground(new java.awt.Color(255, 0, 0));
        Mensaje2.setText("*Todos los campos deven de estar llenos para poder iniciar sesion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Mensaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(Iniciador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PassWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Iniciador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mensaje2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciadorActionPerformed
        if(NombreIngresado.getText().isEmpty()||PassWordIngresada.getText().isEmpty()){
            Mensaje2.setVisible(true);
        }else{
            boolean existe=false;
            int lugar=0;
            File file = new File("Archivos/Usuarios/Fabrica/"+NombreIngresado.getText()+".usr");
            if(file.exists()){
                existe=true;
                lugar=1;
            }
            if(!existe){
                file = new File("Archivos/Usuarios/Ventas/"+NombreIngresado.getText()+".usr");
                if(file.exists()){
                    existe=true;
                    lugar=2;
                }
            }
            if(!existe){
                file = new File("Archivos/Usuarios/Administracion/"+NombreIngresado.getText()+".usr");
                if(file.exists()){
                    existe=true;
                    lugar=3;
                }
            }
            if(existe){
                if(lugar==1){
                    if(!Registro.getUsuarioFabrica(NombreIngresado.getText()).getActivo()){
                        existe=false;
                        JOptionPane.showMessageDialog(null, "El usuario no está activo", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if(lugar==2){
                    if(!Registro.getUsuarioVentas(NombreIngresado.getText()).getActivo()){
                        existe=false;
                        JOptionPane.showMessageDialog(null, "El usuario no está activo", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if(lugar==3){
                    if(!Registro.getUsuarioAdministracion(NombreIngresado.getText()).getActivo()){
                        existe=false;
                        JOptionPane.showMessageDialog(null, "El usuario no está activo", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            if(existe){
                if(lugar==1){
                    if(Registro.getUsuarioFabrica(NombreIngresado.getText()).getPassword().equals(PassWordIngresada.getText())){
                        interfazFabrica = new InterfazFabrica();
                        interfazFabrica.setUsuario(Registro.getUsuarioFabrica(NombreIngresado.getText()));
                        interfazFabrica.PiezasPorAgotarse();
                        interfazFabrica.setVisible(true);
                        this.setVisible(false);
                    }
                }
                if(lugar==2){
                    if(Registro.getUsuarioVentas(NombreIngresado.getText()).getPassword().equals(PassWordIngresada.getText())){
                        interfazVentas = new InterfazVentas();
                        interfazVentas.setUsuario(Registro.getUsuarioVentas(NombreIngresado.getText()));
                        interfazVentas.setVisible(true);
                        this.setVisible(false);
                    }
                }
                if(lugar==3){
                    if(Registro.getUsuarioAdministracion(NombreIngresado.getText()).getPassword().equals(PassWordIngresada.getText())){
                        interfazFinanciera = new InterfazFinanciera();
                        interfazFinanciera.setUsuario(Registro.getUsuarioAdministracion(NombreIngresado.getText()));
                        interfazFinanciera.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_IniciadorActionPerformed


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
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INICIO().setVisible(true);
            }
        });
    }

    public void setVisible(boolean flag){
        this.Mensaje1.setVisible(false);
        this.Mensaje2.setVisible(false);
        super.setVisible(flag);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciador;
    private javax.swing.JLabel Mensaje1;
    private javax.swing.JLabel Mensaje2;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextPane NombreIngresado;
    private javax.swing.JLabel PassWord;
    private javax.swing.JTextPane PassWordIngresada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
