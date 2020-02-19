package formationSpring.beans;

import java.util.List;
import java.util.Map;

public class JavaCollection {
	private List adressList;
	private Map adressMap;

	public JavaCollection() {
	}

	public List getAdressList() {
		return adressList;
	}

	public void setAdressList(List adressList) {
		this.adressList = adressList;
	}

	public Map getAdressMap() {
		return adressMap;
	}

	public void setAdressMap(Map adressMap) {
		this.adressMap = adressMap;
	}

	@Override
	public String toString() {
		return "JavaCollection [adressList=" + adressList + "]";
	}

}
