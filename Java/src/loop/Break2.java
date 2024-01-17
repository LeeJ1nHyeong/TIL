package loop;

public class Break2 {
    public static void main(String[] args) {
        // Break1의 문제를 for문으로 풀면?
        int sum = 0;
        int i = 1;

        // 초기식, 조건식, 증감식은 필수가 아닌 선택이라 아래처럼 작성하면 while문처럼 무한으로 돌아감
        for (; ; ) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;  // if 조건식이 참이라면 for문 강제 종료
            }

            i++;
        }
    }
}
