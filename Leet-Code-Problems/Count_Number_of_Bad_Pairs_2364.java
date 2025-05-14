import java.util.HashMap;

public class Count_Number_of_Bad_Pairs_2364 {

    public static void main(String[] args) {
        int[] nums = { 4, 1, 3, 3 };
                 //    0  1  2  3 

        System.out.println(countBadPairs(nums));
    }

    private static long countBadPairs(int[] nums) {
         int n = nums.length;
        long totalPairs = (long) n * (n - 1) / 2; // Total number of pairs
        System.out.println(totalPairs);
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        long goodPairs = 0;

        for (int i = 0; i < n; i++) {
            int key = nums[i] - i; // Compute nums[i] - i
            System.out.println("key of "+nums[i]+" - "+i+" = "+key);
            goodPairs += freqMap.getOrDefault(key, 0); // Count how many times this value has appeared before
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1); // Update frequency
            
            System.out.println("Freq = "+freqMap.get(key));
            System.out.println("good = "+goodPairs);
        }

        return totalPairs - goodPairs; // Bad pairs = Total - Good
    }
    // private static long countBadPairs(int[] nums) {
        
    //     int count = 0;
    //     int n = nums.length;

    //     for (int i = 0; i < n; i++) {
    //         for (int j = i+1; j < n; j++) {
    //             if (i < j && j - i != nums[j] - nums[i]) {
    //                 count++;
    //             }
    //         }
    //     }

    //     return count;
    // }
}
