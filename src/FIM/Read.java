package FIM;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;


public class Read {
	public static ArrayList<String> readFile(String path)
	{
		ArrayList<String> a=new ArrayList<String>();
		File file=new File(path);
		 try (Scanner sc = new Scanner(file)) {
			while(sc.hasNextLine())
			{
				a.add(sc.nextLine());
				
			}
		}
		catch(FileNotFoundException e) {
			 System.out.println("File not found error");
			 e.printStackTrace();
	         
			 
		}
		return a;
	} 
}
