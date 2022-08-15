
import java.util.Scanner;
public class Questão2{
    public static void main(String[] args){
        System.out.println("qual e o valor que voce quer adicionar: ");
        Scanner numero = new Scanner(System.in);
        double numero1 = numero.nextDouble();
        System.out.println("qual e o segundo valor que voce quer adicionar: ");
        double numero2 = numero.nextDouble();
        double soma = (numero1 + numero2);
        System.out.println("a soma dos dois numero que foram adicionados sao: " + soma);
               
    }
}