package JavaSem2.week9;

import java.util.HashMap;
import java.util.Map;


public class WordCounter {

    public static void main(String[] args) {
        WordCounter counter = new WordCounter();
        counter.countWords();
    }

    public void countWords() {
    String kalimat = "saya belajar Java dan saya suka Java karena Java sangat menyenangkan";

    String[] words = kalimat.split(" ");

    Map<String, Integer> wordCount = new HashMap<>();

    for (int i = 0; i < words.length; i++) {
        if (wordCount.containsKey(words[i])) {
            wordCount.put(words[i], wordCount.get(words[i]) + 1);
        } else {
            wordCount.put(words[i], 1);
        }
    }

    for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        System.out.println("'" + entry.getKey() + "': Muncul " + entry.getValue() + " kali");
    }
    }
}

