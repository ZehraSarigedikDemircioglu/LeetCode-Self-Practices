package zehra;

public class HighestAltitude {

    public static void main(String[] args) {
        int[] arr = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(arr));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
