import java.util.Scanner;

public class CalculoPreço {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira os dados: ");
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int porcentagemImpostos = scan.nextInt();

        int valorImpostos = (custoFabrica * porcentagemImpostos/100);
        int valorDistribuidor = (custoFabrica * porcentagemDistribuidor/100);

        System.out.println("O custo final do carro é: " + (custoFabrica + valorDistribuidor + valorImpostos));

        scan.close();
    }
}
