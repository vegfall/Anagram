import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class AnagramUnitTest {
    AnagramChecker anagramChecker = new AnagramChecker();

    @Test
    public void ElementsAddedTest() {
        anagramChecker.fillMap(new ArrayList<>(Arrays.asList("Word1", "Word2", "OWrD2")));
        anagramChecker.fillMap(new ArrayList<>(Arrays.asList("2drow", "njigruirg", "word23", "word32")));

        //--Check if elements are added
        //Assertions.assertEquals(anagramChecker.anagramList.size(), 3);

        //--Check if elements are sorted
        //Assertions.assertEquals(anagramChecker.sortString("bach"), "abch");

        //--Check if string is anagram of list
        anagramChecker.isAnagram("word2");
        Assertions.assertFalse(anagramChecker.isAnagram("word3"));
    }
}