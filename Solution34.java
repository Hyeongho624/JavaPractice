import java.util.Arrays;

public class Solution34 {
    public static String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return new StringBuilder(new String(charArr)).reverse().toString();
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";
        String a = solution(s);
        System.out.println("문자열: " + s);
        System.out.println("내림차순 배치: " + a);
    }
}