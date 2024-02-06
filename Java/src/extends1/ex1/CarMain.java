package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        // 두 클래스 간에 move()라는 공통 기능(메서드)이 존재한다.
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
