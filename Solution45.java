public class Solution45 {
    public static String solution(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + n);
                if (chars[i] > 'Z') {
                    chars[i] -= 26;
                }
            }
            else if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] + n);
                if (chars[i] > 'z') {
                    chars[i] -= 26;
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "a B z";
        int n = 4;
        System.out.println("From " + str + ", move " + n);
        System.out.println("result: " + solution(str, n));
    }
}
