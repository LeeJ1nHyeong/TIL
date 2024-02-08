package poly.diamond;

public class Child implements InterfaceA, InterfaceB {  // 다중 구현의 경우 여러 개의 인터페이스 상속 가능
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
