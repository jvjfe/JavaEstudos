package polimorfismo;


public abstract class Animal {
    String nome;
    int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método abstrato que será implementado nas subclasses
    public abstract void som();

    // Método concreto (não abstrato) que pode ser compartilhado entre as subclasses
    public void info() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
