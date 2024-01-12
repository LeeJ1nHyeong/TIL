package variable;

public class Var7 {
    public static void main(String[] args) {
        // 변수 타입
        int a = 100;  // 정수
        double b = 10.5;  // 실수
        boolean c = true;  // 불리언(boolean) -> true, false
        char d = 'A';  // 문자 하나, 작은 따옴표('')를 이용해야 함
        String e = "Hello Java";  // 문자열 -> 문자열을 다루기 위한 특별한 타입, 큰 따옴표("")를 이용해야 함

        // int z = "가나다";  타입이 맞지 않아 컴파일이 되지 않음

        // 리터럴 : 코드에서 개발자가 직접 적은 고정된 값(위의 경우 100, 10.5, true, A, Hello Java가 이에 해당)

        System.out.println(a);  // 100
        System.out.println(b);  // 10.5
        System.out.println(c);  // true
        System.out.println(d);  // A
        System.out.println(e);  // Hello Java
    }
}
