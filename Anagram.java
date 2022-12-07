import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
    public static boolean anagram(String oneS, String twoS) {
        List<String> slista = Arrays.asList(oneS.split(""));
        List<String> slistb = Arrays.asList(twoS.split(""));
        List<String> sortedLista = slista.stream().sorted().collect(Collectors.toList());
        List<String> sortedListb = slistb.stream().sorted().collect(Collectors.toList());
        return sortedLista.equals(sortedListb);
    }

    public static void main(String[] args) {
        System.out.println(anagram(args[0], args[1]));
    }
}
