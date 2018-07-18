import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Déclaration du scanner ici....
		String nom,userName = "user";
		String motDePasse, passWord = "123";
		
		//Déclaration de la boucle (do) ici...
		System.out.print("Please enter UserName: ");
		nom = "";//Lecture du nom d'utilisateur ici...
		System.out.print("\nPlease enter the password: ");
		motDePasse = "";//Lecture de mot de passe ici...
		while(nom.equals(userName) && motDePasse.equals(passWord));
		System.out.print("Welcome "+nom);
	}

}
