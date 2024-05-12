public class primenumber {
    public static void main(String[] args) {
        int number = 10;
        boolean ans = prime(number);
        System.out.println(ans);
    }

    private static boolean prime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0 && i != number) {
                return false;
            }

        }
        return true;

    }
}
