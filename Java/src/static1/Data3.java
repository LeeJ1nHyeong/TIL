package static1;

public class Data3 {
    public String name;
    public static int count;  // 클래스 내에서 공용으로 사용할 수 있는 static 변수

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
