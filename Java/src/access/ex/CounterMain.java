package access.ex;

public class CounterMain {
    public static void main(String[] args) {
        // 다음 코드가 작동되도록 MaxCounter 클래스 코드 완성하기
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}
