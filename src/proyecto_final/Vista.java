/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.util.Objects;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandra Arias
 */
public class Vista extends javax.swing.JFrame {
    ArbolBinario ab = new ArbolBinario();
    String m = "InOrden";
    
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        Cant.setValue(new Integer(0));
        Limpiar();
        this.setLocationRelativeTo(null);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Cant = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        Autor = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBLibro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBAutor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        Stock = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Agregar.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        Eliminar.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        Nombre.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 66, 130, 30));
        getContentPane().add(Cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 130, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Autor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 30));
        getContentPane().add(Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 130, 30));

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Autor", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tblLibros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 230));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Busqueda por Cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 199, 28));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Libro");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 28));

        txtBLibro.setEditable(false);
        txtBLibro.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        txtBLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBLibroActionPerformed(evt);
            }
        });
        getContentPane().add(txtBLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 160, 28));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Autor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 50, 28));

        txtBAutor.setEditable(false);
        txtBAutor.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        txtBAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBAutorActionPerformed(evt);
            }
        });
        getContentPane().add(txtBAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 160, 28));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cantidad");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 28));

        btnBuscar.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));
        getContentPane().add(Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 60, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nuevo Libro");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 166, 28));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Libros ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 166, 28));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 302, 300, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 10, 300));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 10, 210));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/l.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

        if (Nombre.getText() == null || Nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        } else {

            Integer cant = (Integer) Cant.getValue();

            ab.agregarNodo(cant.intValue(), Nombre.getText(), Autor.getText());
            Actualizar(m);
        }
        Limpiar();
    }//GEN-LAST:event_AgregarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    
        int fila = tblLibros.getSelectedRow();
        String dato = tblLibros.getModel().getValueAt(fila, 2).toString();
        ab.eliminar(Integer.parseInt(dato));
        Actualizar(m);

    }//GEN-LAST:event_EliminarActionPerformed
      private void Limpiar(){
       
        Nombre.setText("");
        Autor.setText("");
        Cant.setText("");
        txtBLibro.setText("");
        txtBAutor.setText("");
        Stock.setText("");
    }
    private void txtBLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBLibroActionPerformed

    private void txtBAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBAutorActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      String s = Stock.getText();
      //int stk = Integer.parseInt(Stock.getText());
      for (int i = 0; i < tblLibros.getRowCount(); i++) {
            if(tblLibros.getValueAt(i, 2).toString().equals(s)){
                 txtBLibro.setText(tblLibros.getValueAt(i,0).toString());
                 txtBAutor.setText(tblLibros.getValueAt(i,1).toString());
            }
            else if(Stock.getText() == null || Stock.getText().isEmpty()){
                 JOptionPane.showMessageDialog(null, "Cantidad no selecionada"); 
            }
       
        }  
        
    }//GEN-LAST:event_btnBuscarActionPerformed


    
    public void Actualizar(String m) {
        Vector fila = new Vector();
        DefaultTableModel mod = (DefaultTableModel) tblLibros.getModel();
        mod.getDataVector().clear();
        switch (m) {
            case "PreOrden":
                fila = ab.llamaPreOrder(ab.raiz);
                break;
            case "PosOrden":
                fila = ab.llamaPosOrder(ab.raiz);
                break;
            case "InOrden":
                fila = ab.llamaInOrder(ab.raiz);
                break;
            default:
                fila = ab.llamaInOrder(ab.raiz);
                break;
        }
        for (int i = 0; i < fila.size(); i++) {
            Nodo N = (Nodo) fila.get(i);
            mod.addRow(new Object[]{N.nombre, N.aut, N.dato});
        }
    }
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JFormattedTextField Autor;
    private javax.swing.JFormattedTextField Cant;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JFormattedTextField Stock;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtBAutor;
    private javax.swing.JTextField txtBLibro;
    // End of variables declaration//GEN-END:variables
}
