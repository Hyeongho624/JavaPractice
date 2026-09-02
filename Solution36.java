public class Solution36 {
    public static boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch < '0' || ch >'9') {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "a234";
        System.out.println("문자열: " + str);
        System.out.println("문자열 안에 숫자만 포함 여부: " + solution(str));
    }
}
