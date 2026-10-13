import java.util.Arrays;

public class Solution59 {
    public static int solution(int n, int m, int[] section) {
        int count = 0;
        int farthestPainted = 0;
        for (int sec : section) {
            if (sec > farthestPainted) {
                count++;
                farthestPainted = sec + m - 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] area = {2, 3, 6};
        int roller = 4;
        int wall = 8;
        System.out.println("length of wall: " + wall);
        System.out.println("length of roller: " + roller);
        System.out.println("Area of wall: " + Arrays.toString(area));
        System.out.println("result: " + solution(wall, roller, area));
    }
}
