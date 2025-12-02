package Vista;

import Factory.EntrenadorFactory;
import Factory.GimnasioFactory;
import Factory.MaquinaFactory;
import Factory.SalaFactory;
import Adapter.*;
import Recursos.RecursoReservable;
import Modelo.Usuario;
import Proxy.RecursoProxy;

import Modelo.Reserva; // agregadofr

import javax.swing.*;


public class MenuReservaGimnasio extends javax.swing.JFrame {
    
    private Reserva reservaActual; //variable para patron state fr

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuReservaGimnasio.class.getName());
    String resul;
    int numero;
    public MenuReservaGimnasio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(910, 550);
    }

    private GimnasioFactory getFactorySeleccionada() {
        String tipo = (String) cmbMaquina.getSelectedItem();

        if ("Maquina".equals(tipo)) {
            return new MaquinaFactory();
        } else if ("Sala".equals(tipo)) {
            return new SalaFactory();
        } else if ("Entrenador".equals(tipo)) {
            return new EntrenadorFactory();
        } 
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cmbMembresia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaSalida = new javax.swing.JTextArea();
        btnReservar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbMaquina = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaSalidaState = new javax.swing.JTextArea();
        btnAdapter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(204, 204, 204));
        bg.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("INGRESE EL NOMBRE:");
        bg.add(jLabel1);
        jLabel1.setBounds(40, 150, 150, 18);

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setToolTipText("");
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        bg.add(txtNombre);
        txtNombre.setBounds(200, 150, 190, 16);

        cmbMembresia.setBackground(new java.awt.Color(204, 204, 255));
        cmbMembresia.setForeground(new java.awt.Color(0, 0, 0));
        cmbMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Basico", "Vip" }));
        cmbMembresia.setBorder(null);
        bg.add(cmbMembresia);
        cmbMembresia.setBounds(200, 200, 110, 20);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("TIPO DE MEMBRESIA:");
        bg.add(jLabel2);
        jLabel2.setBounds(40, 200, 150, 20);

        txaSalida.setColumns(20);
        txaSalida.setRows(5);
        jScrollPane1.setViewportView(txaSalida);

        bg.add(jScrollPane1);
        jScrollPane1.setBounds(40, 290, 360, 150);

        btnReservar.setBackground(new java.awt.Color(153, 204, 255));
        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        bg.add(btnReservar);
        btnReservar.setBounds(220, 460, 90, 23);

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        bg.add(jButton2);
        jButton2.setBounds(800, 460, 80, 23);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("RESERVAR:");
        bg.add(jLabel3);
        jLabel3.setBounds(40, 250, 90, 18);

        cmbMaquina.setBackground(new java.awt.Color(204, 204, 255));
        cmbMaquina.setForeground(new java.awt.Color(0, 0, 0));
        cmbMaquina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Maquina", "Sala", "Entrenador" }));
        cmbMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMaquinaActionPerformed(evt);
            }
        });
        bg.add(cmbMaquina);
        cmbMaquina.setBounds(200, 250, 110, 22);

        lblEstado.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblEstado.setText("CONFIRMAR/CANCELAR ESTADO DE RESERVA");
        bg.add(lblEstado);
        lblEstado.setBounds(470, 100, 320, 33);

        btnConfirmar.setBackground(new java.awt.Color(153, 204, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setEnabled(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        bg.add(btnConfirmar);
        btnConfirmar.setBounds(470, 330, 110, 23);

        btnCancelar.setBackground(new java.awt.Color(153, 204, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        bg.add(btnCancelar);
        btnCancelar.setBounds(800, 330, 80, 23);

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setText("Limpiar Campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1);
        jButton1.setBounds(20, 460, 150, 23);

        txaSalidaState.setColumns(20);
        txaSalidaState.setRows(5);
        jScrollPane2.setViewportView(txaSalidaState);

        bg.add(jScrollPane2);
        jScrollPane2.setBounds(470, 140, 410, 160);

        btnAdapter.setBackground(new java.awt.Color(153, 204, 255));
        btnAdapter.setText("Adaptar el horario");
        btnAdapter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdapterActionPerformed(evt);
            }
        });
        bg.add(btnAdapter);
        btnAdapter.setBounds(350, 460, 150, 23);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buenos dias");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rellene los campos para solicitar una reserva");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 80);
        bg.add(jSeparator1);
        jSeparator1.setBounds(200, 170, 190, 10);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("INFORMACION DE LA RESERVA");
        bg.add(jLabel7);
        jLabel7.setBounds(40, 100, 320, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed

        String nombre = txtNombre.getText().trim();
        String tipoMembresia = (String) cmbMembresia.getSelectedItem();
        
        if (nombre.isEmpty()){
           JOptionPane.showMessageDialog(null, " !!! POR FAVOR INGRESE UN NOMBRE !!! ");
           return; 
        }
        
   
        Usuario usuario = new Usuario(nombre, tipoMembresia);
        GimnasioFactory factory = getFactorySeleccionada();
        
        
        
        
        if (factory == null){
           JOptionPane.showMessageDialog(null, " !!! SELECCIONE UN RECURSO !!! ");
           return;
        }
        
        RecursoReservable recReal = factory.crearRecurso();
        RecursoReservable rec = new RecursoProxy(recReal);  
        
        
        String resultado = rec.reservar(usuario);
        resul = resultado;
        switch (cmbMaquina.getSelectedIndex()) {
            case 0:
                txaSalida.setText("");
                txaSalida.append(resultado + "\n");
                break;
            case 1:
                HorarioMaquinaGimnasio maquina = new HorarioMaquinaGimnasio();
                txaSalida.setText("");
                txaSalida.append(resultado + "\n"+ maquina.getHorarioJSON());
                break;
            case 2:
                HorarioSala sala = new HorarioSala();
                txaSalida.setText("");
                txaSalida.append(resultado + "\n"+ sala.getHorarioSeparador());
                break;
            case 3:
                if(cmbMembresia.getSelectedIndex()!= 2){
                txaSalida.setText("");
                txaSalida.append(resultado + "\n");
                break;
                }
                else{
                   HorarioEntrenador entrenador = new HorarioEntrenador();
                    txaSalida.setText("");
                    txaSalida.append(resultado + "\n"+entrenador.getHorarioTexto());
                    break; 
                }
        }


        if (!resultado.startsWith("ACCESO DENEGADO")) {

            reservaActual = new Reserva(usuario, rec);

            lblEstado.setText("Estado: " + reservaActual.getEstadoNombre());

            btnConfirmar.setEnabled(true);
            btnCancelar.setEnabled(true);

    } else {
            reservaActual = null;
            lblEstado.setText("Estado: BLOQUEADO POR PROXY");

            btnConfirmar.setEnabled(false);
            btnCancelar.setEnabled(false);
        }   
        numero=cmbMaquina.getSelectedIndex();
        txtNombre.setText(null);
        cmbMembresia.setSelectedIndex(0);
        cmbMaquina.setSelectedIndex(0);
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        // Verificar que existe una reserva
    if (reservaActual != null) {
        // AQUÍ USAS TU PATRÓN STATE:
        // La reserva decide qué hacer según su estado actual
        String mensaje = reservaActual.confirmarReserva();
        
        // Mostramos el resultado en el cuadro de texto
        txaSalidaState.append("\n--- INTENTO DE CONFIRMACIÓN ---\n");
        txaSalidaState.append(mensaje + "\n");
        
        // Actualizamos la etiqueta de estado
        lblEstado.setText("Estado: " + reservaActual.getEstadoNombre());
    }
    
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        // Verificar que existe una reserva
    if (reservaActual != null) {
        // AQUÍ USAS TU PATRÓN STATE:
        String mensaje = reservaActual.cancelarReserva();
        
        // Mostramos el resultado
        txaSalidaState.append("\n--- INTENTO DE CANCELACIÓN ---\n");
        txaSalidaState.append(mensaje + "\n");
        
        // Actualizamos la etiqueta de estado
        lblEstado.setText("Estado: " + reservaActual.getEstadoNombre());
    }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

  
    txaSalida.setText(null);
    txaSalidaState.setText(null);
    
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMaquinaActionPerformed

    private void btnAdapterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdapterActionPerformed
        switch (numero) {
            case 0:
                if(resul==null){
                    txaSalida.setText("");
                }
                else{
                    txaSalida.setText("");
                    txaSalida.append(resul + "\n");  
                }
                break;
            case 1:
                HorarioAdapter maquina = new HorarioMaquinaAdapter(new HorarioMaquinaGimnasio());
                txaSalida.setText("");
                txaSalida.append(resul + "\n"+ maquina.obtenerHorario());
                break;
            case 2:
                HorarioAdapter sala = new SalaAdapter(new HorarioSala());
                txaSalida.setText("");
                txaSalida.append(resul + "\n"+ sala.obtenerHorario());
                break;
            case 3:
                HorarioAdapter entrenador = new EntrenadorAdapter(new HorarioEntrenador());
                txaSalida.setText("");
                txaSalida.append(resul + "\n"+entrenador.obtenerHorario());
                break;
        }
    }//GEN-LAST:event_btnAdapterActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    public static void main(String args[]) {

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new MenuReservaGimnasio().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAdapter;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<String> cmbMaquina;
    private javax.swing.JComboBox<String> cmbMembresia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JTextArea txaSalida;
    private javax.swing.JTextArea txaSalidaState;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
