import java.util.*;

public class zadanie2 {
    public static List<List<String>> annagrams(List<String> words) {
        Map<String, List<String>> map = new LinkedHashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        List<String> input = List.of(
                "listen", "silent", "enlist",
                "hello", "world",
                "cat", "act", "tac"
        );

        List<List<String>> result = annagrams(input);

        System.out.println(result);
    }
}