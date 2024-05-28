# Collections - Array, List, Dictionary

## Array

- C#에서 제공하는 가장 기본적인 Collection이며, 그룹 값의 컨테이너 역할

```csharp
elementType[] {배열명} = new elementType[{배열 길이}];

// ex
int[] values = new int[3];
// 일반 초기화
int[] values = new int[] {1, 2, 3};
// 단축 초기화
int[] values = {1, 2, 3};
```

- 인덱스를 활용하여 배열 내의 값에 접근
- 인덱스 범위 초과 시 IndexOutOfRangeException 오류 발생

```csharp
values[0]  // 1
values[1]  // 2
values[3]  // IndexOutOfRangeException 오류 발생
```

- (배열명).Length → 배열의 길이 호출

```csharp
values.Length  // 3
```

- 배열 생성 후 요소 추가 및 삭제 불가 → 배열 길이 고정
    - 변경 가능성이 없는 정보 저장에 적합한 Collection
    - 다른 Collection과 비교하여 처리속도는 빠르다.

## List

- 요소 추가, 삭제, 업데이트 등이 가능하여 변경이 용이한 Collection

```csharp
List<elementType> {리스트명} = new List<elementType>();

// ex
List<int> values = new List<int>();
List<int> values = new List<int>() {1, 2, 3};
```

- 주요 메서드
    
    | 메서드 | 기능 |
    | --- | --- |
    | {리스트명}.*Count* | 리스트 내의 요소 개수 반환 |
    | {리스트명}.*Add({요소})* | 리스트의 맨 뒤에 요소 추가 |
    | {리스트명}.*Insert({인덱스}, {요소})* | 리스트의 해당 인덱스에 요소 삽입 |
    | {리스트명}.*RemoveAt({인덱스})* | 리스트의 해당 인덱스의 값 제거 |
    | {리스트명}.*Remove({요소})* | 리스트 내의 요소 제거 |
    
    ```csharp
    values.Count // 3
    values.Add(4)  // {1, 2, 3, 4}
    values.Insert(1, 5)  // {1, 5, 2, 3, 4}
    values.RemoveAt(0)  // {5, 2, 3, 4}
    values.Remove(2)  // {5, 3, 4}
    ```
    

## Dictionary

- key-value 형태로 저장하는 형태의 Collection
- key가 인덱스 역할을 하여 value 값 호출

```csharp
Dictionary<keyType, valueType> {딕셔너리명} = new Dictionary<keyType, valueType>();

// ex
Dictionary<string, int> keyValue = new Dictionary<string, int>();
Dictionary<string, int> keyValue = new Dictionary<string, int>()
    {
        {"key1", 1},
        {"key2", 2}
    };
	
keyValue["key1"]  // 1
keyValue["key2"]  // 2
```

- 주요 메서드
    
    | 메서드 | 기능 |
    | --- | --- |
    | {딕셔너리명}.*Add({key}, {value})* | 딕셔너리에 key-value 추가 |
    | {딕셔너리명}.*Remove({key})* | 딕셔너리 내에 key에 해당하는 key-value 삭제 |
    | {딕셔너리명}.*ContainsKey({key})* | 딕셔너리 내 key 존재 여부 확인, 있으면 true, 없으면 false 반환 |
    
    ```csharp
    keyValue.Add("key3", 3)  // { {key1, 1}, {key2, 2}, {key3, 3} }
    keyValue.Remove("key1")  // { {key2, 2}, {key3, 3} }
    keyValue.ContainsKey("key1")  // false
    keyValue.ContainsKey("key2")  // true
    ```
