

import java.util.*;

public class Check_if_One_String_Swap_Can_Make_Strings_Equal_1790 {


    public static boolean areAlmostEqual(String s1, String s2){

            Map<Character, Integer> mapp1 = new HashMap<Character, Integer>();
            Map<Character, Integer> mapp2 = new HashMap<Character, Integer>();

            if (s1.length() != s2.length()) {
                return false;
            }

            for (int i = 0; i < s1.length(); i++) {
                Character key1 = s1.charAt(i);
                int freq1 = 0;

                if (mapp1.containsKey(key1)) {
                    freq1 = mapp1.get(key1);
                }
                freq1++;
                mapp1.put(key1, freq1);
            }
            
            for (Map.Entry<Character, Integer> e : mapp1.entrySet()) {
                System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
            }
            return false;
    }

    public static void main(String[] args) {
        
        String s1 = "bank";
        String s2 = "kanb";

        System.out.println(areAlmostEqual(s1, s2));

    }
}