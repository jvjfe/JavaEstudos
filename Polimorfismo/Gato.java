
package polimorfismo;

public class Gato extends Animal {

    // Construtor da subclasse
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    // Implementação do método abstrato 'som'
    @Override
    public void som() {
        System.out.println("O gato mia");
    }
}
