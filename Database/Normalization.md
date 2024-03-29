# 정규화

## 정규화 (Normalization)

- 이상 현상이 있는 릴레이션(Relation)을 분해하여 이상 현상을 없애는 과정
- 테이블 간에 중복된 데이터를 허용하지 않기 위해 테이블을 분리함
- 중복된 데이터를 허용하지 않음으로써 **무결성(Integrity)** 유지 가능



## 장단점

### 장점

- DB 변경 시 **이상 현상(Anomaly)** 제거 가능
- 정규화된 DB 구조에서 새로운 데이터 형의 추가로 인한 확장 시, 구조 변경을 하지 않아도 되거나 변경을 최소화시킬 수 있음
- DB 저장 용량을 줄일 수 있으며, DB와 연동된 응용 프로그램에 최소한의 영향만을 미치게 되어 생명 연장 가능

### 단점

- 릴레이션(Relation)간의 조인(JOIN) 연산이 많아진다.
- JOIN이 많이 발생하여 성능 저하가 나타날 시 **반정규화**(De-normalization)를 적용해야 할 수도 있다.
    - `반정규화` : **데이터 중복을 허용**하고 **조인을 줄이기** 위해 데이터 모델을 통합하는 과정



## 정규형의 종류

### 제1정규형 (1NF)

- **하나의 속성**에는 **한 개의 값**만을 가져야 한다. **(원자성)**
- 하나의 컬럼은 같은 종류나 타입(Type)의 값을 가져야 한다.
- 각 컬럼이 유일한 이름을 가져야 한다.
- 컬럼의 순서가 바뀌어도 상관이 없어야 한다.

### 제2정규형 (2NF)

- 제1정규형을 만족
- **부분 함수 종속성 제거** : 테이블 기본 키(Primary Key, PK)에 종속되지 않는 컬럼은 테이블이 분리되어야 함
    - 이 때 두 테이블간의 관계를 나타내기 위해 **외래 키**(Foreign Key, FK)를 사용

### 제3정규형 (3NF)

- 제2정규형을 만족
- **이행 함수 종속성 제거** : 다른 속성에 의존(종속)하는 속성은 따로 분리해야 함
    - `이행 종속성` : A → B이고 B → C일 때, A → C가 성립하는 상황

### BCNF (Boyce-Codd Normal Form)

- 제3정규형을 만족
- 모든 결정자가 **후보키 집합**에 속해야 한다.

### 제4정규형 (4NF)

- BCNF을 만족
- **다치 종속**(Multi-valued Dependency)을 없애야 한다.

### 제5정규형 (5NF) (일반적으로는 잘 사용하지 않음)

- 제4정규형을 만족
- **조인 종속**(JOIN Dependency)을 없애야 한다.
- 조인 연산시 손실이 없어야 한다.