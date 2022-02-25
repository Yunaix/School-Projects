import java.util.*;
import java.io.*;
public class FileReader {

	public static void main(String[] args) {
		Scanner input=null;
		File file = new File("/Users/eunic/OneDrive/Desktop/FileIO/src/disc5.txt");
		try {
			input = new Scanner (file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String name = input.nextLine();
		System.out.println("Name: " + name);
		
		int age = input.nextInt();
		System.out.println("Age: " + age);
		
		input.close();
		
		/*while(input.hasNext())
		
		String x = input.nextLine();
		System.out.println(x);
		input.close(); */

	}

}
