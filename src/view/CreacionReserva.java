/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;


import beans.Articulo;
import beans.Tipo_articulo;
import beans.dao.impl.DaoArticulo;
import beans.dao.impl.DaoTipo_articulo;
import beans.impl.DaoArticulosImpl;
import beans.impl.DaoTipoArticuloImpl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hernanadez
 */
public class CreacionReserva extends javax.swing.JInternalFrame {
    DaoArticulo daoArticulo = new DaoArticulosImpl();
    DaoTipo_articulo daoTipo_articulo = new DaoTipoArticuloImpl();
    /**
     * Creates new form FormMantDepartamento
     */
    public CreacionReserva() {
        initComponents();
        dt.addColumn("CODIGO");
        dt.addColumn("DESCRIPCIÓN");
        dt.addColumn("PRECIO VENTA");
        dt.addColumn("PRECIO COSTO");
        dt.addColumn("CODIGO TIPO");
        dt.addColumn("FECHA INGRESO");
        tblMantArticulos.setModel(dt);
        llenaTabla();
        formateaTabla();
        formateaTablaDialogCategorias();
    }
public void formateaTabla()
{
       tblMantArticulos.getColumnModel().getColumn(0).setPreferredWidth(30);
       tblMantArticulos.getColumnModel().getColumn(1).setPreferredWidth(100);
       tblMantArticulos.getColumnModel().getColumn(2).setPreferredWidth(100);
       tblMantArticulos.getColumnModel().getColumn(3).setPreferredWidth(30);
       tblMantArticulos.getColumnModel().getColumn(4).setPreferredWidth(30);
       tblMantArticulos.getColumnModel().getColumn(5).setPreferredWidth(30);
}
public void formateaTablaDialogCategorias()
{
    dtDialogTipoArticulo.addColumn("CODIGO");
    dtDialogTipoArticulo.addColumn("DESCRIPCION");
    
    tblDialogTipoArticulo.setModel(dtDialogTipoArticulo);
    tblDialogTipoArticulo.getColumnModel().getColumn(0).setPreferredWidth(30);
    tblDialogTipoArticulo.getColumnModel().getColumn(1).setPreferredWidth(100);
}

public void llenaTabla()
{
    try{
    ArrayList<Articulo> lista1 = new ArrayList<Articulo>();
    lista1 = (ArrayList)daoArticulo.query();
    dt.setRowCount(lista1.size());
    int i=0;
        for (Articulo lista11 : lista1) {
            dt.setValueAt(lista11.getId_articulo(), i, 0);
            dt.setValueAt(lista11.getDescripcion(), i, 1);
            dt.setValueAt(lista11.getPrecio_venta(), i, 2);
            dt.setValueAt(lista11.getPrecio_costo(), i, 3);
            dt.setValueAt(lista11.getCod_tipo_articulo(), i, 4);
            dt.setValueAt(lista11.getFecha_ingreso(), i, 5);
            i++;
        }
    tblMantArticulos.setModel(dt);
    System.out.println();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}
public void llenaTablaDialogCategorias()
{
    try{
    ArrayList<Tipo_articulo> lista1 = new ArrayList<Tipo_articulo>();
    lista1 = (ArrayList)daoTipo_articulo.query();
    dtDialogTipoArticulo.setRowCount(lista1.size());
    int i=0;
        for (Tipo_articulo lista11 : lista1) {
            dtDialogTipoArticulo.setValueAt(lista11.getId_tipoarticulo(), i, 0);
            dtDialogTipoArticulo.setValueAt(lista11.getDescripcion_articulo(), i, 1);
          
            i++;
        }
    tblDialogTipoArticulo.setModel(dtDialogTipoArticulo);
    System.out.println();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}

public void obtieneCodigo()
{
    int cod = daoArticulo.getCodigo();
    cod = cod+1;
    txtIdArticulo.setText(String.valueOf(cod));
}
public void limpiaCampos()
{
    txtIdArticulo.setText("");
    txtDescripcionArticulo.setText("");
    txtPrecioVenta.setText("");
    txtPrecioCosto.setText("");
    txtFechaIngreso.setText("");
    txtIdTipoArticulo.setText("");
   
}
public void editableCodigo()
{
    txtIdArticulo.setEditable(false);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogBusquedaCategoriaArticluos = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDialogTipoArticulo = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMantArticulos = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtIdArticulo = new javax.swing.JTextField();
        txtDescripcionArticulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdTipoArticulo = new javax.swing.JTextField();
        btnBuscarCat = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtIdTipoArticulo1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIdTipoArticulo2 = new javax.swing.JTextField();
        txtFechaIngreso1 = new javax.swing.JTextField();

        tblDialogTipoArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDialogTipoArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDialogTipoArticuloMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblDialogTipoArticulo);

        javax.swing.GroupLayout dialogBusquedaCategoriaArticluosLayout = new javax.swing.GroupLayout(dialogBusquedaCategoriaArticluos.getContentPane());
        dialogBusquedaCategoriaArticluos.getContentPane().setLayout(dialogBusquedaCategoriaArticluosLayout);
        dialogBusquedaCategoriaArticluosLayout.setHorizontalGroup(
            dialogBusquedaCategoriaArticluosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogBusquedaCategoriaArticluosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogBusquedaCategoriaArticluosLayout.setVerticalGroup(
            dialogBusquedaCategoriaArticluosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogBusquedaCategoriaArticluosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setClosable(true);

        tblMantArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMantArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMantArticulosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblMantArticulos);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icono_nuevo1.jpg"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icono_modificar.png"))); // NOI18N

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icono_eliminar3.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icono_guardar1.png"))); // NOI18N
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CREACIÓN DE RESERVA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CODIGO DE RESERVA:");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtIdArticulo.setEditable(false);
        txtIdArticulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtDescripcionArticulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CODIGO HUÉSPED:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("FECH. INICIO:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("FECH. FINALIZACIÓN:");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtFechaIngreso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("NOMBRE:");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtIdTipoArticulo.setEditable(false);
        txtIdTipoArticulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnBuscarCat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarCat.setText("...");
        btnBuscarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCatActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("DIRECCIÓN:");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtIdTipoArticulo1.setEditable(false);
        txtIdTipoArticulo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("CELULAR:");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtIdTipoArticulo2.setEditable(false);
        txtIdTipoArticulo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtFechaIngreso1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(462, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdTipoArticulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdTipoArticulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdTipoArticulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtFechaIngreso1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcionArticulo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarCat))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFechaIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcionArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtIdTipoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIdTipoArticulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarCat)))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtIdTipoArticulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMantArticulosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMantArticulosMousePressed
        int index = tblMantArticulos.getSelectedRow();
        txtIdArticulo.setText(String.valueOf(tblMantArticulos.getValueAt(index, 0)));
        txtDescripcionArticulo.setText(String.valueOf(tblMantArticulos.getValueAt(index, 1)));
        txtPrecioVenta.setText(String.valueOf(tblMantArticulos.getValueAt(index, 2)));
        txtPrecioCosto.setText(String.valueOf(tblMantArticulos.getValueAt(index, 3)));
        txtIdTipoArticulo.setText(String.valueOf(tblMantArticulos.getValueAt(index, 4)));
        txtFechaIngreso.setText(String.valueOf(tblMantArticulos.getValueAt(index, 5)));
        
    }//GEN-LAST:event_tblMantArticulosMousePressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiaCampos();
        obtieneCodigo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        Articulo articulo = new Articulo();
        articulo.setId_articulo(Integer.parseInt(txtIdArticulo.getText()));
        articulo.setDescripcion(txtDescripcionArticulo.getText());
        articulo.setPrecio_venta(Float.parseFloat(txtPrecioVenta.getText()));
        articulo.setPrecio_costo(Float.parseFloat(txtPrecioCosto.getText()));
        articulo.setFecha_ingreso(txtFechaIngreso.getText());
        articulo.setCod_tipo_articulo(Integer.parseInt(txtIdTipoArticulo.getText()));
        JOptionPane.showMessageDialog(null,daoArticulo.insert(articulo));
        limpiaCampos();
        llenaTabla();
       
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      JOptionPane.showMessageDialog(rootPane, daoArticulo.delete(Integer.parseInt(txtIdArticulo.getText())));
      llenaTabla();
      limpiaCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblDialogTipoArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDialogTipoArticuloMousePressed
        int idx = tblDialogTipoArticulo.getSelectedRow();
        txtIdTipoArticulo.setText(String.valueOf(tblDialogTipoArticulo.getValueAt(idx, 0)));
        dialogBusquedaCategoriaArticluos.setVisible(false);
    }//GEN-LAST:event_tblDialogTipoArticuloMousePressed

    private void btnBuscarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCatActionPerformed
        dialogBusquedaCategoriaArticluos.setSize(620, 300);
        dialogBusquedaCategoriaArticluos.setLocationRelativeTo(this);
        dialogBusquedaCategoriaArticluos.setVisible(true);
        //formateaTablaDialogCategorias();
        llenaTablaDialogCategorias();
    }//GEN-LAST:event_btnBuscarCatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCat;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JDialog dialogBusquedaCategoriaArticluos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDialogTipoArticulo;
    private javax.swing.JTable tblMantArticulos;
    private javax.swing.JTextField txtDescripcionArticulo;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtFechaIngreso1;
    private javax.swing.JTextField txtIdArticulo;
    private javax.swing.JTextField txtIdTipoArticulo;
    private javax.swing.JTextField txtIdTipoArticulo1;
    private javax.swing.JTextField txtIdTipoArticulo2;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel dt = new DefaultTableModel();
    DefaultTableModel dtDialogTipoArticulo = new DefaultTableModel();
   
}
