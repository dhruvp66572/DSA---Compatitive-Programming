package Colleg_Problems;

import java.util.Scanner;

// assertEquals(true, anagram.checkanagram("listen", "silent"));
// assertEquals(true, anagram.checkanagram("triangle", "integral"));
// assertEquals(false, anagram.checkanagram("apple", "pale"));
// assertEquals(false, anagram.checkanagram("hello", "world"));
// assertEquals(true, anagram.checkanagram("aabbcc", "bbaacc"));
// assertEquals(false, anagram.checkanagram("abcd", "abcde"));


public class anagram {

    private static boolean checkanagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        int count[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1;
        String s2;

        Scanner sc = new Scanner(System.in);
        s1 = sc.next();
        s2 = sc.next();
        
        if (checkanagram(s1, s2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
