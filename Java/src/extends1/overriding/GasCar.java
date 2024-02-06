package extends1.overriding;

// Car의 자식 클래스 GasCar
public class GasCar extends Car {
    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }

    // 상속 관계이기 때문에 openDoor()을 추가할 필요가 없다.
}
