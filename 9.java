public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 3, 7, 8}; 
        int missingNumber = findMissingNumber(array);
        System.out.println("Missing number in the array: " + missingNumber);
    }
    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
