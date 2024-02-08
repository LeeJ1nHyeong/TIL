package poly.ex3;

// 추상 클래스
public abstract class AbstractAnimal {  // abstract 키워드 사용 -> 직접 인스턴스 생성 불가
    public abstract void sound();  // 추상 메서드 - 메서드 바디가 존재하지 않음

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
