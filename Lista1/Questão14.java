import java.util.Scanner;
public class Questão14 {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        System.out.println("digite um numero:");
        double n1 = numero.nextDouble();
        System.out.println("digite outro numero:");
        double n2 = numero.nextDouble();
        if (n1 > n2){
            System.out.println("o numero "+n1+" e o maior numero");
    }
        if (n2 > n1){
            System.out.println("o numero "+n2+" e o maior numero"); 
        }
    }
}
