//Create a test class that tests the code
import java.util.*;

public class TestGroceries
{
  // Main Class
  public static void main (String[]args)
  {

    // Create Array to hold the inventory
    Groceries[]ListofInventory = new Groceries[10];
    ArrayList < Groceries > myInventory = new ArrayList < Groceries > ();

    // Create inventory objects
   // Groceries item1 = new Groceries ("A", 10, 2, 1.50);
    //Groceries item2 = new Groceries ("B", 10, 2, 2.10);
    
    BakedGoods cake =
      new BakedGoods ("A1", 10, 2, 1.50, "Desert ", 1, " Birthday Cake ",
		      " Slice", "Cookies and Cream ");
    ColdGoods milk =
      new ColdGoods ("B1", 10, 2, 2.10, " Milk ", 2, " Almond Milk ");
    ColdGoods yogurt =
      new ColdGoods ("B2", 10, 2, 2.10, " Yogurt ", 2, " Gogurt ");
   
    ListofInventory[0]= new Groceries("A1", 10, 2, 1.50);
    ListofInventory[1] = new Groceries("B1", 10, 2, 2.10);
    ListofInventory[2] = new Groceries("B2", 10, 2, 2.10);
   
    //Print items
      myInventory.add (cake);
    
    // myInventory.add (milk);
    // myInventory.add (yogurt);
     System.out.println (myInventory);
     System.out.println(ListofInventory[0]);
     System.out.println(ListofInventory[1]);
      
      

  }
}
