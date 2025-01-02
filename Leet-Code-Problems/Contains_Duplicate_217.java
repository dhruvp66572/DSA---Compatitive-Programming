import java.util.HashMap;
import java.util.HashSet;

public class Contains_Duplicate_217 {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }; // Input array

        boolean k = containsDuplicate(nums); // Calls your implementation

        System.out.println(k); // Output length of array
    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
