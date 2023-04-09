package easy;

public class PowerOfTwo {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(15));
    }

    public static boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        } else {
            return (n == 1 || (n % 2 == 0 && isPowerOfTwo(n / 2)));
        }
    }

    public static boolean isPowerOfTwo2(int n) {

        return ((n & (n - 1)) == 0 && n > 0);
    }

    public static boolean isPowerOfTwo3(int n) {

        if(n ==1){
            return true;
        }else if(n % 2 != 0 || n <= 0){
            return false;
        }else{
            return isPowerOfTwo2(n/2);
        }
    }
}
