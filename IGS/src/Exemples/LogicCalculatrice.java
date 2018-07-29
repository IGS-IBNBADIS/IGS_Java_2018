package Exemples;

public class LogicCalculatrice {

	int addition(int a, int b){
		return a+b;
	}
	int soustraction(int a, int b){
		return a-b;
	}
	int multiplication(int a, int b){
		return a*b;
	}
	float division(int a, int b){

		if(b == 0){
			System.out.println("Erreur: division par zero!");
			return 0;
		}else{
			return a/b;
		}
	}
}
