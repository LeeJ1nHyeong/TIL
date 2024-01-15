package cond;

public class If3 {
    public static void main(String[] args) {
        // 조건이 여러 개일 때 if문으로만 사용한다면 불필요한 조건 검사가 많아질 수 있음
        int age = 14;

        if (age <= 7) {  // 7세 이하일 경우
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13) {  // 8 ~ 13세
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) {  // 14 ~ 16세
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) {  // 17 ~ 19세
            System.out.println("고등학생");
        }
        if (age >= 20) {  // 20세 이상
            System.out.println("성인");
        }
    }
}
