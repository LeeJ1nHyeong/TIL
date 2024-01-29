package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();  // 다른 패키지 내 같은 이름의 클래스가 있는 경우 한 개만 import 할 수 있음
    }
}
