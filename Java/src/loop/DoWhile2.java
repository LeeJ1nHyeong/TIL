package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        // do-while문 : 조건 상관 없이 do에서의 코드를 한 번 실행 후 while문 진행
        // 무조건 한 번 실행을 실행시키고 싶을 때 사용
        int i = 10;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
    }
}
