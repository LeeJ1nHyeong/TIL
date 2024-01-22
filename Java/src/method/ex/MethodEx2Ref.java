package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        // 메서드를 활용하여 리팩토링하기
        printMessage("Hello, world!", 3);
        printMessage("Hello, world!", 5);
        printMessage("Hello, world!", 7);
    }

    public static void printMessage(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
