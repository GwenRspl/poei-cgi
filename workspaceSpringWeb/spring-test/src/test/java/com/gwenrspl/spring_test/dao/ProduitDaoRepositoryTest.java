package com.gwenrspl.spring_test.dao;

import com.gwenrspl.spring_test.config.AppConfig;
import com.gwenrspl.spring_test.model.Produit;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Transactional
class ProduitDaoRepositoryTest {

    @Test
    void findById() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProduitDaoRepository dao = context.getBean(ProduitDaoRepository.class);
        Produit produit = dao.findById(1);
        assertEquals("velo",produit.getName());
        context.close();
    }

    @Test
    void findAll() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProduitDaoRepository dao = context.getBean(ProduitDaoRepository.class);
        List<Produit> produits = dao.findAll();
        assertEquals(1,produits.size());
        context.close();
    }

    @Test
    void create() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProduitDaoRepository dao = context.getBean(ProduitDaoRepository.class);
        Produit p = new Produit();
        p.setId(2);
        p.setName("voiture");
        dao.create(p);

        assertEquals("voiture",dao.findById(2).getName());
        context.close();
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}
