package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        // 다형성 미활용
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // 중복 코드 발생 - 타입(클래스)이 다르기 때문에 중복 코드를 제거하는 데에 어려움이 생김
        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
