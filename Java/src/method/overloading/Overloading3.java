package method.overloading;

public class Overloading3 {
    public static void main(String[] args) {
        // 매개변수 타입이 다른 오버로딩
        System.out.println("1: " + add(1, 2));  // 1: 3
        System.out.println("2: " + add(1.2, 1.5));  // 2: 2.7
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
