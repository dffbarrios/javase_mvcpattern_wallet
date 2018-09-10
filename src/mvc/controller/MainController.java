package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
        
        view.btn_concept.addActionListener(this);   
        view.mitem_close.addActionListener(this); 
         
        view.setResizable(false);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
      if( e.getSource() == view.btn_concept){
            new ConceptController();
            view.dispose();
            
      }else if(e.getSource() == view.mitem_close){
            view.dispose();
      }
    }
    
    
}