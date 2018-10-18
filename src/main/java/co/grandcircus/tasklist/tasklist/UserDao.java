package co.grandcircus.tasklist.tasklist;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository 
@Transactional	
public class UserDao {
	
	
	@Autowired
	EntityManager em;
	
	public void create(User user) {
		em.persist(user);
	}

}
