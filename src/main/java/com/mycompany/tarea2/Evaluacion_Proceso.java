package tarea2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import javax.swing.Timer;
public class Evaluacion_Proceso extends javax.swing.JFrame {
    
    private Evaluacion evaluacion;
    private Pregunta_VF[] preguntas;
    private int indice;
    private int total_preguntas;
    private long seg;
    public Evaluacion_Proceso() {
        this.seg = Instant.now().getEpochSecond();
        // Timer that updates every second
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Tiempo();
            }
        });
        timer.start();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoAlternativas = new javax.swing.ButtonGroup();
        btnAnterior = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        txtNumero = new javax.swing.JLabel();
        txtTaxonomia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEnunciado = new javax.swing.JTextArea();
        txtTiempo = new javax.swing.JLabel();
        PanelAlternativas = new javax.swing.JPanel();
        rbOpcionA = new javax.swing.JRadioButton();
        rbOpcionC = new javax.swing.JRadioButton();
        rbOpcionB = new javax.swing.JRadioButton();
        rbOpcionD = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        txtEnunciado.setEditable(false);
        txtEnunciado.setColumns(20);
        txtEnunciado.setLineWrap(true);
        txtEnunciado.setRows(5);
        txtEnunciado.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtEnunciado);

        grupoAlternativas.add(rbOpcionA);
        rbOpcionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOpcionAActionPerformed(evt);
            }
        });

        grupoAlternativas.add(rbOpcionC);

        grupoAlternativas.add(rbOpcionB);

        grupoAlternativas.add(rbOpcionD);

        javax.swing.GroupLayout PanelAlternativasLayout = new javax.swing.GroupLayout(PanelAlternativas);
        PanelAlternativas.setLayout(PanelAlternativasLayout);
        PanelAlternativasLayout.setHorizontalGroup(
            PanelAlternativasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAlternativasLayout.createSequentialGroup()
                .addGroup(PanelAlternativasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbOpcionC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbOpcionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbOpcionA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbOpcionD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelAlternativasLayout.setVerticalGroup(
            PanelAlternativasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAlternativasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbOpcionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOpcionB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOpcionC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOpcionD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelAlternativas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 488, Short.MAX_VALUE)
                                .addComponent(txtTaxonomia, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTaxonomia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(PanelAlternativas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnFinalizar)
                    .addComponent(btnSiguiente)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void Tiempo(){
        long rest = this.evaluacion.getTiempo()-(Instant.now().getEpochSecond()-this.seg);
        txtTiempo.setText((rest/60)+":"+(rest%60));
        if(rest<=0){
            guardarRespuestaUsuario();
            int puntaje = 0;
            for(Pregunta_VF p: preguntas){
                if(p.getRespuestaUsuario() == p.getRespuestaCorrecta()){
                    puntaje += p.getPuntaje();
                }
            }
            evaluacion.setPuntajeObtenido(puntaje);
            this.dispose();
            Evaluacion_Finalizar resultado = new Evaluacion_Finalizar();
            resultado.Resultado(this.preguntas, this.evaluacion);
            resultado.setVisible(true);
        }
    } 
    
    public void cargarEvaluacion(int idEvaluacion) {
        EvaluacionCRUD evaluacionDAO = new EvaluacionCRUD(); // Instanciar tu DAO
        this.evaluacion = evaluacionDAO.obtenerEvaluacionPorId(idEvaluacion);
        if (evaluacion != null) {
            this.total_preguntas = this.evaluacion.getCantidadPreguntasVF() + this.evaluacion.getCantidadPreguntasAlternativas();
            this.preguntas = evaluacionDAO.obtenerPreguntasPorEvaluacion(this.evaluacion.getIdEvaluacion(), total_preguntas);
            indice = 0;
            Tiempo();
            mostrarPregunta();
        } else {
            Intro intro = new Intro();
            intro.TablaEvaluacionGUI();
            intro.setVisible(true);
            System.out.println("Error: Evaluación no encontrada con ID: " + idEvaluacion);
            javax.swing.JOptionPane.showMessageDialog(this, "La evaluación seleccionada no existe.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
    }
    
    private void mostrarPregunta() {
        Tiempo();
        if (this.indice >= 0 && this.indice < this.total_preguntas) {
            if(this.indice == 0){
                btnAnterior.setVisible(false);
            } else{
                btnAnterior.setVisible(true);
            }
            if(indice == (this.total_preguntas-1)){
                btnSiguiente.setVisible(false);
            } else{
                btnSiguiente.setVisible(true);
            }
            txtNumero.setText((this.indice + 1) + "/" + this.total_preguntas);
            txtEnunciado.setText(this.preguntas[this.indice].getEnunciado()+" ("+this.preguntas[this.indice].getPuntaje()+" pts)");
            txtTaxonomia.setText("Nivel: " + this.preguntas[this.indice].getNivelTaxonomico());
            PanelAlternativas.setVisible(true);
            if (preguntas[this.indice] instanceof Pregunta_Alternativa pa) {
                rbOpcionA.setText(pa.getAlternativas()[0]);
                rbOpcionB.setText(pa.getAlternativas()[1]);
                rbOpcionC.setText(pa.getAlternativas()[2]);
                rbOpcionD.setText(pa.getAlternativas()[3]);
                rbOpcionC.setVisible(true);
                rbOpcionD.setVisible(true);
                grupoAlternativas.clearSelection();
                if (pa.getRespuestaUsuario() != -1) {
                    switch (pa.getRespuestaUsuario()) {
                        case 0 -> rbOpcionA.setSelected(true);
                        case 1 -> rbOpcionB.setSelected(true);
                        case 2 -> rbOpcionC.setSelected(true);
                        case 3 -> rbOpcionD.setSelected(true);
                    }
                }
            } else {
                rbOpcionA.setText("Falso");
                rbOpcionB.setText("Verdadero");
                rbOpcionC.setVisible(false);
                rbOpcionD.setVisible(false);
                if (preguntas[indice].getRespuestaUsuario() != -1) {
                    switch (preguntas[indice].getRespuestaUsuario()) {
                        case 0 -> rbOpcionA.setSelected(true);
                        case 1 -> rbOpcionB.setSelected(true);
                        case 2 -> rbOpcionC.setSelected(true);
                        case 3 -> rbOpcionD.setSelected(true);
                    }
                }
            }
        } else {
            System.out.println("Índice de pregunta fuera de rango: " + indice);
        }
    }

    private void guardarRespuestaUsuario() {
        int respuestaSeleccionada = -1;
        if (rbOpcionA.isSelected()) {
            respuestaSeleccionada = 0;
        } else if (rbOpcionB.isSelected()) {
            respuestaSeleccionada = 1;
        } else if (rbOpcionC.isSelected()) {
            respuestaSeleccionada = 2;
        } else if (rbOpcionD.isSelected()) {
            respuestaSeleccionada = 3;
        }
        this.preguntas[indice].setRespuestaUsuario(respuestaSeleccionada);
    }
    
    private void rbOpcionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOpcionAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOpcionAActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        guardarRespuestaUsuario();
        this.indice--;
        mostrarPregunta();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        guardarRespuestaUsuario();
        this.indice++;
        mostrarPregunta();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        guardarRespuestaUsuario();
        int puntaje = 0;
        for(Pregunta_VF p: preguntas){
            if(p.getRespuestaUsuario() == p.getRespuestaCorrecta()){
                puntaje += p.getPuntaje();
            }
        }
        evaluacion.setPuntajeObtenido(puntaje);
        this.dispose();
        Evaluacion_Finalizar resultado = new Evaluacion_Finalizar();
        resultado.Resultado(this.preguntas, this.evaluacion);
        resultado.setVisible(true);
    }//GEN-LAST:event_btnFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(Evaluacion_Proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evaluacion_Proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evaluacion_Proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evaluacion_Proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evaluacion_Proceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAlternativas;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup grupoAlternativas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbOpcionA;
    private javax.swing.JRadioButton rbOpcionB;
    private javax.swing.JRadioButton rbOpcionC;
    private javax.swing.JRadioButton rbOpcionD;
    private javax.swing.JTextArea txtEnunciado;
    private javax.swing.JLabel txtNumero;
    private javax.swing.JLabel txtTaxonomia;
    private javax.swing.JLabel txtTiempo;
    // End of variables declaration//GEN-END:variables
}
