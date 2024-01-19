package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        // 향상된 for문 (for-each문)
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        System.out.println();

        // 향상된 for문 (for-each문)  단축키: iter
        for (int number : numbers) {
            System.out.println(number);
        }

        // 증가하는 index가 필요한 경우에는 for-each문 사용 불가
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }
    }
}
