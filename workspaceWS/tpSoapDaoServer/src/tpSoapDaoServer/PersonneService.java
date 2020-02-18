package tpSoapDaoServer;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "PersonneWS")
public class PersonneService {

	@WebMethod(operationName = "find")
	public ArrayList<Personne> find() {
		return new DaoPersonne().find();
	}

	@WebMethod(operationName = "findById")
	public Personne findById(@WebParam(name = "id") int id) {
		return new DaoPersonne().findById(id);
	}

	@WebMethod(operationName = "create")
	public void create(@WebParam(name = "personne") Personne personne) {
		new DaoPersonne().create(personne);
	}

}
