package zehra;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] array) {
        int j = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[j] = array[i];
                j++;
            }
        }
        return j;
    }
}
