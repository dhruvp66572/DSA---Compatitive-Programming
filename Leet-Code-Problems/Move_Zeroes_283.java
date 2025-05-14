public class Move_Zeroes_283 {

    private static void moveZero(int[] nums) {
        int n = nums.length;
        int j = n - 1;

        for (int i = 0; i < n; i++) {
            System.out.println(nums[i] + " " + nums[j]);
            if (i == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }

            if (j == 0) {
                j--;
            }            
        }
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };

        moveZero(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}