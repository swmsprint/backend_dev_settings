package sprint.test.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import sprint.test.domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@RequiredArgsConstructor
public class MemberRepository {

    @PersistenceContext
    private final EntityManager em;

    public Long save(Member member){
        em.persist(member);
        return member.getId();
    } //jpa가 저장하는 로직

    public Member find(Long index){
        return em.find(Member.class,index);
    }

}
