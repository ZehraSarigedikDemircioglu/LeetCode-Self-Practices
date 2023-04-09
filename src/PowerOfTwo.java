public class PowerOfTwo {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(3));
    }

    public static boolean isPowerOfTwo(int n){

        if(n <= 0){
            return false;
        }else{
            return n == 1 || (n % 2 == 0 && isPowerOfTwo(n/2));
        }
    }
}
