public class MCL35M extends Carro {
    private String nomePilotoMCL;
    private float expPilotoMCL;
    private float expEquipeMCL;

    public MCL35M(int potencia, float coefArrasto, int velMax) {
        super(potencia, coefArrasto, velMax);
    }


    @Override
    public float calculaVMaxReal(){
        return this.velMax - (this.coefArrasto*this.potencia); //Polimorfismo dinamico do metodo da classe Carro. Tambem se aplica herança da classe pai.
    }

    public float calculaChanceVitoria(){
        return this.velMax*(expEquipeMCL+expPilotoMCL - 1); // Junção de herança da classe pai com elementos da classe filho.
    }
}
