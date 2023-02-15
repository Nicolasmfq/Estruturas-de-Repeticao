import java.util.Scanner;

/* Faça um programa que peça N números inteiros, 
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.
*/

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int quantidadeNumeros;
        int numero;
        int contador = 0;
        int quantidadePares = 0, quantidadeImpares = 0;


        System.out.println("Insira uma quantidade de números que deseja calcular: ");
        quantidadeNumeros = scan.nextInt();
        
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            contador++;
            if (numero % 2 == 0) {
                quantidadePares = quantidadePares + 1;
            }else{
                quantidadeImpares = quantidadeImpares + 1;
            }
        } while(contador < quantidadeNumeros);

        System.out.println("Quantidade de Números Pares: " + quantidadePares);
        System.out.println("Quantidade de Números Ímpares: " + quantidadeImpares);
    }
}
