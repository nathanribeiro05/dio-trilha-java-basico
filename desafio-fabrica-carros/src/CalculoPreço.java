//Você receberá o custo de fábrica e as porcentagens referentes ao distribuidor e os impostos
//e deverá escrever programa para ler esses valores e imprimir o valor final do carro.
//Entrada	Saída
//20000     34600
//28
//45	

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
