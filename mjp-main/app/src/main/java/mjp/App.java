package mjp;


public class App {
    
    public static void main(String[] args) {
        //initialisation d'un joueur
        Joueur juliette = new ActionJoueur("juliette", 100, 10, 30, 1);
        Ptimo a = new SacBleu("sacbleu");
        //appel de l'instance Arene dans laquelle il y a l'interaction
        Arene.game(a, (ActionJoueur) juliette);
       
    }   
   
}

