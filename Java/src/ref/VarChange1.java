package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 변경
        a = 20;
        System.out.println("변경  a= 20");
        System.out.println("a = " + a);  // a = 20
        System.out.println("b = " + b);  // b = 10

        // b 변경
        b = 20;
        System.out.println("변경  b= 20");
        System.out.println("a = " + a);  // a = 20
        System.out.println("b = " + b);  // b = 20
    }
}
