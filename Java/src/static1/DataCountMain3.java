package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        // 공용 변수를 사용하기 때문에 {클래스명}.{변수}로 접근
        // static 변수는 힙 영역이 아닌 메서드 영역에서 관리 (static 영역)
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        // static 변수 접근
        // 인스턴스를 통한 접근 - 권장하지 않음(인스턴스 변수인지 static 변수인지 구분이 어려움)
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);  // 4

        // 클래스를 통한 접근
        System.out.println(Data3.count);  // 4
    }
}
