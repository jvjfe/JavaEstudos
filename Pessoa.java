
package classeemetodos;

public class Pessoa {

    String nome;
    String endereco;
    int telefone;
    float peso;
    int idade;
    String time;

    public Pessoa() {
        this.nome = ".";
        this.endereco = ".";
        this.telefone = 0;
        this.peso = 0;
        this.idade = 0;
        this.time = ".";
    }
    
    public Pessoa(String pNome,String pEndereco,int pTelefone,float pPeso, int pIdade, String pTime ){
         this.nome = pNome;
        this.endereco = pEndereco;
        this.telefone = pTelefone;
        this.peso = pPeso;
        this.idade = pIdade;
        this.time = pTime;
    }
    
    public void showScreen(){
        System.out.println("Sus informacões são:");
        System.out.println(nome);
        System.out.println(endereco);
        System.out.println(telefone);
        System.out.println(peso);
        System.out.println(idade);
        System.out.println(time);
    }

}
