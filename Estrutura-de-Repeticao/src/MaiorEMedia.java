import java.util.Scanner;

// Faça um programa que leia 5 números e informe o maior número e a média dos números.

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maior = 0;
        int soma = 0;

        do{
            System.out.println("Insira o número: ");
            numero = scan.nextInt();
            contador++;
            soma = soma + numero;
            if(numero > maior) maior = numero;
        } while(contador < 5);
        
        System.out.println("Maior Número: " + maior);
        System.out.println("Média: " + soma / 5);
    }
    
}
