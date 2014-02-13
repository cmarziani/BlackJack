import java.util.Random;

public class Jeu{
	static int nbJeux=4;
	static int nbCartes=52*nbJeux;


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
}
