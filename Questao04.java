import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        
        float bytes, kbytes;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe quantos bytes deseja comprar: ");
        bytes = input.nextFloat();
        
        kbytes = bytes / 1024;
        
        System.out.println(bytes + " bytes equivalem a: " + kbytes + " kb");
    }
    
}
