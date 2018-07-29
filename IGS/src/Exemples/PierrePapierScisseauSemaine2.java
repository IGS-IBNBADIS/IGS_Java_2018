package Exemples;

import java.util.Random;
import java.util.Scanner;

public class PierrePapierScisseauSemaine2 {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			System.out.print("Choisissez:"
					+ "\n1)-piere"
					+ "\n2)-papier"
					+ "\n1)-scisseaux");
			int choix = sc.nextInt();
			switch(choix){
			case 1:
				choixPiere(r);
				break;
			case 2:
				choixPapier();
				break;
			case 3:
				choixSciseau();
				break;
			default:
				System.exit(0);
			}
		}

			static void choixPiere(Random r){
				int choix = r.nextInt(3);
				switch(choix){
				case 0: 
					System.out.println("Egalité");
					break;
				case 1: 
					System.out.println("Pc a gagné, papier VS piere");
					break;
				case 2: 
					System.out.println("Vous avez gagné, scisseaux VS piere");
					break;
				}
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

