public class Funcionario {
        private String nome;
        private float salarioBruto;
        private float totalAcrescimo;
        private float totalDesconto;

        public Funcionario (){
            System.out.println("Iniciando um objeto da classe Funcionario");
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getSalarioBruto() {
            return salarioBruto;
        }

        public void setSalarioBruto(float salarioBruto) {
            this.salarioBruto = salarioBruto;
        }

        public float getTotalAcrescimo() {
            return totalAcrescimo;
        }

        public void setTotalAcrescimo(float totalAcrescimo) {
            this.totalAcrescimo = totalAcrescimo;
        }

        public float getTotalDesconto() {
            return totalDesconto;
        }

        public void setTotalDesconto(float totalDesconto) {
            this.totalDesconto = totalDesconto;
        }

        public float calculaSalarioLiquido (){
            return salarioBruto+totalAcrescimo-totalDesconto;
        }

    }