package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        // static 메서드 사용
        String s = "hello java";
        String deco = DecoUtil2.deco(s);  // 인스턴스 생성 없이 클래스로 접근하여 사용 가능

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
