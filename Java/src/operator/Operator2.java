package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열 + 문자열
        String result1 = "hello " + "world";
        System.out.println(result1);  // hello world

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);  // string1string2

        // 문자열 + 숫자열
        String result3 = "a + b = " + 10;
        System.out.println(result3);  // a + b = 10, 이 때 10이 문자열로 변환하여 취급된다.

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);  // a + b = 20
    }
}
