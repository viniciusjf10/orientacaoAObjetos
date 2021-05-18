/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.moedas;
import java.util.Scanner;

public class moedas {
    public static void main(String[] args) {
        int valor, q100, q50, q25, q10, q5, q1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor em centavos: ");
        valor = teclado.nextInt();
        q100 = valor / 100;
        valor = valor % 100;
        
        q50 = valor/50;
        valor = valor % 50;
        
        q25 = valor/25;
        valor = valor % 25;
        
        q10 = valor/10;
        valor = valor % 10;
        
        q5 = valor/5;
        valor = valor % 5;
        
        q1 = valor/1;
        valor = valor % 1;
        
        System.out.println("Moedas de 1 real = " +q100);
        System.out.println("Moedas de 50 centavos = " +q50);
        System.out.println("Moedas de 25 centavos = " +q25);
        System.out.println("Moedas de 10 centavos = " +q10);
        System.out.println("Moedas de 5 centavos = " +q5);
        System.out.println("Moedas de 1 centavos = " +q1);
        
    }
}