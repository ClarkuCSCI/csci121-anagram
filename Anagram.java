import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        HashMap<Character, Integer> oneHM = new HashMap<Character, Integer>();
        HashMap<Character, Integer> twoHM = new HashMap<Character, Integer>();
        for (char c : oneS.toCharArray()) {
            int occurrence;
            if (oneHM.get(c) != null) {
                occurrence = oneHM.get(c);
            }
            else {
                occurrence = 1;
            }
            oneHM.put(c, occurrence + 1);
        }
        for (char c : twoS.toCharArray()) {
            int occurrence;
            if (twoHM.get(c) != null) {
                occurrence = twoHM.get(c);
            }
            else {
                occurrence = 1;
            }
            twoHM.put(c, occurrence + 1);
        }
        return oneHM.equals(twoHM);
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
