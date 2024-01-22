package method.overloading;

public class Overloading1 {
    public static void main(String[] args) {
        // 매개변수의 개수가 다른 오버로딩
        System.out.println("1: " + add(1, 2));  // 1: 3
        System.out.println("2: " + add(1, 2, 3));  // 2: 6
    }

    // 첫 번째 add 메서드: 정수 2개를 받아서 합을 반환한다.
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    // 두 번째 add 메서드: 정수 3개를 받아서 합을 반환한다.
    // 첫 번째 메서드와 이름은 같지만, 매개변수 목록이 다르다.
    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
