public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 2, 8, 7, 1, 4, 6}; 
        sortFirstHalfAscendingSecondHalfDescending(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
    public static void sortFirstHalfAscendingSecondHalfDescending(int[] array) {
        int n = array.length;
        int mid = n / 2;
        for (int i = 0; i < mid - 1; i++) {
            for (int j = 0; j < mid - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = mid; i < n - 1; i++) {
            for (int j = mid; j < n - i + mid - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
