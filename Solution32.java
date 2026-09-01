import java.util.Arrays;

public class Solution32 {
    public static int solution(int[] a, int[] b) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] b1 = {-3, -1, 0, 2};
        int result1 = solution(a1, b1);

        int[] a2 = {-1, 0, 1};
        int[] b2 = {1, 0, -1};
        int result2 = solution(a2, b2);

        System.out.println(Arrays.toString(a1) + "와 " +  Arrays.toString(b1) + "의 내적: " + result1);
        System.out.println(Arrays.toString(a2) + "와 " +  Arrays.toString(b2) + "의 내적: " + result2);
    }
}
