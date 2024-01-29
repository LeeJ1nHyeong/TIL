package pack;


public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();  // 같은 위치에 있는 클래스
        pack.a.User user = new pack.a.User();  // 다른 위치에 있는 클래스 - 경로를 같이 써줘야함
    }
}
