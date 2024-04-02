import java.util.*;
public class UniqueNumbers {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 2, 7, 4, 8, 9, 6}; 
        System.out.println("Original Array: " + Arrays.toString(array));
        printUniqueNumbers(array);
    }
    public static void printUniqueNumbers(int[] array) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : array)
            uniqueNumbers.add(num);
        System.out.println("Unique Numbers: " + uniqueNumbers);
    }
}
