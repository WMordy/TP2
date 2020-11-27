package ma.inpt.aseds;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class JPA_DAO {
	
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	@Autowired
	private EntityManager em;
	
	public void save(Person prs) {
		try {
			em.persist(prs);
			System.out.println("im in");
		}
		catch(Exception e ) {
			System.out.print("im out");
		}
	}
	
	@Transactional(readOnly = true)
	public <T> T find(Class<T> cls, Object id) {
		return em.find(cls, id);
	}
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Person> findAll() {
		return em.createQuery("SELECT e FROM Person e").getResultList();
	}
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Person> findByCriteria(String name) {
        return em.createQuery("SELECT e FROM Person e WHERE e.name = :value").setParameter("value", name).getResultList();
//        return em.createQuery("SELECT e FROM Employee e WHERE e.lastName = ?").setParameter(1, "Raj").getResultList();
    }

}
