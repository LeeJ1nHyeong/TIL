package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        // 인터페이스 다중 구현
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
