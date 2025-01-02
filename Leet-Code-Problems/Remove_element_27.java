public class Remove_element_27 {

    static int removeElement(int[] nums, int val) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            
        }

        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2 }; // Input array
        int val = 2; // Value to remove // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation

        System.out.println("Length: " + k); // Output length of array


    }
}