//Criação de uma classe abstrata que lida com dados de um piloto
public abstract class DadosPiloto {
    public String nome;
    public int idade;
    public String nacionalidade;
    public int numeroVitorias;

    public int getNumeroVitorias() {
        return numeroVitorias;
    }

    public void setNumeroVitorias(int numeroVitorias) {
        this.numeroVitorias = numeroVitorias;
    }

    public abstract void AjusteVitorias();
    /* Criação de classe abstrata que sera usada em outra parte do codigo para atualizar o valor de vitórias. */

}

class Charles extends DadosPiloto //Classe usada para sobrescrever o numero de vitórias.
{
    @Override
    public void AjusteVitorias() {
        numeroVitorias +=3;
    }
}

