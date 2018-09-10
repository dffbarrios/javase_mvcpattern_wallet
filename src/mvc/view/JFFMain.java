package mvc.view;

import mvc.controller.MainController;

/**
 *
 * @author Diego SNP3004EX
 */
public class JFFMain extends javax.swing.JFrame {

    /**
     * Creates new form JFFMain
     */
    public JFFMain() {
        initComponents();
    }
    
    //MainController mainController = new MainController();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_main = new javax.swing.JPanel();
        jbtn_account = new javax.swing.JButton();
        btn_concept = new javax.swing.JButton();
        btn_transaction = new javax.swing.JButton();
        jlbl_concept = new javax.swing.JLabel();
        jlbl_account = new javax.swing.JLabel();
        jlbl_transaction = new javax.swing.JLabel();
        mbar_main = new javax.swing.JMenuBar();
        men_option = new javax.swing.JMenu();
        mitem_close = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_main.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione una operación"));
        pnl_main.setForeground(new java.awt.Color(255, 255, 255));

        jbtn_account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img/account.png"))); // NOI18N
        jbtn_account.setMaximumSize(new java.awt.Dimension(75, 25));
        jbtn_account.setMinimumSize(new java.awt.Dimension(75, 25));
        jbtn_account.setPreferredSize(new java.awt.Dimension(75, 25));

        btn_concept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img/moneybox.png"))); // NOI18N
        btn_concept.setMaximumSize(new java.awt.Dimension(75, 25));
        btn_concept.setMinimumSize(new java.awt.Dimension(75, 25));
        btn_concept.setPreferredSize(new java.awt.Dimension(75, 25));

        btn_transaction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img/transaction.png"))); // NOI18N
        btn_transaction.setMaximumSize(new java.awt.Dimension(75, 25));
        btn_transaction.setMinimumSize(new java.awt.Dimension(75, 25));
        btn_transaction.setPreferredSize(new java.awt.Dimension(75, 25));
        btn_transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transactionActionPerformed(evt);
            }
        });

        jlbl_concept.setText("Conceptos");

        jlbl_account.setText("Cuentas");

        jlbl_transaction.setText("Transacciones");

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(jlbl_concept)
                        .addGap(48, 48, 48)
                        .addComponent(jlbl_account)
                        .addGap(24, 24, 24))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(btn_concept, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_account, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jlbl_transaction))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_concept, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jbtn_account, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(btn_transaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_concept)
                    .addComponent(jlbl_account)
                    .addComponent(jlbl_transaction))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        men_option.setText("Opciones");

        mitem_close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK | java.awt.event.InputEvent.META_MASK));
        mitem_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img/minclose.png"))); // NOI18N
        mitem_close.setText("Salir");
        men_option.add(mitem_close);
        mitem_close.getAccessibleContext().setAccessibleDescription("");

        mbar_main.add(men_option);
        men_option.getAccessibleContext().setAccessibleDescription("");

        setJMenuBar(mbar_main);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transactionActionPerformed
        
    }//GEN-LAST:event_btn_transactionActionPerformed

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
            java.util.logging.Logger.getLogger(JFFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFFMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_concept;
    private javax.swing.JButton btn_transaction;
    public javax.swing.JButton jbtn_account;
    private javax.swing.JLabel jlbl_account;
    private javax.swing.JLabel jlbl_concept;
    private javax.swing.JLabel jlbl_transaction;
    public javax.swing.JMenuBar mbar_main;
    public javax.swing.JMenu men_option;
    public javax.swing.JMenuItem mitem_close;
    public javax.swing.JPanel pnl_main;
    // End of variables declaration//GEN-END:variables
}
