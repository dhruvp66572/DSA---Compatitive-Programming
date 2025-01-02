public class Fibonacci_Number_509 {

    public static void main(String[] args) {
        int n = 3;

        int ans = fibonaccisum(n);

        System.out.println(ans);
    }

    private static int fibonaccisum(int n) {
        int a = 0, b = 1;
        while (n-- > 0) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
