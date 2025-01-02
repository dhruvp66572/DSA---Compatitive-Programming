public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {

    private static int getfirstoccurindex(String str1, String str2) {

        if (str2.length() == 0) {
            return 0;
        }

        if (str2.length() > str1.length()) {
            return -1;
        }

        int j = 0;
        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) == str2.charAt(j)) {
            
                System.out.println(i + " Matched = " + str1.charAt(i));
                j++;
                if (j == str2.length()) {
                    return i - j + 1;
                }

            } else {
                i = i - j;
                j = 0;
                System.out.println(i + " Not Matched = " + str1.charAt(i));
                
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        String str1 = "mississippi";
        String str2 = "issip";

        int ans = getfirstoccurindex(str1, str2);

        System.out.println(ans);
    }

}
