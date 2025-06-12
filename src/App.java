import br.com.jkalango.view.JIntro;
import br.com.jkalango.view.JSplash;

public class App {
    public static void main(String[] args) throws Exception {

        Formiga f = new Formiga();
        f.mover();
        f.atacar();

        Abelinha a = new Abelinha();
        a.mover();
        a.atacar();
        
        Kalango k = new Kalango();
        k.mover();
        k.atacar();

        new JIntro();
        //new JSplash();

        //objetos
        //objeto  kalango
        // abelhinha
        //movendo
        //atacando (novidade)
       
    }
}