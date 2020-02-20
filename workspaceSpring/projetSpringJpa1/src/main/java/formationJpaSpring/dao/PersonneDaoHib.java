package formationJpaSpring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import formationJpaSpring.entity.Personne;

@Repository
public class PersonneDaoHib implements PersonneDao {
	@PersistenceContext
	private EntityManager em;

	public List<Personne> findByName(String name) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		EntityManagerFactory emf = (EntityManagerFactory) ctx.getBean("entityManagerFactory");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT p from Personne p where p.nom=:nom");
		query.setParameter("nom", name);
		List<Personne> list = query.getResultList();
		em.close();
		emf.close();
		return list;
	}

	public Personne findById(Integer id) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		EntityManagerFactory emf = (EntityManagerFactory) ctx.getBean("entityManagerFactory");
		Personne p1 = null;
		EntityManager em = emf.createEntityManager();
		p1 = em.find(Personne.class, id);
		em.close();
		emf.close();
		return p1;
	}

	public List<Personne> findAll() {
		return em	.createQuery("SELECT p from Personne p")
					.getResultList();
	}

	@Transactional
	public void create(Personne p) {
		em.persist(p);
	}

	public void update(Personne p) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(p);
		tx.commit();
		em.close();
		emf.close();
	}

	public void delete(Personne p) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(em.find(Personne.class, p.getId()));
		tx.commit();
		em.close();
		emf.close();
	}
}