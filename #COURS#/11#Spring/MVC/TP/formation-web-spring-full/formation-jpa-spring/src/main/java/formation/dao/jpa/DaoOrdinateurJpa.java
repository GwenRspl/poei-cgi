package formation.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import formation.dao.IDaoOrdinateur;
import formation.model.Ordinateur;
import formation.model.OrdinateurId;

@Repository
@Transactional
public class DaoOrdinateurJpa implements IDaoOrdinateur {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(readOnly=true)
	public List<Ordinateur> findAll() {
		TypedQuery<Ordinateur> query = em.createQuery("select o from Ordinateur o", Ordinateur.class);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly=true)
	public Ordinateur find(OrdinateurId id) {
		return em.find(Ordinateur.class, id);
	}

	@Override
	public Ordinateur save(Ordinateur obj) {
		return em.merge(obj);
	}

	@Override
	@Transactional
	public void delete(Ordinateur obj) {
		em.remove(em.merge(obj));
	}

}
