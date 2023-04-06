import java.util.Arrays;

public class RunningSumOf1dArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {1, 1, 1, 1, 1};
        int[] nums3 = {3, 1, 2, 10, 1};

        System.out.println(Arrays.toString(runningSum(nums))); // [1, 3, 6, 10]
        System.out.println(Arrays.toString(runningSum(nums2))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(runningSum(nums3))); // [3, 4, 6, 16, 17]

    }

    public static int[] runningSum(int[] nums) {

        int[] newArray = new int[nums.length];

        newArray[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            newArray[i] = newArray[i - 1] + nums[i];
        }
        return newArray;
    }
}
/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
 */
