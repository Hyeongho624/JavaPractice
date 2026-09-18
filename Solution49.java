import java.util.*;

public class Solution49 {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];

                if (!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }

        Collections.sort(list);
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 1};
        int[] result = solution(arr);
        System.out.println(Arrays.toString(result));
    }
}