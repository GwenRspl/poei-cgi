package listener;

import java.util.ArrayList;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import model.Personne;

/**
 * Application Lifecycle Listener implementation class Listener1
 *
 */
@WebListener
public class Listener1 implements HttpSessionListener {

	/**
	 * Default constructor.
	 */
	public Listener1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("coucou***********");

		ArrayList<Personne> list = new ArrayList<>();
		list.add(new Personne("Haddock", "Capitaine"));
		list.add(new Personne("Tournesol", "Professeur"));
		list.add(new Personne("EtMilou", "Tintin"));
		list.add(new Personne("Castafiore", "La"));

		HttpSession session = arg0.getSession();
		session.setAttribute("liste", list);
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
	}

}
