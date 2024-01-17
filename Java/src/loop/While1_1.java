package loop;

public class While1_1 {
    public static void main(String[] args) {
        int count = 0;

        // 특정 코드를 반복해서 사용해야 할 경우 이렇게 작성하면 불편함
        count = count + 1;
        System.out.println("현재 숫자는: " + count);  // 현재 숫자는: 1
        count = count + 1;
        System.out.println("현재 숫자는: " + count);  // 현재 숫자는: 2
        count = count + 1;
        System.out.println("현재 숫자는: " + count);  // 현재 숫자는: 3
    }
}
