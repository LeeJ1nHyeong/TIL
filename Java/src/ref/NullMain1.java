package ref;

public class NullMain1 {
    public static void main(String[] args) {
        // null
        // 객체 등의 참조형의 경우 null로 초기화 가능
        Data data = null;
        System.out.println("1. data = " + data);  // 1. data = null
        data = new Data();
        System.out.println("2. data = " + data);  // 2. data = (참조값)
        data = null;
        System.out.println("3. data = " + data);  // 3. data = null
    }
}
