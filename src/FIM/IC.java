package FIM;
import java.util.ArrayList;
import java.util.HashSet;

public class IC {
    public static ArrayList<Integer> ic(ArrayList<String> data) {
        ArrayList<Integer> ic = new ArrayList<>();

        for (String line : data) {
            String[] items = line.split(",");
            HashSet<String> uniqueItems = new HashSet<>();
            for (String item : items) {
                uniqueItems.add(item); 
            }

            ic.add(uniqueItems.size()); 
        }

        return ic;
    }
    
}
