public class Partie{
	
	public static void main(String[] args) {
		Jeu jeu = new Jeu();
		
		//for(int i=0; i<2; i++){
		jeu.saisir();
		int i = 0;
		jeu.tab_Joueurs.get(i).piocherCarte(jeu.tirerCarte());
		jeu.tab_Joueurs.get(i).scoreJoueur();
		jeu.tab_Joueurs.get(i).piocherCarte(jeu.tirerCarte());
		jeu.tab_Joueurs.get(i).scoreJoueur();
		jeu.tab_Joueurs.get(i).piocherCarte(jeu.tirerCarte());
		jeu.tab_Joueurs.get(i).scoreJoueur();
		jeu.tab_Joueurs.get(i).afficherCartes();
		
		//}
	}
}
