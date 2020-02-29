package com.gwenrspl.spring_test.dao;

import com.gwenrspl.spring_test.model.Produit;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProduitDaoRepository {

    @PersistenceContext
    EntityManager em;

    public Produit findById(Integer id) {
        return em.find(Produit.class, id);
    }

    public List<Produit> findAll() {
        Query query = em.createQuery("SELECT p from Produit p");
        List<Produit> list = query.getResultList();
        return list;
    }


    public void create(Produit p) {
        em.persist(p);
    }


    public void update(Produit p) {
        em.merge(p);
    }

    public void delete(Produit p) {
        em.remove(em.find(Produit.class, p.getId()));
    }
}
