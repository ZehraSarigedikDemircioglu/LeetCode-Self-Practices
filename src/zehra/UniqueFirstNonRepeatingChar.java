package zehra;

import java.util.Map;
import java.util.TreeMap;

public class UniqueFirstNonRepeatingChar {

    public static void main(String[] args) {

        String str = "JJavaDDevelloopperr";
        System.out.println(findFirstNonRepeating(str));

    }
    public static Character findFirstNonRepeating(String str){
        Map<Character, Integer> map = new TreeMap<>();
        int count;
        for (char each : str.toCharArray()) {
            if (map.containsKey(each)) {
                count = map.get(each);
                map.put(each, count + 1);
            } else {
                map.put(each, 1);
            }
        }
        for (char each : str.toCharArray()) {
            if(map.get(each) == 1){
                return each;
            }
        }
        return null;
    }
}
