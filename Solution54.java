public class Solution54 {
    public static String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += months[i];
        }
        totalDays += (b - 1);

        return day[totalDays % 7];
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        System.out.print("2016년 " + a + "월 " + b + "일은 무슨 요일? ");
        System.out.print(solution(a, b));
    }
}
