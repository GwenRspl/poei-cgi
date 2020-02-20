package dao;

import java.util.List;

import entity.Personne;

public interface PersonneDao extends Dao<Personne, Integer> {

	public List<Personne> findByName(String name);

}
