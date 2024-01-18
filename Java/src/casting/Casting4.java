package casting;

public class Casting4 {
    public static void main(String[] args) {
        // 계산과 형변환
        // 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
        // 다른 타입의 계산은 큰 범위로 자동 형변환된다.
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1);  // div1 = 1

        double div2 = 3 / 2;  // int / int -> int값인 1이 나오고 이 1을 double로 형변환하여 1.0
        System.out.println("div2 = " + div2);  // div2 = 1.0

        double div3 = 3.0 / 2;  // double / int -> double값인 1.5가 나옴
        System.out.println("div3 = " + div3);  // div3 = 1.5

        double div4 = (double) 3 / 2;  // int / int이지만 3을 double로 명시적 형변환 시켜 double / int 로 계산
        System.out.println("div4 = " + div4);  // div4 = 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);  // result = 1.5
    }
}
