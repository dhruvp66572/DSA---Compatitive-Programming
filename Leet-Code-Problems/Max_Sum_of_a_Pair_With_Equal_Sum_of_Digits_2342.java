import java.util.HashMap;

public class Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits_2342 {

    private static int maximumSum(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) { // 18 , 43, 36
            int digitSum = getDigitSum(num); // sum = 9, 7, 9

            if (map.containsKey(digitSum)) { // no ,  no, yes
                maxSum = Math.max(maxSum, num + map.get(digitSum));  // (-1, (36+18)) ans 54
                // Update the map with the larger value
                map.put(digitSum, Math.max(map.get(digitSum), num)); // (9, (18,36))
            } else {
                map.put(digitSum, num); // (9,18) (7,43) 
            }
        }

        return maxSum;
    }

    // Helper function to calculate sum of digits
    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 18, 43, 36, 13, 7 };

        System.out.println(maximumSum(nums));
    }

}
