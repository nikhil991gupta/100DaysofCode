package DAY109;
/**
 * Approach 1:  Using Extra Space
 * Algorithm
 * We use an extra array in which we place every element of the array at its correct position
 * i.e. the number at index i in the original array is placed at the index (i+k).
 * Then, we copy the new array to the original one.
 * 
 * Complexity Analysis
 * Time complexity  : O(n). One pass is used to put the numbers in the new array.
 * And another pass to copy the new array to the original one.
 * Space complexity : O(n). Another array of the same size is used.
 */

public class rotatearray {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
}
/*
 * 
 * * This approach is based on the fact that when we rotate the array k times,
 * k elements from the back end of the array come to the front and the rest of the elements from the front shift backwards.
 * In this approach, we firstly reverse all the elements of the array.
 * Then, reversing the first k elements followed by reversing the rest n−k elements gives us the required result.
 * 
 * For example
 *  Let n=7 and k=3.
 *  Original List                   : 1 2 3 4 5 6 7
 *  After reversing all numbers     : 7 6 5 4 3 2 1
 *  After reversing first k numbers : 5 6 7 4 3 2 1
 *  After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result
 */

// class Solution {
//     public void rotate(int[] nums, int k) {
//         if (nums == null || nums.length == 0) {
//             return;
//         }

//         int offset = k % nums.length;
//         reverse(nums, 0, nums.length - 1);
//         reverse(nums, 0, offset - 1);
//         reverse(nums, offset, nums.length - 1);
//     }

//     public void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }