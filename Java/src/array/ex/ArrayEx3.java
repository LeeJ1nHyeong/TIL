package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        // 5개 정수 입력 받아서 배열에 저장 후 역순으로 출력하기
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}
