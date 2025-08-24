import java.util.Scanner;
import java.util.Locale;

public class Questao05 {
    public static void main(String[] args) {
        
        float dinheiroGasto, tempo, dias, precoCarteira, vlrUnitario;
        int qtdCigarros, carteira = 20;
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe a quantidade de anos que voce fuma: ");
        tempo = input.nextFloat();
        System.out.println("Informe a quantidade de cigarros fumados por dia: ");
        qtdCigarros = input.nextInt();
        System.out.println("Informe o preco da carteira de cigarro: ");
        precoCarteira = input.nextFloat();
        
        dias = tempo * 365;
        vlrUnitario = precoCarteira / carteira;
        dinheiroGasto = vlrUnitario * qtdCigarros * dias;

        System.out.println("O valor gasto em cigarros eh: " + "R$ " + dinheiroGasto);
    }
}
