package cours.service.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dao")
public class PersonneService {

	public PersonneService() {

	}

	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String test() {
		return "test working..";
	}

	@GET
	@Path("/personnes")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Personne> selectAll() {
		return new DaoPersonne().selectAll();
	}

	@GET
	@Path("/personnes/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Personne findById(@PathParam(value = "id") int id) {
		return new DaoPersonne().findById(id);
	}

	@POST
	@Path("/personnes")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String create(Personne p) {
		new DaoPersonne().create(p);
		return "personne enregistrée en DB";
	}

	@DELETE
	@Path("/personnes/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String delete(@PathParam(value = "id") int id) {
		new DaoPersonne().delete(id);
		return "ok";
	}

	@PUT
	@Path("/personnes")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String update(Personne p) {
		new DaoPersonne().update(p);
		return "ok";
	}

}
