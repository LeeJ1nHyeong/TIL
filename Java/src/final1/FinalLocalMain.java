package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10;  // 최초 1회만 할당 가능
        // data1 = 20;  이 후 변경 불가

        final int data2 = 10;  // 선언 및 초기화
        // data2 = 20;  이 후 변경 불가

        method(10);
    }

    // final 매개변수
    static void method(final int parameter) {
        // parameter = 20;  매개변수 값 변경 불가
    }
}
