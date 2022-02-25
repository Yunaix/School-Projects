import java.util.ArrayList;
import java.io.*;

public class FileIO {

	public static void main(String[] args) {
		
		
		try {
			PrintWriter file= new PrintWriter("/Users/eunic/OneDrive/Desktop/Inventory/src/BakedGoods.txt");
			Groceries[] BakedGoods = new Groceries[1];
			Groceries[] ColdGoods = new Groceries[2];
			ArrayList < Groceries > myInventory = new ArrayList < Groceries > ();
			
			BakedGoods cake =
				      new BakedGoods ("A1", 10, 2, 1.50, "Desert ", 1, " Birthday Cake ",
						      " Slice", "Cookies and Cream ");
			ColdGoods milk =
				      new ColdGoods ("B1", 10, 2, 2.10, " Milk ", 2, " Almond Milk ");
			
			BakedGoods[0]= new Groceries("A1", 10, 2, 1.50);
			ColdGoods[0]= new Groceries("B1", 10, 2, 2.10);
			file.print(cake);
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
