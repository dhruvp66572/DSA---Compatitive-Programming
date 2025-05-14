package Hashing;

import java.util.Scanner;

public class tut2 {
    public static void main(String[] args) {
        String s;
        int q;

        Scanner sc =  new Scanner(System.in);
        
        s = sc.nextLine();
        q = sc.nextInt();

        int hash[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'a']++;
        }
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            //fetch
            System.out.println(hash[c - 'a']);
        }
    }
}
