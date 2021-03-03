package mjp;
import java.util.ArrayList;
import java.util.Collections;

public class GestionCartes {

    //création d'un tableau de Nombres
    public static ArrayList<String> creationDeckNombre() {
        //à refacto
        String[] couleur = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        // initialisation deck
        ArrayList<String> deckDeNombre = new ArrayList<String>();

        for (int i = 0; i < couleur.length - 1; i++) {
            deckDeNombre.add(couleur[i]);
        }

        Collections.shuffle(deckDeNombre);

        ArrayList<String> mainDeNombre = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            mainDeNombre.add(deckDeNombre.get(i));
            //System.out.println("baba:" + mainDeNombre.get(i));

        }
        return mainDeNombre;
    }

    //création d'un tableau de famille
    public static ArrayList<String> creationDeckFamille() {
        String[] famille = {"C", "D", "H", "S","C", "D", "H", "S","C", "D", "H", "S","C", "D", "H", "S"}; 
          // initialisation deck
          ArrayList<String> deckOfFamille = new ArrayList<String>();
 
          for (int j = 0; j < famille.length - 1; j++) {
            deckOfFamille.add(famille[j]);
          } 
          Collections.shuffle(deckOfFamille);

          ArrayList<String> mainFamille = new ArrayList<String>(); 
          for(int i = 0; i < 5; i++) {
            mainFamille.add(deckOfFamille.get(i));
            //System.out.println(mainFamille.get(i));

        }
          return mainFamille;
    }

    
    
}
