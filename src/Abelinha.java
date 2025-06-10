
public class Abelinha extends Personagem {


    public Abelinha() {
        super(50); 
    }

    @Override
    public void mover() {
  
        setEnergia(energia - 2);

        System.out.println("Abelha se moveu. Energia atual: " + energia);
    }

    @Override
    public void fazerSom() {

        System.out.println("Fazendo som: Bzzzz!");
    }
}
