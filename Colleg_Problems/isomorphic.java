package Colleg_Problems;

import java.util.HashMap;

public class isomorphic {

    public static boolean checkisomorphic(String s1, String s2){

        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Character> mapst = new HashMap<>();        
        HashMap<Character, Character> mapts = new HashMap<>();        

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (mapst.containsKey(c1) && mapst.get(c1) != c2) {
                return false;
            }
            if (mapts.containsKey(c2) && mapts.get(c2) != c1) {
                return false;
            }

            mapst.put(c1, c2);
            mapst.put(c2, c1);
        }

        return true;
    }

    public static boolean checkisomorphicclgtask(String s, String[] food){     

        HashMap<Character, String> stofood = new HashMap<>();        
        HashMap<String, Character> foodtos = new HashMap<>();        

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String str = food[i];

            if (stofood.containsKey(c) && stofood.get(c) != str) {
                return false;
            }
            if (foodtos.containsKey(str) && foodtos.get(str) != c) {
                return false;
            }

            stofood.put(c, str);
            foodtos.put(str, c);
        }

        return true;
    }


    public static void main(String[] args) {
        // String s1 = "abbc";
        // String s2 = "xyyz";

        String s = "ABBA";
        String[] food = {"meat", "grass", "grass", "fish"};
        
        // System.out.println(checkisomorphic(s1,s2));
        System.out.println(checkisomorphicclgtask(s, food));
    }
}