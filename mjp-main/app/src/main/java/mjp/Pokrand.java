package mjp;


public class Pokrand extends Ptimo {

    public Pokrand(String nom) {
      super(nom);
      stress = 20;
      dominance = 80;
    }
      
   
    public void attaqueMagique(Joueur joueur){
      System.out.println(this.nom + " sort un jeu de cartes!");
      System.out.println("*********************************************************************");
      joueur.vie -= 35;
      System.out.println("vous avez " + joueur.vie);
    }

  
  }
   