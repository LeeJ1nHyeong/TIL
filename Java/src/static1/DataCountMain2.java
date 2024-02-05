package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        // count 전용 클래스를 따로 생성하여 생성된 인스턴스 개수를 셀 수 있게 됨
        // but 별도의 클래스를 사용하면서 생성자의 매개변수 추가 및 생성자가 복잡해지는 문제 발생
        // 공용 변수가 필요함 -> static 변수
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);  // 1
        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);  // 2
        Data2 data3 = new Data2("C", counter);
        System.out.println("C count=" + counter.count);  // 3
    }
}
