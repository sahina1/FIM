package FIM;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BitVector {
    public static Map<Integer, ArrayList<ArrayList<Integer>>> bitVector(ArrayList<Integer> sortedList, ArrayList<String> actual, ArrayList<String> updatedDiscard) {
        
        Map<Integer, ArrayList<ArrayList<Integer>>> dict = new HashMap<>();

        for (Integer key : sortedList) {
            ArrayList<Integer> bit1 = new ArrayList<>();
            ArrayList<Integer> bit2 = new ArrayList<>();
            ArrayList<ArrayList<Integer>> bitVectors = new ArrayList<>();
            for (String val : actual) {
                String[] items = val.split(",");
                ArrayList<Integer> results = new ArrayList<>();
                for (String item : items) {
                    results.add(Integer.parseInt(item));
                }
                bit1.add(results.contains(key) ? 1 : 0);
            }            for (String val : updatedDiscard) {
                String[] items = val.split(",");
                ArrayList<Integer> updatedDiscards = new ArrayList<>();
                for (String item : items) {
                    updatedDiscards.add(Integer.parseInt(item));
                }
                bit2.add(updatedDiscards.contains(key) ? 0 : 1);
            }
            bitVectors.add(new ArrayList<>(bit1));
            bitVectors.add(new ArrayList<>(bit2));
            dict.put(key, bitVectors);
            
    }
        return dict;
}
}
