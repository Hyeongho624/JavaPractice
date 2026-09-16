import java.util.Arrays;

public class Solution47 {
    public static String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].charAt(n) > strings[j].charAt(n)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                } else if (strings[i].charAt(n) == strings[j].charAt(n)) {
                    if (strings[i].compareTo(strings[j]) > 0) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
                }
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        String[] str = {"sun", "bed", "car"};
        System.out.println("Strings: " + Arrays.toString(str));
        String[] result = solution(str, 1);
        System.out.println("result: " + Arrays.toString(result));
    }
}
