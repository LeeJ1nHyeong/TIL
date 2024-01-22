package method;

public class Method2 {
    public static void main(String[] args) {
        // 매개변수가 없거나 반환 타입이 없는 경우
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    // 반환 타입이 없고 매개변수가 없는 메서드
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;  // void의 경우 return 생략 가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
