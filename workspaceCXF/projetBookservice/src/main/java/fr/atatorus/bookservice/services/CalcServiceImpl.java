package fr.atatorus.bookservice.services;

import javax.jws.WebParam;

public class CalcServiceImpl implements CalcService {

	@Override
	public String test(@WebParam(name = "nom") String nom) {
		return "test working !";
	}

	@Override
	public double add(@WebParam(name = "nb1") int a, @WebParam(name = "nb2") int b) {
		return a + b;
	}

	@Override
	public double sous(@WebParam(name = "nb1") int a, @WebParam(name = "nb2") int b) {
		return a - b;
	}

	@Override
	public double mult(@WebParam(name = "nb1") int a, @WebParam(name = "nb2") int b) {
		return a * b;
	}

	@Override
	public double div(@WebParam(name = "nb1") int a, @WebParam(name = "nb2") int b) {
		// TODO Auto-generated method stub
		return a / b;
	}

}
