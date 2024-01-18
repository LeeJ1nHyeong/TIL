package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        // 입력한 숫자의 합계와 평균
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            count++;
        }

/*      이 방법도 가능
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }
*/

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평슌: " + average);
    }
}
