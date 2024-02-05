package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    // static은 static만 접근 가능
    public static void staticCall() {  // static 메서드
        // 인스턴스를 생성해야 접근 가능
        // instanceValue++;  인스턴스 변수 접근 불가
        // instanceMethod();  인스턴스 메서드 접근 불가

        staticValue++;  // static 변수 접근 가능
        staticMethod();  // static 메서드 접근 가능
    }

    public void instanceCall() {  // 인스턴스 메서드
        instanceValue++;  // 인스턴스 변수 접근 가능
        instanceMethod();  // 인스턴스 메서드 접근 가능

        staticValue++;  // static 변수 접근 가능
        staticMethod();  // static 메서드 접근 가능
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }

}
