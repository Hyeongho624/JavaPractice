public class Solution40 {
    public static int solution(int n) {
        String baseThree = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(baseThree);
        String reverseThree = sb.reverse().toString();
        int answer = Integer.parseInt(reverseThree, 3);
        return answer;
    }

    public static void main(String[] args) {
        int input = 45;
        int output = solution(45);
        System.out.println("Input; " + input);
        System.out.println("Output: " + output);
    }
}
