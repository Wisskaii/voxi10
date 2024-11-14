package fr.voxi.administration;
import java.util.ArrayList;

public class AppAdminVoxi {

	public static void main(String[] args) {

		// Exo 3 // Ajouter visuNotif / Système blocage / refaire 3.
		
		//1.
		
		ArrayList<Utilisateur> utilisateurs = new ArrayList<>() ;
		
		Utilisateur user1 = new Membre("ZAKI", "Selma", "s.zaki@gns.fr", "azerty" , 2, false) ;
		Utilisateur user2 = new Membre("CAMOIT", "Alexis", "a.camoit@gns.fr", "azerty" , 2, true) ;
		Utilisateur user3 = new Membre("KARIM", "Lamia", "l.karim@gns.fr", "azerty" , 1, false) ;
		
		Utilisateur admin1 = new Moderateur("LEBRETON" , "Jules", "j.lebreton@gmail.com", "azerty", 2, "jbreton", 33) ;
		Utilisateur admin2 = new Moderateur("BA" , "Béchir", "bechir.ba@gmail.com", "azerty", 1, "bba", 103) ;
		Utilisateur admin3 = new Moderateur("ESSAMAMI" , "Hamza", "hamza.mami@free.fr", "azerty", 2, "hessa", 8) ;
		
		utilisateurs.add(user1) ;
		utilisateurs.add(admin1) ;
		utilisateurs.add(admin2) ;
		utilisateurs.add(user2) ;
		utilisateurs.add(user3) ;
		utilisateurs.add(admin3) ;
		
		//2.
		
		for(Utilisateur user : utilisateurs){
			System.out.println("Nom : " + user.getNom() + " Prénom : " + user.getPrenom());
		}
		
		System.out.println("\n");
		
		//3.
		
		for(Utilisateur user : utilisateurs){
			if(user.getEtat() == 1){
				System.out.println(user);
			}
		}
		
		System.out.println("\n");
		
		//4.
		
		for(Utilisateur user : utilisateurs){
			if(user.getEtat() == 1){
				user.seDeconnecter();
			}
			System.out.println("Nom : " + user.getNom() + " Etat : " + user.etatToString());
		}
		
		System.out.println("\n");
		
		//5.
		
		for(Utilisateur user : utilisateurs){
			if(user instanceof Moderateur && ((Moderateur)user).getLogin() == "jbreton"){
				user.seConnecter("jberto", "azerty") ;
				System.out.println(user.etatToString());
			}
		}
		
		System.out.println("\n");
		
		//6.
		
		for(Utilisateur user : utilisateurs){
			if(user instanceof Membre && user.getEmail() == "s.zaki@gns.fr"){
				user.seConnecter("s.zaki@gns.fr", "azerty") ;
				System.out.println(user.etatToString());
			}
		}
		
		System.out.println("\n");
		
		//7.
		
		for(Utilisateur user : utilisateurs){
			if(user instanceof Membre){
				user.seConnecter(user.getEmail(), user.getMdp()) ;
				System.out.println("Nom : " + user.getNom() + " " + user.etatToString());
			}
			else{
				user.seConnecter(((Moderateur)user).getLogin(), user.getMdp()) ;
				System.out.println("Nom : " + user.getNom() + " " + user.etatToString());
			}
		}
		
		//8. 
		
	}

}
