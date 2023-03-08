import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] array = new int[]{16, 3, 11, 5, 15};
        System.out.println(Arrays.toString(twoSumOptimalSolution(array, 8)));//[1, 0]
        System.out.println(Arrays.toString(twoSumOptimalSolution1(array, 8)));//[5, 3]
    }

    public static int[] twoSumOptimalSolution(int[] array, int targetValue) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {

            int potentialMatch = targetValue - array[i];
            if (map.containsKey(potentialMatch)) {
                return new int[]{i, map.get(potentialMatch)}; // return index numbers
            } else {
                map.put(array[i], i);
            }
        }

        return new int[]{};
    }

    public static int[] twoSumOptimalSolution1(int[] array, int targetValue) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {

            int potentialMatch = targetValue - array[i];
            if (map.containsKey(potentialMatch)) {
                return new int[]{array[i], potentialMatch}; // return array values
            } else {
                map.put(array[i], i);
            }
        }
        return new int[]{};
    }
}
/*
Given an array of integers nums and an integer target, return the two numbers such that they add
up to target.
Assume that each input would have exactly one solution, and you should not use the same
element twice.
You can return the answer in any order.
No solution will return empty array.
Please, use two pointer strategy to solve this problem
(Hint : you should sort the input first).
Example:
Input: nums = [16, 3, 11, 5, 15], target = 8
Output: [3, 5]
Explanation: Because nums[1] + nums[3] => 3 + 5 = 8, we return [3, 5].
Optional additional task: Try to return original indices of the pair numbers
 */
