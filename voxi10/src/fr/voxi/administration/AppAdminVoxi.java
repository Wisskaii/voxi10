package fr.voxi.administration;
import java.util.ArrayList;

public class AppAdminVoxi {

	public static void main(String[] args) {

		// Exo 3
		
		//1.
		
		System.out.println("Exercice : 1\n");
		
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
		
		System.out.println("Exercice : 2\n");
		
		for(Utilisateur user : utilisateurs){
			System.out.println("Nom : " + user.getNom() + " Prénom : " + user.getPrenom());
		}
		
		System.out.println("\n");
		
		//3.
		
		System.out.println("Exercice : 3\n");
		
		
		int usersOnline = 0 ;
		for(Utilisateur user : utilisateurs){
			if(user.getEtat() == 1){
				usersOnline++ ;
			}
		}
		System.out.println("Il y a " + usersOnline + " utilisateurs connectés");
		
		System.out.println("\n");
		
		//4.
		
		System.out.println("Exercice : 4\n");
		
		for(Utilisateur user : utilisateurs){
			if(user.getEtat() == 1){
				user.seDeconnecter();
			}
			System.out.println("Nom : " + user.getNom() + " Etat : " + user.etatToString());
		}
		
		System.out.println("\n");
		
		//5.
		
		System.out.println("Exercice : 5\n");
		
		for(Utilisateur user : utilisateurs){
			if(user instanceof Moderateur && ((Moderateur)user).getLogin() == "jbreton"){
				user.seConnecter("jberto", "azerty") ;
				System.out.println(user.etatToString());
			}
		}
		
		System.out.println("\n");
		
		//6.
		
		System.out.println("Exercice : 6\n");
		
		for(Utilisateur user : utilisateurs){
			if(user instanceof Membre && user.getEmail() == "s.zaki@gns.fr"){
				user.seConnecter("s.zaki@gns.fr", "azerty") ;
				System.out.println(user.etatToString());
			}
		}
		
		System.out.println("\n");
		
		//7.
		
		System.out.println("Exercice : 7\n");
		
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
		
		System.out.println("\n");
		
		//8.
		
		System.out.println("Exercice : 8\n");
		
		((Moderateur)admin1).debloquer((Membre)user2) ;
		System.out.println("Le modérateur Jules LEBRETON vient de débloquer le compte de l'auditeur Alexis CAMOIT");
		System.out.println(user2.seConnecter("a.camoit@gns.fr", "azerty"));
		
		System.out.println("\n");
		
		//9.
		
		System.out.println("Exercice : 9\n");
		
		((Moderateur)admin3).bloquer((Membre)user1) ;
		System.out.println("Le modérateur Hamza ESSAMAMI vient de bloquer le compte de l'auditrice Selma ZAKI") ;
		System.out.println(user1.seConnecter("s.zaki@gns.fr", "azerty"));
		
		System.out.println("\n");
		
		//10. 
		
		System.out.println("Exercice : 10\n");
		
		System.out.println("Nombre d'alertes envoyées par le modérateur Bechir BA : " + ((Moderateur)admin2).getNbAlertesEnvoyees());
		System.out.println(((Moderateur)admin2).alerter((Membre)user3, "Votre dernier audiobook est limite injurieux"));
		System.out.println("Nombre d'alertes envoyées par le modérateur Bechir BA : " + ((Moderateur)admin2).getNbAlertesEnvoyees());
		
		System.out.println("\n");
		
		// Exo 4
		
		
		
	}

}
