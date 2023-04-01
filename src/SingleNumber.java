import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println(singleNumber(nums)); // 1
        System.out.println(singleNumber(nums2)); // 4
        System.out.println(singleNumber(nums3)); // 1

        System.out.println(singleNumber2(nums)); // 1
        System.out.println(singleNumber2(nums2)); // 4
        System.out.println(singleNumber2(nums3)); // 1
    }
    public static int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.remove(nums[i])) {
                set.add(nums[i]);
            }
        }
        return set.stream().findAny().orElseThrow();
    }

    public static int singleNumber2(int[] nums) {

        int result = 0;
        for (int num : nums) {
            result ^= num; // result = result^num
        }
        return result;
    }
}
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 */

