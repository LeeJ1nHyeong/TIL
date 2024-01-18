package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        // 스코프를 활용하여 코드 수정
        int m = 10;
        if (m > 0) {
            int temp = m * 2;  // temp를 if 블록 내에서 선언하여 메모리 효율성 증가
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
