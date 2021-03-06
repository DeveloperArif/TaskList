package co.grandcircus.tasklist.tasklist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class TaskDao {

	@PersistenceContext
	EntityManager em; 
	
	public List<Task> findAll() {
		return em.createQuery("FROM Task", Task.class).getResultList();
	}
	
	public Task findById(Long id) {
		return em.find(Task.class, id);

	}
	
	public void create(Task task) {
		em.persist(task);
	}
	
	public void delete(Long id) {
		Task task = em.getReference(Task.class, id);
		em.remove(task);
	}
	
}
