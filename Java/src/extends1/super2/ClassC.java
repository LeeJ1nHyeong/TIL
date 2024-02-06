package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20);
        // super();  생성자가 정의되어 있다면 기본 생성자가 만들어지지 않음
        System.out.println("ClassC 생성자");
    }
}
