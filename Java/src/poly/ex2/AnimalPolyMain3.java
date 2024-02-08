package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        // 배열과 메서드 모두 활용한 중복 제거
        Animal[] animals = {new Dog(), new Cat(), new Cow(), new Duck()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    // 동물이 추가 되어도 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
