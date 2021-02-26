/*package mjp;
import java.util.Random;

public class PtimoFactory {

    private static PtimoFactory instance = new PtimoFactory();
    private PtimoFactory() {};

    public static PtimoFactory getPtimoFactoryInstance() {
        return instance;
    }
    
    public Ptimo randomPtimo() {
        Random ran = new Random(); 
        int nxt = ran.nextInt(10);
        
        if(nxt > 4) {
           return new SacBleu();
        } else {
           return new Pyralia();
        }

    }
    
}
*/