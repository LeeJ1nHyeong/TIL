package scope;

public class Scope1 {
    public static void main(String[] args) {
        // 지역 변수 -> 변수가 선언된 코드 블록 내에서만 생존(사용) 가능
        int m = 10;  // m 생존 시작
        if (true) {
            int x = 20;  // x 생존 시작
            System.out.println("if m = " + m);  // 블록 내부에서는 블록 외부의 변수에 접근 가능
            System.out.println("if x = " + x);
        }  // x 생존 종료

        // System.out.println("main x = " + x);  오류 발생 -> x에 접근 불가
        System.out.println("main m = " + m);
    }  // m 생존 종료
}
