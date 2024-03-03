package occurences;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Occurences {
    public static void main(String[] args) {
        // adjust your readable file path
        String fileName = "C:\\Users\\user\\Desktop\\Java OOP\\grinder\\occurences\\words.txt";
        Map<String, Integer> wordCountMap = new HashMap<>();

        // read file in chunks using buffer
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // if the file has content inside
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // split by whitespaces

                // loop through words and add them to the map
                for (String word : words) {
                    word = word.toLowerCase();
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // get each entry (single key value pair in a map) and print them out
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
