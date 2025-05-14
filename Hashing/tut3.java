package Hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class tut3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Pre-Compute
        List<Integer> lst;
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = a[i];
            int freq = 0;

            if (mp.containsKey(key)) {
                freq = mp.get(key);
            }
            freq++;
            mp.put(key, freq);
        }

        // Iterate over the map:
        for (Map.Entry<Integer,Integer> it : mp.entrySet()) {
            System.out.println(it.getKey()+"->"+it.getValue());
        }



        // int q = sc.nextInt();
        // for (int i = 0; i < q; i++) {
        //    int number = sc.nextInt();

        // }
    }    
}
