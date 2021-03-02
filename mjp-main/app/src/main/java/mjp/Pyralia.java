package mjp;

public class Pyralia extends Ptimo {

  public Pyralia(String nom) {
    super(nom);
    stress = 20;
    dominance = 80;
  }
    
 
  public void attaqueMagique(Joueur joueur){
    System.out.println(this.nom + " vous lance une boule de feu!");
    joueur.vie -= 35;
    System.out.println("vous avez " + joueur.vie);
  }

}
