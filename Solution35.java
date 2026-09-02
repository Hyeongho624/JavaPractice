public class Solution35 {
    public static long solution(int price, int money, int count) {
        long cost = 0;
        long answer = -1;

        for (int i = 1; i <= count; i++) {
            cost += (long)price * i;
        }

        if (money > cost) {
            answer = 0;
        } else {
            answer = cost - money;
        }

        return answer;
    }

    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println("price: " + price + ", money: " + money + ", count: " + count);
        System.out.println("answer: " + solution(price, money, count));
    }
}
