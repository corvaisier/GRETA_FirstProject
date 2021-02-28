package mjp;

import java.util.Scanner;

public class Arene {


    public static void game(Ptimo a, ActionJoueur juliette) {

        //début du scanner/interaction avec l'utilisateur
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voulez vous commencer à jouer? Y:N "); 
    
        String response = scanner.next();
    
        if(response.equals("Y")) {
            System.out.println(String.format("Yiiiaaaa!"));
            System.out.println(String.format("Voulez vous capturer un Ptimo? Y:N"));
        }
        String response2 = scanner.next();

        if(response2.equals("Y")) {
            System.out.println(a.nom + " apparaît");
            juliette.distance();
            System.out.println(String.format("Voulez vous observer ce Ptimo? [1]"));
            System.out.println(String.format("Voulez vous vous rapprocher? [2]"));
            System.out.println(String.format("Voulez vous lancer une cage? [3]"));
            System.out.println(String.format("Voulez vous lancer une friandise? [4]"));
            System.out.println(String.format("Voulez vous lancer une fléchette? [5]"));
            System.out.println(String.format("Voulez vous fuir? [6]"));
        }
        String response3 = scanner.next();

        if(response3.equals("1")) {
            juliette.observer(a);
        } else if(response3.equals("2")) {
            juliette.rapprocher();
        } else if(response3.equals("3")) {
            juliette.lancerCage();
        }  else if(response3.equals("4")) {
            juliette.lancerFriandise();
        }  else if(response3.equals("5")) {
            juliette.lancerFlechette();
        }  else if(response3.equals("6")) {
            juliette.lancerCage();
        }
    scanner.close();
    }
}
