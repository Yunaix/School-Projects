import java.io.*;
import java.util.Scanner;
public class FileWriter2 {

	public static void main(String[] args) {
		
		try (PrintWriter file = new PrintWriter("/Users/eunic/OneDrive/Desktop/FileIO/src/disc5.txt")) { //file location and name
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name = input.next();
			System.out.println("Enter your age: ");
			int age = input.nextInt();
			file.print(name + "\n" + age); //prints name and age to file
			file.close();
		}
		
		catch(FileNotFoundException x) {
			x.fillInStackTrace();
		}

}
}