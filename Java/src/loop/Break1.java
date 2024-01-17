package loop;

public class Break1 {
    public static void main(String[] args) {
        // break : 반복문을 강제 종료시킬 때 사용
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;  // if 조건식이 참이라면 while문 강제 종료
            }

            i++;
        }
    }
}
