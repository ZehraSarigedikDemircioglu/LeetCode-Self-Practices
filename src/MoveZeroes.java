import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

            int[] nums = {0, 1, 0, 3, 12}; // [1, 3, 12, 0, 0]
            int[] nums2 = {0}; // [0]

            moveZerosToTheEnd(nums);
            moveZerosToTheEnd(nums2);
        }

        public static void moveZerosToTheEnd(int[] array) {

            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if(array[i] !=0){
                    array[count++] = array[i];
                }
            }

            while (count < array.length) {
                array[count++] = 0;
            }
            System.out.println(Arrays.toString(array));
        }
}
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the
non-zero elements.
Note that you must do this in-place without making a copy of the array.
 */
