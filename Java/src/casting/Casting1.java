package casting;

public class Casting1 {
    public static void main(String[] args) {
        // 자동 형변환(묵시적 형변환) : 작은 범위에서 큰 범위로 변수를 대입할 때 Java 내에서 자동으로 형변환을 해주고 대입함
        // 작은 범위 -> 큰 범위로 대입 (int -> long -> double)
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;  // int -> long
        System.out.println("longValue = " + longValue);  // longValue = 10

        doubleValue = intValue;  // int -> double
        System.out.println("doubleValue1 = " + doubleValue);  // doubleValue1 = 10.0

        doubleValue = 20L;  // long -> double
        System.out.println("doubleValue2 = " + doubleValue);  // doubleValue2 = 20.0
    }
}
