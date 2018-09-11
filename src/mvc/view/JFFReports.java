/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc.view;

import java.net.URL;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego SNP3004EX
 */
public class JFFReports extends javax.swing.JFrame {

    /**
     * Creates new form JFFReports
     */
    public JFFReports() {
        initComponents();
        
        URL url = getClass().getResource("/resource/img/wallet.png");
        ImageIcon icon = new ImageIcon(url);
        
        setTitle("My Wallet");
        setIconImage(icon.getImage());
                 
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
       
        jtbl_tranbycat.getTableHeader().setReorderingAllowed(false);
    }
        
    public void lauchMessage(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void fillJTable(Object[][] arr){
        
        DefaultTableModel tableModel = (DefaultTableModel) jtbl_tranbycat.getModel();
        tableModel.setRowCount(0);
        
        for(Object[] row: arr ){
             tableModel.addRow(row);
        }            
    }
    
    public void fillJcomboBox(ArrayList<String> arr){
        jcbox_category.setModel(new DefaultComboBoxModel(arr.toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnl_report = new javax.swing.JPanel();
        jpnl_reportabcontent = new javax.swing.JTabbedPane();
        jpnl_category = new javax.swing.JPanel();
        jlbl_category = new javax.swing.JLabel();
        jcbox_category = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_tranbycat = new javax.swing.JTable();
        jpnl_date = new javax.swing.JPanel();
        jpnl_graphic1 = new javax.swing.JPanel();
        jtbar_report = new javax.swing.JToolBar();
        jbtn_back = new javax.swing.JButton();
        jmbar_report = new javax.swing.JMenuBar();
        jmen_report = new javax.swing.JMenu();
        jmitem_close = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnl_report.setBorder(javax.swing.BorderFactory.createTitledBorder("Transacciones"));

        jlbl_category.setText("Seleccione Categoria");

        jtbl_tranbycat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Cuenta", "Categoria", "Concepto", "Monto", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jtbl_tranbycat);

        javax.swing.GroupLayout jpnl_categoryLayout = new javax.swing.GroupLayout(jpnl_category);
        jpnl_category.setLayout(jpnl_categoryLayout);
        jpnl_categoryLayout.setHorizontalGroup(
            jpnl_categoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_categoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnl_categoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(jpnl_categoryLayout.createSequentialGroup()
                        .addGroup(jpnl_categoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_category)
                            .addComponent(jcbox_category, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnl_categoryLayout.setVerticalGroup(
            jpnl_categoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_categoryLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlbl_category)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbox_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnl_reportabcontent.addTab("Categoria", jpnl_category);

        javax.swing.GroupLayout jpnl_dateLayout = new javax.swing.GroupLayout(jpnl_date);
        jpnl_date.setLayout(jpnl_dateLayout);
        jpnl_dateLayout.setHorizontalGroup(
            jpnl_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jpnl_dateLayout.setVerticalGroup(
            jpnl_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jpnl_reportabcontent.addTab("Fecha", jpnl_date);

        javax.swing.GroupLayout jpnl_graphic1Layout = new javax.swing.GroupLayout(jpnl_graphic1);
        jpnl_graphic1.setLayout(jpnl_graphic1Layout);
        jpnl_graphic1Layout.setHorizontalGroup(
            jpnl_graphic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jpnl_graphic1Layout.setVerticalGroup(
            jpnl_graphic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jpnl_reportabcontent.addTab("Gastos vs Ingresos", jpnl_graphic1);

        javax.swing.GroupLayout jpnl_reportLayout = new javax.swing.GroupLayout(jpnl_report);
        jpnl_report.setLayout(jpnl_reportLayout);
        jpnl_reportLayout.setHorizontalGroup(
            jpnl_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_reportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnl_reportabcontent)
                .addContainerGap())
        );
        jpnl_reportLayout.setVerticalGroup(
            jpnl_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_reportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnl_reportabcontent, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbar_report.setRollover(true);

        jbtn_back.setText("Regresar");
        jbtn_back.setFocusable(false);
        jbtn_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_back.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbar_report.add(jbtn_back);

        jmen_report.setText("Opciones");

        jmitem_close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmitem_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img/minclose.png"))); // NOI18N
        jmitem_close.setText("Salir");
        jmen_report.add(jmitem_close);

        jmbar_report.add(jmen_report);

        setJMenuBar(jmbar_report);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnl_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jtbar_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jtbar_report, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnl_report, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(JFFReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFFReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFFReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFFReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFFReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtn_back;
    public javax.swing.JComboBox jcbox_category;
    public javax.swing.JLabel jlbl_category;
    public javax.swing.JMenuBar jmbar_report;
    public javax.swing.JMenu jmen_report;
    public javax.swing.JMenuItem jmitem_close;
    public javax.swing.JPanel jpnl_category;
    public javax.swing.JPanel jpnl_date;
    public javax.swing.JPanel jpnl_graphic1;
    public javax.swing.JPanel jpnl_report;
    public javax.swing.JTabbedPane jpnl_reportabcontent;
    public javax.swing.JToolBar jtbar_report;
    public javax.swing.JTable jtbl_tranbycat;
    // End of variables declaration//GEN-END:variables
}
