package cond;

public class If2 {
    public static void main(String[] args) {
        // else문
        int age = 20;

        if (age >= 18) {
            System.out.println("성인입니다");  // 조건이 참이면 여기서 실행
        } else {
            System.out.println("미성년자입니다");  // 조건이 참이 아니면 여기서 실행
        }
    }
}
