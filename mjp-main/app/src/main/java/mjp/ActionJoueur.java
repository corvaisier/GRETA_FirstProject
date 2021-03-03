package mjp;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ActionJoueur extends Joueur {
    
    ArrayList<String> ptimoEnCage = new ArrayList<String>();
    
    ActionJoueur(String nom, int vie, int cages, int friandises, int flechette) {
        super(nom, vie, cages, friandises, flechette);
    }

    protected void vie(){
        System.out.println(this.nom + " a " + this.vie  + " vie ");
    }    
    protected void cages(){
        System.out.println(this.nom + " a " + this.cages  + " cages ");
    }
    protected void friandises(){
        System.out.println(this.nom + " a " + this.friandises  + " friandises ");
    }    
    protected void flechette(){
        System.out.println(this.nom + " a " + this.flechette  + " flechettes ");
    }
    protected void distance(){
        System.out.println("Il est à la distance de: " + Arene.getDistance());
    }

    protected void observer(Ptimo a) {
        String stress = ""; 
        String dominance = "";
        if(a.stress > 0 && a.stress < 26){
            stress = "ce ptimo est détendu";
        } else if (a.stress > 25 && a.stress < 51){
            stress = "ce ptimo est méfiant";
        } else if (a.stress > 50 && a.stress < 72){
            stress = "ce ptimo est nerveux";
        } else {
            stress = "ce ptimo est paniqué";
        }      
        if(a.dominance > 0 && a.dominance < 26){
            dominance = "inoffensif";
        } else if (a.dominance > 25 && a.dominance < 51){
            dominance = "neutre";
        } else if (a.dominance > 50 && a.dominance < 72){
            dominance = "féroce";
        } else {
            dominance = "dangereux";
        }  
        System.out.println("ce Ptimo est " + stress + " et " + dominance);
    }

    protected int rapprocher(Ptimo ptimo) {
        int randomNum = Outils.randomNum(3, 8);
        int distance = Arene.getDistance();
        distance -= randomNum;
        Arene.setDistance(distance);
        if(distance < 2) {
            this.lancerCage(ptimo);
            return 1;
        } else {
            return 0;
        }
        
    }

    private void lancerCage(Ptimo ptimo) {
        if(this.cages < 1) {
            System.out.println("vous ne disposez plus de cages");
        } else {
            System.out.println(this.nom + " capture le ptimo");
            Outils.sacBleuPyraliaOuPokrand(ptimo);
            this.cages --;
            this.cages();
        }
    }

    protected void danseImpressionnante(Ptimo ptimo) {
        System.out.println(this.nom + " effectue une danse impressionnante");
        System.out.println(ptimo.nom + " semble impressioné et beaucoup moins féroce que précédemment");
        int randomNum = ThreadLocalRandom.current().nextInt(7, 21 + 1);
        ptimo.dominance -= randomNum;
    }

    protected void lancerFlechette(Ptimo ptimo) {
        int randomNum = Outils.randomNum(0, 100);
        if(this.flechette < 1) {
            System.out.println("vous ne disposez plus de fléchette");
        } else {
            if(randomNum < 51){
                System.out.println(this.nom + " lance une fléchette");
                this.flechette --;
                this.flechette();
                this.lancerCage(ptimo);
            } else {
                System.out.println(this.nom + " loupe son lancé de fléchette, ce qui augmente le stress du ptimo!");
                ptimo.stress += 20;
            }
        }
    }

    protected void lancerFriandise(Ptimo ptimo) {
        int randomNum = Outils.randomNum(0, 100);
        if(this.friandises < 1) {
            System.out.println("vous ne disposez plus de friandises");
        } else {
            if(randomNum > 24 && Arene.getDistance() < 8) {
                System.out.println(this.nom + " lance une friadise avec réussite, le stress du ptimo réduit!");
                this.friandises --;
                ptimo.stress = ptimo.stress - 20;
                this.friandises();
            } else {
                System.out.println("avant: " + ptimo.stress);
                System.out.println(this.nom + " lance une friadise à côté, ce qui augmente le stress du ptimo!");
                this.friandises --;
                ptimo.stress = ptimo.stress + 20;
                System.out.println("après: " + ptimo.stress);
                this.friandises();
            }
        }
    } 

    protected void fuir() {
        System.out.println(this.nom + " part");
        this.vie = 100;
        this.vie();
    } 
}
