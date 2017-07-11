import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new FileReader("./in"));
        final BufferedWriter bw = new BufferedWriter(new FileWriter("./out"))) {
      Map<String, Integer> wordsRepeated = new HashMap<>();
      String sentence;
      while ((sentence = br.readLine()) != null) {
        String[] words = sentence.split(" ");
        for (String word : words) {
          wordsRepeated.put(word,
              wordsRepeated.get(word) == null ? 1 : wordsRepeated.get(word) + 1);
        }
      }
      Set<Entry<String, Integer>> entries = wordsRepeated.entrySet();
      entries.stream().filter(x -> x.getValue() > 1).forEach(x -> {
        try {
          bw.write("Word: " + x.getKey() + " | Appeared: " + x.getValue() + " times\n");
        } catch (IOException ex) {
          System.err.println(ex.getMessage());
        }
      });
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
