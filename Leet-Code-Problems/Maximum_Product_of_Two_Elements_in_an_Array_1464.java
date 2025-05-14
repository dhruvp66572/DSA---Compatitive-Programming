import java.util.Scanner;

public class Maximum_Product_of_Two_Elements_in_an_Array_1464 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        getmax(arr, n);
            }
        
            private static void getmax(int[] arr, int n) {
                int max1 = 0, max2 = 0;
        
                for (int num : arr) {
                    if (num > max1) {
                        max2 = max1;
                        max1 = num;
                    } else if (num > max2) {
                        max2 = num;
                    }
                }
                
                System.out.println(max2 +" "+ max1);
            }
}
