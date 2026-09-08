public class Solution41 {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                idx = 0;
                answer.append(c);
            } else {
                if (idx % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                idx++;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "try hello world";
        String n = solution(s);
        System.out.println("String Input: " + s);
        System.out.println("Solution: " + n);
    }
}
