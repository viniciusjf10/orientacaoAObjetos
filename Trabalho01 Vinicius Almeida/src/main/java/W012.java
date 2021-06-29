public class W012 extends Carro{
    private String nomePilotoMB;
    private float expPilotoMB;
    private float expEquipeMB;

    public W012(int potencia, float coefArrasto, int velMax) {
        super(potencia, coefArrasto, velMax);
    }

    @Override
    public float calculaVMaxReal(){
        return this.velMax - (this.coefArrasto*this.potencia); //Polimorfismo dinamico do metodo da classe Carro. Tambem se aplica herança da classe pai.
    }

    public float calculaChanceVitoria(){
        return this.velMax*(expEquipeMB+expPilotoMB - 1); // Junção de herança da classe pai com elementos da classe filho.
    }
}
