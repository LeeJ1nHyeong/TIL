package cond;

public class If1 {
    public static void main(String[] args) {
        // if문
        int age = 20;  // 나이

        if (age >= 18) {
            System.out.println("성인입니다");  // 조건이 참이므로 실행
        }

        if (age < 18) {
            System.out.println("미성년자입니다");  // 조건이 거짓이므로 실행 X
        }
    }
}
