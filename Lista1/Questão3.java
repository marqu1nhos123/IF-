import java.util.Scanner;
public class Questão3 {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        System.out.println("informe um valor que voce deseja dividir: ");
        double numero1 = numero.nextDouble();
        System.out.println("informe mais um valor que voce deseja dividir: ");
        double numero2 = numero.nextDouble();
        double soma = (numero1 + numero2);
        System.out.println("a soma dos numeros sao: "+ soma);
        double divisao = (soma)/2;
        System.out.println("a divisao dos numeros sao: "+ divisao);
        double resto = (numero1 % numero2);
        System.out.println("o resto da divisao e: " + resto);
        
    }
}
