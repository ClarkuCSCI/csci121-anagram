import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnagramTests {

    @Test
    void testAnagrams() {
        Assertions.assertTrue(Anagram.anagram("rat", "tar"));
        Assertions.assertTrue(Anagram.anagram("rat", "art"));
        Assertions.assertTrue(Anagram.anagram("creative", "reactive"));
    }

    @Test
    void testNonAnagrams() {
        Assertions.assertFalse(Anagram.anagram("alphabet", "cat"));
        Assertions.assertFalse(Anagram.anagram("coin", "buzz"));
        Assertions.assertFalse(Anagram.anagram("banana", "ban"));
    }


}
