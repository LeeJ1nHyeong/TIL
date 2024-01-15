package cond;

public class Switch3 {
    public static void main(String[] args) {
        // Switch문에 break가 없다면?
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:  // break문이 없다면 다음 코드도 같이 실행됨
            case 3:
                coupon = 3000;  // 이 코드도 실행되고 break가 됨
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 " + coupon);  // 발급받은 쿠폰 3000

        /* Java 14 이상에서 사용가능한 Switch 문

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

         */

    }
}
