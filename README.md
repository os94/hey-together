# 🍔 hey-together

#### [프로젝트관련 상세 정리&회고](https://os94.tistory.com/198)
- 원본 Repo : https://github.com/eattogether/hey-together/
  - Wiki : [hey-together/wiki](https://github.com/eattogether/hey-together/)
- 서비스 개요 : 배달음식 1인 주문의 부담을 줄일 수 있도록, 비슷한 위치의 사람들이 단체로 주문할 수 있도록 한다.
- 서비스 이름 : 마! 같이 묵자
- 팀원 : 뚱이, 티버, 션, 에이든, 코맥
- 사용기술
  - **Spring Boot**
  - **JPA**
  - Vue.js
  - **MySQL, H2**
  - **Spring Rest Docs**
  - JWT
  - Jenkins, Docker

<br>

#### 개인적으로 구현하면서 인상깊었던/삽질했던 부분들

- 인수테스트 디렉토리 분리
- Spring Rest Docs
- ATDD와 관계매핑 & 복잡한 도메인
- @OneToMany List<?> 상황에서 LazyInitializationException 예외
- JPA 양방향 순환참조 문제
- OneToMany와 양방향 남용의 문제
