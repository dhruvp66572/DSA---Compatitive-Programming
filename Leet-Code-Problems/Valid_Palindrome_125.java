public class Valid_Palindrome_125 {

  public static void main(String[] args) {

    String str = "A man, a plan, a canal: Panama";

    boolean ans = checkpalindrome(str);

    System.out.println(ans);
  }

  private static boolean checkpalindrome(String str) {
    
    String filterstr = "";

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (Character.isLetterOrDigit(c)) {
        filterstr = filterstr.concat(String.valueOf(Character.toLowerCase(c)));
      }
    }
    String rev = "";
    for (int i = filterstr.length() - 1; i >= 0; i--) {
      rev = rev.concat(String.valueOf(filterstr.charAt(i)));
    }
    return filterstr.equals(rev);
  }
}