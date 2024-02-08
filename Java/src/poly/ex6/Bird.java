package poly.ex6;

public class Bird extends AbstractAnimal implements Fly {  // 상속과 구현 동시 가능 (상속은 하나만 가능, 구현은 여러 개 가능)
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
