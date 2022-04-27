import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        boolean bool;
        HashMap<Character, Boolean> oneHM = new HashMap<Character, Boolean>();
        HashMap<Character, Boolean> twoHM = new HashMap<Character, Boolean>();
        if (oneS.length() == twoS.length()) {
            for (char c : oneS.toCharArray()) {
                oneHM.put(c, true);
            }
            for (char c : twoS.toCharArray()) {
                twoHM.put(c, true);
            }
            bool = true;
        }
        else {
            bool = false;
        }
        return bool;
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
