package mjp;


public class App {
    
    public static void main(String[] args) {

        Joueur juliette = new Joueur("juliette", 100, 10, 30, 1);
        Ptimo a = new SacBleu("sacbleu");
        Joueur.game(a, juliette, 12);

        
    }   
   
}

