package mjp;
import java.util.ArrayList;
import java.util.Collections;

public class GestionCartes {

    public String creationDeck() {
        String[] famille = {"C", "D", "H", "S"}; 
        String[] couleur = {"2", "3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K", "A"}; 
          // initialisation deck
          ArrayList<String> deck = new ArrayList<String>(); 
          for (int i = 0; i < couleur.length; i++) {
            for (int j = 0; j < famille.length; j++) {
                deck.add(couleur[i] + famille[j]);
              } 
          }
          Collections.shuffle(deck);
          String main = deck.get(1) + deck.get(2) + deck.get(3) + deck.get(4) + deck.get(5);
          System.out.println(main);
          return main;
    }

    public int similaire(String main) {
        int accu = 0;


        return 0;
    }
    
    
}
