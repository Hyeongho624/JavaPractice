public class Solution33 {
    public static int solution(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (Math.sqrt(i) % 1 == 0)
                result -= i;
            else
                result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 13;
        int b = 17;
        int result = solution(a, b);
        System.out.println("left: " + a + ", right: " + b + ", result = " + result);
    }
}
