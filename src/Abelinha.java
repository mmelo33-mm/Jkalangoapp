
public class Abelinha extends Personagem implements IArmamento {

    @Override
    public void mover() {
      System.out.print("Voando nos 360 graus.. na doida, Game Over sem polenização..");
    }

    @Override
    public void atacar() {
        System.out.println("Ataca com ferrão!");
    }
    
    @Override
    public void fazerSom() {
      
    }

}
