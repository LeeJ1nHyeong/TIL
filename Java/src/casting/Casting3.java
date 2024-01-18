package casting;

public class Casting3 {
    public static void main(String[] args) {
        // 형변환 시 작은 숫자가 표현할 수 있는 범위를 넘어선다면? (오버플로우)
        long maxIntValue = 2147483647;  // int 최고값
        long maxIntOver = 2147483648L;  // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue;  // 형변환
        System.out.println("maxIntValue casting=" + intValue);  // maxIntValue casting=2147483647

        intValue = (int) maxIntOver;  // 형변환
        System.out.println("maxIntOver casting=" + intValue);  // maxIntValue casting=-2147483648
                                                               // 오버플로우 발생(int 범위의 최솟값부터 다시 시작)

    }
}
