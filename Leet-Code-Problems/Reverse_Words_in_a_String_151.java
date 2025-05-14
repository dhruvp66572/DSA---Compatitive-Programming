import java.util.Stack;

public class Reverse_Words_in_a_String_151 {

    public static String reverseWords(String s) {

        Stack<String> stack =  new Stack<>();
        String ans = " ";
        String[] str = s.trim().replaceAll("\\s+", " ").split(" ");

        for (String string : str) {
            stack.push(string);
        }

        while (!stack.isEmpty()) {
            ans = ans.concat(stack.pop()+" ");
        }
        return ans.trim();
    }

    public static void main(String[] args) {
        String s = "  the sky                  is blue  ";

        System.out.println(reverseWords(s));



    }
}
