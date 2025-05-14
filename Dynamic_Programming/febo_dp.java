
import java.util.Arrays;

public class febo_dp {

    public static int febo(int n) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return febo(n - 1) + febo(n - 2);
    }

    public static int febowitharray(int n, int[] dp) {

        if (n <= 1)
            return n;

        // if dp[n] != -1; then return same value dp[n];
        if (dp[n] != -1)
            return dp[n];

        return dp[n] = febowitharray(n - 1, dp) + febowitharray(n - 2, dp);
    }

    public static int febowitharrayspace(int n) {

        int prev = 1;
        int prev2 = 0;

        for (int i = 2; i <= n; i++) {
            int curi = prev + prev2;
            prev2 = prev;
            prev = curi;
        }

        return prev;
    }

    public static void main(String[] args) {

        int n = 8;

        // febonacci using recursion
        System.out.println(febo(n)); // calling the static method

        // febonacci using recursion with 1D array
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(febowitharray(n, dp)); // calling the static method

        //  without recursion and with array with space optimazation

        System.out.println(febowitharrayspace(n)); // calling the static method
       

    }
}
