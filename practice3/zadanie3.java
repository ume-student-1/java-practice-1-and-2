import java.util.*;

public class zadanie3 {

    public static List<String> getMostFrequentWords(String text, int n) {
        String[] words = text.toLowerCase().split("\\s+");

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        List<String> result = new ArrayList<>(frequency.keySet());

        result.sort((a, b) ->
                frequency.get(b) - frequency.get(a)
        );

        if (n < result.size()) {
            return new ArrayList<>(result.subList(0, n));
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "java is great java is powerful " +
                      "python is great too but java is java";

        int N = 3;

        System.out.println(getMostFrequentWords(text, N));
    }
}