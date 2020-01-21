package tpCommercial;

public class Commercial {
	private String nom;
	private String prenom;
	private int secu;

	public Commercial(String nom, String prenom, int secu) {
		this.nom = nom;
		this.prenom = prenom;
		this.secu = secu;
	}

	public int getSecu() {
		return secu;
	}

	@Override
	public String toString() {
		return "Commercial [nom=" + nom + ", prenom=" + prenom + ", secu=" + secu + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + secu;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commercial other = (Commercial) obj;
		if (secu != other.secu)
			return false;
		return true;
	}

}
