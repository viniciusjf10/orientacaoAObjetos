import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*
        Funcionario funcionario = new Funcionario();

        Scanner scanner = new Scanner( System.in );
        System.out.println("Digite o nome do funcionario: ");
        String nome = scanner.next();
        funcionario.setNome(nome);

        Scanner scanner2 = new Scanner( System.in );
        System.out.println("Digite o salario bruto do funcionario: ");
        float salarioB = scanner.nextFloat();
        funcionario.setSalarioBruto(salarioB);

        Scanner scanner3 = new Scanner( System.in );
        System.out.println("Digite o total de acrescimos no salário do funcionario: ");
        float salarioA = scanner.nextFloat();
        funcionario.setTotalAcrescimo(salarioA);

        Scanner scanner4 = new Scanner( System.in );
        System.out.println("Digite o total de descontos no salário do funcionario: ");
        float salarioD = scanner.nextFloat();
        funcionario.setTotalDesconto(salarioD);

        /*  SET MANUAL DE VALORES
        funcionario.setNome("Vinicius");
        funcionario.setSalarioBruto(4500);
        funcionario.setTotalDesconto(1000);
        funcionario.setTotalAcrescimo(1500);
        SET MANUAL DE VALORES
        */


        //System.out.println("O salario final do funcionario e: " + funcionario.calculaSalarioLiquido());

        Exercicio_IMC exercicio_imc = new Exercicio_IMC("M",100,1.89f);
        System.out.println("A condição de imc eh: " + exercicio_imc.calculaImc());


    }
}
