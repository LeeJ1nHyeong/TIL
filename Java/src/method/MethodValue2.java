package method;

public class MethodValue2 {
    public static void main(String[] args) {
        // MethodValue1에서 호출자 변수 이름과 매개변수 이름을 같게 한다면?
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);  // 1. changeNumber 호출 전, number: 5
        changeNumber(number);  // 2. changeNumber 호출 전, number: 5
                             // 3. changeNumber 호출 전, number: 10
        System.out.println("4. changeNumber 호출 후, number: " + number);  // 4. changeNumber 호출 후, number: 5
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 호출 전, number: " + number);
        number = number * 2;
        System.out.println("3. changeNumber 호출 전, number: " + number);
    }
}
