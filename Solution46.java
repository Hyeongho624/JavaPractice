public class Solution46 {
    public static int solution(String s) {
        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");

        int result = Integer.parseInt(s);
        return result;
    }

    public static void main(String[] args) {
        String str = "2three45sixseven";
        int num = solution(str);
        System.out.println("String: " + str);
        System.out.println("Integer: " + num);
    }
}
