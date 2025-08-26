import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor de A: ");
        a = input.nextInt();
        System.out.println("Informe o valor de B: ");
        b = input.nextInt();
        System.out.println("Informe o valor de C: ");
        c = input.nextInt();
        
        if(a*a + b*b == c*c){
            System.out.println("Os numeros informados sao pitagoricos");
        }
        else{
            System.out.println("Os numeros informados NAO sao pitagoricos");
        }
    }
}
