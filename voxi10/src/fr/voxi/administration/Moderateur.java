package fr.voxi.administration;

public class Moderateur extends Utilisateur implements Administrateur {
	
	private String login ;
	private int nbAlertesEnvoyees = 0 ;
	
	public Moderateur(String nom, String prenom, String email, String mdp, int etat, String login, int nbAlertesEnvoyees) {
		super(nom, prenom, email, mdp, etat);
		this.login = login ;
		this.nbAlertesEnvoyees = nbAlertesEnvoyees ;
	}

	public String alerter(Membre membre, String message){
		this.nbAlertesEnvoyees++ ;
		return "Signalement fait à : " + membre + " Message : " + message ;
	}

	@Override
	public String toString() {
		return "Moderateur [login=" + login + ", nbAlertesEnvoyees=" + nbAlertesEnvoyees + "]";
	}
	
	@Override
	public boolean seConnecter(String login, String mdp){
		if(login == this.login && mdp == this.getMdp()){
			this.setEtat(CONNECTE) ;
			return true ;
		}
		else{
			return false ;
		}
	}
	
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the nbAlertesEnvoyees
	 */
	public int getNbAlertesEnvoyees() {
		return nbAlertesEnvoyees;
	}

	/**
	 * @param nbAlertesEnvoyees the nbAlertesEnvoyees to set
	 */
	public void setNbAlertesEnvoyees(int nbAlertesEnvoyees) {
		this.nbAlertesEnvoyees = nbAlertesEnvoyees;
	}
	
	public void bloquer(Membre membre){
		membre.setBloque(true);
	}
	
	public void debloquer(Membre membre){
		membre.setBloque(false);
	}
	
}
