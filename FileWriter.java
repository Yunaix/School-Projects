import java.io.*;
public class FileWriter {

	public static void main(String[] args) 
	{
		try {
		PrintWriter file= new PrintWriter("/Users/eunic/OneDrive/Desktop/FileIO/src/disc4.txt"); //add filename after src slash.txt
		file.print("Welcome to IS 247 Discussion Session"); //located in the FileIO folder under src
		file.close();
	}
		catch(FileNotFoundException x){
			x.printStackTrace();
		}
			
		}

}
