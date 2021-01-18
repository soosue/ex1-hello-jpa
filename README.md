# ex1-hello-jpa

jpa 구동방식
1. Persistence -> META-INF/persistence.xml에서 설정정보 조회
2. Persistence에서 EntityManagerFactory 생성
3. EntityManagerFactory에서 EntityManager 생성
4. EntityManager에서 Transaction 생성 tx.begin, tx.commit, em.persist 등등

emf는 web application당 1개, em은 요청당 1개

jpa에서 제일 중요한 것.
1. 관계형 데이터베이스와 객체를 매핑하는 것.
2. 영속성 컨텍스트


영속성 컨텍스트의 장점
1. 필요할 때 select 하는 지연로딩
2. update를 entity.set만 하면 되는 더티체킹
3. 1차캐시에서 조회(select 한 번만 함)
4. 엔티티끼리 비교하면 같다고 함.
5. 트랜잭션 커밋할 때 쿼리가 나가는 쓰기지연.
