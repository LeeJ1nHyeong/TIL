package oop1.ex;

// 객체 지향 계좌
public class Account {
    int balance;  // 잔액

    void deposit(int amount) {  // 입금 메서드
        balance += amount;
    }

    void withdraw(int amount) {  // 출금 메서드
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }
}
