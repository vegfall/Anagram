import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramChecker {
    public HashMap<String, String> anagramList = new HashMap<>();

    public boolean isAnagram(String word) {
        ArrayList<String> anagramWords = new ArrayList<>();
        String wordSorted = sortString(word);

        for (HashMap.Entry<String, String> listItems : anagramList.entrySet()) {
            if (wordSorted.equals(listItems.getValue())) {
                anagramWords.add(listItems.getKey());
            }
        }

        if (anagramWords.size() > 0) {
            System.out.print(word + " is an anagram of: ");
            for (String anagrams : anagramWords)
                System.out.print(anagrams + " | ");
            return true;
        } else {
            System.out.println(word + " does not have an anagram in list.");
            return false;
        }
    }

    public void fillMap(ArrayList<String> originalList) {
        for (String word : originalList) {
            anagramList.put(word, sortString(word));
        }
    }

    private String sortString(String word) {
        char wordCharacters[] = word.toLowerCase().toCharArray();

        Arrays.sort(wordCharacters);

        return String.valueOf(wordCharacters);
    }
}
