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



    public void rugis() {
        System.out.println(this.nom + ": GGRRRrrrr!");
        this.stress -= 10;
        this.dominance += 10;
    }
      
    public void attaquer(Joueur adversaire) {
        System.out.println(this.nom + " attaque");
        adversaire.vie -= 20;
        System.out.println("vous avez " + adversaire.vie);
    }

    public void fuit(Ptimo ptimo, ActionJoueur joueur) {
        System.out.println(this.nom + " fuit!");
        Outils.reinitialiserPtimo(ptimo, joueur);
    }
  
    public void reculer(Ptimo ptimo, ActionJoueur joueur){
        if(Arene.getDistance() > 14) {
            this.fuit(ptimo, joueur);
        }
    }

    public abstract void attaqueMagique();

    
   public void determineAction(Ptimo ptimo, ActionJoueur joueur) {
       if(this.stress == 100) {
           this.attaqueMagique();
       }
       if(Arene.getDistance() > 14) {
           this.fuit(ptimo, joueur);
       }
       if(Arene.getDistance() > 10) {
           this.rugis();
       }
       if(this.dominance < 50 && Arene.getDistance() < 5) {
           this.attaquer(joueur);
       }
       if(Arene.getDistance() > 10) {
           this.reculer(ptimo, joueur);
       }
   }
   

}
