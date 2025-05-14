import java.util.*;

public class Missing_Number_268 {

    private static int missingNumber(int[] nums) {

        int freq = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length + 1; i++) {
            freq = 0;
            count.put(i, freq);
        }

        for (int i = 0; i < nums.length; i++) {
            freq = 0;
            if (count.containsKey(nums[i])) {
                freq = count.get(nums[i]);
                freq++;
                count.put(nums[i], freq);
            }
        }

        for (int i = 0; i < nums.length+1; i++) {
            if (count.get(i) == 0) {
                return i;
            }
        }

        // Iterate over the map:
        for (Map.Entry<Integer, Integer> it : count.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {0,1};

        System.out.println(missingNumber(nums));
    }

}
