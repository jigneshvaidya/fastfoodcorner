package fastfoodcorner;

import java.awt.*;
import java.text.*;
import java.util.Date;
import javax.swing.*;

public class BillPrint{
    
    public static void main(String args[]) {
        
        BillPrint bill = new BillPrint();
        bill.initPrint();
        
    }
    
    public BillPrint() {
        
        initComponents();
        
    }

    private void initComponents() {

        frame = new JFrame("PAY YOUR BILL");
        title = new JLabel("FAST FOOD CORNER",JLabel.CENTER);
        head = new JLabel("BILLING RECEIPT",JLabel.CENTER);
        lDate = new JLabel("",JLabel.RIGHT);
        lDate.setText("DATE : "+dateFormat.format(date));
        lOrder = new JLabel();
        line1 = new JLabel("=============================");
        line2 = new JLabel("=============================");
        orderCost = new JLabel();
        tax = new JLabel();
        totalCost = new JLabel();
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 =  new JPanel();
        vegMeal = new JLabel();
        eggMeal = new JLabel();
        nonVegMeal = new JLabel();
        vegBurger = new JLabel();
        eggBurger = new JLabel();
        nonVegBurger = new JLabel();
        coke = new JLabel();
        frenchFries = new JLabel();

        //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new java.awt.Dimension(280,380));
        frame.setLayout(new FlowLayout());
        frame.add(jPanel3);
        frame.add(jPanel1);
        frame.setVisible(true);
        
    }
    
    public void initPrint() {
        
        lOrder.setText("YOU ORDERED");
        orderCost.setText("ORDER_COST_____:___"+iSum);
        tax.setText("TAX_____________:___"+iTax);
        totalCost.setText("TOTAL_COST_____:___"+iTot);
        
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        jPanel3.setLayout(layout);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        jPanel3.add(title,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        jPanel3.add(head,gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        jPanel3.add(lDate,gbc);

        frame.add(jPanel2);
        
        jPanel2.setLayout(new GridLayout(14,1));
        jPanel2.add(lOrder);
        jPanel2.add(line1);
        if(noOfVegMeal!=0){
            jPanel2.add(vegMeal);
            vegMeal.setText(noOfVegMeal+" Veg_meal______:___"+(200*noOfVegMeal));
            vegMeal.setVisible(true);
        }if(noOfEggMeal!=0){
            jPanel2.add(eggMeal);
            eggMeal.setText(noOfEggMeal+" Egg_meal______:___"+(220*noOfEggMeal));
            eggMeal.setVisible(true);
        }if(noOfNonVegMeal!=0){
            jPanel2.add(nonVegMeal);
            nonVegMeal.setText(noOfNonVegMeal+" Chicken_meal___:___"+(250*noOfNonVegMeal));
            nonVegMeal.setVisible(true);
        }if(noOfVegBurger!=0){
            jPanel2.add(vegBurger);
            vegBurger.setText(noOfVegBurger+" Veg_burger_____:___"+(150*noOfVegBurger));
            vegBurger.setVisible(true);
        }if(noOfEggBurger!=0){
            jPanel2.add(eggBurger);
            eggBurger.setText(noOfEggBurger+" Egg_burger_____:___"+(170*noOfEggBurger));
            eggBurger.setVisible(true);
        }if(noOfNonVegBurger!=0){
            jPanel2.add(nonVegBurger);
            nonVegBurger.setText(noOfNonVegBurger+" Non-Veg_burger_:___"+(200*noOfNonVegBurger));
            nonVegBurger.setVisible(true);
        }if(noOfCoke!=0){
            jPanel2.add(coke);
            coke.setText(noOfCoke+" Coke__________:___"+(20*noOfCoke));
            coke.setVisible(true);
        }if(noOfFrenchFries!=0){
            jPanel2.add(frenchFries);
            frenchFries.setText(noOfFrenchFries+" Franch_Frie_____:___"+(30*noOfFrenchFries));
            frenchFries.setVisible(true);
        }
        iTax=(iSum*12.36f)/100.0f;
        iTot=iSum+iTax;
        jPanel2.add(line2);
        orderCost.setText("ORDER_COST____:___"+iSum+"/- ");
        tax.setText("TAX_____________:___"+iTax+"/- ");
        totalCost.setText("TOTAL_COST_____:___"+iTot+"/- ");
        jPanel2.add(orderCost);
        jPanel2.add(tax);
        jPanel2.add(totalCost);

    }

    public static int getPrint(int noVegMeal,int noNonVegMeal,int noEggMeal,int noVegBurger,int noNonVegBurger,int noEggBurger,int noCoke,int noFrenchFries,int cost){
        noOfVegMeal=noVegMeal;
        noOfNonVegMeal=noNonVegMeal;
        noOfEggMeal=noEggMeal;
        noOfVegBurger=noVegBurger;
        noOfNonVegBurger=noNonVegBurger;
        noOfEggBurger=noEggBurger;
        noOfCoke=noCoke;
        noOfFrenchFries=noFrenchFries;
        iSum = cost;
        return(0);
    }
    
    private static JLabel vegMeal;
    private static JLabel eggMeal;
    private static JLabel nonVegMeal;
    private static JLabel vegBurger;
    private static JLabel eggBurger;
    private static JLabel nonVegBurger;
    private static JLabel coke;
    private static JLabel frenchFries;
    private JLabel line1;
    private JLabel line2;
    private JLabel orderCost;
    private JLabel tax;
    private JLabel totalCost;
    private JFrame frame;
    private JLabel head;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JLabel lDate;
    private JLabel lOrder;
    private JLabel title;
    DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    static int noOfVegMeal=0;
    static int noOfNonVegMeal=0;
    static int noOfEggMeal=0;
    static int noOfVegBurger=0;
    static int noOfNonVegBurger=0;
    static int noOfEggBurger=0;
    static int noOfCoke=0;
    static int noOfFrenchFries=0;
    static float iTot=0;
    static float iTax=0;
    static int iSum=0;

}