package fastfoodcorner;

import java.awt.event.*;
import javax.swing.*;

public class FastFoodCorner extends javax.swing.JFrame {
    public FastFoodCorner() {
        initComponents();
    }

    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        lMenu = new JLabel();
        rbVeg = new JRadioButton();
        rbEgg = new JRadioButton();
        rbChicken = new JRadioButton();
        bOrder = new JButton();
        jPanel2 = new JPanel();
        cbBurger = new JCheckBox();
        cbCoke = new JCheckBox();
        cbFries = new JCheckBox();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jPanel3 = new JPanel();
        lOrderCost = new JLabel();
        lOrder = new JLabel();
        print = new JButton();
        newOrder = new JButton();
        noOfVegMeal=0;
        noOfNonVegMeal=0;
        noOfEggMeal=0;
        noOfVegBurger=0;
        noOfNonVegBurger=0;
        noOfEggBurger=0;
        noOfCoke=0;
        noOfFrenchFries=0;

        addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent we) {
                        System.exit(0);
                    }
                });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        lMenu.setText("Menu");
        buttonGroup1.add(rbVeg);
        rbVeg.setText("Veg burger");
        rbVeg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                rbVegActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEgg);
        rbEgg.setText("Egg burger");
        rbEgg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                rbEggActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbChicken);
        rbChicken.setText("Chicken burger");
        rbChicken.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                rbChickenActionPerformed(evt);
            }
        });

        bOrder.setText("Place Order");
        bOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                bOrderActionPerformed(evt);
            }
        });
        
        print.setText("PRINT BILL");
        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        
        newOrder.setText("New Order");
        newOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                newOrderActionPerformed(evt);
            }
        });
        
        //<editor-fold defaultstate="Collapesed" desc="jPanel1Layout">
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMenu)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbVeg)
                            .addComponent(rbEgg)
                            .addComponent(rbChicken)))
                    .addComponent(bOrder))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbVeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbEgg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbChicken)
                .addGap(18, 18, 18)
                .addComponent(bOrder))
                
        );
        //</editor-fold>

        cbBurger.setText("Burger");
        cbBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBurgerActionPerformed(evt);
            }
        });

        cbCoke.setText("Coke");
        cbCoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCokeActionPerformed(evt);
            }
        });

        cbFries.setText("Franch Fries");
        cbFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFriesActionPerformed(evt);
            }
        });
        jLabel1.setText(":  Rs. 150/-");
        jLabel2.setText(":  Rs. 20/-");
        jLabel3.setText(":  Rs. 30/-");
        //<editor-fold defaultstate="Collapesed" desc="jPanel2Layout">
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbBurger)
                    .addComponent(cbCoke)
                    .addComponent(cbFries))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBurger)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCoke)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFries)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lOrderCost.setText(" Order cost           :     Rs "+prize+"/- ");
        lOrder.setText("Order                     :    "+order);
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lOrderCost)
                    .addComponent(lOrder)
                    .addComponent(print)
                    .addComponent(newOrder))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lOrder)
                .addGap(18, 18, 18)
                .addComponent(lOrderCost)
                .addGap(18, 18, 18)
                .addComponent(print)
                .addGap(18,18,18)
                .addComponent(newOrder)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }
    //</editor-fold>

    private void rbVegActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jLabel1.setText(":  Rs. 150/-");
        cbBurger.setSelected(true);
    }                                     

    private void rbEggActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jLabel1.setText(":  Rs. 170/-");
        cbBurger.setSelected(true);
    }                                     

    private void rbChickenActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jLabel1.setText(":  Rs. 200/-");
        cbBurger.setSelected(true);
    }                                         

    private void cbCokeActionPerformed(java.awt.event.ActionEvent evt) {   
        
    }                                      

    private void cbBurgerActionPerformed(java.awt.event.ActionEvent evt) {
        if(!rbVeg.isSelected()&&!rbEgg.isSelected()&&!rbChicken.isSelected()){
            rbVeg.setSelected(true);
        }
    }
    
    private void cbFriesActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void bOrderActionPerformed(java.awt.event.ActionEvent evt) {                                       
        boolean flag=false;
        if(cbBurger.isSelected()&&cbCoke.isSelected()&&cbFries.isSelected()){
            Kitchen.getFullMeal(cbBurger.getText(),cbCoke.getText(),cbFries.getText());
            if(!flag)
                flag=true;
            if(rbVeg.isSelected()){
                prize+=200;
                noOfVegMeal++;
            }if(rbEgg.isSelected()){
                noOfEggMeal++;
                prize+=220;
            }if(rbChicken.isSelected()){
                noOfNonVegMeal++;
                prize+=250;
            }if(!rbVeg.isSelected()&&!rbEgg.isSelected()&&!rbChicken.isSelected()){
                noOfVegMeal++;
                prize+=250;
            }
        }else if(cbBurger.isSelected()&&cbCoke.isSelected()){
            Kitchen.getHalfMeal(cbBurger.getText(),cbCoke.getText());
            if(!flag)
                flag=true;
            noOfCoke++;
            if(rbVeg.isSelected()){
                prize+=170;
                noOfVegBurger++;
            }if(rbEgg.isSelected()){
                prize+=190;
                noOfEggBurger++;
            }if(rbChicken.isSelected()){
                prize+=200;
                noOfNonVegBurger++;
            }if(!rbVeg.isSelected()&&!rbEgg.isSelected()&&!rbChicken.isSelected()){
                prize+=170;
                noOfVegBurger++;
            }
        }else if(cbCoke.isSelected()&&cbFries.isSelected()){
            prize+=50;
            Kitchen.getHalfMeal(cbCoke.getText(),cbFries.getText());
            if(!flag)
                flag=true;
            noOfCoke++;
            noOfFrenchFries++;
        }else if(cbBurger.isSelected()&&cbFries.isSelected()){
            Kitchen.getHalfMeal(cbBurger.getText(),cbFries.getText());
            if(!flag)
                flag=true;
            noOfFrenchFries++;
            if(rbVeg.isSelected()){
                prize+=180;
                noOfVegBurger++;
            }if(rbEgg.isSelected()){
                prize+=200;
                noOfEggBurger++;
            }if(rbChicken.isSelected()){
                noOfNonVegBurger++;
            }if(!rbVeg.isSelected()&&!rbEgg.isSelected()&&!rbChicken.isSelected()){
                prize+=230;
                noOfVegBurger++;
            }
        }else if(cbBurger.isSelected()){
            
            Kitchen.getSingleOrder(cbBurger.getText());
            if(!flag)
                flag=true;
            if(rbVeg.isSelected()){
                prize+=150;
                noOfVegBurger++;
            }if(rbEgg.isSelected()){
                prize+=170;
                noOfEggBurger++;
            }if(rbChicken.isSelected()){
                prize+=200;
                noOfNonVegBurger++;
            }if(!rbVeg.isSelected()&&!rbEgg.isSelected()&&!rbChicken.isSelected()){
                prize+=150;
                noOfVegBurger++;
            }
        }else if(cbCoke.isSelected()){
            prize+=20;
            Kitchen.getSingleOrder(cbCoke.getText());
            if(!flag)
                flag=true;
            noOfCoke++;
        }else if(cbFries.isSelected()){
            prize+=30;
            Kitchen.getSingleOrder(cbFries.getText());
            if(!flag)
                flag=true;
            noOfFrenchFries++;
        }if(flag)
            order++;
        lOrder.setText(" Order                     :    "+order);
        lOrderCost.setText(" Order cost           :     Rs "+prize+"/- ");
    }
    private void printActionPerformed(java.awt.event.ActionEvent evt) {
        if(order!=0){
            BillPrint b = new BillPrint();
            b.getPrint(noOfVegMeal,noOfNonVegMeal,noOfEggMeal,noOfVegBurger,noOfNonVegBurger,noOfEggBurger,noOfCoke,noOfFrenchFries,prize);
            b.initPrint();
        }
    }
    private void newOrderActionPerformed(java.awt.event.ActionEvent evt) {
        order=0;
        noOfVegMeal=0;
        noOfNonVegMeal=0;
        noOfEggMeal=0;
        noOfVegBurger=0;
        noOfNonVegBurger=0;
        noOfEggBurger=0;
        noOfCoke=0;
        noOfFrenchFries=0;
        prize=0;
        cbBurger.setSelected(false);
        cbCoke.setSelected(false);
        cbFries.setSelected(false);
        rbChicken.setSelected(false);
        rbEgg.setSelected(false);
        rbVeg.setSelected(true);
        lOrder.setText(" Order                     :    "+order);
        lOrderCost.setText(" Order cost           :     Rs "+prize+"/- ");
    }
                                    
    public static void main(String args[]) {
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //<editor-fold defaultstate="Collapesed" desc="LookAndFeelInfo">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastFoodCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastFoodCorner().setVisible(true);
            }
        });
    }

    private JLabel lMenu;
    private ButtonGroup buttonGroup1;
    private JRadioButton rbChicken;
    private JRadioButton rbEgg;
    private JRadioButton rbVeg;
    private JCheckBox cbBurger;
    private JCheckBox cbCoke;
    private JCheckBox cbFries;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JLabel lOrder;
    private JLabel lOrderCost;
    private JButton bOrder;
    private JButton print;
    private JButton newOrder;
    public int prize=0;
    public int order=0;
    public int noOfVegBurger;
    public int noOfNonVegBurger;
    public int noOfEggBurger;
    public int noOfCoke;
    public int noOfFrenchFries;
    public int noOfVegMeal;
    public int noOfNonVegMeal;
    public int noOfEggMeal;
}