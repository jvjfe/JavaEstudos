
package polimorfismo;

public class Cachorro extends Animal {

    // Construtor da subclasse
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    // Implementação do método abstrato 'som'
    @Override
    public void som() {
        System.out.println("O cachorro late");
    }
}
