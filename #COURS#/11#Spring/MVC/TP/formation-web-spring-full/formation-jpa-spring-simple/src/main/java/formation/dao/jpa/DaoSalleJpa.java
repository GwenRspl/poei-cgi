package formation.dao.jpa;

import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import formation.dao.IDaoPersonne;
import formation.dao.IDaoSalle;

@Repository
@Transactional
public class DaoSalleJpa implements IDaoSalle {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private IDaoPersonne daoPersonne;

	@Override
	@Transactional(readOnly=true)
	public List<Salle> findAll() {
		TypedQuery<Salle> query = em.createQuery("select s from Salle s", Salle.class);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly=true)
	public Salle find(Long id) {
		return em.find(Salle.class, id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Salle> findByNom(String nom) {
		Query query = em.createQuery("select s from Salle s where s.nom = :param1");
		query.setParameter("param1", nom);

		return query.getResultList();
	}

	@Override
	public Salle save(Salle obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Salle obj) {
		em.remove(em.merge(obj));
	}

	@Override
	@Transactional(readOnly=true)
	public List<Salle> findByCodePostal(String codePostal) {
		TypedQuery<Salle> query = em.createQuery("select s from Salle s where s.adresse.codePostal = :cp", Salle.class);

		query.setParameter("cp", codePostal);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Salle> findByVille(String ville) {
		TypedQuery<Salle> query = em.createNamedQuery("Salle.findByVille", Salle.class);

		query.setParameter("cp", ville);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Salle> findByPersonnePrenom(String prenom) {
//			TypedQuery<Salle> query = em.createQuery("select s from Salle s join s.personnes p where p.prenom = :prenom", Salle.class);
//
//			query.setParameter("prenom", prenom);

		Query query = em.createQuery("select p.salle.nom, p.nom, p.prenom from Personne p where p.prenom = :prenom");

		query.setParameter("prenom", prenom);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly=true)
	public Salle findWithPersonnes(Long id) {
		TypedQuery<Salle> query = em.createQuery("select s from Salle s left join fetch s.personnes p where s.id = :id",
				Salle.class);

		query.setParameter("id", id);

		return query.getSingleResult();
	}

}
