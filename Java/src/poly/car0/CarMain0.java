package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        // 역할과 구현 분리 X
        Driver driver = new Driver();  // 운전자
        K3Car k3Car = new K3Car();  // K3 자동차

        driver.setK3Car(k3Car);
        driver.drive();

        // 추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
