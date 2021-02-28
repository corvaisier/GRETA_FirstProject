package mjp;

import java.util.concurrent.ThreadLocalRandom;

public class Joueur {
    String nom;
    int vie;
    int cages;
    int friandises;
    int flechette;
    //création d'une distance random d'apparition du monstre
    int distance = ThreadLocalRandom.current().nextInt(8, 13 + 1);

    Joueur(String nom, int vie, int cages, int friandises, int flechette){
        this.nom = nom;
        this.vie = vie;
        this.cages = cages;
        this.friandises = friandises;
        this.flechette = flechette;
    }
   
}

	


