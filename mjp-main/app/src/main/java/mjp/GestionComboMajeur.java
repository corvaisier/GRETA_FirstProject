package mjp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GestionComboMajeur {

    public static boolean bas(ArrayList<String> nombres){
        if(paire(similaire(nombres))) {
         System.out.println("cartes bas");
            return true;
        } 
        return false;
     }
    public static boolean moyen(ArrayList<String> famille, ArrayList<String> nombres){
        if(brelan(similaire(nombres))) {
         System.out.println("cartes moyen");
            return true;
        } else if(quinte(nombres)) {
         System.out.println("cartes moyen");
         return true;
         }  else if(flush(famille)) {
             System.out.println("cartes moyen");
             return true;
         }
         System.out.println("pas de cartes moyen");
         return false;
     }
 

    public static boolean majeur(ArrayList<String> famille, ArrayList<String> nombres){
       if(full(similaire(nombres))) {
        System.out.println("cartes majeur");
           return true;
       } else if(quinteFlush(famille, nombres)) {
        System.out.println("cartes majeur");
        return true;
        }  else if(carre(similaire(famille))) {
            System.out.println("cartes majeur");
            return true;
        }
        System.out.println("pas de cartes majeur");
        return false;
    }

    public static boolean quinteFlush(ArrayList<String> famille, ArrayList<String> nombres) {
        if(flush(famille) && quinte(nombres)) {
            //System.out.println("BOOOM TA MAMAN!!");
            return true;
        }
        return false;
    }

    public static boolean quinte(ArrayList<String> nombres) {
        Collections.replaceAll(nombres,"J","11");
        Collections.replaceAll(nombres,"Q","12");
        Collections.replaceAll(nombres,"K","13");
        Collections.replaceAll(nombres,"A","14");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nombres.size(); i++) {
            int x = Integer.parseInt(nombres.get(i));
            list.add(x);
        }

        int accu = 0;
        int acc = 0;
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) + 1  == list.get(i + 1) ) {
                accu++;
            }
        }
        for(int i = list.size() - 1; i > 0; i--) {
            if(list.get(i) - 1 == list.get(i - 1) ) {
                acc++;
            }
        }
        if(accu == 4 ||acc == 4) {
            return true;
        }
        return false;
    }

    public static boolean flush(ArrayList<String> famille) {
        HashSet<String> couleur = new HashSet<String>();
        for(int i = 1; i < famille.size() - 1; i++) {
            couleur.add(famille.get(i));
        }
        if(couleur.size() == 1) {
            return true;
        }
        return false;
    }

    public static boolean full(ArrayList<Integer> nombres) {
        if(nombres.size()>1) {
            if(brelan(nombres) && paire(nombres)) {  
                System.out.println("full");    
                        return true;
            }
        }

        return false;
    }
    public static boolean paire(ArrayList<Integer> nombres){
        if(nombres.get(0) == 2) {         
                System.out.println("paire");
                return true;
        }
        return false;
    }
    public static boolean brelan(ArrayList<Integer> nombres){
        if(nombres.get(0) == 3) {        
            System.out.println("brelan");
            return true;
    } else if(nombres.size()>1) {
        if(nombres.get(1) == 3) {
            System.out.println("brelan");
            return true;
        }
}
        return false;
    }
    public static boolean carre(ArrayList<Integer> nombres){
        if(nombres.get(0) == 4) {           
                System.out.println("carre");
                return true;
        }
        return false;
    }

//méthode permettant de détermier les paires/brelans/carrés
    public static ArrayList<Integer> similaire(ArrayList<String> nombres) {
        ArrayList<Integer> tableauOccurences = new ArrayList<Integer>();
        Map<String, Integer> occurences = new HashMap<String, Integer>();
        for(String i : nombres) {
            Integer j = occurences.get(i);
            occurences.put(i, (j == null) ? 1 : j + 1);
        }
        for(Map.Entry<String, Integer> val: occurences.entrySet()) {
            if(val.getValue() > 1) {
                //System.out.println("occu: " + val.getValue());
                tableauOccurences.add(val.getValue());
            }
        }
        return tableauOccurences;
    }
}