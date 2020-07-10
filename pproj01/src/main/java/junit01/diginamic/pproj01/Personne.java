package junit01.diginamic.pproj01;

public class Personne {
	private String nom;
	private String prenom;
	
	public Personne() {
		// TODO Auto-generated constructor stub
		this("","");
	}
	
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nom + "-" + prenom;
	}

}
