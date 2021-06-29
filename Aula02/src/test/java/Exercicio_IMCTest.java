import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_IMCTest {

    @Test
    public void acimaDoPesoMasculino()
    {
        Exercicio_IMC exercicio_imc = new Exercicio_IMC("M",100,1.89f);
        assertEquals("acima do peso ideal",exercicio_imc.calculaImc());
    }
    @Test
    public void acimaDoPesoFeminino()
    {
        Exercicio_IMC exercicio_imc = new Exercicio_IMC("F",100,1.89f);
        assertEquals("acima do peso ideal",exercicio_imc.calculaImc());
    }
    @Test
    public void obesoMasculino()
    {
        Exercicio_IMC exercicio_imc = new Exercicio_IMC("M",150,1.89f);
        assertEquals("obeso",exercicio_imc.calculaImc());
    }
    @Test
    public void obesoFeminino()
    {
        Exercicio_IMC exercicio_imc = new Exercicio_IMC("F",150,1.89f);
        assertEquals("obeso",exercicio_imc.calculaImc());
    }
    @Test
    public void abaixoDoPesoMasculino()
    {
        Exercicio_IMC exercicio_imc = new Exercicio_IMC("M",50,1.89f);
        assertEquals("abaixo do peso",exercicio_imc.calculaImc());
    }
    @Test
    public void abaixoDoPesoFeminino()
    {
        Exercicio_IMC exercicio_imc = new Exercicio_IMC("F",50,1.89f);
        assertEquals("abaixo do peso",exercicio_imc.calculaImc());
    }
    @Test
    public void pesoIdealMasculino()
    {
        Exercicio_IMC exercicio_imc = new Exercicio_IMC("M",80,1.89f);
        assertEquals("no peso normal",exercicio_imc.calculaImc());
    }
    @Test
    public void pesoIdealFeminino()
    {
        Exercicio_IMC exercicio_imc = new Exercicio_IMC("F",80,1.89f);
        assertEquals("no peso normal",exercicio_imc.calculaImc());
    }
    @Test
    public void marginalmenteAcimaDoPesMasculino()
    {
        Exercicio_IMC exercicio_imc = new Exercicio_IMC("M",95,1.85f);
        assertEquals("marginalmente acima do peso",exercicio_imc.calculaImc());
    }
}