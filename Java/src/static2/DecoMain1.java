package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        // 멤버 변수 없이 메서드만 있지만 이 메서드를 사용하기 위해 인스턴스를 생성해야함
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
