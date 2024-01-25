package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        // 사용자 입력을 받는 상품 주문 시스템
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");

        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            System.out.print("수량: ");
            int quantity = sc.nextInt();

            orders[i] = createOrder(productName, price, quantity);

            sc.nextLine();
        }

        printOrders(orders);

        int total = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + total);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (int i = 0; i < orders.length; i++) {
            ProductOrder order = orders[i];
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (int i = 0; i < orders.length; i++) {
            ProductOrder order = orders[i];
            total += order.price * order.quantity;
        }
        return total;
    }
}
