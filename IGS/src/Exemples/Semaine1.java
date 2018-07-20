package Exemples;
import java.util.ArrayList;
import java.util.Scanner;

public class Semaine1 {
	
	public static void main(String[] args){
		creationTableau();
		creationArrayList();
	}
	
	static void creationTableau(){
		int tab2[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez les 5 varialbles:");
		for(int i=0; i < tab2.length; i++){
			System.out.print("entrez la variable n"+(i+1));
			tab2[i] = sc.nextInt();
		}
		
		for(int i=0; i < tab2.length; i++){
			System.out.println("la variable n "+(i+1)+" = "+tab2[i]);
		}
		
		sc.close();
	}
	
	static void creationArrayList(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer la taille de la list: ");
		int l = sc.nextInt();
		for(int i = 0; i < l; i++){
			list.add(i);
		}
		list.remove(2);
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		sc.close();
	}

}
