package mjp;

import java.util.Scanner;

public class Arene {

    private static int distance = Outils.randomNum(8, 15);



    public static void setDistance(int distance) {
        Arene.distance = distance;
    }

    public static int getDistance() {
        return distance;
    }

    
    public static void game(Ptimo ptimo, ActionJoueur joueur) {

        // début du scanner/interaction avec l'utilisateur
        Scanner scanner = new Scanner(System.in);

        System.out.println(String.format("Un Ptimo se cache dans les bois, voulez vous le capturer? Y:N"));

        String response = scanner.next();

        while (joueur.vie > 0) {
            if (response.equals("Y")) {
                System.out.println(String.format(" "));
                System.out.println(
                    String.format(ptimo.nom + " est à " + Arene.getDistance() + " m que souhaitez vous faire?"));
                    System.out.println(String.format(" "));
                    System.out.println(String.format("[1] Voulez vous observer ce Ptimo? "));
                    System.out.println(String.format("[2] Voulez vous vous rapprocher? "));
                    System.out.println(String.format("[3] Voulez vous faire une danse impressionnante? "));
                    System.out.println(String.format("[4] Voulez vous lancer une friandise? (x" + joueur.friandises + ")"));
                    System.out.println(String.format("[5] Voulez vous lancer une fléchette? (x" + joueur.flechette + ")"));
                    System.out.println(String.format(" "));
                    System.out.println(String.format("[6] Laisser le " + ptimo.nom + " en liberté? "));
                    System.out.println(String.format("[0] Arrêter le jeu?"));
                    System.out.println(String.format(" "));
                }
                String response3 = scanner.next();
        
                if(response3.equals("1")) {
                    joueur.observer(ptimo);
                    ptimo.determineAction(ptimo, joueur);
                } else if(response3.equals("2")) {
                    joueur.rapprocher(ptimo);
                    if(joueur.rapprocher(ptimo) == 1) {
                        ptimo = Outils.reinitialiserPtimo(ptimo, joueur);
                    } else {
                        ptimo.determineAction(ptimo, joueur);
                    }
                } else if(response3.equals("3")) {
                    joueur.danseImpressionnante(ptimo);
                    ptimo.determineAction(ptimo, joueur);
                } else if(response3.equals("4")) {
                    joueur.lancerFriandise(ptimo);
                    ptimo.determineAction(ptimo, joueur);
                } else if(response3.equals("5")) {
                    joueur.lancerFlechette(ptimo);
                    ptimo.determineAction(ptimo, joueur);
                } else if(response3.equals("6")) {
                   joueur.fuir();
                   ptimo = Outils.reinitialiserPtimo(ptimo, joueur);
                } else if(response3.equals("0")) {
                    scanner.close();
                }
            } 
           
    scanner.close();
    }
}
