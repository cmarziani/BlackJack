public class Joueur{
	static int[] cartes = new int[10];
	static String nom;
	static int nbCartes;

	public Joueur(){
	
	}
	
	public Joueur(String name){
		
		nbCartes=0;
		nom=name;
	}
	
	public static void piocherCarte(int carte){
		cartes[nbCartes]=carte;
		nbCartes++;
	}
}
