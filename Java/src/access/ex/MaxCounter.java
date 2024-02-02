package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {  // 다른 패키지에서도 호출해야하므로 public으로 설정
        this.count = 0;
        this.max = max;
    }

    public void increment() {
        if (count < max) {
            count += 1;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }
}
