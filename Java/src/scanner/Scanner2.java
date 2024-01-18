package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        // 두 수를 입력받고 그 합 출력하기
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("두 숫자의 합: " + sum);
    }
}
