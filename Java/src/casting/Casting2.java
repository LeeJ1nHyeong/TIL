package casting;

public class Casting2 {
    public static void main(String[] args) {
        // 명시적 형변환 : 개발자가 강제로 형변환시킴
        // 큰 범위 -> 작은 범위로 대입 (double -> int)
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue;  컴파일 에러 발생
        intValue = (int) doubleValue;  // 명시적 형변환 -> int형식으로 강제 변환
        System.out.println(intValue);  // 1 -> int에 맞는 형식으로 출력됨(소수점 내림으로 출력)

        System.out.println((int) 10.5);  // 10
    }
}
