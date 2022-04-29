import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        HashMap<Character, Integer> oneHM = new HashMap<Character, Integer>();
        HashMap<Character, Integer> twoHM = new HashMap<Character, Integer>();
        // go through each character in the first string
        for (char c : oneS.toCharArray()) {
            // if character is present in oneHM add to the count
            if (oneHM.containsKey(c))
                oneHM.put(c, oneHM.get(c) + 1);
                //  if character not present in oneHM start count at 1
            else
                oneHM.put(c, 1);
        }
        // go through each character in the second string
        for (char c : twoS.toCharArray()) {
            // if character is present in twoHM add one to the hash map value
            if (twoHM.containsKey(c))
                twoHM.put(c, oneHM.get(c) + 1);
                //  if character not yet present in twoHM create key and set value as one
            else
                twoHM.put(c, 1);
        }
        // see is hash maps are equal and return true/false
        return oneHM.equals(twoHM);
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
