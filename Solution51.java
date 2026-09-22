import java.util.Arrays;

public class Solution51 {
    public static String solution(int[] food) {
        String answer = "";
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer += i;
            }
        }
        String left = answer;
        answer += "0";
        for (int i = left.length() - 1; i >= 0; i--) {
            answer += left.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};
        String result= solution(food);
        System.out.println("Food: " + Arrays.toString(food));
        System.out.println("Result: " + result);
    }
}
