import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class Testing {
    AnagramChecker anagramChecker = new AnagramChecker();

    @Test
    public void ElementsAddedTest() {
        anagramChecker.fillMap(new ArrayList<>(Arrays.asList("Word1", "Word2", "OWrD2")));
        anagramChecker.fillMap(new ArrayList<>(Arrays.asList("2drow", "njigruirg")));

        //--Check if elements are added
        //Assertions.assertEquals(anagramChecker.anagramList.size(), 3);

        //--Check if elements are sorted
        //Assertions.assertEquals(anagramChecker.sortString("bach"), "abch");

        //--Check if string is anagram of list
        anagramChecker.isAnagram("word2");
    }
}