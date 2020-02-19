package formation.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import formation.dao.IDaoOrdinateur;
import formation.dao.IDaoPersonne;
import formation.model.Eleve;
import formation.model.Ordinateur;
import formation.model.Personne;

@Repository
@Transactional
public class DaoPersonneJpa implements IDaoPersonne {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private IDaoOrdinateur daoOrdi;

	@Override
	@Transactional(readOnly=true)
	public List<Personne> findAll() {
		TypedQuery<Personne> query = em.createQuery("select p from Personne p", Personne.class);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly=true)
	public Personne find(Long id) {
		return em.find(Personne.class, id);
	}

	@Override
	public Personne save(Personne obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Personne obj) {
		obj = em.merge(obj);

		if (obj instanceof Eleve) {
			Eleve eleve = (Eleve) obj;

			if (eleve.getOrdinateur() != null) {
				Ordinateur ordi = eleve.getOrdinateur();
				daoOrdi.delete(ordi);
			}
		}

		em.remove(obj);
	}

}
