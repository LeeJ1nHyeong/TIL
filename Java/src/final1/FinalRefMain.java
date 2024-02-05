package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        // data = new Data();  해당 변수를 새로운 인스턴스(참조값)로 변경 불가

        // 참조 대상 내의 값은 (final 변수가 아니라면) 변경 가능
        data.value = 10;
        System.out.println(data.value);  // 10
        data.value = 20;
        System.out.println(data.value);  // 20
    }
}
