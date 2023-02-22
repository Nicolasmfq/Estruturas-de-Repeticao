package Array;
/* 
    Crie um vetor de 6 números inteiros
    e mostre-os na ordem inversa.
 */
public class OrdemInversa {
    public static void main(String[] args) {
        
        int vetor[] = {50, 5, 16, -8, 19, 23};
        int count = 0;

        System.out.println("Vetor: ");
        while(count < (vetor.length)){    
            System.out.println(vetor[count] + " ");
            count++;
        }
        
        System.out.println("Ordem Inversa: ");
        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }

    }
}
