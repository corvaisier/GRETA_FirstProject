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
        ///////////////////////////////////////////////////////////////////////////////////////
        this.stress = 100;

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


//listes des différentes actions possibles du ptimo
    public void rugis() {
        System.out.println(this.nom + ": GGRRRrrrr!");
        this.stress -= 10;
        this.dominance += 10;
    }
      
    public void attaquer(Joueur joueur) {
        System.out.println(this.nom + " attaque");
        joueur.vie -= 20;
        System.out.println("vous avez " + joueur.vie);
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

    public abstract void attaqueMagique(Joueur joueur);

    
//systeme de choix d'actions à refacto
   public void determineAction(Ptimo ptimo, ActionJoueur joueur) {
        int randomNum = Outils.randomNum(0,  100);
        if(this.dominance == 100) {
            this.attaqueMagique(joueur);
        } else if(Arene.getDistance() > 14)  {
            this.fuit(ptimo, joueur);
        } else {
            if(randomNum < 51) {
                this.magicOuPhysique(joueur);
            } else {
                this.rugisOuFuit(ptimo, joueur);
            }
        }
   
   }


   public void magicOuPhysique(ActionJoueur joueur) {
        int randomNum = Outils.randomNum(0,  100);

            if(randomNum > 49 && this.dominance < 40) {
                this.attaquer(joueur);;
            } else if(randomNum > 70 && this.dominance > 50 &&  this.stress > 60) {
                this.attaqueMagique(joueur);
            } else  {
                this.attaquer(joueur);
            }    
   }

   public void rugisOuFuit(Ptimo ptimo, ActionJoueur joueur) {
       int randomNum = Outils.randomNum(0,  100);
      
            if(randomNum > 49 && this.dominance < 40) {
                this.fuit(ptimo, joueur);
            } else if(randomNum > 50 && this.dominance > 40) {
                this.rugis();
            } else  {
                this.rugis();
            }    
   }

}
