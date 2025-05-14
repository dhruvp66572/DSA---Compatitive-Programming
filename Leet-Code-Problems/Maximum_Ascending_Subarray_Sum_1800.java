public class Maximum_Ascending_Subarray_Sum_1800 {

    public static void main(String[] args) {

        int[] nums = { 10, 20, 30, 5, 10, 50 };

        System.out.println(maxAscendingSum(nums)); // Output: 2
    }

    private static int maxAscendingSum(int[] nums) {

        int sum = nums[0], maxsum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
                System.out.println("After sum = " + sum);
            } else {
                sum = nums[i];
            }
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }

}
