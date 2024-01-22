package method;

public class Method1 {
    public static void main(String[] args) {
        // 아래 두 개의 계산 코드는 변수 이름만 다를 뿐 같은 형태의 코드이다.
        // 계산1
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + " 연산 수행");
        int sum1 = a + b;
        System.out.println("결과1 출력: " + sum1);

        // 계산2
        int x = 10;
        int y = 20;
        System.out.println(x + "+" + y + " 연산 수행");
        int sum2 = x + y;
        System.out.println("결과2 출력: " + sum2);
    }
}
