import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        int A, B, total;
        char operador;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valore inteiro de A: ");
        A = input.nextInt();
        
        System.out.println("Informe o valore inteiro de B: ");
        B = input.nextInt();
        
        input.nextLine();
        
        System.out.println("Informe o tipo de operacao que deseja realizar (+, -, * ou /): ");
        operador = input.nextLine().charAt(0);
        
        switch(operador){
            case '+':
                total = A + B;
                System.out.println("Soma do valor eh: " + total);
                break;
                
            case '-':
                total = A - B;
                System.out.println("Subtracao do valor eh: " + total);
                break;
                
            case '*':
                total = A * B;
                System.out.println("Multiplicacao do valor eh: " + total);
                break;
                
            case '/':
                if(B!=0){
                total = A / B;
                System.out.println("Divisao do valor eh: " + total);
                } else{
                    System.out.println("Nao pode dividir por zero");
                }
                break;
                
            default:
                System.out.println("Operador invalido");
                break;
                  
            
        }
    }
}
