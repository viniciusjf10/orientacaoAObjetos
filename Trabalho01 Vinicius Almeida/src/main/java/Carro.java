public class Carro {

    protected  int potencia;
    protected float coefArrasto;
    protected int velMax;

    public Carro(int potencia, float coefArrasto, int velMax) {
        this.potencia = potencia;
        this.coefArrasto = coefArrasto;
        this.velMax = velMax;
    } //Construtor para carros.

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public float getCoefArrasto() {
        return coefArrasto;
    }

    public void setCoefArrasto(float coefArrasto) {
        this.coefArrasto = coefArrasto;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public float calculaVMaxReal(){
        return this.velMax - (this.coefArrasto*this.potencia);
    };

    public float calculaVMaxReal(int drs){
        return this.velMax - (this.coefArrasto*this.potencia) + drs;
    //Overloading de metodo inserindo um argumeto novo em um metodo ja existente;
    }
}

