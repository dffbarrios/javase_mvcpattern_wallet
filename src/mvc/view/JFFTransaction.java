package mvc.view;

import java.net.URL;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego SNP3004EX
 */
public class JFFTransaction extends javax.swing.JFrame {

    /**
     * Creates new form JFFTransaction
     */
    public JFFTransaction() {
        initComponents();
        
        URL url = getClass().getResource("/resource/img/wallet.png");
        ImageIcon icon = new ImageIcon(url);
        
        setTitle("My Wallet");
        setIconImage(icon.getImage());
                 
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
       
        jbtn_send.setEnabled(false);
        jtf_destinyacc.setEnabled(false);
        jtf_destinyacc.setVisible(false);
        jlbl_destinyacc.setVisible(false);
        jtbl_transaction.getTableHeader().setReorderingAllowed(false);
    }
    
    public void lauchMessage(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void fillJTable(Object[][] arr){
        
        DefaultTableModel tableModel = (DefaultTableModel) jtbl_transaction.getModel();
        tableModel.setRowCount(0);
        
        for(Object[] row: arr ){
             tableModel.addRow(row);
        }            
    }
    
    public void fillJcomboBox(ArrayList<String> arr, JComboBox jcombobox){
        jcombobox.setModel(new DefaultComboBoxModel(arr.toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnl_transaction_catch = new javax.swing.JPanel();
        jlbl_type = new javax.swing.JLabel();
        jcbox_category = new javax.swing.JComboBox();
        jlbl_originacc = new javax.swing.JLabel();
        jlbl_destinyacc = new javax.swing.JLabel();
        jtf_originacc = new javax.swing.JTextField();
        jtf_destinyacc = new javax.swing.JTextField();
        jlbl_concept = new javax.swing.JLabel();
        jcbox_concept = new javax.swing.JComboBox();
        jlbl_amount = new javax.swing.JLabel();
        jbtn_send = new javax.swing.JButton();
        jspn_amount = new javax.swing.JSpinner();
        jpnl_transaction_show = new javax.swing.JPanel();
        jscp_transaction = new javax.swing.JScrollPane();
        jtbl_transaction = new javax.swing.JTable();
        jbtn_close = new javax.swing.JButton();
        jbtn_search = new javax.swing.JButton();
        jmbar_transaction = new javax.swing.JMenuBar();
        jmen_options = new javax.swing.JMenu();
        jmitem_close = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnl_transaction_catch.setBorder(javax.swing.BorderFactory.createTitledBorder("Transacciones"));

        jlbl_type.setText("Operación");

        jcbox_category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una operación..." }));

        jlbl_originacc.setText("Número de Cuenta");

        jlbl_destinyacc.setText("Cuenta Destino");

        jlbl_concept.setText("Concepto");

        jcbox_concept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una operación..." }));

        jlbl_amount.setText("Monto");

        jbtn_send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img/send.png"))); // NOI18N
        jbtn_send.setText("Enviar");

        jspn_amount.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), null, null, Double.valueOf(1.0d)));

        javax.swing.GroupLayout jpnl_transaction_catchLayout = new javax.swing.GroupLayout(jpnl_transaction_catch);
        jpnl_transaction_catch.setLayout(jpnl_transaction_catchLayout);
        jpnl_transaction_catchLayout.setHorizontalGroup(
            jpnl_transaction_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_transaction_catchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnl_transaction_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbox_category, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_concept)
                    .addComponent(jcbox_concept, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_type))
                .addGap(18, 18, 18)
                .addGroup(jpnl_transaction_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_originacc)
                    .addGroup(jpnl_transaction_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlbl_amount)
                        .addComponent(jtf_originacc)
                        .addComponent(jspn_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnl_transaction_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_destinyacc, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_destinyacc, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_send))
                .addContainerGap())
        );
        jpnl_transaction_catchLayout.setVerticalGroup(
            jpnl_transaction_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_transaction_catchLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jpnl_transaction_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_type)
                    .addComponent(jlbl_originacc)
                    .addComponent(jlbl_destinyacc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnl_transaction_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbox_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_originacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_destinyacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnl_transaction_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_concept)
                    .addComponent(jlbl_amount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnl_transaction_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnl_transaction_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbox_concept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jspn_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbl_transaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Cuenta", "Tipo", "Concepto", "Monto", "Fecha"
            }
        ));
        jscp_transaction.setViewportView(jtbl_transaction);

        jbtn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img/close.png"))); // NOI18N
        jbtn_close.setText("Salir");

        jbtn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img/search.png"))); // NOI18N
        jbtn_search.setText("Listar");

        javax.swing.GroupLayout jpnl_transaction_showLayout = new javax.swing.GroupLayout(jpnl_transaction_show);
        jpnl_transaction_show.setLayout(jpnl_transaction_showLayout);
        jpnl_transaction_showLayout.setHorizontalGroup(
            jpnl_transaction_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_transaction_showLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscp_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnl_transaction_showLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnl_transaction_showLayout.setVerticalGroup(
            jpnl_transaction_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl_transaction_showLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jscp_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addGroup(jpnl_transaction_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_close)
                    .addComponent(jbtn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(174, 174, 174))
        );

        jmen_options.setText("Opciones");

        jmitem_close.setText("Salir");
        jmen_options.add(jmitem_close);

        jmbar_transaction.add(jmen_options);

        setJMenuBar(jmbar_transaction);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnl_transaction_catch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnl_transaction_show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jpnl_transaction_catch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jpnl_transaction_show, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(JFFTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFFTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFFTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFFTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFFTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_close;
    public javax.swing.JButton jbtn_search;
    public javax.swing.JButton jbtn_send;
    public javax.swing.JComboBox jcbox_category;
    public javax.swing.JComboBox jcbox_concept;
    private javax.swing.JLabel jlbl_amount;
    private javax.swing.JLabel jlbl_concept;
    public javax.swing.JLabel jlbl_destinyacc;
    private javax.swing.JLabel jlbl_originacc;
    private javax.swing.JLabel jlbl_type;
    public javax.swing.JMenuBar jmbar_transaction;
    public javax.swing.JMenu jmen_options;
    public javax.swing.JMenuItem jmitem_close;
    public javax.swing.JPanel jpnl_transaction_catch;
    public javax.swing.JPanel jpnl_transaction_show;
    private javax.swing.JScrollPane jscp_transaction;
    public javax.swing.JSpinner jspn_amount;
    public javax.swing.JTable jtbl_transaction;
    public javax.swing.JTextField jtf_destinyacc;
    public javax.swing.JTextField jtf_originacc;
    // End of variables declaration//GEN-END:variables
}
