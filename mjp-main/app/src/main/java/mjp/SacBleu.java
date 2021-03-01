package mjp;

public class SacBleu extends Ptimo {

  public SacBleu(String nom) {
    super(nom);
    stress = 70;
    dominance = 19;
  }
    
  public void rugis() {
      System.out.println("GGRRRrrrr  " + this.stress + " " + this.dominance);
  }
    
  public void attaquer(Joueur adversaire) {
      adversaire.vie -= 20;
      System.out.println(adversaire.vie);
  }

  public void reculer(){

  }
  
  public void attaqueMagique(){

  }

  public int choice(int stress, int dominance, int distance) {
      return 1;
  }

}
