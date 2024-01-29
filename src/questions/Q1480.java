package questions;

import java.util.Arrays;

/**
 * 1480. Running Sum of 1d Array
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * Example 2:
 * <p>
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 * Example 3:
 * <p>
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 * <p>
 * <p>
 * Constraints:
 * <p>
 *  * 1 <= nums.length <= 1000
 *  * -10^6 <= nums[i] <= 10^6
 */
public class Q1480 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(runningSum(new int[]{1,1,1,1,1})));
        System.out.println(Arrays.toString(runningSum(new int[]{3,1,2,10,1})));
    }
    public static int[] runningSum(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += sum;
            sum = nums[i];
        }
        return nums;
    }
}
