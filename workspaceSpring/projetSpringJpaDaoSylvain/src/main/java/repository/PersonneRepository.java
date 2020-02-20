package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {

}
