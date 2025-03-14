package FIM;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UniqueItem { 
	 public static ArrayList<ArrayList<?>> uniqueItems(ArrayList<String> data)  { 
        HashSet<Integer> uniqueItems = new HashSet<>(); 
        for (String line : data) {
            String[] items = line.split(","); 
            for (String item : items) {
                    uniqueItems.add(Integer.parseInt(item)); 
            }
        }
        ArrayList<Integer> sortedList = new ArrayList<>(uniqueItems); 
        Collections.sort(sortedList);
        ArrayList<String> strList = new ArrayList<>();
        for (Integer num : sortedList) {
            strList.add(num.toString());
        }
        ArrayList<ArrayList<?>> result = new ArrayList<>();
        result.add(strList);     
        result.add(sortedList);  

        return result;
    }
    
}
