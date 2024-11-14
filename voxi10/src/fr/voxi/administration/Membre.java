package fr.voxi.administration;

public class Membre extends Utilisateur {
	
	private boolean bloque = false ;

	public Membre(String nom, String prenom, String email, String mdp, int etat, boolean bloque) {
		super(nom, prenom, email, mdp, etat);
		this.bloque = bloque;
	}
	
	// Ajouter visuNotif()
		
	@Override
	public String toString() {
		return "Membre [Nom=" + getNom() + " Prénom : " + getPrenom() + "]";
	}
	
	@Override
	public boolean seConnecter(String email, String mdp){
		if(email == this.getEmail() && mdp == this.getMdp() && this.bloque == false){
			this.setEtat(CONNECTE);
			return true ;
		}
		else{
			return false ;
		}
	}

	/**
	 * @return the bloque
	 */
	public boolean isBloque() {
		return bloque;
	}

	/**
	 * @param bloque the bloque to set
	 */
	public void setBloque(boolean bloque) {
		this.bloque = bloque;
	}
	
}
