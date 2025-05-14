package Colleg_Problems;

import java.util.Scanner;

public class Reverse_Vowels {

    public static boolean isVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return true;
        }

        return false;
    }

    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int j = arr.length - 1;
        int i = 0;
        while (i < j) {
            if (isVowel(arr[i]) && isVowel(arr[j])) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i++;
            } else if (isVowel(arr[i])) {
                j--;
            } else {
                i++;
            }
        }

        return new String(arr);

    }

    public static void main(String[] args) {
        String s;

        Scanner sc = new Scanner(System.in);

        s = sc.nextLine();

        System.out.println(reverse(s));
    }
}