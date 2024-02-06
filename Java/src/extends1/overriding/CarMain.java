package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        // 메서드 오버라이딩
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();  // 전기차를 빠르게 이동합니다.

        GasCar gasCar = new GasCar();
        gasCar.move();  // 차를 이동합니다.
    }
}
