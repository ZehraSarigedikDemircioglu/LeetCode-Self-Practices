package zehra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = new int[]{16, 3, 11, 5, 15};
        System.out.println(Arrays.toString(twoSum(array, 8)));//[3, 1]
    }

    public static int[] twoSum(int[] array, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int expected = target - array[i];
            if(map.containsKey(expected)){
                return new int[]{i, map.get(expected)};
            }else{
                map.put(array[i], i);
            }
        }
        return new int[]{};
    }
}
