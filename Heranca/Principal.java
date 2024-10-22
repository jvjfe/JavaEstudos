
package heranca;

/**
 *
 * @author 2Ds_tec
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fisica PessoaFisica = new Fisica();
        PessoaFisica.RG = "30.005.346-0";
        PessoaFisica.nome = "Ikari Jiyu";
        PessoaFisica.idade = 10;
        
        Juridica PessoaJuridica = new Juridica();
        PessoaJuridica.CNPJ = "15.500.570/0001-18";
        PessoaJuridica.nome = "Jhon Ferri";
        PessoaJuridica.idade = 13;
        
        System.out.println("PESSOA FISICA");
        System.out.println(PessoaFisica.nome);
        System.out.println(PessoaFisica.RG);
        System.out.println(PessoaFisica.idade);
        System.out.println("--------------------");
        System.out.println("PESSOA JURIDICA");
        System.out.println(PessoaJuridica.nome);
        System.out.println(PessoaJuridica.CNPJ);
        System.out.println(PessoaJuridica.idade);
    }
    
}
