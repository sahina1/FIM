package FIM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileSeperation {
    public static Map<String, ArrayList<String>> fileSeperation(ArrayList<Integer> ic, ArrayList<String> data, ArrayList<String> strList) {
        ArrayList<String> actual = new ArrayList<>();
        ArrayList<String> discard = new ArrayList<>();
        ArrayList<String> finalList = new ArrayList<>();
        int halfMax = ic.size() / 2;
        for (int i = 0; i < ic.size(); i++) {
            if (ic.get(i) > halfMax) {
                discard.add(data.get(i)); 
            } else {
                actual.add(data.get(i)); 
            }
        }
        ArrayList<String> updatedDiscard = new ArrayList<>();
        for (String dt : discard) {
            List<String> items = new ArrayList<>(Arrays.asList(dt.split(",")));
            List<String> copyStrList = new ArrayList<>(strList); 
            copyStrList.removeAll(items); 
            updatedDiscard.add(String.join(",", copyStrList));
        }
        int j = 0;
        for (int i = 0; i < ic.size(); i++) {
            if (ic.get(i) > halfMax) {
                if (j < updatedDiscard.size()) {
                    finalList.add(updatedDiscard.get(j));
                    j++;
                }
            } else {
                finalList.add(data.get(i));
            }
        }
        FileUpdate.writeToFile("DB/updated_file.csv", finalList);
        Map<String, ArrayList<String>> seperation = new HashMap<>();
        seperation.put("actual", actual);
        seperation.put("updatedDiscard", updatedDiscard);
        seperation.put("finalList", finalList);
        return seperation;
    }
}
