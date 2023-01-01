
### 패키지 구조
- adapter [데이터 교환을 담당하는 어뎁터를 분류]
    - in [외부 서비스와 내부 비즈니스 로직의 데이터 교환을 조정]
        - rest [REST APi를 구현한 어뎁터]
    - out [내부 비즈니스 로직과 외부 서비스의 데이터 교환을 조정]
        - persistence [JPA 구현한 어뎁터]
            - entity [JPA에서 사용하는 entity]
            - repository [JPA repository]
            - query [QueryDsl 컴포넌트]
        - client [faign client 어뎁터를 구현]
        - redis [redis 어뎁터 구현]
- application [내부 비즈니스 로직을 구현]
    - port [외부와 데이터 교환을 위한 인터페이스]
        - in [외부에서 내부 비즈니스 로직을 사용하기 위한 인터페이스]
            - commend [외부에서 내부로 요청하는 데이터를 담은 객체]
        - out [내부에서 외부 서비스를 사용하기 위한 인터페이스]
            - event [내부에서 외부로 요청하는 데이터를 담은 객체]
    - service [UseCase가 구현된 비즈니스 로직]
- domain [도메인에서 사용하기 위한 entity]


### 테스트 방법

스프링 시작 후 호출
http://localhost:8090/api/v1/dev/client-sample 