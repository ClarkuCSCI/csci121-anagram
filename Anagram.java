import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        HashMap<Character, Boolean> oneHM = new HashMap<Character, Boolean>();
        HashMap<Character, Boolean> twoHM = new HashMap<Character, Boolean>();
        char[] s1 = oneS.toCharArray();
        char[] s2 = twoS.toCharArray();

        if (s1.length < twoS.length() || twoS.length() < s1.length)
            for (int j = 0; j < s2.length; j++) {
                twoHM.put(s2[j], true);
            }

        else {
            int y = 0;
            for (char c : twoS.toCharArray()) {
                boolean x;
                if (s1[y] == c) x = true;
                else x = false;
                twoHM.put(c, x);
                y++;
            }
        }
        
        if (s2.length < oneS.length() || oneS.length() < s2.length)
            for (int j = 0; j < s1.length; j++) {
                oneHM.put(s1[j], false);
            }
        else {
            int y2 = 0;
            for (char c : oneS.toCharArray()) {
                boolean x;
                if (s2[y2] == c) x = true;
                else x = false;
                oneHM.put(c, x);
                y2++;
            }
        }
        
        return oneHM.equals(twoHM);
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
