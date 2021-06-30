import java.util.LinkedList;
import java.util.List;

public class mainClass {
    public static void main(String[] args) {
        Charles objCharles = new Charles();
        objCharles.nome = "Charles Leclerc";
        objCharles.idade = 23;
        objCharles.nacionalidade = "Monegasco";
        objCharles.numeroVitorias = 15;

        objCharles.AjusteVitorias(); //alteração de dados em um metodo abstrato que esta em uma classe abstrata.

        MCL35M objMCL = new MCL35M(900,0.1f,345);
        W012 objW = new W012(870,0.05f,350);

        List<Integer> carro = new LinkedList<>();
        carro.add(objMCL.getVelMax());
        carro.add(objW.getVelMax());
        



    }
}

// LISTA A FAZER: Herança   OK, classe abstrata  OK, metodo abstrato  OK, sobreposiçao de metodo    OK, utilizaçao de lista,

// polimorfismo     OK, colocar tad em uma lista e usar metodos polimorficos , encapsulamento  OK, construtores     OK, junit, codigo limpo  OK