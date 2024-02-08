package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        // 역할과 구현 분리
        Driver driver = new Driver();

        // 차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경(k3 -> model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // 차량 변경(model3 -> newCar)
        // 차량만 추가했을 뿐(Open) Driver의 코드는 건드리지 않았다.(Closed) -> OCP 원칙
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
