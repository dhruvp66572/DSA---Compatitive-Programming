public class Clear_Digits_3174 {

    public static String clearDigits(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (isnumber(s.charAt(i))) {
                ans = ans.concat(String.valueOf(s.charAt(i)));
            } else {
                System.out.println(ans.length());
                ans = ans.substring(0, ans.length() - 1);
            }
            System.out.println("-" + ans + "-");
        }

        return ans;
    }

    private static boolean isnumber(char charAt) {
        if (charAt <= 57 && charAt >= 48) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "d9";

        System.out.println(clearDigits(s));
    }
}