import java.util.*;

//Create a superclass with attributes for inventory
class Groceries
{
  public String ID;
  public int count;
  public int supplyLev;
  public double price;

// Creates a default constructor for businessInventory
    Groceries ()
  {
  }

// Creates an overloaded constructor 
  Groceries (String myID, int mycount, int mysupplyLev, double myprice)
  {
    this.ID = myID;
    this.count = mycount;
    this.supplyLev = mysupplyLev;
    this.price = myprice;

  }

// Overrides toString
  public String toString ()
  {
    return "The ID for this item is " + this.ID + ", there are a total of " +
      this.count + " items in the total invetory." + " There must be " +
      this.supplyLev +
      " of this item available in inventory and the price of the item is $" +
      this.price;
  }
}

