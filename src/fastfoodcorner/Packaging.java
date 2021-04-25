package fastfoodcorner;

import javax.swing.*;

class Packaging extends JFrame{

    private static JLabel urOrder;
    private static JLabel orderImg;
    private static ImageIcon burgerOnly;
    private static ImageIcon friesOnly;
    private static ImageIcon cokeOnly;
    private static ImageIcon burgerAndFries;
    private static ImageIcon friesAndCoke;
    private static ImageIcon cokeBurger;
    private static ImageIcon friesCokeAndBurger;
    static boolean flag1=false;    
    static boolean flag2=false;
    static boolean flag3=false;
    public static void main(String args[]){
        Packaging pack = new Packaging();
        pack.completeOrder();
    }
    
    Packaging(){
        initPacking();
    }
    
    private void initPacking() {
        setSize(400,500);
        urOrder = new JLabel("Your order sir ");
        orderImg = new JLabel("");
        burgerOnly = new ImageIcon("D:\\FastFoodCorner\\src\\fastfoodcorner\\onlyBurger.jpg");
        friesOnly = new ImageIcon("D:\\FastFoodCorner\\src\\fastfoodcorner\\onlyFries.jpg");
        cokeOnly = new ImageIcon("D:\\FastFoodCorner\\src\\fastfoodcorner\\onlyCoke.jpg");
        burgerAndFries = new ImageIcon("D:\\FastFoodCorner\\src\\fastfoodcorner\\friesBurger.jpg");
        friesAndCoke = new ImageIcon("D:\\FastFoodCorner\\src\\fastfoodcorner\\cokeFries.jpg");
        cokeBurger = new ImageIcon("D:\\FastFoodCorner\\src\\fastfoodcorner\\burgerCoke.jpg");
        friesCokeAndBurger = new ImageIcon("D:\\FastFoodCorner\\src\\fastfoodcorner\\fulMeal.jpg");
        orderImg.setBounds(10,20,400,400);
        urOrder.setBounds(150,10,100,10);
        orderImg.setVisible(false);
        add(urOrder);
        add(orderImg);
        setVisible(true);
    }
    
    private void completeOrder() {
        setVisible(true);
    }
    
    static void wrap(String item) {
        flag1=true;
    }

    static void getBottle(String item) {
        flag2=true;
    }

    static void paperBag(String item) {
        flag3=true;
    }

    void getOrder() {
       
        if(flag1&&!flag2&&!flag3){
            orderImg.setIcon(burgerOnly);
            orderImg.setVisible(true);
        }
        if(!flag1&&flag2&&!flag3){
            orderImg.setIcon(cokeOnly);
            orderImg.setVisible(true);
        }
        if(!flag1&&!flag2&&flag3){
            orderImg.setIcon(friesOnly);
            orderImg.setVisible(true);
        }
        if(flag1&&flag2&&!flag3){
            orderImg.setIcon(cokeBurger);
            orderImg.setVisible(true);
        }
        if(!flag1&&flag2&&flag3){
            orderImg.setIcon(friesAndCoke);
            orderImg.setVisible(true);
        }
        if(flag1&&!flag2&&flag3){
            orderImg.setIcon(burgerAndFries);
            orderImg.setVisible(true);
        }
        if(flag1&&flag2&&flag3){
            orderImg.setIcon(friesCokeAndBurger);
            orderImg.setVisible(true);
        }
        flag1=false;
        flag2=false;
        flag3=false;
    }
    
}