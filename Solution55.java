import java.util.Arrays;

public class Solution55 {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        for (String word : goal) {
            if (idx1 < cards1.length && cards1[idx1].equals(word)) {
                idx1++;
            } else if (idx2 < cards2.length && cards2[idx2].equals(word)) {
                idx2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        String[] cardOne = {"i", "drink", "water"};
        String[] cardTwo = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println("cards1: " + Arrays.toString(cardOne));
        System.out.println("cards2: " + Arrays.toString(cardTwo));
        System.out.println("goal: " + Arrays.toString(goal));
        System.out.println("result: " + solution(cardOne, cardTwo, goal));
    }
}
