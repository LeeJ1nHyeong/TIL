package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자
        int a = 1;
        int b = 0;

        b = ++a;  // a의 값을 먼저 증가시킨 후 b에 대입
        System.out.println("a = " + a + ", b = " + b);  // a = 2, b = 2

        // 후위 증감 연산자
        a = 1;
        b = 0;

        b = a++;  // a의 현재 값을 b에 먼저 대입한 후 a의 값 증가
        System.out.println("a = " + a + ", b = " + b);  // a = 2, b = 1

        // 다른 연산자 없이 증감연산자만 있는 경우에는 그 값을 1 증가/감소만 시키고 끝남
        a++;
        System.out.println("a = " + a);  // a = 3
        ++a;
        System.out.println("a = " + a);  // a = 4
    }
}
