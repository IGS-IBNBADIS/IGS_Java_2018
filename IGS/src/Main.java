
public class Main {
	
	public static void main(String[] args) {
		int a = 5;
		switch (a){
		case 0:
			addition(10, 25);
			break;
		case 1:
			break;
		default:
			System.out.println("non!");
			break;
		}
	}

	static int addition(int a, int b){
		return a+b;
	}
	
	static float division(int a, int b){

		if(b == 0){
			System.out.println("Erreur: division par zero!");
			return 0;
		}else{
			return a/b;
		}
	}
}
