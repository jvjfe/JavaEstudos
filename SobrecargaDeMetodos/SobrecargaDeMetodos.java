package sobrecargademetodos;

public class SobrecargaDeMetodos {

    public void exibirQuantidade(int a) {
        System.out.println("Quantidade de argumentos: 1");
    }

    public void exibirQuantidade(int a, int b) {
        System.out.println("Quantidade de argumentos: 2");
    }

    public static void main(String[] args) {
        SobrecargaDeMetodos exemplo = new SobrecargaDeMetodos();
        
        exemplo.exibirQuantidade(5);          
        exemplo.exibirQuantidade(5, 10);     
    }
}
