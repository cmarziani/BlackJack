public class Partie{
	
	public static void main(String[] args) {
		Jeu jeu = new Jeu();
		
		//for(int i=0; i<2; i++){
		jeu.saisir();
		int i = 0;
		jeu.tab_Joueurs.get(i).piocherCarte(jeu.tirerCarte());
		System.out.println(jeu.tab_Joueurs.get(i).nom+" a "+jeu.tab_Joueurs.get(i).calculPoints()+" points.");
		jeu.tab_Joueurs.get(i).piocherCarte(jeu.tirerCarte());
		System.out.println(jeu.tab_Joueurs.get(i).nom+" a "+jeu.tab_Joueurs.get(i).calculPoints()+" points.");
		jeu.tab_Joueurs.get(i).piocherCarte(jeu.tirerCarte());
		System.out.println(jeu.tab_Joueurs.get(i).nom+" a "+jeu.tab_Joueurs.get(i).calculPoints()+" points.");		
		jeu.tab_Joueurs.get(i).afficherCartes();
		
		//}
	}
}
