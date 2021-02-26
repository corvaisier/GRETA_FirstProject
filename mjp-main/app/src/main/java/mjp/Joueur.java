package mjp;

public class Joueur {
    String nom;
    int vie;
    int cages;
    int friandises;
    int flechette;

    Joueur(String nom, int vie, int cages, int friandises, int flechette){
        this.nom = nom;
        this.vie = vie;
        this.cages = cages;
        this.friandises = friandises;
        this.flechette = flechette;
    }
    protected void vie(){
        System.out.println(this.nom + " a " + this.vie);
    }    
    protected void cages(){
        System.out.println(this.nom + " a " + this.cages);
    }
    protected void friandises(){
        System.out.println(this.nom + " a " + this.friandises);
    }    
    protected void flechette(){
        System.out.println(this.nom + " a " + this.flechette);
    }

    protected void observer(Ptimo a) {
        String stress = ""; 
        String dominance = "";
        if(a.stress > 0 || a.stress > 26){
            stress = "ce ptimo est détendu";
        } else if (a.stress > 25 || a.stress > 51){
            stress = "ce ptimo est méfiant";
        } else if (a.stress > 50 || a.stress > 72){
            stress = "ce ptimo est nerveux";
        } else {
            stress = "ce ptimo est paniqué";
        }      
        if(a.dominance > 0 || a.dominance > 26){
            dominance = "et est inoffensif";
        } else if (a.dominance > 25 || a.dominance > 51){
            dominance = "et est neutre";
        } else if (a.dominance > 50 || a.dominance > 72){
            dominance = "et est féroce";
        } else {
            dominance = "et est dangereux";
        }  
        System.out.println("ce Ptimo est " + stress + " et " + dominance);
    }
    protected void rapprocher(int distance) {

    }
}

	


