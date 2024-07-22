public class subarrays{
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        printSubarrays(array, 0, 0);
    }

    // Recursive function to print all subarrays
    public static void printSubarrays(int[] array, int start, int end) {
        // Base case: if the starting index exceeds the length of the array, return
        if (start == array.length) {
            return;
        }
        // If the end index exceeds the length of the array, move to the next starting index
        else if (end == array.length) {
            printSubarrays(array, start + 1, start + 1);
        }
        // Print the current subarray and recursively call for the next subarray
        else {
            printSubarray(array, start, end);
            printSubarrays(array, start, end + 1);
        }
    }

    // Helper function to print a subarray from start to end index
    public static void printSubarray(int[] array, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
/*
 * 
To reduce the time complexity of generating and printing all subarrays, you need to rethink the approach. Since the task inherently involves generating 
𝑂
(
𝑛
2
)
O(n 
2
 ) subarrays and printing each subarray's elements, the time complexity cannot be improved beyond 
𝑂
(
𝑛
3
)
O(n 
3
 ) for this specific task if the goal is to print all subarrays explicitly.

However, if you are looking for specific subarrays or properties of subarrays without printing all elements, some tasks can be optimized. Here are a few general strategies that can be applied depending on the specific requirements:

1. Use Efficient Data Structures
If the task involves finding subarrays that satisfy certain conditions, you can use efficient data structures (e.g., hash maps) to reduce the complexity.

2. Sliding Window Technique
For problems that involve contiguous subarrays, the sliding window technique can be more efficient.

3. Dynamic Programming
For problems that involve finding specific properties of subarrays (like maximum sum, longest increasing subarray, etc.), dynamic programming can reduce the time complexity.
 */