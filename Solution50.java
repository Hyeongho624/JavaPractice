import java.util.*;

public class Solution50 {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            answer[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i].equals(arr[j])) {
                    answer[i] = i - j;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "banana";
        int[] result = solution(s);
        System.out.println("String: " + s);
        System.out.println("Result: " + Arrays.toString(result));
    }
}