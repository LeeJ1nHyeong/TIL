package poly.ex.pay1;

public class PayMain1 {
    public static void main(String[] args) {
        // 다음 코드를 변경하지 않고 OCP 원칙을 지키도록 클래스 코드 리팩토링하기
        PayService payService = new PayService();

        // kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        // naver 결제
        String payOption2 = "naver";
        int amount2 = 5000;
        payService.processPay(payOption2, amount2);

        // 잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 5000;
        payService.processPay(payOption3, amount3);

        // test - 새 결제 수단 추가
        String payOption4 = "newPay";
        int amount4 = 5000;
        payService.processPay(payOption4, amount4);
    }
}
