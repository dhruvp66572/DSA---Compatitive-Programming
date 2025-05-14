import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Word_Subsets_916 {

    public static void main(String[] args) {
        String[] words1 = { "amazon", "apple", "facebook", "google", "leetcode" };
        String[] words2 = { "e", "o" };

        System.out.println(getans(words1, words2));
    }

    private static List<String> getans(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        Map charmap = new HashMap<>();

        for (int i = 0; i < words1.length; i++) {

            if (charmap.containsKey(words1)) {
                
            }
            System.out.println(words1[i]);   
        }

        return ans;
    }
}