//GrupoH
package com.mycompany.ventascheckstyle.Vista;
import com.mycompany.ventascheckstyle.Controlador.CategoriaControlador;
import com.mycompany.ventascheckstyle.Modelo.CategoriaDTO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CategoriasActualizar extends javax.swing.JFrame {
    private CategoriaControlador controlador;
    private DefaultTableModel tableModel;

    public CategoriasActualizar() {
        initComponents();
        controlador = new CategoriaControlador();
        tableModel =(DefaultTableModel)jTableCategorias.getModel();
        cargarCategoriasTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCategorias = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblHeader4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnCategorias1 = new javax.swing.JButton();
        btnModProductos = new javax.swing.JButton();
        btnModVentas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTableCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre"
            }
        ));
        jTableCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCategorias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 0, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHeader4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHeader4.setText("SISTEMA ELIZABETH");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(lblHeader4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblHeader4)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCategorias1.setText("Categorias");
        btnCategorias1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategorias1ActionPerformed(evt);
            }
        });

        btnModProductos.setText("Productos");
        btnModProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModProductosActionPerformed(evt);
            }
        });

        btnModVentas.setText("Ventas");
        btnModVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCategorias1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(btnModProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnCategorias1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModVentas)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jLabel1.setText("EDITAR CATEGORIA");

        txtNombre.setText(" ");

        jLabel2.setText("Nombre:");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnActualizar)
                                .addGap(57, 57, 57)
                                .addComponent(btnRegresar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar)
                            .addComponent(btnActualizar)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // Lo regresamos al modulo de categorias
        dispose();
        new CategoriasModu().setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCategorias1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategorias1ActionPerformed
        //LLamo a categorias modu:
        dispose();
        new CategoriasModu().setVisible(true);
    }//GEN-LAST:event_btnCategorias1ActionPerformed

    private void btnModProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModProductosActionPerformed
        dispose();
       // new ProductoModu().setVisible(true);
    }//GEN-LAST:event_btnModProductosActionPerformed

    private void btnModVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModVentasActionPerformed
        dispose();
       // new ventasForm().setVisible(true);
    }//GEN-LAST:event_btnModVentasActionPerformed

    private void jTableCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCategoriasMouseClicked
       int fila = jTableCategorias.getSelectedRow();
       if (fila != -1) {
            cargarCampos(fila);
       }
    }//GEN-LAST:event_jTableCategoriasMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       
        actualizar();
        
    }//GEN-LAST:event_btnActualizarActionPerformed
 
    private void actualizar(){
        int fila = jTableCategorias.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una categoría de la tabla.");
            return;
        }

        String nombre = txtNombre.getText().trim();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre de la categoría no puede estar vacío.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTableCategorias.getModel();
        int id = (int) model.getValueAt(fila, 0); // Obtén el ID de la categoría seleccionada

        boolean actualizado = controlador.actualizarCategoria(id, nombre);
        if (actualizado) {
            JOptionPane.showMessageDialog(this, "Categoría actualizada correctamente.");
            cargarCategoriasTabla(); // Recarga la tabla
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar la categoría.");
        }
    }
    private void cargarCategoriasTabla(){
        tableModel.setRowCount(0);
        List <CategoriaDTO> categorias = controlador.listarCategorias();

        for (CategoriaDTO categoria : categorias){
            tableModel.addRow(new Object []{
                categoria.getId(),
                categoria.getNombre()
            });
         }
    }
     
    private void cargarCampos(int fila) {
       DefaultTableModel model = (DefaultTableModel) jTableCategorias.getModel();
       txtNombre.setText(model.getValueAt(fila, 1).toString());
     }
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriasActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCategorias1;
    private javax.swing.JButton btnModProductos;
    private javax.swing.JButton btnModVentas;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCategorias;
    private javax.swing.JLabel lblHeader4;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
