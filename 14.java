import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 6, 5, 1}; 
        System.out.println("Original Array: " + Arrays.toString(array));
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
    public static int[] removeDuplicates(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[length - 1];
                    length--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, length);
    }
}
