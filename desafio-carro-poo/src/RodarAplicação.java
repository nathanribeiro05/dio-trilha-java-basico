/*Defina 1 método para calcular o valor total  para encher o tanque, receba o nome do modelo e cor do carro. 
Este deve receber como parâmetro o valor da gasolina. Faça também uma sobrecarga do construtor.
*/

public class RodarAplicação {
    
    public static void main(String [] args) {

        System.out.println("Informações sobre o carro: ");

        Carro carro1 = new Carro("Preto", "New Civic 2020", 80);

            System.out.println("Cor: ");
            System.out.println(carro1.getCor());
            System.out.println("Modelo: ");
            System.out.println(carro1.getModelo());
            System.out.println("Capacidade do tanque: ");
            System.out.println(carro1.getCapacidadeTanque());
            System.out.println("Valor total para encher tanque: ");
            System.out.println(carro1.totalValorTanque(6.5));


        System.out.println("Informações sobre o carro: ");

        Carro carro2 = new Carro();
            carro2.setCor("Branco");
            carro2.setModelo("Gol");
            carro2.setCapacidadeTanque(60);

            System.out.println("Cor: ");
            System.out.println(carro2.getCor());
            System.out.println("Modelo: ");
            System.out.println(carro2.getModelo());
            System.out.println("Capacidade do tanque: ");
            System.out.println(carro2.getCapacidadeTanque());
            System.out.println("Valor total para encher tanque: ");
            System.out.println(carro2.totalValorTanque(6.5));

        

    }
}
