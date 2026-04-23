/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 *
 * @author Hernanadez
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();

        this.setExtendedState(MAXIMIZED_BOTH);
    }

public void showFormMantTipoArticulo()
{
    if(fmta == null)
    {
    fmta = new RegistroHuespedes();
        Dimension d = new Dimension();
        Dimension frameDim = this.getSize();
        d = fmta.getSize();
        getContentPane().add(fmta).setLocation(((int) frameDim.getWidth() - (int) d.getWidth())/2, ((int) frameDim.getHeight() - (int) d.getHeight())/2);

            desktopPane.add(fmta);
            fmta.show();
    }
    else
    {
        fmta =null;
    }
}
public void showFormMantArticulos()
{
    if(fma == null)
    {
    fma= new CreacionReserva();
        Dimension d = new Dimension();
        Dimension frameDim = this.getSize();
        d = fma.getSize();
        getContentPane().add(fma).setLocation(((int) frameDim.getWidth() - (int) d.getWidth())/2, ((int) frameDim.getHeight() - (int) d.getHeight())/2);

            desktopPane.add(fma);
            fma.show();
    }
    else
    {
        fma =null;
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menItemIngresoTipoArticulo = new javax.swing.JMenuItem();
        MitemIngesoArticulos = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        EmpleadosMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE GESTION DE TIENDA-MENU");
        setIconImage(new ImageIcon(getClass().getResource("/resources/iconoSisPedidos5.jpg")).getImage());

        fileMenu.setMnemonic('f');
        fileMenu.setText("Categoría");

        menItemIngresoTipoArticulo.setMnemonic('o');
        menItemIngresoTipoArticulo.setText("Ingresar");
        menItemIngresoTipoArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menItemIngresoTipoArticuloMousePressed(evt);
            }
        });
        fileMenu.add(menItemIngresoTipoArticulo);

        MitemIngesoArticulos.setMnemonic('s');
        MitemIngesoArticulos.setText("Modificar categoría");
        MitemIngesoArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MitemIngesoArticulosMousePressed(evt);
            }
        });
        fileMenu.add(MitemIngesoArticulos);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        jMenu1.setText("Hotel");

        EmpleadosMenuItem1.setText("Ingreso");
        EmpleadosMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EmpleadosMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(EmpleadosMenuItem1);

        menuBar.add(jMenu1);

        jMenu4.setText("Habitaciones");

        jMenuItem1.setText("Ingreso Habitaciones");
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Modificar Habitaciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        menuBar.add(jMenu4);

        jMenu6.setText("Registro huéspedes");

        jMenuItem5.setText("Registrar huésped");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuItem6.setText("Modificar huésped");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        menuBar.add(jMenu6);

        jMenu8.setText("Reserva");

        jMenuItem9.setText("Crear reserva");
        jMenu8.add(jMenuItem9);

        jMenuItem10.setText("Modificar reserva");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);

        menuBar.add(jMenu8);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void menItemIngresoTipoArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menItemIngresoTipoArticuloMousePressed
        showFormMantTipoArticulo();
    }//GEN-LAST:event_menItemIngresoTipoArticuloMousePressed

    private void MitemIngesoArticulosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MitemIngesoArticulosMousePressed
       showFormMantArticulos();
    }//GEN-LAST:event_MitemIngesoArticulosMousePressed

    private void EmpleadosMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpleadosMenuItem1MousePressed
      
    }//GEN-LAST:event_EmpleadosMenuItem1MousePressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EmpleadosMenuItem1;
    private javax.swing.JMenuItem MitemIngesoArticulos;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem menItemIngresoTipoArticulo;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

    RegistroHuespedes fmta;
    CreacionReserva fma;
   // FormMantAutores fma;
   // FormMantCategorias fmc;
   // FormMantTiposLibros fmtl;
   // FormManLibros1 fml;
   // FormMantEmpleados fme;
   // FormMantEjemplares fmej;
  //  FormMantUsuarios fmu;
}
