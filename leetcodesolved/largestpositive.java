public class largestpositive {
    // 2441. Largest Positive Integer That Exists With Its Negative
    public static void main(String[] args) {
        int nums[] = { -1, 2, -3, 3 };
        int ans = -1;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] < 0 && nums[i - 1] > 0 && nums[i + 1] > 0) {
                ans = Math.max(nums[i - 1], nums[i + 1]);
            }

        }
        System.out.println(ans);

    }

}
