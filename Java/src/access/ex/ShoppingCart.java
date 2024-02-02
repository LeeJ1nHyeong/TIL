package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    // TODO 나머지 코드 완성해라
    public void addItem(Item item) {
        if (itemCount < 10) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
