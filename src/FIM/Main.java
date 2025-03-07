package FIM;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String path = "DB/sampleDb.csv"; 
        ArrayList<String> data = Read.readFile(path); 
        ArrayList<String> strList = UniqueItem.uniqueItems(data);
        System.out.println("DB ELEMENTS:");
        for (String line : data) {
            System.out.println(line);
        }
        System.out.println("UNIQUE ELEMENTS:");
        for (String item : strList) { 
            System.out.print(item + " ");
        }
        
    }
}
