package mjp;

public class Joueur {
    String nom;
    int vie;
    int cages;
    int friandises;
    int flechette;
    private static int sacbleuCapture = 0;
    private static int pyraliaCapture = 0;
    private static int pokrandCapture = 0;

  
        Joueur(String nom, int vie, int cages, int friandises, int flechette){
            this.nom = nom;
            this.vie = vie;
            this.cages = cages;
            this.friandises = friandises;
            this.flechette = flechette;
        }
        public static void setSacbleuCapture() {
            Joueur.sacbleuCapture += 1;
        }

        public static int getSacbleuCapture() {
            return sacbleuCapture;
        }
        
        public static void setPyraliaCapture() {
            Joueur.pyraliaCapture +=1;
        }

        public static int getPyraliaCapturee() {
            return pyraliaCapture;
        }
        public static void setPokrandCapture() {
            Joueur.pokrandCapture += 1;
        }
    
        public static int getPokrandCapture() {
            return pokrandCapture;
        }
    }

	


