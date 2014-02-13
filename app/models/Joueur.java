public class Joueur{
	static int[] cartes = new int[15];
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
	
	public void scoreJoueur(){
		int score1=calculPoints1();
		int score11=calculPoints11();
		if(score1==score11){
			System.out.println("Le joueur a : "+score1+" points");
		}
		else
			System.out.println("Le joueur a : "+score1+" ou "+score11+" points");
	}
	
	public int calculPoints1(){
		int score1=0;
		boolean stop=false;
		
		for(int i=0;i<nbCartes && !stop;i++){
			if(cartes[i]==1){
				score1+=1;
			}
			else if(cartes[i]>=10){
				score1+=10;
			}
			else{
				score1 += cartes[i];
			}
			
			if(score1==21){
				stop=true;
			}		
		}
		
		return score1;
	}

public int calculPoints11(){
		int score11=0;
		boolean stop=false;
		
		for(int i=0;i<nbCartes && !stop;i++){
			if(cartes[i]==1){
				score11+=11;
			}
			else if(cartes[i]>=10){
				score11+=10;
			}
			else{
				score11 += cartes[i];
			}
			
			if(score11==21){
				stop=true;
			}
		}
		return score11;
	}

	
	public static void afficherCartes(){
		System.out.println("Le joueur "+nom+" a :");
		for(int i=0; i<nbCartes; i++){
			if(cartes[i]==1){
				System.out.println("As");
			}
			else if(cartes[i]<=10){
				System.out.println(cartes[i]);
			}
			else if(cartes[i]==11){
				System.out.println("J");
			}
			else if(cartes[i]==12){
				System.out.println("Q");
			}
			else if(cartes[i]==13){
				System.out.println("K");
			}
		}
	}
}
