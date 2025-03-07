package FIM;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String path = "DB/sampleDb.csv"; 
        ArrayList<String> data = Read.readFile(path); 
        ArrayList<Integer> sortedList = UniqueItem.uniqueItems();

        
        for (String line : data) {
            System.out.println(line);
        }

        
        for (Integer item :sortedList ) { 
            System.out.println(item);
        }
    }
}
