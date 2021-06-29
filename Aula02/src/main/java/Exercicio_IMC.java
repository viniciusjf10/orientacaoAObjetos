public class Exercicio_IMC {
    private String sexo;
    private float peso;
    private float altura;

    public Exercicio_IMC(String sexo, float peso, float altura) {
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String calculaImc() {
        float imc = this.peso / ((this.altura * this.altura));
        String classificacao = "";
        if (this.getSexo().equals("M")) {
            if (imc < 20.7)
                return "abaixo do peso";

            if (imc <= 26.4)
                return "no peso normal";

            if (imc <= 27.8)
                return "marginalmente acima do peso";

            if (imc <= 31.1)
                return "acima do peso ideal";

            else
                return "obeso";
        }

        if (this.getSexo().equals("F"))
        {
            if (imc < 19.1)
                return "abaixo do peso";

            if (imc <= 25.8)
                return "no peso normal";

            if (imc <= 27.3)
                return "marginalmente acima do peso";


            if (imc <= 32.3)
                return "acima do peso ideal";

            else
                return "obeso";
        }
        //COMPLEXIDADE CICLOMÁTICA DE 9
        return null;
    }
}