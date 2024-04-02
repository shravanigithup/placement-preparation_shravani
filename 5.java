import java.util.Arrays;
public class ArrayReversal {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 2, 8, 7, 1, 4, 6};
        System.out.println("Original Array: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
