package fr.atatorus.bookservice.services;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "Calc", serviceName = "CalcService")
public interface CalcService {

	String test(@WebParam(name = "nom") String nom);

	double add(@WebParam(name = "nb1") int a, @WebParam(name = "nb2") int b);

	double sous(@WebParam(name = "nb1") int a, @WebParam(name = "nb2") int b);

	double mult(@WebParam(name = "nb1") int a, @WebParam(name = "nb2") int b);

	double div(@WebParam(name = "nb1") int a, @WebParam(name = "nb2") int b);

}
