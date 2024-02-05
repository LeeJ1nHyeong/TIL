package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        // 각각의 인스턴스는 데이터가 서로 공유되지 않음
        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count);  // 1

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data2.count);  // 1

        Data1 data3 = new Data1("C");
        System.out.println("C count=" + data3.count);  // 1
    }
}
