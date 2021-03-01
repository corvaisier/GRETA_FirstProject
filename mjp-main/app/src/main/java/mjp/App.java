package mjp;


public class App {
    
    public static void main(String[] args) {
        //initialisation d'un joueur
        Joueur joueur = new ActionJoueur("juliette", 100, 10, 30, 1);
        PtimoFactory.randomPtimo((ActionJoueur) joueur);
        //appel de l'instance Arene dans laquelle il y a l'interaction
        Arene.game(PtimoFactory.randomPtimo((ActionJoueur) joueur), (ActionJoueur) joueur);
       
    }   
   
}

