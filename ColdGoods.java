//Create a subclass that extends the superclass Groceries
import java.util.*;
public class ColdGoods extends Groceries
{

  // Unique characteristics for cold goods
  String name;
  String type;
  int floor;

// Default constructor
    ColdGoods ()
  {
  }

//Overloaded constructor
  ColdGoods (String ID, int count, int supplyLev, double price, String mytype,
	     int myfloor, String myname)
  {
	  //Calls super's constructor 
    super (ID, count, supplyLev, price);
    this.type = mytype;
    this.floor = myfloor;
    this.name = myname;
  }
//Overrides toString
  public String toString ()
  {
    return "The name of the item is " + this.name + ", it is a type of " +
      this.type + ", it is located on the " + this.floor + "-floor ";
  }

}