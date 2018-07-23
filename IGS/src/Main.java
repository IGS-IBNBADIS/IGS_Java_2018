import java.util.Random;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("Choisissez:"
				+ "\n1)-piere"
				+ "\n2)-papier"
				+ "\n1)-scisseaux");
		int choix = 0;//lisez le choix:
		switch(choix){
		case 1:
			choixPiere();
			break;
		case 2:
			choixPapier();
			break;
		case 3:
			choixSciseau();
			break;
		//ecrivez le default
		}
	}

		static void choixPiere(){
			//utiliser le random pour generer un chiffre et 
			//gerez les cas du choix de l'ordinateur par un SWITCH
		}
		static void choixPapier(){
			//utiliser le random pour generer un chiffre et 
			//gerez les cas du choix de l'ordinateur par un SWITCH			
		}
		static void choixSciseau(){
			//utiliser le random pour generer un chiffre et 
			//gerez les cas du choix de l'ordinateur par un SWITCH
		}
		
		
	}
