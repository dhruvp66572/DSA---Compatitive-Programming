import java.util.HashMap;
import java.util.Map;

public class Longest_Palindrome_409 {

    public static int ans(String s) {

        HashMap<Character, Integer> mapp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            int freq = 0;

            if (mapp.containsKey(key)) {
                freq = mapp.get(key);
            }
            freq++;
            mapp.put(key, freq);
        }

        int count = 0;
        Boolean flag = true;

        for (Map.Entry<Character, Integer> e : mapp.entrySet()){
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
            if (mapp.get(e.getKey())%2 == 0) {
                count += e.getValue();
            }
            else{
                if (flag) {
                    count += e.getValue();
                    flag = false;                
                }
            }
        }

    return count;

    }

    public static void main(String[] args) {
        String s = "abccccdd";

        System.out.println(ans(s));
    }
}
