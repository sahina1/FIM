package FIM;
import java.util.ArrayList; 
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String path = "DB/sampleDb.csv"; 
        ArrayList<String> data = Read.readFile(path); 
        ArrayList<?> unique = UniqueItem.uniqueItems(data);
        ArrayList<String> strList = (ArrayList<String>) unique.get(0);
        ArrayList<Integer> sortedList = (ArrayList<Integer>) unique.get(1);
        ArrayList<Integer> result = IC.ic(data);
        Map<String, ArrayList<String>> separatedData = FileSeperation.fileSeperation(result, data, strList);
        ArrayList<String> actual = separatedData.get("actual");
        ArrayList<String> updatedDiscard = separatedData.get("updatedDiscard");
        ArrayList<String> finalList = separatedData.get("finalList");
        Map<Integer, ArrayList<ArrayList<Integer>>> bitvector = BitVector.bitVector(sortedList, actual, updatedDiscard);        
        System.out.println("DB ELEMENTS:");
        for (String line : data) {
            System.out.println(line);
        }

        System.out.println("UNIQUE ELEMENTS:");
        for (String item : strList) { 
            System.out.print(item +" ");
        }
        System.out.println(); 

        System.out.println("Unique Element Row:");
        for (Integer row : result) {
            System.out.print(row + " ");
        }
        System.out.println(); 

        System.out.println("Total Unique Elements: " + Total.total(result));
        for (Integer key : sortedList) {
            System.out.println( key +" "+bitvector.get(key));
        }
}
}
