import java.util.HashMap;
import java.util.Map;

public class Singel_number_136 {

    public static int  getSingleElement(int[] nums){

        HashMap<Integer, Integer> mapp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = mapp.getOrDefault(nums[i], 0);
            mapp.put(nums[i], value+1);
        }


        for (Map.Entry<Integer,Integer> it : mapp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        System.out.println(getSingleElement(nums));
    }
}