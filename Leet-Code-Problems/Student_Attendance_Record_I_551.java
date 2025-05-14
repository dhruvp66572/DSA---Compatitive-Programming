import java.util.HashMap;

public class Student_Attendance_Record_I_551 {

    private static boolean checkeligible(String s) {

        HashMap<Integer,Integer> mp = new HashMap<>();
        Boolean ans = false;
        for (int i = 0; i < s.length(); i++) {
            int key = s.charAt(i);
            int freq = 0;

            if (mp.containsKey(key)) {
                freq = mp.get(key);
            }
            freq++;
            mp.put(key, freq);

            if (mp.get(i) < 2 ) {
                // if () {
                    
                // }
                ans = true;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "PPALLP";

        System.out.println(checkeligible(s));

    }

}
