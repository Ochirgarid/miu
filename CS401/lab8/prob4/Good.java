package prob4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Good {
    public static void main(String[] args) {
        Good good = new Good();

        List<String> words = Arrays.asList("Brin", "Nate", "Neal", "Raju", "Sara", "Nora", "Scott");

        System.out.println(good.countWords(words, 'r', 'o', 4));
    }

    public int countWords(List<String> words, char c, char d, int len) {
        return words.stream()
                .filter(word -> word.length() == len && word.indexOf(c) != -1 && word.indexOf(d) == -1)
                .collect(Collectors.toList()).size();
    }
}
