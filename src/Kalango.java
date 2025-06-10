
public class Kalango extends Personagem {


    public Kalango() {
        super(150); 
    }

    @Override
    public void mover() {

        setEnergia(energia - 5);

        System.out.println("Kalango se moveu. Energia atual: " + energia);
    }

    @Override
    public void fazerSom() {

        System.out.println("Fazendo som: Tssss!");
    }
}
