import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

   /* @Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }

    @Test
    public void renderTemplate() {
        Content html = views.html.index.render("Your new application is ready.");
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("Your new application is ready.");
    }*/

	@Test
	public void carteValueCheck(){
		Jeu jeu = new Jeu();
		for(int i=0; i<=100;i++){
			carteValeur(jeu.tirerCarte());
		}
		
	}
	
	boolean carteValeur(int carte){
		if(carte>=1 && carte<=13){
			return true;
		}
		else return false;
	}
	
	@Test
	public void afficherCartesTest(){
		Jeu jeu = new Jeu();
		Joueur player = new Joueur();
		String lesCartes="";
		for(int i=1; i<=13; i++){
			player.piocherCarte(i);
		}	
		for(int i=0; i<player.nbCartes; i++){
			if(player.cartes[i]==1){
				lesCartes+=("As ");
			}
			else if(player.cartes[i]<=10){
				lesCartes+=(player.cartes[i]+" ");
			}
			else if(player.cartes[i]==11){
				lesCartes+=("J ");
			}
			else if(player.cartes[i]==12){
				lesCartes+=("Q ");
			}
			else if(player.cartes[i]==13){
				lesCartes+=("K ");
			}
		}
		assertThat(lesCartes).contains("As 2 3 4 5 6 7 8 9 10 J Q K ");
	}
}
