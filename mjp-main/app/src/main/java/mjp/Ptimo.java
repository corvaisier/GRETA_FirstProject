package mjp;

public abstract class Ptimo {
    
    public String nom;
    protected int stress;
    protected int dominance;

    Ptimo(String nom) {
        this.nom = nom;
    }
    
    public void setStress(int stress){
        this.stress = Math.min(stress, 100);
        this.stress = Math.max(stress, 0);

    }
    public int getStress(int stress) {
        return this.stress;
    }
    public void setDominance(int dominance){
        this.dominance = Math.min(dominance, 100);
        this.dominance = Math.max(dominance, 0);
    }
    public int getDominance(int dominance) {
        return this.dominance;
    }

	public abstract void rugis();
    public abstract void attaquer(Joueur adversaire);
    public abstract void reculer();
    public abstract void attaqueMagique();
    public abstract int choice(int stress, int dominance, int distance);

   public void determineAction() {
       if(this.dominance < 31 && this.stress > 50) {
           this.rugis();
           this.dominance += 10;
           this.stress -= 10;
       }
   }

}
