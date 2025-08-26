
import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        String valor, valorInvertido;
        int i;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um nome ou valor: ");
        valor = input.nextLine();
        
        valorInvertido = "";
        
        for(i = valor.length()- 1; i >= 0; i--){
            valorInvertido = valorInvertido + valor.charAt(i);
        }
        
        System.out.println("Valor invertido: " + valorInvertido);
    }
}
