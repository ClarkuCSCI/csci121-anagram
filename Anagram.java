import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        HashMap<Character, Boolean> oneHM = new HashMap<Character, Boolean>();
        HashMap<Character, Boolean> twoHM = new HashMap<Character, Boolean>();
        char[] oneSplit = oneS.toCharArray();
        char[] twoSplit = twoS.toCharArray();

        if (twoSplit.length < oneS.length() || oneS.length() < twoSplit.length)
            for (int i = 0; i < oneSplit.length; i++) {
                oneHM.put(oneSplit[i], false);
            }
        else {
            int counter = 0;
            for (char c : oneS.toCharArray()) {
                boolean check;
                if (twoSplit[counter] == c) check = true;
                else check = false;
                oneHM.put(c, check);
                counter++;
            }
        }
        if (oneSplit.length < twoS.length() || twoS.length() < oneSplit.length)
            for (int i = 0; i < twoSplit.length; i++) {
                twoHM.put(twoSplit[i], true);
            }

        else {
            int counter2 = 0;
            for (char c : twoS.toCharArray()) {
                boolean check;
                if (oneSplit[counter2] == c) check = true;
                else check = false;
                twoHM.put(c, check);
                counter2++;
            }
        }
        return oneHM.equals(twoHM);
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
