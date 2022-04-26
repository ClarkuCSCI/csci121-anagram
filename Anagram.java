import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        HashMap<Character, Integer> oneHM = new HashMap<Character, Integer>();
        HashMap<Character, Integer> twoHM = new HashMap<Character, Integer>();
        for (char c : oneS.toCharArray()) {
            if (!oneHM.containsKey(c)) {
                oneHM.put(c, 1);
            }
            else {
                int h = oneHM.get(c);
                h++;
                oneHM.put(c, h);
            }
        }
        for (char c : twoS.toCharArray()) {
            if (!twoHM.containsKey(c)) {
                twoHM.put(c, 1);
            }
            else {
                int h = twoHM.get(c);
                h++;
                twoHM.put(c, h);
            }
        }
        return oneHM.equals(twoHM);
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
