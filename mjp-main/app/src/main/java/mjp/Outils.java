package mjp;

import java.util.concurrent.ThreadLocalRandom;

public class Outils {
    
    public static int randomNum(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    
    public static void reinitialiserPtimo(Ptimo ptimo, ActionJoueur joueur) {
        ptimo = PtimoFactory.randomPtimo((ActionJoueur) joueur);
        int distance = Outils.randomNum(8, 13);
        Arene.setDistance(distance); 
    }
    public static void sacBleuOuPyralia(Ptimo ptimo) {
        if(ptimo.nom.equals("Sacbleu")) {
            Joueur.setSacbleuCapture();
        } else if(ptimo.nom.equals("Pyralia")) {
            Joueur.setPyraliaCapture();
        } else {

        }
    }
    public static boolean pokrandConditions() {
        if((Joueur.getPyraliaCapturee() + Joueur.getSacbleuCapture() > 3) && Joueur.getSacbleuCapture() > 0 && Joueur.getPyraliaCapturee() > 0) {
            return true;
        }
        return false;
    }
}
