/*Crie as classes "Funcionario", "Gerente", "Vendedor" e "Faxineiro". Realize upcasts. */

public class RodarAplicacao {
    public static void main(String[] args){
        
        Funcionario funcionario = new Funcionario();

        /*Aqui ocorrerá upcast: */
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

    }
}
