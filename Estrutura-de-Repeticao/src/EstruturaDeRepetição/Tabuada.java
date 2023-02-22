package EstruturaDeRepetição;
import java.util.Scanner;
/* Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada = 0;
        
        System.out.println("Tabuada: ");
        tabuada = scan.nextInt();
        
        System.out.println("Tabuada de: " + tabuada);

        for(int x = 1; x <= 10; x++){
            System.out.println(tabuada + " x " + x + " = " + tabuada * x);
        }
    }
    
}
