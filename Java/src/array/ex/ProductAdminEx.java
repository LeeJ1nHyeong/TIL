package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        // 상품 관리 프로그램 만들기
        Scanner scanner = new Scanner(System.in);
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productsPrices = new int[maxProducts];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int number = scanner.nextInt();
            scanner.nextLine();

            if (number == 1) {
                if (productCount == 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                } else {
                    System.out.print("상품 이름을 입력하세요:");
                    productNames[productCount] = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요:");
                    productsPrices[productCount] = scanner.nextInt();

                    productCount++;
                }

            } else if (number == 2) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productsPrices[i] + "원");
                }
            } else if (number == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
