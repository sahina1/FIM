package FIM;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UniqueItem { // Fixed class name
    public static ArrayList<Integer> uniqueItems() { 
        String path = "DB/sampleDb.csv"; 
        ArrayList<String> data = Read.readFile(path); 
        HashSet<Integer> uniqueItems = new HashSet<>(); 

        for (String line : data) {
            String[] items = line.split(","); 
            for (String item : items) {
                    uniqueItems.add(Integer.parseInt(item)); 
            }
        }

        ArrayList<Integer> sortedList = new ArrayList<>(uniqueItems); 
        Collections.sort(sortedList);

        return sortedList;
    }
}
