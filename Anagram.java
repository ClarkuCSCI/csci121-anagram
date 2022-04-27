import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        HashMap<Character, Integer> oneHM = new HashMap<Character, Integer>();
        HashMap<Character, Integer> twoHM = new HashMap<Character, Integer>();
        //HashMap<Character, Boolean> oneHM = new HashMap<Character, Boolean>();
        //HashMap<Character, Boolean> twoHM = new HashMap<Character, Boolean>();
        for (char c : oneS.toCharArray()) {
            if (oneHM.containsKey(c))
                oneHM.put(c, oneHM.get(c) + 1);
            else
                oneHM.put(c, 1);
            //oneHM.put(c, true);
        }
        for (char c : twoS.toCharArray()) {
            // check if c is in the hashmap
            //twoHM.put(c, true);
            if (twoHM.containsKey(c))
                twoHM.put(c, twoHM.get(c) + 1);
            else
                twoHM.put(c, 1);
        }
        return oneHM.equals(twoHM);
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
