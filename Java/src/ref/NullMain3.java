package ref;

public class NullMain3 {
    public static void main(String[] args) {
        // 멤버 변수의 값이 null일 경우에는 NullPointerException이 발생하지 않는다.
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);  // bigData.count = 0
        System.out.println("bigData.data = " + bigData.data);  // bigData.data = null

        // NullPointerException
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
