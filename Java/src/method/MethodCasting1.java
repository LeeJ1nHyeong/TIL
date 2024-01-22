package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(double);  int형에 double형을 대입하기 때문에 컴파일 오류 발생
        printNumber((int) number);  // 명시적 형변환을 사용하여 int형으로 변환 후 메서드 호출
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);  // 숫자: 1
    }
}
