package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        // 다음 코드가 작동되도록 Item, ShoppingCart 클래스 코드 완성하기
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
