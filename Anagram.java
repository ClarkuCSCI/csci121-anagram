import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        HashMap<Character, Boolean> oneHM = new HashMap<Character, Boolean>();
        HashMap<Character, Boolean> twoHM = new HashMap<Character, Boolean>();
        int i = 0;
        for (char c : oneS.toCharArray()) {
            oneHM.put(c, true);
            // StdOut.println("oneHM: " + oneHM);
            i++;
        }
        int j = 0;
        for (char c : twoS.toCharArray()) {
            twoHM.put(c, true);
            // StdOut.println("twoHM: " + twoHM);
            j++;
        }
        if (i != j) {
            return false;
        }
        return oneHM.equals(twoHM);
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
