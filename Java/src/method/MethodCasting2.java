package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number);  // 자동 형변환으로 인해 int형이 double형으로 변환된 상태로 메서드 호출
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);  // 숫자: 100.0
    }
}
