public class Best_Sightseeing_Pair_1014 {
    

    public static int maxScoreSightseeingPair(int[] values) {
        int max = 0;
        int maxScore = 0;
        for (int i = 0; i < values.length; i++) {
            maxScore = Math.max(maxScore, values[i] + max - i);
            max = Math.max(max, values[i] + i);
        }
        return maxScore;
    }


    public static void main(String[] args) {
        int[] arr = {8, 1, 5, 2, 6};
        int ans = maxScoreSightseeingPair(arr);
        System.out.println(ans);
    }
}
