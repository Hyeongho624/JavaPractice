import java.util.Arrays;

public class Solution53 {
    public static int[] solution(int k, int[] score) {
        int[] tempt = new int[k];
        int[] answer = new int[score.length];
        int count = 0;

        for (int i = 0; i < score.length; i++) {
            if (count < k) {
                tempt[count] = score[i];
                count++;
            } else {
                int minIndex = 0;
                for (int j = 1; j < k; j++) {
                    if (tempt[j] < tempt[minIndex]) {
                        minIndex = j;
                    }
                }
                if (score[i] > tempt[minIndex]) {
                    tempt[minIndex] = score[i];
                }
            }
            int min = tempt[0];
            for (int j = 1; j < count; j++) {
                if (tempt[j] < min) {
                    min = tempt[j];
                }
            }
            answer[i] = min;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println("score: " + Arrays.toString(score));
        System.out.println("result: " + Arrays.toString(solution(4, score)));
    }
}
