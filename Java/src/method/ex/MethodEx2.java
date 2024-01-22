package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        // 메서드를 활용하여 리팩토링하기
        String message = "Hello, world!";
        for (int i = 0; i < 3; i++) {
            System.out.println(message);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(message);
        }
    }
}
