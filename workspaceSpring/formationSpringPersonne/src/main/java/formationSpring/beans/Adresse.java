package formationSpring.beans;

import org.springframework.stereotype.Component;

@Component("adresse1")
public class Adresse {
	private int num = 5;
	private String rue = "rue blabla";
	private String cp = "94300";

	public Adresse() {
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Adresse [num=" + num + ", rue=" + rue + ", cp=" + cp + "]";
	}

}
