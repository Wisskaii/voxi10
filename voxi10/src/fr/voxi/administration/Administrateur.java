package fr.voxi.administration;

public interface Administrateur {
	
	// Normalement ça devrait être bon mais méfiance sah
	
	public void bloquer(Membre membre) ;
	public void debloquer(Membre membre) ;
	
}
