package mvc.view;

import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego SNP3004EX
 */
public class JFFConcept extends javax.swing.JFrame {

    /**
     * Creates new form JFFConcept
     */
    public JFFConcept() {
        initComponents();
        
        URL url = getClass().getResource("/resource/img/wallet.png");
        ImageIcon icon = new ImageIcon(url);
        
        setTitle("My Wallet");
        setIconImage(icon.getImage());
                 
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
       
        btn_save.setEnabled(false);
        jtbl_concept.getTableHeader().setReorderingAllowed(false);
    }
    
    public void lauchMessage(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void fillJTable(Object[][] arr){
        
        DefaultTableModel tableModel = (DefaultTableModel) jtbl_concept.getModel();
        tableModel.setRowCount(0);
        
        for(Object[] row: arr ){
             tableModel.addRow(row);
        }            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_concept_catch = new javax.swing.JPanel();
        lbl_desc = new javax.swing.JLabel();
        jtf_desc = new javax.swing.JTextField();
        lbl_details = new javax.swing.JLabel();
        jscp_details = new javax.swing.JScrollPane();
        jtxt_details = new javax.swing.JTextArea();
        btn_save = new javax.swing.JButton();
        pnl_concept_show = new javax.swing.JPanel();
        jscp_concept = new javax.swing.JScrollPane();
        jtbl_concept = new javax.swing.JTable();
        jbtn_get = new javax.swing.JButton();
        jbtn_close = new javax.swing.JButton();
        jtbar_options = new javax.swing.JToolBar();
        jbtn_backacc = new javax.swing.JButton();
        jbtn_backtra = new javax.swing.JButton();
        mbar_concept = new javax.swing.JMenuBar();
        jmen_option = new javax.swing.JMenu();
        jmitem_close = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_concept_catch.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles del concepto"));
        pnl_concept_catch.setToolTipText("");

        lbl_desc.setText("Descripción");

        lbl_details.setText("Detalles");

        jtxt_details.setColumns(20);
        jtxt_details.setRows(5);
        jscp_details.setViewportView(jtxt_details);

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img/save.png"))); // NOI18N

        javax.swing.GroupLayout pnl_concept_catchLayout = new javax.swing.GroupLayout(pnl_concept_catch);
        pnl_concept_catch.setLayout(pnl_concept_catchLayout);
        pnl_concept_catchLayout.setHorizontalGroup(
            pnl_concept_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_concept_catchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_concept_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_concept_catchLayout.createSequentialGroup()
                        .addGroup(pnl_concept_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_desc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jscp_details, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(pnl_concept_catchLayout.createSequentialGroup()
                        .addGroup(pnl_concept_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_desc)
                            .addComponent(lbl_details))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_concept_catchLayout.setVerticalGroup(
            pnl_concept_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_concept_catchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_desc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_details)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_concept_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscp_details, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnl_concept_show.setBorder(javax.swing.BorderFactory.createTitledBorder("Conceptos"));

        jtbl_concept.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción", "Detalles"
            }
        ));
        jscp_concept.setViewportView(jtbl_concept);

        jbtn_get.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img/search.png"))); // NOI18N
        jbtn_get.setText("Listar");

        jbtn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img/close.png"))); // NOI18N
        jbtn_close.setText("Salir");

        javax.swing.GroupLayout pnl_concept_showLayout = new javax.swing.GroupLayout(pnl_concept_show);
        pnl_concept_show.setLayout(pnl_concept_showLayout);
        pnl_concept_showLayout.setHorizontalGroup(
            pnl_concept_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_concept_showLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_concept_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscp_concept, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnl_concept_showLayout.createSequentialGroup()
                        .addComponent(jbtn_get)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(jbtn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_concept_showLayout.setVerticalGroup(
            pnl_concept_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_concept_showLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscp_concept, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_concept_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_get, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jtbar_options.setRollover(true);

        jbtn_backacc.setText("Cuentas");
        jbtn_backacc.setFocusable(false);
        jbtn_backacc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_backacc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbar_options.add(jbtn_backacc);

        jbtn_backtra.setText("Transacciones");
        jbtn_backtra.setFocusable(false);
        jbtn_backtra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_backtra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbar_options.add(jbtn_backtra);

        jmen_option.setText("Opciones");

        jmitem_close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmitem_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img/minclose.png"))); // NOI18N
        jmitem_close.setText("Salir");
        jmen_option.add(jmitem_close);

        mbar_concept.add(jmen_option);

        setJMenuBar(mbar_concept);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_concept_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_concept_catch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jtbar_options, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtbar_options, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(pnl_concept_catch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_concept_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(JFFConcept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFFConcept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFFConcept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFFConcept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFFConcept().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_save;
    public javax.swing.JButton jbtn_backacc;
    public javax.swing.JButton jbtn_backtra;
    public javax.swing.JButton jbtn_close;
    public javax.swing.JButton jbtn_get;
    public javax.swing.JMenu jmen_option;
    public javax.swing.JMenuItem jmitem_close;
    private javax.swing.JScrollPane jscp_concept;
    private javax.swing.JScrollPane jscp_details;
    public javax.swing.JToolBar jtbar_options;
    public javax.swing.JTable jtbl_concept;
    public javax.swing.JTextField jtf_desc;
    public javax.swing.JTextArea jtxt_details;
    private javax.swing.JLabel lbl_desc;
    private javax.swing.JLabel lbl_details;
    public javax.swing.JMenuBar mbar_concept;
    private javax.swing.JPanel pnl_concept_catch;
    public javax.swing.JPanel pnl_concept_show;
    // End of variables declaration//GEN-END:variables
}
