public class Kalango extends Personagem implements IArmamento {

    public Kalango(int energia) {
        super(energia);
        System.out.println("");
    }


    public Kalango() {
        //TODO Auto-generated constructor stub
    }


    @Override
    public void mover() {
       System.out.println("Terreste com velocidade");
    }


    @Override
    public void atacar() {
        System.out.println("Ataca de 2 formas");
    }
    @Override
    public void fazerSom() {
        System.out.println("Tssssss");
    }

}