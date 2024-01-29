package pack;

import pack.a.*;  // 여러 개의 클래스가 있는 경우 *을 사용하면 해당 패키지 내의 모든 클래스 사용 가능

public class PackageMain2 {
    public static void main(String[] args) {
        // import 사용
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
    }
}
