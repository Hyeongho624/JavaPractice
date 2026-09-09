import java.util.Arrays;

public class Solution42 {
    public static int solution(int[] number) {
            int count = 0;
            for (int i = 0; i < number.length; i++) {
                for (int j = i + 1; j < number.length; j++) {
                    for (int k = j + 1; k < number.length; k++) {
                        int sum = number[i] + number[j] + number[k];
                        if (sum == 0) {
                            count += 1;
                        }
                    }
                }
            }
            return count;
    }

    public static void main(String[] args) {
        int[] arr = {-3, -2, -1, 0, 1, 2, 3};
        int count = solution(arr);
        System.out.println("number: " + Arrays.toString(arr));
        System.out.println("result: " + count);
    }
}
