import java.util.*;

public class Solution57 {
    public static int[] solution(int[] answers) {
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) {
                scores[0]++;
            }
            if (answers[i] == pattern2[i % pattern2.length]) {
                scores[1]++;
            }
            if (answers[i] == pattern3[i % pattern3.length]) {
                scores[2]++;
            }
        }

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        List<Integer> resultList = new ArrayList<>();
        for (int person = 0; person < 3; person++) {
            if (scores[person] == maxScore) {
                resultList.add(person + 1); // 사람 번호는 1, 2, 3
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] supoja1 = {1, 2, 3, 4, 5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answer = {1, 3, 2, 4, 2};
        System.out.println("1번 수포자: " + Arrays.toString(supoja1));
        System.out.println("2번 수포자: " + Arrays.toString(supoja2));
        System.out.println("3번 수포자: " + Arrays.toString(supoja3));
        System.out.println("answer: " + Arrays.toString(answer));
        System.out.println("result: " + Arrays.toString(solution(answer)));
    }
}
