import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        int x, y, z, menor, meio, maior;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe os valores inteiros de X, Y e Z: ");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        
        menor = Math.min(x, Math.min(y, z));
        maior = Math.max(x, Math.max(y, z));
        meio = x + y + z - menor - maior;
        
        System.out.println("Numeros em ordem crescente: " + menor + "," + meio + "," + maior);
       
        /**Verificar as funções para essa resolução
         * Math.min e Math.max
         */
  
    }
}
