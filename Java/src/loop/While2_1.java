package loop;

public class While2_1 {
    public static void main(String[] args) {
        // 1부터 하나씩 증가하는 수를 3번 더해라 (while문 없이 풀면?)
        int sum = 0;

        sum += 1;
        System.out.println("i=" + 1 + " sum=" + sum);  // i=1 sum=1
        sum += 2;
        System.out.println("i=" + 2 + " sum=" + sum);  // i=2 sum=3
        sum += 3;
        System.out.println("i=" + 3 + " sum=" + sum);  // i=3 sum=6
    }
}
