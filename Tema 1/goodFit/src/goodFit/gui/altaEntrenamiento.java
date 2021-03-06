/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodFit.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Beli
 */
public class altaEntrenamiento extends javax.swing.JDialog {

    /**
     * Creates new form altaEntrenamiento
     */
    public altaEntrenamiento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    private boolean cancelar(){
        return ((jTextFieldCodigo.getText().length() == 0) &&(jTextFieldEntrenador.getText().length()  == 0) && (jTextFieldNombreEntreno.getText().length() == 0) && (jTextFieldTelefono.getText().length() == 0));
    }
    
    private boolean comprobarTeclaCorrecta(char tecla){
        return ((tecla < 'a' || tecla > 'z') && (tecla < 'A' || tecla > 'Z'));
    }
    
    private boolean comprobarNumeroCorrecto(char tecla){
        return (tecla < '0' || tecla > '9');
    }
    
    private boolean validarCampos(int longitud, int limite){
        if (longitud > 0 && longitud <= limite ) {
            return true;
        }
        return false;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupUbicacion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelEntrenador = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelUbicacion = new javax.swing.JLabel();
        jTextFieldNombreEntreno = new javax.swing.JTextField();
        jTextFieldEntrenador = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jSpinnerFecha = new javax.swing.JSpinner();
        jComboBoxTipoDeEntrenamiento = new javax.swing.JComboBox<>();
        jRadioButtonFitness = new javax.swing.JRadioButton();
        jRadioButtonCross = new javax.swing.JRadioButton();
        jRadioButtonMusculacion = new javax.swing.JRadioButton();
        jSpinnerPrecio = new javax.swing.JSpinner();
        jLabelMaquinas = new javax.swing.JLabel();
        jLabelArea = new javax.swing.JLabel();
        jComboBoxArea = new javax.swing.JComboBox<>();
        jTextFieldCodigo = new javax.swing.JTextField();
        jCheckBoxCinta = new javax.swing.JCheckBox();
        jCheckBoxBicicleta = new javax.swing.JCheckBox();
        jCheckBoxPlacas = new javax.swing.JCheckBox();
        jCheckBoxPalancas = new javax.swing.JCheckBox();
        jCheckBoxBancos = new javax.swing.JCheckBox();
        jCheckBoxMulti = new javax.swing.JCheckBox();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCodigo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelCodigo.setText("Código:");

        jLabelNombre.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelTipo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelTipo.setText("Tipo:");

        jLabelFecha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelFecha.setText("Fecha:");

        jLabelEntrenador.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelEntrenador.setText("Entrenador:");

        jLabelTelefono.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelTelefono.setText("Teléfono:");

        jLabelPrecio.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelPrecio.setText("Precio:");

        jLabelUbicacion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelUbicacion.setText("Ubicación:");

        jTextFieldNombreEntreno.setToolTipText("Introduce el nombre del entrenamiento. Máximo 10 caracteres alfanuméricos.");
        jTextFieldNombreEntreno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreEntrenoKeyTyped(evt);
            }
        });

        jTextFieldEntrenador.setToolTipText("Introduce el nombre del entrenador. Máximo 10 caracteres.");
        jTextFieldEntrenador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEntrenadorKeyTyped(evt);
            }
        });

        jTextFieldTelefono.setToolTipText("Introduce un teléfono de contacto Máximo 9 digitos.");
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());
        jSpinnerFecha.setToolTipText("Introduce la fecha de alta");

        jComboBoxTipoDeEntrenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muscular", "Funcional", "Crossfit", "Fuerza", "Running", "Físico" }));
        jComboBoxTipoDeEntrenamiento.setToolTipText("Selecciona el tipo de entrenamiento");
        jComboBoxTipoDeEntrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoDeEntrenamientoActionPerformed(evt);
            }
        });

        buttonGroupUbicacion.add(jRadioButtonFitness);
        jRadioButtonFitness.setSelected(true);
        jRadioButtonFitness.setText("Fitness");
        jRadioButtonFitness.setToolTipText("La ubicación del entrenamiento será la sala de fitness");
        jRadioButtonFitness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFitnessActionPerformed(evt);
            }
        });

        buttonGroupUbicacion.add(jRadioButtonCross);
        jRadioButtonCross.setText("Cross");
        jRadioButtonCross.setToolTipText("La ubicación del entrenamiento sera la sala de crossfit");
        jRadioButtonCross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCrossActionPerformed(evt);
            }
        });

        buttonGroupUbicacion.add(jRadioButtonMusculacion);
        jRadioButtonMusculacion.setText("Musculación");
        jRadioButtonMusculacion.setToolTipText("La ubicación del entrenamiento sera la sala de musculación");
        jRadioButtonMusculacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMusculacionActionPerformed(evt);
            }
        });

        jSpinnerPrecio.setModel(new javax.swing.SpinnerNumberModel(1, 1, 200, 1));
        jSpinnerPrecio.setToolTipText("Introduce un precio que oscile entre 1 y 200");

        jLabelMaquinas.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelMaquinas.setText("Maquinas:");

        jLabelArea.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelArea.setText("Area:");
        jLabelArea.setToolTipText("");

        jComboBoxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tronco", "Core", "Tren superior", "Tren inferior" }));
        jComboBoxArea.setToolTipText("Selecciona el area del cuerpo que desea entrenar");

        jTextFieldCodigo.setToolTipText("Introduce el código del entrenamiento. Máximo 5 caracteres alfanuméricos.");
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyTyped(evt);
            }
        });

        jCheckBoxCinta.setSelected(true);
        jCheckBoxCinta.setText("Cinta");
        jCheckBoxCinta.setToolTipText("La sala seleccionada incluye la cinta");

        jCheckBoxBicicleta.setSelected(true);
        jCheckBoxBicicleta.setText("Bicicleta");
        jCheckBoxBicicleta.setToolTipText("La sala seleccionada incluye la bicicleta");

        jCheckBoxPlacas.setSelected(true);
        jCheckBoxPlacas.setText("Placas");
        jCheckBoxPlacas.setToolTipText("La sala seleccionada incluye las placas");

        jCheckBoxPalancas.setSelected(true);
        jCheckBoxPalancas.setText("Palancas");
        jCheckBoxPalancas.setToolTipText("La sala seleccionada incluye las palancas");

        jCheckBoxBancos.setSelected(true);
        jCheckBoxBancos.setText("Bancos");
        jCheckBoxBancos.setToolTipText("La sala seleccionada incluye los bancos");

        jCheckBoxMulti.setSelected(true);
        jCheckBoxMulti.setText("Multifunción");
        jCheckBoxMulti.setToolTipText("La sala seleccionada incluye la multifunción");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEntrenador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerFecha)
                            .addComponent(jTextFieldNombreEntreno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxArea, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipoDeEntrenamiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabelArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(jLabelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMaquinas))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBoxCinta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxBicicleta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxPlacas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxPalancas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxBancos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonFitness)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonCross)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonMusculacion))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSpinnerPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addComponent(jTextFieldTelefono)
                                .addComponent(jTextFieldEntrenador))
                            .addComponent(jCheckBoxMulti))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombreEntreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jComboBoxTipoDeEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArea)
                    .addComponent(jComboBoxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEntrenador)
                    .addComponent(jTextFieldEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecio)
                    .addComponent(jSpinnerPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUbicacion)
                    .addComponent(jRadioButtonFitness)
                    .addComponent(jRadioButtonCross)
                    .addComponent(jRadioButtonMusculacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMaquinas)
                    .addComponent(jCheckBoxCinta)
                    .addComponent(jCheckBoxBicicleta)
                    .addComponent(jCheckBoxPlacas)
                    .addComponent(jCheckBoxPalancas)
                    .addComponent(jCheckBoxBancos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxMulti)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButtonAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        int longitudCodigo = jTextFieldCodigo.getText().length();
        int longitudNombreEntreno = jTextFieldNombreEntreno.getText().length();
        int longitudTelefono = jTextFieldTelefono.getText().length();
        int longitudEntrenador = jTextFieldEntrenador.getText().length();
        if (validarCampos(longitudCodigo,5) && validarCampos(longitudNombreEntreno, 10) && validarCampos(longitudTelefono, 9) && validarCampos(longitudEntrenador,10)) {
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            dispose();
        } else{
            JOptionPane.showMessageDialog(null, "Algún campo esta mal rellenado");
        }
        
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        if (cancelar()) {
            dispose();
        }
        else{
            if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                dispose();
            }
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
        // TODO add your handling code here:
        if(comprobarNumeroCorrecto(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jTextFieldCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyTyped
        // TODO add your handling code here:
        if(comprobarNumeroCorrecto(evt.getKeyChar()) && comprobarTeclaCorrecta(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCodigoKeyTyped

    private void jTextFieldNombreEntrenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreEntrenoKeyTyped
        // TODO add your handling code here:
        if(comprobarNumeroCorrecto(evt.getKeyChar()) && comprobarTeclaCorrecta(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreEntrenoKeyTyped

    private void jTextFieldEntrenadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEntrenadorKeyTyped
        // TODO add your handling code here:
        if (comprobarTeclaCorrecta(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldEntrenadorKeyTyped

    private void jRadioButtonFitnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFitnessActionPerformed
        // TODO add your handling code here:
        jCheckBoxBancos.setEnabled(true);
        jCheckBoxBicicleta.setEnabled(true);
        jCheckBoxCinta.setEnabled(true);
        jCheckBoxMulti.setEnabled(true);
        jCheckBoxPalancas.setEnabled(true);
        jCheckBoxPlacas.setEnabled(true);
        jCheckBoxBancos.setSelected(true);
        jCheckBoxBicicleta.setSelected(true);
        jCheckBoxCinta.setSelected(true);
        jCheckBoxMulti.setSelected(true);
        jCheckBoxPalancas.setSelected(true);
        jCheckBoxPlacas.setSelected(true);

    }//GEN-LAST:event_jRadioButtonFitnessActionPerformed

    private void jRadioButtonCrossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCrossActionPerformed
        // TODO add your handling code here:
        jCheckBoxPalancas.setEnabled(true);
        jCheckBoxPlacas.setEnabled(true);
        jCheckBoxMulti.setEnabled(false);
        jCheckBoxBancos.setEnabled(false);
        jCheckBoxBicicleta.setEnabled(false);
        jCheckBoxCinta.setEnabled(false);
        jCheckBoxPalancas.setSelected(true);
        jCheckBoxPlacas.setSelected(true);
        jCheckBoxBancos.setSelected(false);
        jCheckBoxMulti.setSelected(false);
        jCheckBoxBicicleta.setSelected(false);
        jCheckBoxCinta.setSelected(false);
    }//GEN-LAST:event_jRadioButtonCrossActionPerformed

    private void jRadioButtonMusculacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMusculacionActionPerformed
        // TODO add your handling code here:
        jCheckBoxMulti.setEnabled(true);
        jCheckBoxBancos.setEnabled(true);
        jCheckBoxPalancas.setEnabled(false);
        jCheckBoxPlacas.setEnabled(false);
        jCheckBoxBicicleta.setEnabled(false);
        jCheckBoxCinta.setEnabled(false);
        jCheckBoxBancos.setSelected(true);
        jCheckBoxMulti.setSelected(true);
        jCheckBoxPalancas.setSelected(false);
        jCheckBoxPlacas.setSelected(false);
        jCheckBoxBicicleta.setSelected(false);
        jCheckBoxCinta.setSelected(false);
    }//GEN-LAST:event_jRadioButtonMusculacionActionPerformed

    private void jComboBoxTipoDeEntrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoDeEntrenamientoActionPerformed
        // TODO add your handling code here:
        int indice = jComboBoxTipoDeEntrenamiento.getSelectedIndex();
        if (indice == 0 || indice == 3) {
            jComboBoxArea.setEnabled(true);
        }
        else{
            jComboBoxArea.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxTipoDeEntrenamientoActionPerformed
   /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupUbicacion;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JCheckBox jCheckBoxBancos;
    private javax.swing.JCheckBox jCheckBoxBicicleta;
    private javax.swing.JCheckBox jCheckBoxCinta;
    private javax.swing.JCheckBox jCheckBoxMulti;
    private javax.swing.JCheckBox jCheckBoxPalancas;
    private javax.swing.JCheckBox jCheckBoxPlacas;
    private javax.swing.JComboBox<String> jComboBoxArea;
    private javax.swing.JComboBox<String> jComboBoxTipoDeEntrenamiento;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEntrenador;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelMaquinas;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonCross;
    private javax.swing.JRadioButton jRadioButtonFitness;
    private javax.swing.JRadioButton jRadioButtonMusculacion;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JSpinner jSpinnerPrecio;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEntrenador;
    private javax.swing.JTextField jTextFieldNombreEntreno;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
