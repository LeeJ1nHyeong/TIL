package cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
        // 문제 조건 : 삼항 연산자 사용
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
