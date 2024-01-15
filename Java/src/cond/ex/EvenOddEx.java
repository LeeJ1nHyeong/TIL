package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        // 문제 조건 : 삼항 연산자 이용
        int x = 2;
        String result = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + ", " + result);
    }
}
