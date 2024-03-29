package Aula06ArraysEFuncoes;
import java.util.Scanner;

public class Carro {

    enum Mensagem {
        VENDA, ECONOMICO, SUPER_ECONOMICO
    }

    public Mensagem calcularConsumo(int km, int litros) {
        float result = km / litros;
        if (result < 8) {
          return Mensagem.VENDA;
        } else if (result >= 8 && result <= 14) {
          return Mensagem.ECONOMICO;
        } else {
          return Mensagem.SUPER_ECONOMICO;
        }
  }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distance = 0;
        int liters = 0;

        System.out.print("Digite a distância em Km: ");
        distance = scan.nextInt();
        
        System.out.print("Digite a quantidade de litros: ");
        liters = scan.nextInt();
        
        Carro carro = new Carro();
        
        Mensagem msg = carro.calcularConsumo(distance, liters);
        System.out.println("Status do carro:" + msg);

        scan.close();
    }
}