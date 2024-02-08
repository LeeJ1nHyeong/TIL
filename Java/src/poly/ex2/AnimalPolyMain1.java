package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        // 다형성 활용
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();  // 오리 추가

        // 메서드는 오버라이딩 된 것이 우선적으로 호출된다.
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        // 동물 추가 시 상속만 잘 지정해주면 된다.
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) {  // 다형적 참조
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
