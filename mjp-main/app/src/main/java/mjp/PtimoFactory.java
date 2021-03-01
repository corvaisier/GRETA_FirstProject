package mjp;

import java.util.concurrent.ThreadLocalRandom;

public class PtimoFactory {

    protected static Ptimo randomPtimo(ActionJoueur juliette) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);

        if(randomNum < 61) {
            return new SacBleu("Sacbleu");
        } else if(randomNum > 60 &&  randomNum < 80) {
            return new Pyralia("Pyralia");
        } else if(randomNum > 79 && juliette.ptimoEnCage.size() > 4) {
            return new Pokrand("Pokrand");
        } else {
            return new SacBleu("Sacbleu");
        }
    }   
     
}
