package mvc.controller;

import java.net.URL;
import javax.swing.ImageIcon;
import mvc.view.JFFConcept;

/**
 *
 * @author Diego SNP3004EX
 */
public class ConceptController {
   
    JFFConcept view = new JFFConcept();
    
   public ConceptController(){
       initView();
   } 
   
   public void initView(){
        
       URL url = getClass().getResource("/resource/img/wallet.png");
       ImageIcon icon = new ImageIcon(url);
        
       view.setTitle("My Wallet");
       view.setIconImage(icon.getImage());
                 
       view.setResizable(false);
       view.setVisible(true);
   }
   
}
