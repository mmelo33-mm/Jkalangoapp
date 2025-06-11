//NPC - non-player
public class PersonaNaoJogavel extends Personagem {
    
    @Override
    public void mover() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mover'");
    }

    @Override
    public void fazerSom() {
        System.out.println("Som de NPC genérico");
    }

}