/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ptamagotchi;

import Actividades.BatallaLegendaria;
import Actividades.Batallar;
import Actividades.Caminar;
import Actividades.Entrenar;
import Actividades.Nadar;
import Alimentos.Alga;
import Alimentos.BabiriBerry;
import Alimentos.FigyBerry;
import Alimentos.GrepaBerry;
import Alimentos.TangaBerry;
import Mascota.Mascota;
import Medicamentos.PocionMaxima;

/**
 *
 * @author Emanuel
 */
public class Tamagotchi extends javax.swing.JFrame {
    public Mascota mascota;
    public Nadar nadar;
    public Entrenar entrenar;
    public Caminar caminar;
    public Batallar batalla;
    public BatallaLegendaria batallaLegen;
    public Alga alga;
    public BabiriBerry Babiri;
    public FigyBerry Figy;
    public GrepaBerry Grepa;
    public TangaBerry Tanga;
    public PocionMaxima PocionMax;

    /**
     * Creates new form Tamagotchi
     */
    public Tamagotchi() {
        initComponents();
        mascota = new Mascota();
        nadar = new Nadar();
        entrenar = new Entrenar();
        caminar = new Caminar();
        batalla = new Batallar();
        batallaLegen = new BatallaLegendaria();
        alga = new Alga();
        Babiri = new BabiriBerry();
        Figy = new FigyBerry();
        Grepa = new GrepaBerry();
        Tanga = new TangaBerry();
        PocionMax = new PocionMaxima();
    }

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tamagotchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tamagotchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tamagotchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tamagotchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tamagotchi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
