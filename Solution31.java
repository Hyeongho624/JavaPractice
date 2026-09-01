public class Solution31 {
    public static String solution(int n) {
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (i % 2 == 0) ? '수' : '박';
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;

        System.out.println("n이 3: " + solution(n1));
        System.out.println("n이 4: " + solution(n2));
    }
}