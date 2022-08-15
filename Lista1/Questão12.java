import java.util.Scanner;
public class Questão12 {
    public static void main(String[] args){
        Scanner ms = new Scanner(System.in);
        System.out.println("informe quantos metros/segundos: ");
        double n1 = ms.nextDouble();
        System.out.println("informe quantos minutos voce quer calcular:");
        double n2 = ms.nextDouble();
        
        double soma = (n1 * 3.6);
        double total = (soma /60)*n2;
        System.out.println("Ele rodou "+total+" km");
    }
}
