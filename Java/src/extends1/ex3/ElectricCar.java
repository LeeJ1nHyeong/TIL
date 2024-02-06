package extends1.ex3;

// Car의 자식 클래스 ElectricCar
public class ElectricCar extends Car {
    public void charge() {
        System.out.println("충전합니다.");
    }

    // 상속 관계이기 때문에 openDoor()을 추가할 필요가 없다.
}
