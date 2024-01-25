package ref;

public class InitMain {
    public static void main(String[] args) {
        // 인스턴스의 멤버 변수는 자동으로 초기화됨 (int = 0, boolean = false, 참조형 = null)
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}
