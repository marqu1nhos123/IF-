import java.util.Scanner;
public class Questão20 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.err.print("Infome um numero:");
        double numero1 = numero.nextDouble();
        System.err.print("Infome um numero:");
        double numero2 = numero.nextDouble();
        System.err.print("Infome um numero:");
        double numero3 = numero.nextDouble();
        
        if (numero1 < numero2 && numero1 < numero3){
            System.err.printf("\n%s e o menor numero",numero1);
        }
        if (numero2 < numero1 && numero2 < numero3){
            System.err.printf("\n%s e o menor numero", numero2);
        }
        if (numero3 < numero1 && numero3 < numero2){
            System.err.printf("\n%s e o menor numero",numero3);
        }
    }
}
