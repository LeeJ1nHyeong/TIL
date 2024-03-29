# 데이터 모델링

## 데이터 모델링 (Data Modeling)

- 고객의 **비즈니스 프로세스를 이해**하고, **규칙을 정의**하여, **데이터 모델**로 표현하는 것
- 고객과의 의사소통을 통해 고객의 비즈니스 프로세스를 이해해야 함
- 데이터베이스를 구축하기 위한 분석 및 설계의 과정

## 특징

- **추상화** : 현실 세계를 DB 등 일정한 형식에 맞춰 간략하게 표현
- **단순화** : 누구나 쉽게 이해가 가능하게 표현
- **명확성** : 애매모호함을 배제하고 누구나 이해할 수 있도록 정확하게 기술

## 데이터 모델링 단계

1. **개념적 모델링**
    - **업무** 측면에서 모델링을 수행
    - **중요한 부분 위주**로 진행
    - 기술적 용어는 가급적 사용하지 않을 것
    - **추상화** 수준이 가장 높은 단계
    - **엔터티** 및 **속성**을 도출하여 **ERD** 작성
2. **논리적 모델링**
    - 개념적 모델링에서 논리적 모델링으로 변환 작업을 하는 단계
    - 특정 DB 모델에 종속
    - **식별자**를 도출 및 정의하고 모든 **릴레이션, 관계, 속성** 등을 표현
    - **정규화**를 통해 모델의 **독립성** 확보 및 **재사용성**을 높임
3. **물리적 모델링**
    - DB를 실제로 구축하는 단계
    - DB 관리 시스템에 **테이블, 인덱스, 함수** 등을 생성
    - **성능, 보안, 가용성** 등을 고려

## 데이터 모델링 관점

- **데이터** : 구조 분석, 정적 분석
- **프로세스**(**작업**) : 시나리오 분석, 도메인 분석, 동적 분석
- **데이터와 프로세스 간의 관계** : CRUD 분석

## 고려사항(유의사항)

- **독립성** : 중복 데이터를 최대한 제거하여 모델의 독립성을 확보해야 한다.
    - **정규화**를 통해 중복 데이터 제거
    - 독립성이 확보된 모델은 고객 업무 변화에 능동적으로 대처 가능
- **비유연성 발생 X** : 데이터의 정의를 데이터의 사용 프로세스와 분리하여 작은 변화에도 DB 및 애플리케이션에 중대한 변화가 발생하지 않도록 한다.
- **비일관성 발생 X** : 데이터와 데이터 간의 상호 연관 관계를 명확하게 정의하여야 한다.