package method;

public class MethodValue3 {
    public static void main(String[] args) {
        // 메서드를 활용하여 값 변경하기
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1);  // changeNumber 호출 전, num1: 5
        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1: " + num1);  // changeNumber 호출 후, num1: 10
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
