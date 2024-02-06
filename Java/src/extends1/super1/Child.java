package extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this.value = " + this.value);  // 본인의 value값 (this 생략 가능)
        System.out.println("super.value = " + super.value);  // 부모의 value값

        this.hello();  // 본인의 hello() (this 생략 가능)
        super.hello();  // 부모의 hello()
    }
}
