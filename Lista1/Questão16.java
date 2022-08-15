import java.util.Scanner;
public class Questão16 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("informe um numero: ");
        int n1 = numero.nextInt();
        if (n1 % 2 == 0){
            System.out.println("numero  par ");  
        }
        if (n1 % 2 != 0){
            System.out.println("numero impar");
        }
    }
}
