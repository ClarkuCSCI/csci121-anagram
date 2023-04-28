import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        HashMap<Character, Integer> oneHM = new HashMap<Character, Integer>();
        HashMap<Character, Integer> twoHM = new HashMap<Character, Integer>();
        for (char c : oneS.toCharArray()) {
            oneHM.put(c, oneHM.getOrDefault(c, 0)+1);
        }
        for (char c : twoS.toCharArray()) {
            twoHM.put(c, twoHM.getOrDefault(c, 0)+1);
        }
        return oneHM.equals(twoHM);
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
