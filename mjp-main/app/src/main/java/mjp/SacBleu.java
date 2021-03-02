package mjp;

public class SacBleu extends Ptimo {

  public SacBleu(String nom) {
    super(nom);
    stress = 70;
    dominance = 19;
  }


  public void attaqueMagique(Joueur joueur){
    System.out.println(this.nom + " provoque une tempête de glace!");
    joueur.vie -= 35;
    System.out.println("vous avez " + joueur.vie);
  }

}
