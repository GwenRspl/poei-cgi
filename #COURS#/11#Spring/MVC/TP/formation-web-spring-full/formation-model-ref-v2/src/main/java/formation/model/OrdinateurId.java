package formation.model;

import java.io.Serializable;

public class OrdinateurId implements Serializable {
	private static final long serialVersionUID = -4198724594445693273L;
	private String societe;
	private String code;

	public OrdinateurId() {
		super();
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
