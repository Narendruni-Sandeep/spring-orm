package SpringOrm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import SpringOrm.model.Dept;

@Repository
public class DeptDAO {

	@PersistenceContext
	private EntityManager em;

	public void persist(Dept dpt) {
		em.persist(dpt);
	}

	public List<Dept> findAll() {
		return em.createQuery("SELECT d FROM dept d", Dept.class).getResultList();
	}
}
