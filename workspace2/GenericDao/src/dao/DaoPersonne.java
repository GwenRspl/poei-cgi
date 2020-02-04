package dao;

import java.sql.SQLException;
import java.util.List;

import model.Personne;

public interface DaoPersonne extends Dao<Personne, Integer> {

	public List<Personne> find() throws ClassNotFoundException, SQLException;

	public Personne findById(Integer id) throws ClassNotFoundException, SQLException;

	public void create(Personne personne) throws ClassNotFoundException, SQLException;

	public void update(Personne personne) throws ClassNotFoundException, SQLException;

	public void delete(Personne personne) throws ClassNotFoundException, SQLException;

	public List<Personne> findByRange(Integer id1, Integer id2) throws ClassNotFoundException, SQLException;

}
