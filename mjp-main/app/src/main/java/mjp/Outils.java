package mjp;

import java.util.concurrent.ThreadLocalRandom;

public class Outils {
    
    public static int randomNum(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    
    public static Ptimo reinitialiserPtimo(Ptimo ptimo, ActionJoueur joueur) {
        ptimo = PtimoFactory.randomPtimo((ActionJoueur) joueur);
        int distance = Outils.randomNum(8, 13);
        Arene.setDistance(distance); 
        return ptimo;
    }

    public static boolean sacBleuPyraliaOuPokrand(Ptimo ptimo) {
        if(ptimo.nom.equals("Sacbleu")) {
            Joueur.setSacbleuCapture();
            return false;
        } else if(ptimo.nom.equals("Pyralia")) {
            Joueur.setPyraliaCapture();
            return false;
        } else{
            System.out.println("Vous avez gagné!");
            Joueur.setPokrandCapture();
            return true;
        }    
    }
    
    public static boolean pokrandConditions() {
        if((Joueur.getPyraliaCapturee() + Joueur.getSacbleuCapture() > 3) && Joueur.getSacbleuCapture() > 0 && Joueur.getPyraliaCapturee() > 0) {
            return true;
        }
        return false;
    }
    public static boolean finJeu(ActionJoueur joueur) {
        Boolean resultat = true;
        if(joueur.vie < 1) {
            resultat =  false;
        } 
        if(Joueur.getPokrandCapture() > 0) {
            resultat =  false;
        } 
        if(joueur.cages < 1){
            resultat =  false;
        }
        return resultat;
    }
}
