package listener;

import model.Article;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.HashMap;

@WebListener()
public class ListenerPanier implements HttpSessionListener {

    // Public constructor is required by servlet spec
    public ListenerPanier() {
    }

    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
        HashMap<Article,Integer> panier = new HashMap<>();
        se.getSession().setAttribute("panier",panier);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
    }


}
