package fr.voxi.administration;

public abstract class Utilisateur {
		
	public final int CONNECTE = 1 ;
	public final int DECONNECTE = 2 ;
	
	private String nom ;
	private String prenom ;
	private String email ;
	private String mdp ;
	private int etat = DECONNECTE ;
	
	public Utilisateur(String nom, String prenom, String email, String mdp, int etat) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.etat = etat;
	}

	public abstract boolean seConnecter(String email, String mdp) ;
	
	public int seDeconnecter(){
		return this.etat = DECONNECTE ;
	}

	@Override
	public String toString() {
		return "Utilisateur [CONNECTE=" + CONNECTE + ", DECONNECTE=" + DECONNECTE + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", mdp=" + mdp + ", etat=" + etat + "]";
	}
	
	public String etatToString(){
		
		String etatToString = "" ;
		switch(etat){
			
		case 1:
			etatToString = "CONNECTE" ;
			break ;
		
		case 2:
			etatToString = "DECONNECTE" ;
			break ;
		
		default:
			etatToString = "Erreur" ;
		}
		return etatToString ;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}

	/**
	 * @param mdp the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	/**
	 * @return the etat
	 */
	public int getEtat() {
		return etat;
	}

	/**
	 * @param etat the etat to set
	 */
	public void setEtat(int etat) {
		this.etat = etat;
	}

	/**
	 * @return the CONNECTE
	 */
	public int getCONNECTE() {
		return CONNECTE;
	}

	/**
	 * @return the DECONNECTE
	 */
	public int getDECONNECTE() {
		return DECONNECTE;
	}
	
}
