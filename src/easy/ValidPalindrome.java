package easy;

public class ValidPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Do geese see God")); // True
        System.out.println(isPalindrome("Was it a car or a cat I saw")); // True
        System.out.println(isPalindrome("A brown fox jumping over")); // False
        System.out.println(isPalindrome("1A man, a plan, a canal: Panama1")); // True
        System.out.println(isPalindrome("race a car")); // False
    }

    public static boolean isPalindrome(String str) {

        String s = str.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
