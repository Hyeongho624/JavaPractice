import java.util.Arrays;

public class Solution56 {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for (int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }
        return answer;
    }

    public static void main(String[] args) {
        int max = 3;
        int apple = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println("최대 이익: " + solution(max, apple, score));
    }
}
