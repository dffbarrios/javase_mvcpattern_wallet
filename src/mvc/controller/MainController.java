package mvc.controller;

import java.net.URL;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.view.JFFMain;

/**
 *
 * @author Diego SNP3004EX
 */
public class MainController implements ActionListener {
    
    private JFFMain view;
    
    public MainController(){
        view = new JFFMain();
        initView();    
    }
    
    public void initView(){
        URL url = getClass().getResource("/resource/img/wallet.png");
        ImageIcon icon = new ImageIcon(url);
        
        view.setTitle("My Wallet");
        view.setIconImage(icon.getImage());
        
        view.jbtn_concept.addActionListener(this);   
        view.jbtn_account.addActionListener(this);   
        view.jbtn_transaction.addActionListener(this);
        view.mitem_close.addActionListener(this); 
         
        view.setResizable(false);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
      if( e.getSource() == view.jbtn_concept){
            new ConceptController();
            view.dispose();
      
      }else if(e.getSource() == view.jbtn_account){
           new AccountController();
           view.dispose();
            
      }else if(e.getSource() == view.jbtn_transaction){
           new TransactionController();
           view.dispose();
            
      }else if(e.getSource() == view.mitem_close){
            view.dispose();
      }
    }
    
    
}