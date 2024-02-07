package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();  // 부모의 메서드 호출 가능
        child.childMethod();  // 자기 자신에게 있는 메서드 호출 가능

        // 부모 변수가 자식 인스턴스 참조
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod();  자식 인스턴스의 메서드는 호출 불가

        // 자식 변수는 부모 인스턴스 참조 불가
        // Child child1 = new Parent();  오류
    }
}
