package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        // 배열과 for문을 활용한 중복 제거
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();  // 오리 추가
        Animal[] animals = {dog, cat, cow, duck};

        // 변하지 않는 부분
        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
