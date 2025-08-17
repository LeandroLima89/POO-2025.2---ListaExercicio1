import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        
        int x, y, resultado;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();
        
        resultado = x * y;
        
        System.out.println("O resultado da multiplicacao eh: " + resultado);
        
    }
    
}
