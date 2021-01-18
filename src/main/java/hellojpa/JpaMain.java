package hellojpa;

import hellojpa.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            List<Member> result = em.createQuery("select m from Member m", Member.class)
                    .setFirstResult(0)
                    .setMaxResults(1)
                    .getResultList();

            for (Member member : result) {
                System.out.println(member.getName());

            }

            tx.commit();
        }catch (Exception e) {
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();

    }
}
