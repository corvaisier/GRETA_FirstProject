package mjp;


public class PtimoFactory {

    protected static Ptimo randomPtimo(ActionJoueur juliette) {
        int randomNum = Outils.randomNum(0, 100);
        if(randomNum > 65 &&  randomNum < 80) {
            return new Pokrand("Pokrand");
        } else if(randomNum > 79 &&  Outils.pokrandConditions()) {
            return new Pokrand("Pokrand");
        } else {
            return new Pokrand("Pokrand");
        }
        
    }   
     
}
