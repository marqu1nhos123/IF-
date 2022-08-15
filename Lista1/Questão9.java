import java.util.Scanner;
public class Questão9 {
    public static void main(String[] args){
        Scanner cotacao = new Scanner(System.in);
        System.out.println("qual e o valor da cotacao do dolar?");
        float dolar = cotacao.nextFloat();
        System.out.println("qual e o valor e real a ser convertido?");
        float real = cotacao.nextFloat();
        double convercao = dolar * real;
        
        System.out.println("O valor convertido : "+convercao);
    }
}
