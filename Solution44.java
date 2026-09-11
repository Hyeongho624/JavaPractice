import java.util.Arrays;

public class Solution44 {
    public static int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for (int[] card : sizes) {
            int w = Math.max(card[0], card[1]);
            int h = Math.min(card[0], card[1]);

            if (w > maxW) maxW = w;
            if (h > maxH) maxH = h;
        }
        return maxW * maxH;
    }

    public static void main(String[] args) {
        int[][] arr = {{60,50},{30,70},{60,30},{80,40}};
        int size = solution(arr);
        System.out.println("명함의 크기: " + Arrays.deepToString(arr));
        System.out.println("지갑의 크기: " + size);
    }
}