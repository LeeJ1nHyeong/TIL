package extends1.overriding;

// Car의 자식 클래스 ElectricCar
public class ElectricCar extends Car {

    // 메서드 오버라이딩
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }

    // 상속 관계이기 때문에 openDoor()을 추가할 필요가 없다.
}
