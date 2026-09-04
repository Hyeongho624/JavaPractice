import java.util.Arrays;

public class Solution39 {
    public static int[] solution(int n, int m) {
        int a = n;
        int b = m;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcdVal = a;
        int lcmVal = (n * m) / gcdVal;

        int[] answer = {gcdVal, lcmVal};
        return answer;
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        System.out.println("n: " + n + ", m: " + m);
        System.out.println("result: " + Arrays.toString(solution(n, m)));
    }
}