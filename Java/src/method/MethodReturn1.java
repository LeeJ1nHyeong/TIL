package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        // 메서드의 반환 타입
        boolean result = odd(2);
        System.out.println(result);
    }

    // 조건문 미실행 시 return이 없어 컴파일 오류 발생 (java: missing return statement)
    /*  java: missing return statement
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        }
    }
    */
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
