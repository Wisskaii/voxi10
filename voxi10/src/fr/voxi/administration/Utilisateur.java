package fr.voxi.administration;

public class Utilisateur {
	
	// Moyen sûr de ce qu'il se passe par ici donc code à revoir
	
	public final int CONNECTE = 1 ;
	public final int DECONNECTE = 2 ;
	
	private String nom ;
	private String prenom ;
	private String email ;
	private String mdp ;
	private int etat = DECONNECTE ;
	
	public boolean seConnecter(String email, String mdp){
		if(email == this.email && mdp == this.mdp){
			return true ;
		}
		else{
			return false ;
		}
	}
	
	public int seDeconnecter(){
		return this.etat = DECONNECTE ;
	}
	
}
