package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        // 객체 지향 계좌 실행
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("잔고: " + account.balance);
    }
}
