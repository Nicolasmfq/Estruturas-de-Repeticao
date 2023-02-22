package EstruturaDeRepetição;
import java.util.Scanner;
// Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Insira o número que deseja calcular: ");
        numero = scan.nextInt();
        System.out.println("Fatorial de: " + numero);

        int multiplicacao = 1;

        for (int x = numero; x >= 1; x--){
            multiplicacao = multiplicacao * x;
        }
        System.out.println(numero + "!" + " = " + multiplicacao);

    }
}
