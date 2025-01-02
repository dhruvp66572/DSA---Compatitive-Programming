
public class Count_Vowel_Strings_in_Ranges_2559 {

    public static int[] vowelStrings(String[] words, int[][] queries) {

        int[] ans = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (isVowelString(words[j])) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static boolean isVowelString(String str) {
            if ("aeiou".indexOf(str.charAt(0)) == -1 && "aeiou".indexOf(str.charAt(str.length()-1)) ==-1) { // If not a vowel
                return false;
            }        
        return true; // All characters are vowels
    }

    public static void main(String[] args) {
        String[] words = { "aba", "bcb", "ece", "aa", "e" };
        int[][] queries = { { 0, 2 }, { 1, 4 }, { 1, 1 } };

        int[] ans = vowelStrings(words, queries);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}