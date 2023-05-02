import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        if (oneS.length() != twoS.length()) {
            return false;
        }
        HashMap<Character, Integer> freqs = new HashMap<Character, Integer>();
        for (char c : oneS.toCharArray()) {
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
        }
        for (char c : twoS.toCharArray()) {
            int count = freqs.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            freqs.put(c, count - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
