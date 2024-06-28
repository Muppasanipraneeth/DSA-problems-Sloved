import java.util.Arrays;

public class Reverseprefix {
    // 2000. Reverse Prefix of Word
    public static void main(String[] args) {
        String str = "abcdefd";
        char ch = 'd';
        char[] array = new char[str.length()];
        int end = 0;
        for (int i = 0; i < array.length; i++) {
            char k = str.charAt(i);
            array[i] = k;

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch) {
                end = i;
                break;
            }

        }
        Revsering(array, end);
        String ans = "";
        for (int i = 0; i < array.length; i++) {
            ans += array[i];
        }
        System.out.println(ans);
    }

    private static String Revsering(char[] array, int end) {
        int i = 0;
        while (i <= end) {
            char temp = array[i];
            array[i] = array[end];
            array[end] = temp;
            i++;
            end--;

        }
        return Arrays.toString(array);
    }
}