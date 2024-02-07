package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 자식의 기능은 호출 불가
        // poly.childMethod();

        // 다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly;  // poly를 강제로 Child 타입으로 적용하여 child에 저장
        child.childMethod();  // 다운캐스팅으로 인해 호출이 가능해짐
    }
}
