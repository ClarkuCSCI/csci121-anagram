import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        HashMap<Character, Integer> oneHM = new HashMap<Character, Integer>();
        HashMap<Character, Integer> twoHM = new HashMap<Character, Integer>();
        for (char c : oneS.toCharArray()) {
            if (oneHM.get(c) == null) oneHM.put(c, 1);
            else oneHM.put(c, oneHM.get(c) + 1);
        }
        for (char c : twoS.toCharArray()) {
            if (twoHM.get(c) == null) twoHM.put(c, 1);
            else twoHM.put(c, twoHM.get(c) + 1);
        }
        return oneHM.equals(twoHM);
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
