package classeemetodos;
import java.util.Scanner;

public class ClasseEMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu endereco:");
        String endereco = scanner.nextLine();
        System.out.println("Digite seu telefone:");
        int telefone = scanner.nextInt();
        System.out.println("Digite seu peso:");
        float peso = scanner.nextFloat();
        System.out.println("Digite seu idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite seu time:");
        String time = scanner.nextLine();

        //metodo 1
        Pessoa Pessoa1 = new Pessoa();
        Pessoa1.showScreen();
        System.out.println("----------------------------------------");

        //metodo 2
        Pessoa Pessoa2 = new Pessoa("Nome", "Lugar", 1234567, (float) 55.5, 10, "Rio de Janeiro");
        Pessoa2.showScreen();

        //metodo 3
        Pessoa Pessoa3 = new Pessoa(nome, endereco, telefone, peso, idade, time);
        Pessoa3.showScreen();
    }
}
