<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandra Arias
 */
public class Vista extends javax.swing.JFrame {
     private Lista nvoLib;
     DefaultTableModel dtm = new DefaultTableModel();
     List<Libro> li = new ArrayList<>();
     ArbolBinario ab = new ArbolBinario();
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        nvoLibro();
     
  
        DefaultTableModel mod = (DefaultTableModel) tblLibros.getModel();      

        Object[] fila = new Object[tblLibros.getColumnCount()];
        for(int i = 0; i<li.size(); i++){
            fila[0] = li.get(i).getNombre();
            fila[1] = li.get(i).getAutor();
            fila[2] = li.get(i).getCantidad();
            mod.addRow(fila);
        }
    }
    
    private void nvoLibro(){
        
            Libro l1 = new Libro();
            l1.setNombre("Orgullo y Prejuicio");
            l1.setAutor("Jane Austen");
            l1.setCantidad(8);
           

            Libro l2 = new Libro();
            l2.setNombre("Los hornos de Hitler");
            l2.setAutor("Olga Lengyel");
            l2.setCantidad(6);

            Libro l3 = new Libro();
            l3.setNombre("Harry Potter y la piedra filosofal");
            l3.setAutor("J. K. Rowling");
            l3.setCantidad(4);

            Libro l4 = new Libro();
            l4.setNombre("Historias Cruzadas");
            l4.setAutor("Kathryn Stockett");
            l4.setCantidad(7);
            
            Libro l5 = new Libro();
            l5.setNombre("A primera vista");
            l5.setAutor("Nicholas Sparks ");
            l5.setCantidad(2);
            
            li.add(l1);
            li.add(l2);
            li.add(l3); 
            li.add(l4); 
            li.add(l5); 
    }
    
    
     private void LlenarTabla(){
           DefaultTableModel model = (DefaultTableModel) tblLibros.getModel();
           
        Object[] fila = new Object[tblLibros.getColumnCount()];
        
            fila[0] = txtNombre.getText();
            fila[1] = txtAutor.getText();
            fila[2] = txtCant.getText();
         
            model.addRow(fila);
            
     }
      
      private void Limpiar(){
       
        txtNombre.setText("");
        txtAutor.setText("");
        txtCant.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBLibro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBAutor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBStock = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrdenadas = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLibros.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Libro", "Autor", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLibros);
        if (tblLibros.getColumnModel().getColumnCount() > 0) {
            tblLibros.getColumnModel().getColumn(0).setResizable(false);
            tblLibros.getColumnModel().getColumn(1).setResizable(false);
            tblLibros.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 46, -1, 156));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 47, -1, 28));

        txtNombre.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 47, 90, 28));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Autor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 86, 51, 28));

        txtAutor.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 86, 90, 28));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantiad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 125, -1, 28));

        txtCant.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        txtCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantActionPerformed(evt);
            }
        });
        getContentPane().add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 125, 90, 28));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nuevo Libro");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 13, 166, 28));

        btnAgregar.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 171, 90, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Busqueda por nombre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 269, 199, 28));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 249, 805, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Libros ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 7, 166, 28));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Libro");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 328, -1, 28));

        txtBLibro.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        txtBLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBLibroActionPerformed(evt);
            }
        });
        getContentPane().add(txtBLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 328, 90, 28));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Autor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 328, 50, 28));

        txtBAutor.setEditable(false);
        txtBAutor.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        txtBAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBAutorActionPerformed(evt);
            }
        });
        getContentPane().add(txtBAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 328, 90, 28));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Disponibles");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 328, -1, 28));

        txtBStock.setEditable(false);
        txtBStock.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        txtBStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBStockActionPerformed(evt);
            }
        });
        getContentPane().add(txtBStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 328, 90, 28));

        btnBuscar.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 374, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 207, 90, -1));

        tblOrdenadas.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        tblOrdenadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Libro", "Autor", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrdenadas);
        if (tblOrdenadas.getColumnModel().getColumnCount() > 0) {
            tblOrdenadas.getColumnModel().getColumn(0).setResizable(false);
            tblOrdenadas.getColumnModel().getColumn(1).setResizable(false);
            tblOrdenadas.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 433, -1, 156));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/l.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantActionPerformed

    private void txtBLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBLibroActionPerformed

    private void txtBAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBAutorActionPerformed

    private void txtBStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBStockActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        LlenarTabla();
        Limpiar();
 
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblLibros.getModel();

        int fila = tblLibros.getSelectedRow();
        if(fila>=0){
            model.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(this, "Fila no seleccionada");
        }
       
   
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        btnBuscar aux = raiz;
        
        
        
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTable tblOrdenadas;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBAutor;
    private javax.swing.JTextField txtBLibro;
    private javax.swing.JTextField txtBStock;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
=======
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
        fondo = new javax.swing.JLabel();

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

        Nombre.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 130, -1));
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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/l.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

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
    }
    private void txtBLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBLibroActionPerformed

    private void txtBAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBAutorActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      String s = Stock.getText();
      int stk = Integer.parseInt(Stock.getText());
      for (int i = 0; i < tblLibros.getRowCount(); i++) {
            if(tblLibros.getValueAt(i, 2).toString().equals(s)){
                 txtBLibro.setText(tblLibros.getValueAt(i,0).toString());
                 txtBAutor.setText(tblLibros.getValueAt(i,1).toString());
            }else{
                 JOptionPane.showMessageDialog(null, "No existe esa cantidad");
                 
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
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
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
>>>>>>> 25f67c4e019b16a7e2f3f6931097f1f318b19a1c
