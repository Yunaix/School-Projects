//Create a subclass that extends the superclass Groceries
public class BakedGoods extends Groceries
{

  // Unique characteristics for baked goods
  String name;
  String flavor;
  String type;
  String size;
  int floor;

//Default constructor
    BakedGoods ()
  {
  }

//Overloaded constructor
  BakedGoods (String ID, int count, int supplyLev, double price,
	      String mytype, int myfloor, String myname, String mysize,
	      String myflavor)
  {
    //Calling super class's constructor 
    super (ID, count, supplyLev, price);	// only takes the supply class variables
    this.type = mytype;
    this.floor = myfloor;
    this.name = myname;
    this.size = mysize;
    this.flavor = myflavor;
  }

// Overrides toString
  public String toString ()
  {
    return "The type of baked good is " + this.type + ", it is located on " +
      this.floor + "-floor. The name name of the item is " + this.name +
      " and the size of the item is " + this.size + "." +
      "The flavor of the item is " + this.flavor;
  }
}

