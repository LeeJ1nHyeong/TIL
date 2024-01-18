package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        // 사용자 입력 - Scanner
        Scanner scanner = new Scanner(System.in);

        // 문자열
        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine();  // 입력을 String으로 가져온다.(Enter를 입력할 때까지의 문자)
        System.out.println("입력한 문자열: " + str);

        // 정수
        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt();  // 입력을 int형으로 가져오기
        System.out.println("입력한 정수: " + intValue);

        // 실수
        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble();  // 입력을 double형으로 가져오기
        System.out.println("입력한 실수: " + doubleValue);
    }
}
