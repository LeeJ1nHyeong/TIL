package static2.ex;

public class CarMain {
    public static void main(String[] args) {
        // 다음 코드를 참고하여 Car 클래스 코드 작성하기
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        Car.showTotalCars();  // 구매 차량 수를 출력하는 static 메서드
    }
}
