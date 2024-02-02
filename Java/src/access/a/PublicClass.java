package access.a;

// public 클래스는 한 파일 내에서 하나만 생성 가능
// public 클래스의 이름은 파일명과 같아야 함
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

// default 클래스는 한 파일 내에서 무한정 생성 가능
class DefaultClass1 {

}

class DefaultClass2 {

}