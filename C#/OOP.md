## C#에서의 객체지향 프로그래밍

### 캡슐화

- 접근 제어자를 활용하여 외부로부터의 데이터 접근을 제한함으로써 데이터 변경 등의 위험 방지 가능
- private, public, protected, internal(default) 등
    - **private** : 해당 클래스 내에서만 접근 가능, 외부 및 자식 클래스에서 접근 불가
    - **public** : 어디서든지 접근 가능
    - **protected** : 클래스 및 클래스로부터 상속된 자식 클래스에서 접근 가능
    - **internal** : 같은 어셈블리 내에서 접근 가능

### 상속

- 클래스 명 뒤에 콜론( : ) 추가 후 부모 클래스 명을 작성
- **base()** → 부모 생성자 (Python, Java의 super()라고 생각하면 됨)

```csharp
public class ChildClass : ParentClass {
	
    public Childclass() : base() {
	
    }
}
```

### 다형성

- 오버라이딩 → 부모 클래스 메서드에 virtual 키워드를 사용 후 자식 클래스에서 override 키워드를 사용

```csharp
public class ParentClass {
	
    public virtual void method() {
        // 부모 클래스 메서드
    }
}


public class ChildClass : ParentClass {
	
    public override void method() {
        // 오버라이딩
    }
}
```
