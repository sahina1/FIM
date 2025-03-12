package FIM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileSeperation {
    public static void fileSeperation(ArrayList<Integer> ic, ArrayList<String> data, ArrayList<String> strList) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> discard = new ArrayList<>();
        ArrayList<String> finalList = new ArrayList<>();
        int halfMax = ic.size() / 2;
        for (int i = 0; i < ic.size(); i++) {
            if (ic.get(i) > halfMax) {
                discard.add(data.get(i)); 
            } else {
                result.add(data.get(i)); 
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
        System.out.println("Updated List:");
        for (String line : finalList) {
            System.out.println(line);
        }
    }
}
