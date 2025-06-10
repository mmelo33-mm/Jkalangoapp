public abstract class Personagem {
    protected int energia;

    /**@param energiaInicial */
    public Personagem(int energiaInicial) {
        this.energia = energiaInicial;
    }


    public abstract void mover();

   
    public abstract void fazerSom();

    /**@param novaEnergia */
    public void dormir(int novaEnergia) {
        this.energia = novaEnergia;
        System.out.println(getClass().getSimpleName() + " dormiu. Energia definida para: " + this.energia);
    }

    /** @return */
    public int getEnergia() {
        energia += 10; 
        return energia;
    }

    /** @param novaEnergia */
    public void setEnergia(int novaEnergia) {
        this.energia = novaEnergia;
    }
}
