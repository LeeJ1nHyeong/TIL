# 구조체

## 구조체 (struct)

- 사용자가 직접 생성하여 사용하는 사용자 지정 데이터 형식
- 참조 타입인 클래스와 달리 **값 타입**

```csharp
public struct Struct1 {
	int int1;
	string string1;
	
	public Struct1 (int int1, string string1) {
		this.int1 = int1;
		this.string1 = string1;
	}
	
	public Method1() {
	
	}
}
```

### 제한 사항

- 구조체 생성 시 static이나 const 변수를 제외하고 구조체 선언 내부에서 값 초기화 불가
    
    ```csharp
    public struct Struct1 {
    	int int1;
    	string string1;
    	
    	/* 값 초기화 불가
    	int int1 = 1;
    	string string1 = "abc";
		*/
    }
    ```
    
- 매개변수가 없는 생성자 사용 불가
    
    ```csharp
    public struct Struct1 {
    	public Struct1 (int int1, string string1) {
    		this.int1 = int1;
    		this.string1 = string1;
    	}
    	
    	/* 매개변수 없는 생성자 사용 불가
    	public Struct1 () {
    	
    	}
    	*/
    }
    ```
    
- 모든 변수를 타입에 따라 기본 값으로 자동 설정하는 기본 생성자 제공

## 클래스 vs 구조체

### 클래스

- 참조 타입의 사용자 지정 데이터 형식
- 상속 가능
- 주소값을 복사하는 형태로, 다른 변수에 복사한 뒤 그 변수의 값을 변경할 경우 기존 클래스 내의 값도 같이 변경

### 구조체

- 값 타입의 사용자 지정 데이터 형식
- 상속 불가
- 구조체 내의 모든 데이터들이 별도의 주소값을 가짐
- 다른 변수에 복사한 뒤 그 변수의 값을 변경해도 기존 구조체 내의 값은 변경되지 않음

```csharp
// 클래스 (참조 타입)
public class Class1 {
	int value;
	
	public Class1(int value) {
		this.value = value;
	}
}

Class1 c1 = new Class1(1);
Class1 c2 = c1;

c2.value = 2;

// 다른 변수에 클래스 복사 후 value 값을 변경할 경우 기존 클래스 내의 value 값도 함께 변경
c1.value  // 2
c2.value  // 2

// 구조체 (값 타입)
public struct Struct1 {
	int value;
	
	public Struct1(int value) {
		this.value = value;
	}
}

Struct1 s1 = new Struct1(1);
Struct1 s2 = s1;

s2.value = 2

// 다른 변수에 구조체 복사 후 value 값을 변경해도 기존 구조체 내의 value 값은 변경되지 않음
s1.value  // 1
s2.value  // 2
```