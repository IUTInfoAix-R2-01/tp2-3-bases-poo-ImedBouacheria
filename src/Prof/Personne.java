package Prof;

public class Personne {
	private String prenom ; 
	private String Nom;



	public Personne(String prenom) {
		this.prenom = prenom;
	
	}
	public Personne(String prenom, String Nom ) {
		this.prenom= prenom ;
		this.Nom = Nom ;
	}
	
	
	public String getNom() {
		return Nom ;
	}

 public void setNom(String Nom) {
	 this.Nom = Nom ;
 }
	public String getPrenom() {
		return prenom ;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String toString() {
		if (this.Nom == null) {
			return "prenom : " + this.prenom ;
			}
		return "prenom [Nom = " + Nom + " , prenom = " + prenom + " ]";
		
	}
 }
 