package ref;

public class NullMain2 {
    public static void main(String[] args) {
        // 지역변수 NullPointerException
        Data data = null;
        data.value = 10;  // == null.value이므로 주소가 없는 곳을 찾는 것이기 때문에 NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
