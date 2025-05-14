import java.util.Arrays;

public class frog_jump {

    public static int jump(int n, int[] height, int[] dp) {

        if (n == 0)
            return 0;
        if (dp[n] != -1)
            return dp[n];

        int j2 = Integer.MAX_VALUE;
        int j1 = jump(n - 1, height, dp) + Math.abs(height[n] - height[n - 1]);

        if (n > 1) {
            j2 = jump(n - 2, height, dp) + Math.abs(height[n] - height[n - 2]);
        }

        return dp[n] = Math.min(j1, j2);

    }

    public static int jumpwitharray(int n, int[] height) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, 0);
        dp[0] = 0;
        for (int i = 1; i <= n - 1; i++) {

            int j2 = Integer.MAX_VALUE;
            int j1 = dp[i - 1] + Math.abs(height[i] - height[i - 1]);

            if (i > 1) {
                j2 = dp[i - 2] + Math.abs(height[i] - height[i - 2]);
            }

            dp[i] = Math.min(j1, j2);
        }
        return dp[n - 1];
    }
    public static int jumpwitharrayspace(int n, int[] height) {
        int prev = 0;
        int prev2 = 0;
        for (int i = 1; i <= n - 1; i++) {

            int j2 = Integer.MAX_VALUE;
            int j1 = prev + Math.abs(height[i] - height[i - 1]);

            if (i > 1) {
                j2 = prev2 + Math.abs(height[i] - height[i - 2]);
            }

            int curi = Math.min(j1, j2);
            prev2 = prev;
            prev = curi; 
        }
        return prev;
    }


    public static void main(String[] args) {

        int height[] = { 30, 10, 60, 10, 60, 50 };
        int n = height.length;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        // using recursion
        System.out.println(jump(n - 1, height, dp)); // calling the static method

        // convert recursion to array

        System.out.println(jumpwitharray(n , height)); // calling the static method
        
        // convert to space optimization
        System.out.println(jumpwitharrayspace(n , height)); // calling the static method

    }

}
