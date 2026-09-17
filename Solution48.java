import java.util.Arrays;

public class Solution48 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            int[] temp = new int[end - start + 1];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = array[start - 1 + j];
            }
            Arrays.sort(temp);
            answer[i] = temp[k - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,6,3,7,4};
        int[][] com = {{2,5,3}, {4,4,1}, {1,7,3}};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Command: " + Arrays.deepToString(com));
        System.out.println("result: " + Arrays.toString(solution(arr, com)));
    }
}
