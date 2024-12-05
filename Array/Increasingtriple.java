package Array;

public class Increasingtriple {
    //334. Increasing Triplet Subsequence
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        boolean ans=Isincreasing(array);
        System.out.println(ans);

    }
    public static boolean Isincreasing(int[] array) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : array) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {

                return true;
            }
        }
        return false;
    }
}
/**
 *
 * import java.util.ArrayList;
 *
 * public boolean increasingTriplet(int[] nums) {
 *     ArrayList<Integer> dp = new ArrayList<>();
 *
 *     for (int num : nums) {
 *         int pos = binarySearch(dp, num);
 *         if (pos < dp.size()) {
 *             dp.set(pos, num); // Replace at the position found
 *         } else {
 *             dp.add(num); // Extend the subsequence
 *         }
 *         if (dp.size() >= 3) {
 *             return true;
 *         }
 *     }
 *     return false;
 * }
 *
 * private int binarySearch(ArrayList<Integer> dp, int target) {
 *     int left = 0, right = dp.size() - 1;
 *     while (left <= right) {
 *         int mid = left + (right - left) / 2;
 *         if (dp.get(mid) >= target) {
 *             right = mid - 1;
 *         } else {
 *             left = mid + 1;
 *         }
 *     }
 *     return left;
 * }
 *
 * import java.util.ArrayList;
 *
 * public boolean increasingTriplet(int[] nums) {
 *     ArrayList<Integer> dp = new ArrayList<>();
 *
 *     for (int num : nums) {
 *         int pos = binarySearch(dp, num);
 *         if (pos < dp.size()) {
 *             dp.set(pos, num); // Replace at the position found
 *         } else {
 *             dp.add(num); // Extend the subsequence
 *         }
 *         if (dp.size() >= 3) {
 *             return true;
 *         }
 *     }
 *     return false;
 * }
 *
 * private int binarySearch(ArrayList<Integer> dp, int target) {
 *     int left = 0, right = dp.size() - 1;
 *     while (left <= right) {
 *         int mid = left + (right - left) / 2;
 *         if (dp.get(mid) >= target) {
 *             right = mid - 1;
 *         } else {
 *             left = mid + 1;
 *         }
 *     }
 *     return left;
 * }
 */
