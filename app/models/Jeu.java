import java.util.Random;

public class Jeu{
	static int nbJeux=4;
	static int nbCartes=52*nbJeux;
	static ArrayList<Joueur> tab_Joueurs = new ArrayList<Joueur>();

public Jeu(){
	
}

 static int randCarte(int nbCartes){
	 Random rand = new Random();
	 int carte = rand.nextInt(nbCartes - 1);	 

	 return (carte%13)+1;
 }
 
  public static int tirerCarte(){
	 return randCarte(nbCartes);
 }
 
 public void saisir(){
	String nom;
	Scanner entree= new Scanner(System.in);
	try{ 
	    System.out.println("nom joueur :");
	    nom=entree.next();
	    tab_Joueurs.add(new Joueur(nom));
	}
	catch(Exception e){
	    System.err.println("Saisie invalide : recommencer");
	    saisir();
	}
 }
}
