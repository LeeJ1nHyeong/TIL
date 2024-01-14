package operator;

public class Logical1 {
    public static void main(String[] args) {
        // && : AND 연산 - 둘 다 true이면 true, 하나라도 false라면 false
        System.out.println(true && true);  // true
        System.out.println(true && false);  // false
        System.out.println(false && false);  // false

        // || : OR 연산 - 하나라도 true라면 true, 그렇지 않다면 false
        System.out.println(true || true);  // true
        System.out.println(true || false);  // true
        System.out.println(false || false);  // false

        // ! : 반대
        System.out.println(!true);  // false
        System.out.println(!false);  // true

        // 변수 활용
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);  // false
        System.out.println(a || b);  // true
        System.out.println(!a);  // false
        System.out.println(!b);  // true

    }
}
