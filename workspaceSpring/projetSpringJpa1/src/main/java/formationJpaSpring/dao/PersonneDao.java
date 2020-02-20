package formationJpaSpring.dao;

import java.util.List;

import formationJpaSpring.entity.*;

public interface PersonneDao extends Dao <Personne, Integer> {
	public List<Personne> findByName(String name);
}