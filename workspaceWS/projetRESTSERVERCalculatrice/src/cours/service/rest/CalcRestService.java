package cours.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public class CalcRestService {

	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String test() {
		return "test working";
	}

	@GET
	@Path("/info")
	@Produces(MediaType.APPLICATION_JSON)
	public CalcInfo getInfo() {
		CalcInfo calcInfo = new CalcInfo();
		calcInfo.setA(10);
		calcInfo.setB(20);
		return calcInfo;
	}

	@GET
	@Path("/add2/{nb1}/{nb2}")
	@Produces(MediaType.APPLICATION_JSON)
	public double add2(@PathParam(value = "nb1") int a, @PathParam(value = "nb2") int b) {
		return a + b;
	}

	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public double add(CalcInfo info) {
		return info.getA() + info.getB();
	}

	@POST
	@Path("/mult")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public double mult(CalcInfo info) {
		return info.getA() * info.getB();
	}

	@POST
	@Path("/div")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public double div(CalcInfo info) {
		return info.getA() / info.getB();
	}

	@POST
	@Path("/sous")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public double sous(CalcInfo info) {
		return info.getA() - info.getB();
	}

}
