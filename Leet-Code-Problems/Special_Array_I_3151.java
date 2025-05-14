public class Special_Array_I_3151 {
    public static void main(String[] args) {

        int[] nums = { 1, 3, 5, 7 };


        // Output: 2
    }

    private static int[] maxAscendingSum(int[] nums, int target) {

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
    // private static Boolean maxAscendingSum(int[] nums) {

    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i]%2 ==  nums[i+1]%2) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
