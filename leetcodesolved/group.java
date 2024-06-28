import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class group {
    public static void main(String[] args) {
        String[] anagram = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(anagram);
        System.out.println(Arrays.toString(anagram));
        for (int i = 0; i < anagram.length; i++) {

        }
    }
}
