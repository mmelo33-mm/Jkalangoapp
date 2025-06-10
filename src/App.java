public class App {
    public static void main(String[] args) throws Exception {
     
        Formiga formiga = new Formiga();
        Abelinha abelinha = new Abelinha();
        Kalango kalango = new Kalango();

        System.out.println("--- Iniciando Movimentos ---");
       

        System.out.println("\n--- Movimentos da Formiga ---");
        for (int i = 0; i < 3; i++) {
            formiga.mover();
        }

        System.out.println("\n--- Movimentos da Abelinha ---");
        for (int i = 0; i < 3; i++) {
            abelinha.mover();
        }

        System.out.println("\n--- Movimentos do Kalango ---");
        for (int i = 0; i < 3; i++) {
            kalango.mover();
        }

        System.out.println("\n--- Sons dos Animais ---");

        System.out.print("Formiga: ");
        formiga.fazerSom();
        System.out.print("Abelinha: ");
        abelinha.fazerSom();
        System.out.print("Kalango: ");
        kalango.fazerSom();

        System.out.println("\n--- Animais Dormindo e Energia Final ---");

        formiga.dormir(50);
        abelinha.dormir(60);
        kalango.dormir(70);


        System.out.println("\n--- Nível de Energia Final (incluindo regeneração) ---");
        System.out.println("Energia final da Formiga: " + formiga.getEnergia()); 
        System.out.println("Energia final da Abelinha: " + abelinha.getEnergia()); 
        System.out.println("Energia final do Kalango: " + kalango.getEnergia()); 
    }
}
