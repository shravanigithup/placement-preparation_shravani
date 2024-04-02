public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; 
        int target = 9; 
        int[] indices = findTwoSumIndices(nums, target);
        if (indices != null) {
            System.out.println("Indices of two elements whose sum is " + target + ": " + indices[0] + ", " + indices[1]);
        } else {
            System.out.println("No such indices found.");
        }
    }
    public static int[] findTwoSumIndices(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null; 
    }
}
