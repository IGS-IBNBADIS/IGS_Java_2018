package Exemples;

public class LivreSemaine2 {
	private String titre;
	private int nbrPage;
	
	LivreSemaine2(String i, int j){
		nbrPage = j;
		titre = i;
	}
	
	public void setTitre(String t){
		titre = t;
	}
	
	public int getNbrPage(){
		return nbrPage;
	}
	
	
}
