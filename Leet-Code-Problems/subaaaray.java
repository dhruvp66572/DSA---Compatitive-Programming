public class subaaaray {


    static int subaaryy(int[] a){
        int c = 0;

        for (int j = 0; j < a.length - 2; j++) {
            int sum = a[j] + a[j+2];
            System.out.println("sum is " + sum);
            double mid = (double)a[j+1]/2;
            System.out.println("Mid is " + mid); 

            if (mid == sum) {
                c++;
            }
        }
        return c;
    }
    
    public static void main(String[] args) {
        int[] nums = {-2,-6,-1,-9,-4,-10,-1}; // Input array

        int k = subaaryy(nums); // Calls your implementation

        System.out.println("Length: " + k); // Output length of array
    }
}
