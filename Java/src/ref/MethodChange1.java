package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        // 기본형 변수의 메서드 호출
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);  // a = 10
        changePrimitive(a);
        // 메서드에 값을 복사해서 전달할 뿐 a의 값은 변경되지 않는다.
        System.out.println("메서드 호출 후: a = " + a);  // a = 10
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
