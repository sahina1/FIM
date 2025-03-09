package FIM;
import java.util.ArrayList;

public class FileSeperation {
    public static void fileSeperation(ArrayList<Integer> ic, ArrayList<String> data, ArrayList<String> strList) {
        ArrayList<String> actual = new ArrayList<>();
        ArrayList<String> discard = new ArrayList<>();
        int halfMax = ic.size() / 2;

        for(int i = 0; i < ic.size(); i++) {
            if (ic.get(i) > halfMax) {
                discard.add(data.get(i));
            } else {
                actual.add(data.get(i));
            }
        }

        System.out.println("Discarded Elements:");
        for (String i : discard) {
            System.out.println(i + " ");
        }

        System.out.println("Actual Elements:");
        for (String j : actual) {
            System.out.println(j + " ");
        }
    }
}
