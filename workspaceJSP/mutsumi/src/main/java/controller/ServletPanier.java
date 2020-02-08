package controller;

import model.Article;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ServletPanier")
public class ServletPanier extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("articles", this.retrieveArticlesFromDb());
        request.setAttribute("montantTotal", this.getMontantTotal(request));
        request.getRequestDispatcher("panier.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("articleSelect"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        Article chosenArticle = this.findArticleById(id);

        request = this.addToCart(request,chosenArticle,quantity);
        doGet(request,response);
    }

    private List<Article> retrieveArticlesFromDb(){
        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1,"article1","desc1","img",20.5));
        articles.add(new Article(2,"article2","desc2","img",10.0));
        articles.add(new Article(3,"article3","desc3","img",5.0));
        //TODO : link to DAOArticle
        //articles = new DAOArticleJdbc().findAll();
        return articles;
    }
    private Article findArticleById(int id){
        //TODO : link to DAOArticle
        Article article = new Article(1,"article1","desc1","img",20.5);
        return article;
    }

    private HttpServletRequest addToCart(HttpServletRequest request, Article article, int quantity){
        HashMap<Article,Integer> map = (HashMap<Article, Integer>) request.getSession().getAttribute("panier");
        if(map.containsKey(article)){
            int originalQuantity = map.get(article);
            map.replace(article, (originalQuantity + quantity));
        } else {
        map.put(article, quantity);
        }
        request.getSession().setAttribute("panier", map);
        return request;
    }

    private double getMontantTotal(HttpServletRequest request){
        double total = 0.0;
        HashMap<Article,Integer> map = (HashMap<Article, Integer>) request.getSession().getAttribute("panier");
        for(Map.Entry<Article,Integer> entry : map.entrySet()){
            total+= entry.getKey().getPrix() * entry.getValue();
        }
        return total;

    }

}
