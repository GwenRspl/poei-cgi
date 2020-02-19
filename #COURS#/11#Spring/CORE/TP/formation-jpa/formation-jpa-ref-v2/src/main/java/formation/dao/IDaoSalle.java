package formation.dao;

import java.util.List;

import formation.model.Salle;

public interface IDaoSalle extends IDao<Salle, Long> {
	List<Salle> findByNom(String nom);
	
}
