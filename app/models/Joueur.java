public class Joueur{
	static int[] cartes = new int[10];
	static String nom;
	static int nbCartes;

	public Joueur(){

	}
	
	public static void piocherCarte(int carte){
		cartes[nbCartes]=carte;
		nbCartes++;
	}
}
