package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        // 입금(deposit), 출금(withdraw) 메서드를 생성하여 리팩토링하기
        int balance = 10000;

        // 입금 1000
        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        // 출금 2000
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        System.out.println("최종 잔액: " + balance + "원");
    }
}
