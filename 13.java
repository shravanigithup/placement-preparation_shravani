import java.util.Arrays;
public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; 
        int k = 2; 
        System.out.println("Original Array: " + Arrays.toString(array));
        rotateLeft(array, k);
        System.out.println("Array after rotating left by " + k + " positions: " + Arrays.toString(array));
    }
    public static void rotateLeft(int[] array, int k) {
        int n = array.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + n - k) % n] = array[i];
        }
        System.arraycopy(temp, 0, array, 0, n);
    }
}
