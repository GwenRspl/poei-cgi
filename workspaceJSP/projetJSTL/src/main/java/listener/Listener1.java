package listener;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import model.Personne;

/**
 * Application Lifecycle Listener implementation class Listener1
 *
 */
@WebListener
public class Listener1 implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public Listener1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("coucou");
		ArrayList<Personne> list = new ArrayList<>();
		list.add(new Personne("Haddock", "Capitaine"));
		list.add(new Personne("Tournesol", "Professeur"));
		list.add(new Personne("EtMilou", "Tintin"));
		list.add(new Personne("Castafiore", "La"));

		ServletContext session = arg0.getServletContext();
		session.setAttribute("liste", list);
	}

}
