import java.util.HashMap;
import java.util.Map;

public class Tuple_with_Same_Product_1726 {

    private static int tupleSameProduct(int[] nums) {

        int n = nums.length;
        Map<Integer, Integer> productmap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productmap.put(product, productmap.getOrDefault(product, 0) + 1);
            }
        }

        int ans = 0;
        for (int count : productmap.values()) {
            if (count > 1) {
                ans += 8 * (count * (count - 1) / 2);
            }
        }

        for (Map.Entry<Integer, Integer> e : productmap.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 2,3,4,6,8,12 };

        System.out.println(tupleSameProduct(nums));
    }

}
