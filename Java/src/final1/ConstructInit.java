package final1;

// 클래스 내에서의 final 멤버 변수
public class ConstructInit {
    final int value;

    public ConstructInit(int value) {  // 멤버 변수의 경우, 생성자를 통해서 초기 값 할당
        this.value = value;
    }
}
