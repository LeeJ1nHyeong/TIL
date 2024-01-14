package operator;

public class Operator4 {
    public static void main(String[] args) {
        // 복잡한 수식의 경우 가독성을 좋게 하기 위해 괄호 사용을 쓰는 것을 추천
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);  // sum3과 같음 but 가독성이 더 좋아짐
        System.out.println("sum3 = " + sum3);  // sum3 = 13
        System.out.println("sum4 = " + sum4);  // sum4 = 13
    }
}
