package fastfoodcorner;

public class Kitchen {
    static String item1,item2,item3;
    static Packaging p1;
    public static void getSingleOrder(String order){
        
        item1=order;
        p1=new Packaging();
        if(order.equalsIgnoreCase("Burger")){
            Packaging.wrap(item1);
        }else if(order.equalsIgnoreCase("Coke")){
            Packaging.getBottle(item1);
        }else if(order.equalsIgnoreCase("Franch Fries")){
            Packaging.paperBag(item1);
        }
        p1.getOrder();
    }
    
    public static void getHalfMeal(String order1,String order2){
        
        item1=order1;
        item2=order2;
        p1=new Packaging();
        if(order1.equalsIgnoreCase("Burger")){
            Packaging.wrap(item1);
        }else if(order1.equalsIgnoreCase("Coke")){
            Packaging.getBottle(item1);
        }else if(order1.equalsIgnoreCase("Franch Fries")){
            Packaging.paperBag(item1);
        }if(order2.equalsIgnoreCase("Burger")){
            Packaging.wrap(item2);
        }else if(order2.equalsIgnoreCase("Coke")){
            Packaging.getBottle(item2);
        }else if(order2.equalsIgnoreCase("Franch Fries")){
            Packaging.paperBag(item2);
        }
        p1.getOrder();
    }
    
    public static void getFullMeal(String order1,String order2,String order3){
        
        item1=order1;
        item2=order2;
        item3=order3;
        p1=new Packaging();
        if(order1.equalsIgnoreCase("Burger")){
            Packaging.wrap(item1);
        }else if(order1.equalsIgnoreCase("Coke")){
            Packaging.getBottle(item1);
        }else if(order1.equalsIgnoreCase("Franch Fries")){
            Packaging.paperBag(item1);
        }if(order2.equalsIgnoreCase("Burger")){
            Packaging.wrap(item2);
        }else if(order2.equalsIgnoreCase("Coke")){
            Packaging.getBottle(item2);
        }else if(order2.equalsIgnoreCase("Franch Fries")){
            Packaging.paperBag(item2);
        }if(order3.equalsIgnoreCase("Burger")){
            Packaging.wrap(item3);
        }else if(order3.equalsIgnoreCase("Coke")){
            Packaging.getBottle(item3);
        }else if(order3.equalsIgnoreCase("Franch Fries")){
            Packaging.paperBag(item3);
        }
        p1.getOrder();
        
    }
}