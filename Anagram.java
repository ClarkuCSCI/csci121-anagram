import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        HashMap<Character, Integer> oneHM = new HashMap<Character, Integer>();
        HashMap<Character, Integer> twoHM = new HashMap<Character, Integer>();
        for (char c : oneS.toCharArray()) {
            if (oneHM.containsKey(c)) {
                int number = oneHM.get(c) + 1;
                oneHM.put(c, number);
            }
            else {
                oneHM.put(c, 1);
            }
        }

        for (char c : twoS.toCharArray()) {
            if (twoHM.containsKey(c)) {
                int number = twoHM.get(c) + 1;
                twoHM.put(c, number);
            }
            else {
                twoHM.put(c, 1);
            }
        }
        return oneHM.equals(twoHM);
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
