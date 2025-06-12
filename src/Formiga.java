public class Formiga extends Personagem implements IArmamento{
    public Formiga(){
        super();
    }
    public Formiga(int energia) {
        super(energia);
        super.getEnergia();
    }

    @Override
    public void mover() {
        System.out.println("Formiga: anda só pra frente, se perder a rota Game Over");
    }

    @Override
    public void atacar() {
        System.out.println("Ataca com 4 formas!");
    }

    @Override
    public void fazerSom() {
        System.out.println("sssssss");
    }

}