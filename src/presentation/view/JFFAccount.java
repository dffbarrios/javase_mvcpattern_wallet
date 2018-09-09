/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentation.view;

/**
 *
 * @author Diego SNP3004EX
 */
public class JFFAccount extends javax.swing.JFrame {

    /**
     * Creates new form JFFAccount
     */
    public JFFAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnl_account_catch = new javax.swing.JPanel();
        jlbl_number = new javax.swing.JLabel();
        jtf_number = new javax.swing.JTextField();
        jlbl_owner = new javax.swing.JLabel();
        jtf_owner = new javax.swing.JTextField();
        jlbl_balance = new javax.swing.JLabel();
        jspn_balance = new javax.swing.JSpinner();
        jlbl_type = new javax.swing.JLabel();
        jcbox_type = new javax.swing.JComboBox();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jpnl_account_show = new javax.swing.JPanel();
        jscp_account = new javax.swing.JScrollPane();
        jtbl_account = new javax.swing.JTable();
        jmbar_account = new javax.swing.JMenuBar();
        jmen_options = new javax.swing.JMenu();
        jmitem_account = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnl_account_catch.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta"));

        jlbl_number.setText("Número");

        jlbl_owner.setText("Titular");

        jlbl_balance.setText("Balance");

        jlbl_type.setText("Tipo de Cuenta");

        jcbox_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opción" }));

        btn_add.setText("Agregar");

        btn_delete.setText("Eliminar");

        javax.swing.GroupLayout jpnl_account_catchLayout = new javax.swing.GroupLayout(jpnl_account_catch);
        jpnl_account_catch.setLayout(jpnl_account_catchLayout);
        jpnl_account_catchLayout.setHorizontalGroup(
            jpnl_account_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_account_catchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnl_account_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnl_account_catchLayout.createSequentialGroup()
                        .addComponent(jlbl_type)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpnl_account_catchLayout.createSequentialGroup()
                        .addGroup(jpnl_account_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnl_account_catchLayout.createSequentialGroup()
                                .addGroup(jpnl_account_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtf_number, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jcbox_type, 0, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jpnl_account_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtf_owner)
                                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                            .addGroup(jpnl_account_catchLayout.createSequentialGroup()
                                .addComponent(jlbl_number)
                                .addGap(101, 101, 101)
                                .addComponent(jlbl_owner)))
                        .addGap(18, 18, 18)
                        .addGroup(jpnl_account_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnl_account_catchLayout.createSequentialGroup()
                                .addComponent(jlbl_balance)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jspn_balance)
                            .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jpnl_account_catchLayout.setVerticalGroup(
            jpnl_account_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_account_catchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnl_account_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_number)
                    .addComponent(jlbl_owner)
                    .addComponent(jlbl_balance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnl_account_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_owner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jspn_balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlbl_type)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnl_account_catchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbox_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add)
                    .addComponent(btn_delete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbl_account.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Titular", "Tipo", "Saldo", "Fecha de Creación"
            }
        ));
        jscp_account.setViewportView(jtbl_account);

        javax.swing.GroupLayout jpnl_account_showLayout = new javax.swing.GroupLayout(jpnl_account_show);
        jpnl_account_show.setLayout(jpnl_account_showLayout);
        jpnl_account_showLayout.setHorizontalGroup(
            jpnl_account_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_account_showLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscp_account, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnl_account_showLayout.setVerticalGroup(
            jpnl_account_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_account_showLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscp_account, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jmen_options.setText("Opciones");

        jmitem_account.setText("Salir");
        jmen_options.add(jmitem_account);

        jmbar_account.add(jmen_options);

        setJMenuBar(jmbar_account);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnl_account_catch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnl_account_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jpnl_account_catch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnl_account_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(JFFAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFFAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFFAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFFAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFFAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JComboBox jcbox_type;
    private javax.swing.JLabel jlbl_balance;
    private javax.swing.JLabel jlbl_number;
    private javax.swing.JLabel jlbl_owner;
    private javax.swing.JLabel jlbl_type;
    private javax.swing.JMenuBar jmbar_account;
    private javax.swing.JMenu jmen_options;
    private javax.swing.JMenuItem jmitem_account;
    private javax.swing.JPanel jpnl_account_catch;
    private javax.swing.JPanel jpnl_account_show;
    private javax.swing.JScrollPane jscp_account;
    private javax.swing.JSpinner jspn_balance;
    private javax.swing.JTable jtbl_account;
    private javax.swing.JTextField jtf_number;
    private javax.swing.JTextField jtf_owner;
    // End of variables declaration//GEN-END:variables
}