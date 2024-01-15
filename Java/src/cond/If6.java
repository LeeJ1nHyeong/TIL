package cond;

public class If6 {
    public static void main(String[] args) {
        // If5에서 else if 사용 시
        int price = 10000;
        int age = 10;
        int discount = 0;

        // 첫번째 조건에서 실행 되면서 이후의 else if문은 실행되지 않음
        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");  // 실행
        } else if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");  // 실행X
        }

        System.out.println("총 할인 금액: " + discount + "원");  // 총 할인 금액: 1000원

        // 실행 코드가 1줄일 경우 코드블록({}) 생략 가능
        // 가독성을 위해 1줄이여도 코드블록을 사용하는 것을 추천
        if (true) System.out.println("if문에서 실행됨");  // 실행
    }
}
