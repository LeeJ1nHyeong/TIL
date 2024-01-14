package operator;

public class Operator3 {
    public static void main(String[] args) {
        // 연산자 우선순위
        // 일반 수학 계산과 마찬가지로 괄호 안 수식, 곱셈/나눗셈, 덧셈/뺄셈 순으로 계산
        int sum1 = 1 + 2 * 3;
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);  // sum1 = 7
        System.out.println("sum2 = " + sum2);  // sum2 = 9
    }
}
