package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();  // data에 객체를 생성하면 된다.

        System.out.println("bigData.count = " + bigData.count);  // bigData.count = 0
        System.out.println("bigData.data = " + bigData.data);  // bigData.data = null

        System.out.println("bigData.data.value = " + bigData.data.value);  // bigData.data.value = 0
    }
}
