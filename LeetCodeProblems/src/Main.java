import java.util.Scanner;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x; // Handle base cases
        }

        int left = 1, right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid * mid is equal to x
            if (mid == x / mid) {
                return mid;
            }
            // If mid * mid is less than x, move right boundary and update result
            if (mid < x / mid) {
                result = mid;
                left = mid + 1;
            } else { // mid * mid is greater than x, move left boundary
                right = mid - 1;
            }
        }

        return result; // Return the floor value of sqrt(x)
    }
}


public class Main {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(new Solution().mySqrt(x)); // Output: 2
    }
}