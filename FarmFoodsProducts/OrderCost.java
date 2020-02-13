package FarmFoodsProducts;

class OrderVariables {

   double cost;
   double product;
   double amount;
  
  }

class OrderCost extends OrderVariables {
   public static void main(String args[]) {

    OrderVariables beef = new OrderVariables();
    OrderVariables chicken = new OrderVariables();
    OrderVariables fish = new OrderVariables();
    OrderVariables pork = new OrderVariables();

    OrderVariables milk = new OrderVariables();
    OrderVariables cheese = new OrderVariables();
    OrderVariables yogurt = new OrderVariables();
   
    OrderVariables carrots = new OrderVariables();
    OrderVariables lettuce = new OrderVariables();
    OrderVariables asparagus = new OrderVariables();
   
    OrderVariables apples = new OrderVariables();
    OrderVariables oranges = new OrderVariables();
    OrderVariables grapes = new OrderVariables();

    beef.product = 1377.0;
    chicken.product = 78.71;
    fish.product = 870.0;
    pork.product = 299.9;
    
    milk.product = 50.0;
    cheese.product = 6.2;
    yogurt.product = 0.0;

    carrots.product = 0.0;
    lettuce.product = 36.8;
    asparagus.product = 55.0;
   
    apples.product = 14.8;
    oranges.product = 30.0;
    grapes.product = 0.0;

    beef.amount = 3.4;
    chicken.amount = 1.28;
    fish.amount = 11.99;
    pork.amount = 3.75;

    milk.amount = 3.27;
    cheese.amount = 4.94;
    yogurt.amount = 1.05;
  
    carrots.amount = 0.69;
    lettuce.amount = 2.77;
    asparagus.amount = 2.0;

    apples.amount = 1.32;
    oranges.amount = 1.33;
    grapes.amount = 2.09;

    beef.cost =  beef.product * beef.amount;
    chicken.cost = chicken.product *  chicken.amount;
    fish.cost = fish.product * fish.amount;
    pork.cost = pork.product * pork.amount;
    
    milk.cost = milk.product *  milk.amount;
    cheese.cost = cheese.product * cheese.amount;
    yogurt.cost = yogurt.product * yogurt.amount;

    carrots.cost = carrots.product * carrots.amount;
    lettuce.cost = lettuce.product * lettuce.amount;
    asparagus.cost = asparagus.product * asparagus.amount;
   
    apples.cost = apples.product * apples.amount;
    oranges.cost =  oranges.product *  oranges.amount;
    grapes.cost = grapes.product * grapes.amount;


        System.out.println("                          MEAT                         ");
        System.out.println("---------------------------------------------------------");
        System.out.println("The cost of the new order of beef is: " + beef.cost);
        System.out.println("The cost of the new order of chicken is: " + chicken.cost);
        System.out.println("The cost of the new order of fish is: " + fish.cost);
        System.out.println("The cost of the new order of pork is: " + pork.cost);
        System.out.println();
        System.out.println("                          DAIRY               ");
        System.out.println("---------------------------------------------------------");
        System.out.println("The cost of the new order of milk is: " + milk.cost);
        System.out.println("The cost of the new order of cheese is: " + cheese.cost);
        System.out.println("The cost of the new order of yogurt is: " + yogurt.cost);
        System.out.println();
        System.out.println("                        VEGETABLES              ");
        System.out.println("---------------------------------------------------------");
        System.out.println("The cost of the new order of carrots is: " + carrots.cost);
        System.out.println("The cost of the new order of lettuce is: " + lettuce.cost);
        System.out.println("The cost of the new order of asparagus: " + asparagus.cost);
        System.out.println();
        System.out.println("                          FRUIT                 ");
        System.out.println("---------------------------------------------------------");
        System.out.println("The cost of the new order of apples is: " + apples.cost);
        System.out.println("The cost of the new order of oranges is: " + oranges.cost);
        System.out.println("The cost of the new order of grapes is: " + grapes.cost);
        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println("Total Cost: " +"$"+(beef.cost + chicken.cost + fish.cost + pork.cost + milk.cost + cheese.cost + yogurt.cost + carrots.cost + lettuce.cost + asparagus.cost + apples.cost + oranges.cost + grapes.cost));

        }
      }
    
  
  
