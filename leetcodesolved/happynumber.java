public class happynumber {
    // 202 Happy number
    public static void main(String[] args) {
        int num = 1111111;
        boolean ans = happy(num);
        System.out.println(ans);

    }

    private static boolean happy(int num) {
        int sum = 0;
        while (true) {

            while (num != 0) {
                int temp = num % 10;
                sum = sum + temp * temp;
                num = num / 10;
            }
            num = sum;
            sum = 0;
            if (num / 10 == 0) {
                if (num == 1) {
                    return true;
                } else {
                    return false;
                }
            }

        }

    }
}
