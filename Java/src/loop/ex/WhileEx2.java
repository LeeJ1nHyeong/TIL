package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        // 문제 조건 : while문 사용
        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
    }
}
