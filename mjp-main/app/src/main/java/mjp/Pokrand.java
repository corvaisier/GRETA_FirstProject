package mjp;

import java.util.ArrayList;

public class Pokrand extends Ptimo {

    public Pokrand(String nom) {
      super(nom);
      stress = 20;
      dominance = 100;
    }
      
    public void attaqueMagique(Joueur joueur){
      System.out.println(this.nom + " sort un jeu de cartes!");
      System.out.println("*********************************************************************");
      choixAction(choixCombo(GestionCartes.creationDeckFamille(), GestionCartes.creationDeckNombre()));

      joueur.vie -= 35;
      System.out.println("vous avez " + joueur.vie);
    }

    public int choixCombo(ArrayList<String> famille, ArrayList<String> nombre){
      if(GestionComboMajeur.majeur(famille, nombre)) {
        return 10;
      } else if(GestionComboMajeur.moyen(famille, nombre)){
        return 5;
      } else if(GestionComboMajeur.bas(nombre)) {
        return 1;
      }
      return 0;     
    }
    public void choixAction(int n) {
      if(n == 10) {
        System.out.println(this.nom + " vous assome et libère tous les Ptimo");
      } else if(n == 5) {
        System.out.println(this.nom + " fuit!");
      } else if(n == 1) {
        System.out.println(this.nom + " fait une attaque magique classique");
      } else{
        System.out.println(this.nom + " perd 10pts de dominance");
        this.dominance -= 10;
      }
    }
  }
   