package Reloj;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class AlarmaEditorPanel extends javax.swing.JPanel {
    
    public AlarmaEditorPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSeleccionaHora = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jCheckBoxActivada = new javax.swing.JCheckBox();
        jSpinnerHora = new javax.swing.JSpinner();

        jLabelSeleccionaHora.setText("Selecciona la hora de la alarma:");

        jLabelTitulo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelTitulo.setText("Opciones de la alarma");

        jCheckBoxActivada.setText("Activada");
        jCheckBoxActivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActivadaActionPerformed(evt);
            }
        });

        jSpinnerHora.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSeleccionaHora)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerHora, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxActivada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabelTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSeleccionaHora)
                    .addComponent(jCheckBoxActivada)
                    .addComponent(jSpinnerHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxActivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActivadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxActivadaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JCheckBox jCheckBoxActivada;
    private javax.swing.JLabel jLabelSeleccionaHora;
    private javax.swing.JLabel jLabelTitulo;
    protected javax.swing.JSpinner jSpinnerHora;
    // End of variables declaration//GEN-END:variables
}
