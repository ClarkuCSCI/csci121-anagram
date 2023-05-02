import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        if (oneS.length() != twoS.length()) {
            return false;
        }
        HashMap<Character, Integer> oneHM = new HashMap<Character, Integer>();
        HashMap<Character, Integer> twoHM = new HashMap<Character, Integer>();
        for (char c : oneS.toCharArray()) {
            int count = oneHM.getOrDefault(c, 0) + 1;
            oneHM.put(c, count);
        }
        for (char c : twoS.toCharArray()) {
            int count = twoHM.getOrDefault(c, 0) + 1;
            twoHM.put(c, count);
        }
        return oneHM.equals(twoHM);
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
