package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        // 이 코드의 경우 while문이 실행되지 않아 출력없이 종료된다.
        // 조건 상관 없이 처음 i를 출력하고 싶어도 아래의 코드로는 출력이 되지 않는다.
        int i = 10;
        while (i < 3) {
            System.out.println("현재 숫자는:" + i);
            i++;
        }
    }
}
