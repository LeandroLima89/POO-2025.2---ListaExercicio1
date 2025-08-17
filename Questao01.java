import java.util.Scanner;
public class Questao01 {

    public static void main(String[] args) {
        int x, y, troca;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();
        
        troca = x;
        x = y;
        y =troca;
        
        System.out.println("Agora, X = " + x);
        System.out.println("Agora, Y = " + y);
        
    }
}
