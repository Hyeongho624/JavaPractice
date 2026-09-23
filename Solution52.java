public class Solution52 {
    public static int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int received = n / a * b;
            answer += received;
            n = received + n % a;
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;
        int result = solution(a, b, n);
        System.out.println("Empty Bottles: " + n);
        System.out.println("Required Bottles: " + a);
        System.out.println("Received Bottles: " + b);
        System.out.println("result: " + result);
    }
}
