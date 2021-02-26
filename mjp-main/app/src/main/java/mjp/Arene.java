package mjp;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Arene {

    public static void game(Ptimo a, Joueur b) {

        int randomNum = ThreadLocalRandom.current().nextInt(8, 13 + 1);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Voulez vous commencer à jouer? Y:N "); 
    
        String response = scanner.next();
    
        if(response.equals("Y")) {
        // prompt for their age
        System.out.println(String.format("Yiiiaaaa!"));
        System.out.println(String.format("Voulez vous capturer un Ptimo? Y:N"));
        }
        String response2 = scanner.next();

        if(response2.equals("Y")) {
            System.out.println(a.nom + " apparaît a " + randomNum + "m");
            System.out.println(String.format("Voulez vous observer ce Ptimo? Y:N"));
        }
        String response3 = scanner.next();

        if(response3.equals("Y")) {
            b.observer(a);
        }
    
    scanner.close();
    }
}
    

