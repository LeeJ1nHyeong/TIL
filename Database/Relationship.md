# 관계

## 관계(Relationship)

- 엔터티의 인스턴스 사이의 논리적인 연관성으로서 존재의 형태나 행위로서 서로에게 연관성이 부여된 상태

## 관계 패어링(Relationship Paring)

- 각각의 엔터티의 인스턴스들이 자신이 관련된 인스턴스들과 관계의 어커런스로 참여하는 형태
- 엔터티 안에서 인스턴스가 개별적으로 관계를 가지는 것

## 관계의 분류

- 존재에 의한 관계
    - 사원은 부서에 항상 속해있다.
- 행위에 의한 관계
    - 주문은 고객이 주문을 할 때 발생한다.

## 관계의 표기법

- 관계명(Membership) : 관계의 이름
- 관계차수(Cardinality) : 1:1, 1:M, M:N
- 관계선택사양(Optionality) : 필수관계(Mandatory), 선택관계(Optional)

## 관계 체크 사항

- 두 개의 엔터티 사이에 관심있는 연관 규칙이 존재하는가?
- 두 개의 엔터티 사이에 정보의 조합이 발생되는가?
- 업무기술서, 장표에 관계 연결에 대한 규칙이 서술되어 있는가?
- 업무기술서, 장표에 관계 연결을 가능하게 하는 동사가 있는가?

## 관계 읽기

- 기준(Source) 엔터티를 한 개 또는 각으로 읽는다.
- 대상 엔터티의 관계참여도(개수)를 읽는다.
- 관계선택사양과 관계명을 읽는다.