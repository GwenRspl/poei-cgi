package formation.dao;

import java.util.List;

import formation.model.Salle;

public interface IDaoSalle extends IDao<Salle, Long> {
	List<Salle> findByNom(String nom);
	List<Salle> findByCodePostal(String codePostal);
	List<Salle> findByPersonnePrenom(String prenom);
	List<Salle> findByVille(String ville);
	Salle findWithPersonnes(Long id);
}
