package loop;

public class Break3 {
    public static void main(String[] args) {
        // Break2 코드 개선
        int sum = 0;

        for (int i = 1; ; i++ ) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;  // if 조건식이 참이라면 for문 강제 종료
            }
        }
    }
}
