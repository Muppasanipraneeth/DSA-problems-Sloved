public class Adddigits {// 258. Add Digits
    public static void main(String[] args) {
        int num = 0;

        int ans = single(num);
        System.out.println(ans);

        // System.out.println(ans);

    }

    private static int single(int num) {
        int sum = 0;

        while (true) {
            while (num != 0) {
                int temp = num % 10;
                sum += temp;
                num = num / 10;
            }
            num = sum;
            sum = 0;
            if (num / 10 == 0) {
                return num;
            }

        }

    }

}
