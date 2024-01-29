package construct;

// 생성자 활용
public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 추가
    MemberConstruct(String name, int age) {
        this(name, age, 50);  // this()를 활용하여 코드 중복 제거
    }
    // 생성자 - 클래스 이름과 똑같이 작성해야함
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
