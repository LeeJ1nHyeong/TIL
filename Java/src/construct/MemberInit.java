package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {  // this 사용
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
