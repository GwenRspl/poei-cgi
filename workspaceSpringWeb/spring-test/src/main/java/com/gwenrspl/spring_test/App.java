package com.gwenrspl.spring_test;

import com.gwenrspl.spring_test.config.AppConfig;
import com.gwenrspl.spring_test.dao.ProduitDaoRepository;
import com.gwenrspl.spring_test.model.Produit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        testCreate();
        testFindAll();
    }

    static void testFindAll(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProduitDaoRepository dao = context.getBean(ProduitDaoRepository.class);
        List<Produit> produits = dao.findAll();
        for (Produit p : produits){
            System.out.println(p);
        }
        context.close();
    }

    static void testCreate(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProduitDaoRepository dao = context.getBean(ProduitDaoRepository.class);
        Produit p = new Produit();
        p.setId(1);
        p.setName("velo");
        dao.create(p);
        context.close();
    }
}
