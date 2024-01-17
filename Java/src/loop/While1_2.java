package loop;

public class While1_2 {
    public static void main(String[] args) {
        /* while문의 형태

        while (조건식) {
            코드
        }

         */

        int count = 0;

        while (count < 3) {  // 조건식이 false가 될 때 까지 반복 실행
            count++;
            System.out.println("현재 숫자는: " + count);
        }

    }
}
