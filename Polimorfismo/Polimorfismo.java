package polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
  
        Animal cachorro = new Cachorro("Catioro", 5); 
        Animal gato = new Gato("Monkey Flip", 3);         


        System.out.println("Informacoes do Cachorro:");
        cachorro.info();
        cachorro.som();
        System.out.println("-------------------");


        System.out.println("Informacoes do Gato:");
        gato.info();
        gato.som();
    }
}
