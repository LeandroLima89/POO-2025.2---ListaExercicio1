import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        double x, y, z;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do lado X: ");
        x = input.nextDouble();
        System.out.print("Informe o tamanho do lado Y: ");
        y = input.nextDouble();
        System.out.print("Informe o tamanho do lado Z: ");
        z = input.nextDouble();
        
        if(x + y > z && x + z > y && y + z > x){
            if(x == y && y == z){
                System.out.println("O triangulo eh equilatero");
            }
            else if (x == y || y == z || x == z){
                System.out.println("O triangulo eh isosceles");
            }
            else{
                System.out.println("O triangulo eh escaleno");
            }
            
        }
        else{
            System.out.println("Os valores nao formam um triangulo");
        }
    }
}
