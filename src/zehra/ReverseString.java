package zehra;

public class ReverseString {

    public static char[] reverseString(char[] s) {
        int right = s.length - 1;
        int left = 0;

        while (left < right) {
            char c = s[right];
            s[right] = s[left];
            s[left] = c;

            left++;
            right--;
        }
        return s;
    }
}
// a = a + b, b = a - b, a = a -b
