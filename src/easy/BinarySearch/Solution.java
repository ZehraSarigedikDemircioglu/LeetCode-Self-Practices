package easy.BinarySearch;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        System.out.println(search(numbers, 6));
        System.out.println(search2(numbers, 6));
    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target){
                return middle;
            }
            if (target < nums[middle]){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        return -1; // since the requirement is logn, need to go with binarysearch
    }
    public static int search2(int[] nums, int target) {

        return Arrays.binarySearch(nums, target);
    }
}
/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 */
