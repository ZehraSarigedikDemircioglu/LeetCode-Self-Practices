package easy;

public class SquareRoot {

    public static void main(String[] args) {

        System.out.println(mySqrt(1)); // 1
        System.out.println(mySqrt(2)); // 1
        System.out.println(mySqrt(3)); // 1
        System.out.println(mySqrt(4)); // 2
        System.out.println(mySqrt(5)); // 2
        System.out.println(mySqrt(8)); // 2
        System.out.println(mySqrt(25)); // 5
        System.out.println(mySqrt(24)); // 4
        System.out.println(mySqrt(26)); // 5
        System.out.println(mySqrt(80)); // 8
        System.out.println(mySqrt(102)); // 10
        System.out.println(mySqrt(120)); // 10
        System.out.println(mySqrt(130)); // 11
        System.out.println(mySqrt(2147395600)); // 46340 this takes a random value in leetcode, so i had to switch long
    }

    public static int mySqrt(int x) {

        long n = 1;
        long square = n * n;
        while (square <= x) {
            n++;
            square = n * n;
        }
        return (int)n - 1;
    }
}
/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 */
