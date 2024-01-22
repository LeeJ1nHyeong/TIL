package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        // 메서드 return시 그 메서드는 즉시 종료된다.
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return;
        }

        System.out.println(age + "살, 입장하세요");  // age == 10일 경우 출력되지 않는다.
    }
}
