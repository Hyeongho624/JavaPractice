public class Solution43 {
    public static int solution(String t, String p) {
        int count = 0;
        long strToNum2 = Long.parseLong(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String str = t.substring(i, i + p.length());
            long strToNum1 = Long.parseLong(str);
            if (strToNum1 <= strToNum2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str1 = "3141592";
        String str2 = "271";
        System.out.println(solution(str1, str2)); // 출력 결과: 2
    }
}