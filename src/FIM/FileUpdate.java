package FIM;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class FileUpdate {
    public static void writeToFile(String fileName, List<String> finalList) { 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false))) { 
            for (String line : finalList) {
                writer.write(line);
                writer.newLine(); 
            }
            System.out.println("updated file created ");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
