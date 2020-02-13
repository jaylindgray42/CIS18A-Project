package FarmFoodsProducts;

class ProductData {

 double weight; // The max weight of a product(s) that FarmFoods needs to have.
 
 double price; // The price per unit weight of a certain item.
  }
  
class Orders extends ProductData {
  public static void main(String args[]) 
   throws java.io.IOException {
 
  ProductData Beef = new ProductData();
  ProductData Chicken = new ProductData();
  ProductData Fish = new ProductData();
  ProductData Pork = new ProductData();

  ProductData Milk = new ProductData();
  ProductData Cheese = new ProductData();
  ProductData Yogurt = new ProductData();

  ProductData Carrots = new ProductData();
  ProductData Lettuce = new ProductData();
  ProductData Asparagus = new ProductData();
  
  ProductData Apples = new ProductData();
  ProductData Oranges = new ProductData();
  ProductData Grapes = new ProductData();

  Beef.weight = 2500.0;
  Chicken.weight = 1000.0;
  Fish.weight = 1100.0;
  Pork.weight = 1500.0;

  Milk.weight = 250.0;
  Cheese.weight = 100.0;
  Yogurt.weight = 30.0;
  
  Carrots.weight = 100.0;
  Lettuce.weight = 100.0;
  Asparagus.weight = 100.0;

  Apples.weight = 50.0;
  Oranges.weight = 50.0;
  Grapes.weight = 50.0;

  Beef.price = 3.4;
  Chicken.price = 1.28;
  Fish.price = 11.99;
  Pork.price = 3.75;

  Milk.price = 3.27;
  Cheese.price = 4.94;
  Yogurt.price = 1.05;
  
  Carrots.price = 0.69;
  Lettuce.price = 2.77;
  Asparagus.price = 2.00;

  Apples.price = 1.32;
  Oranges.price = 1.33;
  Grapes.price = 2.09;

  
  double meatstock[] = {1123.0, 921.3, 230.0, 1200.1}; // each element represents the amount of a certain product in stock (the weight of the amount). 
  double dairystock[] = {200.0, 93.8, 30.0};
  double veggiestock[] = {100.0, 63.2, 45.0};
  double fruitstock[] = {35.2, 20.0, 50.0};

  System.out.println("Welcome to FarmFoods! The best farm-to-shelf store in town!");
  System.out.println();
  System.out.println("The categories of products in FarmFoods stock are as follows: \nM = Meats\tB = beef\tC = chicken\tf = fish\tP = pork\nD = Dairy\tm = milk\tc = cheese\tY = yogurt\nV = Vegetables\t( = carrots\tL = lettuce\tA = asparagus\nF = Fruits\ta = apples\tO = oranges\tG = grapes\nTo go to a category, press the key associated with that category then press Enter. ");
  System.out.println("Also, to select a sub-category of a category, enter the character that represents that sub-category next to the main category's character.");

  char ch, pathway, pathway2, pathway3, pathway4; //These represent 4 product categories.

  pathway = 'M'; // Meat
  pathway2 = 'D'; // Dairy
  pathway3 = 'V'; // Vegetables
  pathway4 = 'F'; // Fruit

  ch = (char) System.in.read(); 
   
  switch(ch) {
    case 'M':
      char ch2, beef, chicken, fish, pork;

      beef = 'B';
      chicken = 'C';
      fish = 'f';
      pork = 'P';

      System.out.println("You've selected the meat category.");
      ch2 = (char) System.in.read(); 

      if(ch2 == beef & meatstock[0] <= Beef.weight) 
        System.out.println("Order " + (Beef.weight - meatstock[0]) + " more beef!");
      else if(ch2 == chicken & meatstock[1] <= Chicken.weight) 
        System.out.println("Order " + (Chicken.weight - meatstock[1]) + " more chicken!");
      else if(ch2 == fish & meatstock[2] <= Fish.weight)
        System.out.println("Order " + (Fish.weight - meatstock[2]) + " more fish!");
      else if(ch2 == pork & meatstock[3] <= Pork.weight)
        System.out.println("Order " + (Pork.weight - meatstock[3]) + " more pork!");
      break;

     case 'D':
       char ch3, milk, cheese, yogurt;

       milk = 'm';
       cheese = 'c';
       yogurt = 'Y';
       
       System.out.println("You've selected the Dairy category.");
       ch3 = (char) System.in.read();

       if(ch3 == milk & dairystock[0] <= Milk.weight)
         System.out.println("Order " + (Milk.weight - dairystock[0]) + " more milk!");
       else if(ch3 == cheese & dairystock[1] <= Cheese.weight)
         System.out.println("Order " + (Cheese.weight - dairystock[1]) + " more cheese!");
       else if(ch3 == yogurt & dairystock[2] <= Yogurt.weight)
         System.out.println("Order " +(Yogurt.weight - dairystock[2]) + " more yogurt!");
       break;
   
      case 'V':
        char ch4, carrots, lettuce, asparagus;
        
        carrots = '(';
        lettuce = 'L';
        asparagus = 'A';

        System.out.println("You've selected the Vegetable category.");
        ch4 = (char) System.in.read();

        if(ch4 == carrots & veggiestock[0] <= Carrots.weight)
          System.out.println("Order " + (Carrots.weight - veggiestock[0]) + " more carrots!");
        else if(ch4 == lettuce & veggiestock[1] <= Lettuce.weight)
          System.out.println("Order " + (Lettuce.weight - veggiestock[1]) + " more lettuce!");
        else if(ch4 == asparagus & veggiestock[2] <= Asparagus.weight)
          System.out.println("Order " + (Asparagus.weight - veggiestock[2]) + " more asparagus!");
        break;

       case 'F':
        char ch5, apples, oranges, grapes;
        
        apples = 'a';
        oranges = 'O';
        grapes = 'G';

        System.out.println("You've selected the Fruit category.");
        ch5 = (char) System.in.read();

        if(ch5 == apples & fruitstock[0] <= Apples.weight)
          System.out.println("Order " + (Apples.weight - fruitstock[0]) + " more apples!");
        else if(ch5 == oranges & fruitstock[1] <= Oranges.weight)
          System.out.println("Order " + (Oranges.weight - fruitstock[1]) + " more oranges!");
        else if(ch5 == grapes & fruitstock[2] <= Grapes.weight)
          System.out.println("Order " + (Grapes.weight - fruitstock[2]) + " more grapes!");
         break;
 

       default:
         System.out.println("Not a recognized category!");

     }
   }
 }
