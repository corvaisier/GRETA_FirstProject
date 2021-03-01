package mjp;

public class Pokrand extends Ptimo {

    public Pokrand(String nom) {
      super(nom);
      stress = 20;
      dominance = 80;
    }
      
    public void rugis() {
        System.out.println("GGRRRrrrr  " + this.stress + " " + this.dominance);
    }
      
    public void attaquer(Joueur adversaire) {
        adversaire.vie -= 60;
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
  