
public class Formiga extends Personagem {

  
    public Formiga() {
        super(100); 
    }

    @Override
    public void mover() {
        
        setEnergia(energia - 3);
       
        System.out.println("Formiga se moveu. Energia atual: " + energia);
    }

    @Override
    public void fazerSom() {
        
        System.out.println("Fazendo som: Fzzzz!");
    }
}
