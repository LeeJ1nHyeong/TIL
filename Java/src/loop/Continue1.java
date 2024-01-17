package loop;

public class Continue1 {
    public static void main(String[] args) {
        // continue : 반복문 내에서 특정 조건일 때 이 후의 코드를 무시하고 싶을 때 사용
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;  // 특정 조건에서 건너뛰고 싶을 때 continue로 이 후 코드를 무시하고 다시 조건식으로 이동
            }
            System.out.println(i);
            i++;
        }
    }
}
