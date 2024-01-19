package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        // 학생 수 입력 후 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균 계산
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int n = scanner.nextInt();
        int[][] score = new int[n][3];
        int[] sum = new int[n];

        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            score[i][0] = scanner.nextInt();
            sum[i] += score[i][0];

            System.out.print("영어 점수:");
            score[i][1] = scanner.nextInt();
            sum[i] += score[i][1];

            System.out.print("수학 점수:");
            score[i][2] = scanner.nextInt();
            sum[i] += score[i][2];
            scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            double average = (double) sum[i] / 3;
            System.out.println((i + 1) + "번 학생의 총점: " + sum[i] + ", 평균: " + average);
        }
    }
}
