public class Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray_3105 {

    public static void main(String[] args) {

        int[] nums = {3,2,1};

        System.out.println(longestSubarray(nums)); // Output: 2
    }

    private static int longestSubarray(int[] nums) {

        int longest = 1, incLen = 1, decLen = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < nums[i-1]) {
                decLen++;
                incLen = 1;
            } else if (nums[i] > nums[i-1]) {
                incLen++;
                decLen = 1;
            } else {
                incLen = 1;
                decLen = 1;
            }

            longest = Math.max(longest, Math.max(incLen, decLen));
        }
        return longest;
    }

}
