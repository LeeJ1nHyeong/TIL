package cond;

public class If4 {
    public static void main(String[] args) {
        // else if - 조건이 여러 개일 때
        int age = 14;

        if (age <= 7) {  // 7세 이하일 경우
            System.out.println("미취학");
        } else if (age <= 13) {  // 8 ~ 13세
            System.out.println("초등학생");
        } else if (age <= 16) {  // 14 ~ 16세
            System.out.println("중학생");
        } else if (age <= 19) {  // 17 ~ 19세
            System.out.println("고등학생");
        } else {  // 20세 이상
            System.out.println("성인");
        }

        // 이 때 else는 생략 가능
    }
}
