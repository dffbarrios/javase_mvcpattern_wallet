package mvc.controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import mvc.model.dal.implement.CategoryDal;
import mvc.model.dal.implement.TransactionDal;
import mvc.model.dal.pojo.TblCategory;
import mvc.model.dal.pojo.TblTransaction;
import mvc.view.JFFReports;

/**
 *
 * @author Diego SNP3004EX
 */
public class ReportController implements ActionListener, ItemListener{

    JFFReports view;    
    public ReportController(){
        initView();
    }    
    
    public void initView(){
        
       view = new JFFReports();               
       view.jcbox_category.addItemListener(this);       
       view.jbtn_back.addActionListener(this);    
       view.btn_GraphbyCat.addActionListener(this);    
       view.jmitem_close.addActionListener(this);
       
       view.fillJcomboBox(this.fillCategory());
   }
    
    public ArrayList<String> fillCategory(){
       try{
           
           List<TblCategory> category ;
           ArrayList<String> categoryDesc = new ArrayList<String>();
           categoryDesc.add("Seleccione una opción...");
           
           CategoryDal categoryDal = new CategoryDal();
           category = categoryDal.get();           
           
           for(TblCategory cat: category ){
               categoryDesc.add(cat.getCatName());
           }
           
           return categoryDesc;
           
       }catch(Exception ex){
           view.lauchMessage(ex.toString());
           return new ArrayList<String>();
       }
    } 
    
    public Object[][] get(String parameter){
        try{
            TransactionDal transactionDal = new TransactionDal();
            List<TblTransaction> transactions = transactionDal.get();

            Object[][] model = new Object[transactions.size()][6];
            
            int s = 0;
            int l = transactions.size();
            for(int k = 0; k < l; k++){
               if(transactions.get(k).getTblCategory().getCatName().equals(parameter)){
                    s++;
               }                
            }
           
            int n = 0; int i=0;
            Object[][] viewModel = new Object[s][6];
            while(n < l){                
               
                if(transactions.get(n).getTblCategory().getCatName().equals(parameter)){
                    viewModel[i][0] =  transactions.get(i).getTraNumber();
                    viewModel[i][1] = transactions.get(i).getTblAccount().getAccNumber();
                    viewModel[i][2] = transactions.get(i).getTblCategory().getCatName();
                    viewModel[i][3] = transactions.get(i).getTblConcept().getConName();
                    viewModel[i][4] = transactions.get(i).getTraBalance().toString() + " COP";
                    viewModel[i][5] = transactions.get(i).getTraDate().toString();
                    
                    i++;
                }                
                n++;
            }            
            return viewModel;
        }catch(Exception ex){
            view.lauchMessage(ex.toString());
            return null;
        }
    }    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.jbtn_back){           
           view.dispose();
           new TransactionController();
           
        }else if(e.getSource() == view.jmitem_close){
           view.dispose();
           new MainController();
       
        }else if(e.getSource() == view.btn_GraphbyCat){          
           drawGraphicIncomesVsExpenses();
       }    
    }
    
    public void drawGraphicIncomesVsExpenses(){
        
        JFrame frame = new JFrame("Grafica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        URL url = getClass().getResource("/resource/img/wallet.png");
        ImageIcon icon = new ImageIcon(url);
        frame.setIconImage(icon.getImage());
        
        frame.setSize(420, 250);
        frame.setVisible(true);
        
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
       
        TransactionDal transactionDal = new TransactionDal();
        List<TblTransaction> transactions = transactionDal.get();
        int nI = 0; int nG = 0; int nT = 0;
        double aI = 0; double aG = 0; double aT = 0;
        for(TblTransaction t: transactions){
            if(t.getTblCategory().getCatId() == 1){ 
                nI++; aI += t.getTraBalance();
            }
            else if(t.getTblCategory().getCatId() == 2){
                nG++; aG += t.getTraBalance();
            }       
        }
        
        IncomesVsExpenses graph = new IncomesVsExpenses(nI, nG, aI, aG);
        frame.add(graph);   
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
       view.fillJTable(this.get(view.jcbox_category.getSelectedItem().toString()));
    }   
}

class IncomesVsExpenses extends JPanel {

    private int nI;
    private int nG;

    private double aI;
    private double aG;

    
    public IncomesVsExpenses (int nI,int nG, double aI, double aG){
        this.setnI(nI);
        setnG(nG);
        setaI(aI);
        setaG(aG);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int x = 10;
        int y = 50;
        
        int[] transactions = new int[2];        
        transactions[0]= getnI() * 5;
        transactions[1]= getnG() * 5;
        
        String[] label = new String[6];
        label[0]= "Ingresos f(I)  Ttx: " + getnI() +  " R: " + getaI() + "COP";
        label[1]= "Gastos   f(G)  Ttx: " + getnG() +  " R: " + getaG() + "COP";
        
        g.drawString("Graficando Ingresos vs Gastos (Barra)", 100, 30);
        
        for (int j = 0; j < transactions.length; j++) {
            
            if(j == 0)
                g.setColor(Color.blue);
            else
                g.setColor(Color.red);
            
            g.drawRect(20, y, transactions[j], 50);
            g.drawString(label[j] + ": " + transactions[j], 150, y + 30);
            y = y + 70;
        }
    }

    /**
     * @return the nI
     */
    public int getnI() {
        return nI;
    }

    /**
     * @param nI the nI to set
     */
    public void setnI(int nI) {
        this.nI = nI;
    }

    /**
     * @return the nG
     */
    public int getnG() {
        return nG;
    }

    /**
     * @param nG the nG to set
     */
    public void setnG(int nG) {
        this.nG = nG;
    }

    /**
     * @return the aI
     */
    public double getaI() {
        return aI;
    }

    /**
     * @param aI the aI to set
     */
    public void setaI(double aI) {
        this.aI = aI;
    }

    /**
     * @return the aG
     */
    public double getaG() {
        return aG;
    }

    /**
     * @param aG the aG to set
     */
    public void setaG(double aG) {
        this.aG = aG;
    }
}
